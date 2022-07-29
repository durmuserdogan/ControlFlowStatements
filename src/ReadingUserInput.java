import java.util.Scanner;

public class ReadingUserInput {
    public static void nextInt(){
        Scanner scanner = new Scanner(System.in);

        int sum=0;

        for (int i=1;i<=10;i++){

            System.out.println("please give a number: "+ i);
            boolean a = scanner.hasNextInt();
            if(!a){
                System.out.println("Invalid Number");

            }
            else{
                int numb= scanner.nextInt();

                sum+=numb;

            }
            scanner.nextLine();

        }
        System.out.println("sum is "+ sum);
        scanner.close();


    }





}
