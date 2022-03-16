
public class DuckNumber {

        public static boolean checkNumber(String  str) {
            int number= Integer.parseInt(str);
            while(number != 0) {
                if(number%10 == 0)
                    return true;
                else
                    number = number / 10;
            }
            return false;
        }

        public static void main(String args[]) {
            String str = "1020";
            if (str.charAt(0) == '0') {
                System.out.println("not a duck number");
            } else {
                boolean check = checkNumber(str);
                if (check == true) System.out.println("duck number");
                else System.out.println("not a duck number");
            }
        }

    }