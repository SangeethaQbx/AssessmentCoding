public class Amstrong {
    public static int pow(int a,int b){
        int pro=1;
        for(int i=0;i<b;i++){
            pro=pro*a;
        }
        return pro;
    }
    public static void main(String[] args) {

        int num=153;
        int temp=num;
        int n=num;
        int count=0;
        int sum=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        while (num!=0){
            int val=num%10;
            sum=sum+pow(val,count);
            num=num/10;
        }
        if(sum==temp)
        System.out.println(temp+ " is armstrong number");
        else System.out.println("not an Amstrong num");
    }
}
