public class GreatestCommonDivisior {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10){
            return -1;
        }
        else{
            int divisor = Math.min(first,second);
            while ((first%divisor != 0) || (second%divisor !=0)){
                divisor--;
            }
            return divisor;

        }

    }
}
