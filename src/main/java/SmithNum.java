import java.util.ArrayList;

public class SmithNum {
        public static int findSum(int n){
            int sum=0;
            int temp=n;
            while(temp>0){
                int  r=temp%10;
                sum=sum+r;
                temp=temp/10;
            }
            return sum;
        }
        public static void main(String[] args) {
            int number=85;
            int n1,sum=0;
            int numSum=findSum(number);
            for(int i = 2; i< number; i++) {
                while(number%i == 0) {
                    sum=sum+findSum(i);
                    number = number/i;
                }
            }
            int primeSum=sum+findSum(number);
            if(numSum==primeSum) System.out.println("given number is smith number");
            else System.out.println("not  an smith number");
        }
    }