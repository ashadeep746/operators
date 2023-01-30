import java.util.Scanner;

public class conditionalstatement {

    public static void main(String[] args) {
        System.out.println("enter a input");
        Scanner sc = new Scanner();
        sc.nextInt();
        int i = 10;
        switch (i) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            default:
                System.out.println(11);
        }
    }
}
