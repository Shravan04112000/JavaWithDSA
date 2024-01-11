import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter your rollno");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your Roll No is:"+ rollno);
    }
}
