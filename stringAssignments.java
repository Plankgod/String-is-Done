package stringAssignments;
import java.util.Scanner;

public class stringAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bio");

        String myBio=sc.nextLine();
        System.out.println("My bio is:" + myBio);
        sc.close();
    }
}
