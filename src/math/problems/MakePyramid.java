package math.problems;

public class MakePyramid {
    public static void main(String[] args) {
        for (int i=1; i<10; i += 2) {
            for (int j=0; j < (4 - i / 2); j++) {
                System.out.print(" ");
            } for (int t=0; t<i; t++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
