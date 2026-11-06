Experiment 2: String Handling
Program 2a: Compare Two Employee Names
Aim: To compare two strings using String methods.
Scenario: A company checks whether two entered employee names are the same, ignoring letter case.
Program:
import java.util.Scanner;
 
public class EmployeeNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();
 
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both employee names are the same.");
        } else {
            System.out.println("Both employee names are different.");
        }
        sc.close();
    }
}
Sample Output:
Enter first employee name: Ravi Kumar
Enter second employee name: ravi kumar
Both employee names are the same.
Result: The names were compared without considering case, and the result was displayed correctly.
Program 2b: Keyword Search in a Message
Aim: To check whether a message contains a given keyword.
Scenario: A messaging app checks whether a message contains a particular word.
Program:
import java.util.Scanner;
 
public class MessageKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();
 
        if (message.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("Keyword found in the message.");
        } else {
            System.out.println("Keyword not found in the message.");
        }
        sc.close();
    }
}
Sample Output:
Enter a message: The exam is tomorrow morning
Enter keyword: EXAM
Keyword found in the message.
Result: The keyword was located using the contains() method, ignoring case.
