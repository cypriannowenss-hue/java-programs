Cyprian Kameli
 J77-10537-2024
 A PROGRAM TO COMPUTE fines for overdue library books
 */

import java.util.Scanner;

public class fines {
    public static void main(String[] args) {
        String bookID;
        int dueDate, returnDate, daysOverdue, fineRate, fineAmount;

        Scanner scanner = new Scanner(System.in);
        // prompt user for imput
        System.out.println("Please enter the bookID");
        bookID = scanner.nextLine();

        System.out.println("Please enter the dueDate");
        dueDate = scanner.nextInt();

        System.out.println("Please enter the returnDate");
        returnDate = scanner.nextInt();

        // calculate days overdue
        daysOverdue = returnDate - dueDate;

        fineAmount = 0;
        fineRate = 0;

        if (daysOverdue == 0) {
            fineRate = 0;
        } else if (daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue >= 8 && daysOverdue <= 14) {
            fineRate = 50;
        } else {
            fineRate = 100;

        }
        fineAmount = fineRate * daysOverdue;

        System.out.println("LIBRARY FINE DETAILS");
        System.out.println("BookID:" + bookID);
        System.out.println("Due Date:" + dueDate);
        System.out.println("ReturnDate:" + returnDate);
        System.out.println("Days Overdue:" + daysOverdue);
        System.out.println("FineRate:" + fineRate);
        System.out.println("FineAmount:" + fineAmount);

    }