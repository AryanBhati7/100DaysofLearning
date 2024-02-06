public class Butterfly_Pattern {
    public static void Butterfly(int n) {
        // 1st half of butterfly
        for (int i = 1; i <= n; i++) {
            // For priting stars in row i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for priting spaces in row i
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // For priting stars in row i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Second Half of Butterfly
        for (int i = n; i >= 1; i--) {
            // For priting stars in row i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for priting spaces in row i
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // For priting stars in row i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Butterfly(5);
    }
}
