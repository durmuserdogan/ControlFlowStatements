public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one, int two, int three){
        if((one<10) || (two<10) || (three<10) || (one>1000) || (two>1000) || (three>1000)){
            return false;
        }
        else{
            int oneL=one%10;
            int twoL=two%10;
            int threeL=three%10;

            if((oneL==twoL) || (oneL==threeL) || (twoL==threeL)){
                return true;
            }
            return false;
        }

    }
    public static boolean isValid(int number){
        if (number<10 || number>1000){
            return false;
        }
        else{
            return true;
        }
    }
}
