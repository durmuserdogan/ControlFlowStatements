public class AllFactors {
    public static int printFactors(int number){
        int i=1;
        if (number<0){
            System.out.println("Invalid Value");
        }
        else{
            for(; i<=number; i++){
                if(number%i==0){
                    System.out.print(i);
                }

            }


        }
        return i;
    }
}
