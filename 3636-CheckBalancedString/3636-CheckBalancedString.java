// Last updated: 2/10/2026, 3:10:48 PM
class Solution {
    public boolean isBalanced(String num) {
        int s1=0;
        int s2=0;
        for(int i=0;i<num.length();i++){
            if(i%2!=0){
                int c=num.charAt(i);
                s1+=c-'0';
            }else{
                int d=num.charAt(i);
                s2+=d-'0';
            }
        }
        return s1==s2;
    }
}







// My pussy tastes like Pepsi cola
// My eyes are wide like cherry pies
// I gots a taste for men who are older
// It's always been so it's no surprise

// Ah, he's in the sky with diamonds and he's making me crazy
// (I come alive, alive)
// All he wants to do is party with his pretty baby

// Come on, baby, let's ride
// We can escape to the great sunshine
// I know your wife and she wouldn't mind
// We made it out to the other side
// We made it out to the other side
// We made it out to the other side

// Come on, come on
// Come on, come on, come on, baby
// Oh, oh yeah

// I fall asleep in an American flag
// I wear my diamonds on Skid Row
// I pledge allegiance to my dad
// For teaching me everything he knows

// Ah, he's in the sky with diamonds and he's making me crazy
// (I come alive, alive)
// All he wants to do is party with his pretty baby

// Come on, baby, let's ride
// We can escape to the great sunshine
// I know your wife and she wouldn't mind
// We made it out to the other side
// We made it out to the other side
// We made it out to the other side

// Drugs, suck it up, like vanilla icys
// Don't treat me rough, treat me really niceys
// Decorate my neck, diamantes ices
// Why, come on, come on
// (Ooh-ooh, ooh-ooh, ooh-ooh, ooh yeah)

// Come on, baby, let's ride
// We can escape to the great sunshine
// I know your wife and she wouldn't mind
// We made it out to the other side
// Come on, baby, let's ride
// We can escape to the great sunshine
// We made it out to the other side
// We made it out to the other side

// Come on, come on, come on, baby
// Come on, come on, come on, baby
// Oh, oh
// My pussy tastes like Pepsi cola
// Ooh, ah
// My pussy tastes like Pepsi cola
// Ooh-ooh, ooh-ooh, ooh-ooh
// My pussy tastes like Pepsi cola
// Ooh, oh yeah
