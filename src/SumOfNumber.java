/**
 * Created by Amit on 07/03/17.
 */
public class SumOfNumber {
    public static int sumNumber(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }

    public static void printNdigitNumber(int n){
        int i = (int) Math.pow(10,n);
        int max = (int)Math.pow(10,n+1);
        while (i <  max ) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        //System.out.println(sumNumber(344));
        printNdigitNumber(4);
    }
}
