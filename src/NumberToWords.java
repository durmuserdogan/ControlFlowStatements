public class NumberToWords {
    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }
        else{
            int reverseNumber=reverse(number);
            int lastDigit =0;
            for(int i=1; i<=getDigitCount(number);i++){

                lastDigit=reverseNumber%10;
                switch (lastDigit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                reverseNumber/=10;
            }
            System.out.println();
        }
    }

    public static int reverse( int number){
        int reverseNumber=0;
        while(number!=0){
            reverseNumber=reverseNumber*10;
            reverseNumber=reverseNumber+(number%10);
            number=number/10;
        }
        return reverseNumber;


    }

    public static int getDigitCount(int number){
        if (number<0){
            return -1;
        }
        else{
            int count=1;
            while(number>9){
                number/=10;
                count++;

            }
            return count;
        }
    }
}
