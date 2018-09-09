package math.problems;
/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String args[]){
        int factorial = fact(3);
        System.out.println("Factorial of 3 is: "+factorial);
    }
    static int fact(int n) {
        int output;
        if(n==1){
            return 1;
        }
        output = fact(n-1)* n;
        return output;
    }
}
