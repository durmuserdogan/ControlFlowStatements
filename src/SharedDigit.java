public class SharedDigit {
    public static boolean hasSharedDigit(int one, int two){
        if((one<10) || (two<10) || (one>99) || (two>99)){
            return false;
        }
        else{
            return true;
        }

    }
}
