public class LargestThirdNum {

    public static void main(String[] args) {

        int[] num = {12, 7, 6, 15, 8, 20, 9};
        int first = num[0], second = Integer.MIN_VALUE, third = Integer.MAX_VALUE;

        for (int i=1;i<num.length;i++){
            if(num[i]>first){
                third=second;
                second=first;
                first=num[i];
            } else if (num[i]>second){
                third=second;
                second=num[i];
            }else if (num[i]>third){
                third=num[i];
            }
        }
        System.out.println("the third largest is "+third);

    }

}
