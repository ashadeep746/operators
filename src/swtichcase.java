import java.util.Scanner;

public class swtichcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");
        String day = sc.next();
      //  sc.next("no day");
        switch (day) {
            case "monday":
                System.out.println("monday");
            break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
            default :
                System.out.println("no day");
        }
    }
}

