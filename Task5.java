public class Task5 {

    public static void main(String[] args) {

        System.out.println(chek(-1));
    }

    public static int chek(int a) {

        if (a >= 0) {
            System.out.println("Число положительное!");
        }
        else {
            System.out.println("Число отрицательное!");
        }

        return a;
    }

}