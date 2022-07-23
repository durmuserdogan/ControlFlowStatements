public class SharedDigit {
    public static boolean hasSharedDigit(int one, int two){
        if((one<10) || (two<10) || (one>99) || (two>99)){
            return false;
        }
        else{
            int one1=one%10;
            int one2=one/10;
            int two1=two%10;
            int two2=two/10;

            if ((one1 ==(two1)) || (one1 ==(two2)) || (one2 ==(two1)) || (one2 ==(two2))){
                return true;
            }
            else{
                return false;
            }

        }

    }
}
