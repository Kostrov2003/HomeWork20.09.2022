public class Task4 {
    public static void main(String[] args) {

        System.out.println(mat(10,9.5));
    }

    public static boolean mat(double a, double b) {
        double sum = 0;
        sum = a + b;

        if((sum >= 10) && (sum <= 20)) {
            return true;
        }

        else {
            return false;
        }

    }
}