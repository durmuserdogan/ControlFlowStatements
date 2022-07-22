public class DigitSumChallenge {
    public static int sumDigits(int number){
        if (number<10){
            return -1;
        }

        else{
            int sum=0;
            while (number > 0){
                //extract the lest-significant digit
                int digit =number %10;
                sum += digit;

                //drop the least-significant digit
                number /=10;

            }
            return sum;

        }
    }
}
