import java.util.Scanner;

public class FullNameApplication {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your first name.");
        String userFirstName = read.nextLine().trim();
        System.out.println("Please enter your middle name, if you have one.");
        String userMiddleName = read.nextLine().trim();
        System.out.println("Please enter your last name.");
        String userLastName = read.nextLine().trim();
        System.out.println("Please enter your suffix, if you have one.");
        String userSuffix = read.nextLine().trim();

        // full name initialized as first name.
        String userFullName = userFirstName;

        if (!userMiddleName.equals("")) {
            userFullName += " " + userMiddleName;
        }

        userFullName += " " + userLastName;

        if (!userSuffix.equals("")) {
            userFullName += ", " + userSuffix;
        }

        System.out.println(userFullName);

        read.close();
    }
}
