package math.problems;

public class Fibonacci {
        public static void main(String[] args) {
            int Fibonacci, a = 0, b = 0, c = 1;
            System.out.print("Fibonacci numbers:");
            for(int i = 1; i <= 40; i++) {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a+" ");
            }
        }
    }

