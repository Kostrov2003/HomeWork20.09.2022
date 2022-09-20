public class Task8 {
    public static void main(String[] args) {

        int data = 104;

      year(data);
    }

    public static void year(int data) {


        if ((data % 4 == 0) &&((data % 400 ==0) ||(data% 100 != 0))) {
            System.out.println("Год является високосным!");

        }
        else {
            System.out.println("Год не является високосным!");
        }



    }
}