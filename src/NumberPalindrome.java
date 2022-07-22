public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        if (number<0){
            number*=(-1);
        }
        //int lastDigit=0;
        int reverse=0;
        int i=number;
        while(i>0){
            int lastDigit=i%10;

            reverse=reverse*10;
            reverse=lastDigit+reverse;
            i=i/10;

        }
        if (reverse==number){
            return true;
        }
        else{
            return false;
        }

    }
}
