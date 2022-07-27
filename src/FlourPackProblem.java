public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        else{
            int big = bigCount*5;
            int small = smallCount*1;
            //int totalGoal = goal;
            int sum=0;
            sum=big+small;
            if((sum>=goal)){
                if(smallCount>=goal%5){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }
}
