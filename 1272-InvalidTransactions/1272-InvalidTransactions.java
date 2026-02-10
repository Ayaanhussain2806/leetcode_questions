// Last updated: 2/10/2026, 3:13:58 PM
// Approach - 2
class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalid = new ArrayList<>();
        Map<String, List<Transaction>> map = new HashMap<>();

        // Process all transactions in a single pass
        for (int i = 0; i < transactions.length; i++) {
            Transaction tran = new Transaction(transactions[i], i);
            map.computeIfAbsent(tran.name, k -> new ArrayList<>()).add(tran);

            // Check if the transaction is invalid due to amount
            if (tran.amount > 1000) {
                invalid.add(transactions[i]);
            }
        }

        // Check for invalid transactions due to time and city
        for (List<Transaction> userTransactions : map.values()) {
            for (Transaction tran : userTransactions) {
                if (!tran.isAlreadyInvalid && isInvalidDueToTimeAndCity(userTransactions, tran)) {
                    invalid.add(transactions[tran.index]);
                }
            }
        }

        return invalid;
    }

    private boolean isInvalidDueToTimeAndCity(List<Transaction> transactions, Transaction current) {
        for (Transaction other : transactions) {
            if (current != other && current.invalidTransaction(other.city, other.time)) {
                return true;
            }
        }
        return false;
    }

    class Transaction {
        String name;
        int time;
        int amount;
        String city;
        int index;
        boolean isAlreadyInvalid;

        Transaction(String transaction, int index) {
            String[] t = transaction.split(",");
            this.name = t[0];
            this.time = Integer.parseInt(t[1]);
            this.amount = Integer.parseInt(t[2]);
            this.city = t[3];
            this.index = index;
            this.isAlreadyInvalid = (this.amount > 1000);
        }

        public boolean invalidTransaction(String city, int time) {
            return !this.city.equals(city) && Math.abs(this.time - time) <= 60;
        }
    }
}