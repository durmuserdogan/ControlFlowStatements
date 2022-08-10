public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width<=0 || height <=0 || areaPerBucket <=0 || extraBuckets <0){
            return -1;
        }
        else{
            double area=width*height;
            double rbuckets=0;
            rbuckets=((double)area/areaPerBucket)-extraBuckets;

            return (int)Math.ceil(rbuckets);

        }

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width<=0 || height <=0 || areaPerBucket <=0 ){
            return -1;
        }
        else{
            double area = width*height;
            double rbuckets=0;

            rbuckets=(double)(area/areaPerBucket);

            return (int)Math.ceil(rbuckets);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <=0 || areaPerBucket <=0 ){
            return -1;
        }
        else{
            double rbuckets=0;

            rbuckets=(double)(area/areaPerBucket);
            return (int)Math.ceil(rbuckets);
        }

    }
}
