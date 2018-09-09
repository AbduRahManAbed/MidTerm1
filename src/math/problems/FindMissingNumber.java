package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {
        public static void main(String[] args) {
            int numbers;
            int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
            numbers = 10;

            int A = numbers * ((numbers + 1) / 2);
            int S = -5;
                for (int i: array) {
                S += i;
                }
                System.out.print(A - S);
                 System.out.print("\n");
        }
    }