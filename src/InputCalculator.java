import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);

        int sum=0;
        long avg=0;
        int i=1;
        while (true){

            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();
                sum+=number;
                avg=Math.round((double)sum/i);

                i++;
            }
            else{
                break;
            }
            scanner.nextLine();

        }
        System.out.println("SUM = "+sum+" AVG = "+avg);

    }
}
