package mypackage;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.println("|                          WELCOME                            |");
        System.out.println("|                       LockedMe.com                          |");
        System.out.println("|                                                             |");
        System.out.println("|                       developed by                          |");
        System.out.println("|                                                             |");
        System.out.println("|                    Tejeswi Devi Priya                       |");
        System.out.println("|          Email ID: priyapillarisetty19@gmail.com            |");
        System.out.println("---------------------------------------------------------------");
        int ch, ch2;
        do {
            System.out.println("Please choose one from the below options");
            System.out.println("1. Retrieve files in ascending order");
            System.out.println("2. Add, Delete and Search a user specified file");
            System.out.println("3. Exit");
            ch = sc.nextInt();
            switch(ch) {
            case 1 :
                BusinessLevelOperations retrifilesobj = new BusinessLevelOperations();
                retrifilesobj.sortingFileNames();
                System.out.println();
                System.out.println("Retrieved files in an ascending order");
                break;
            case 2 :
                do {
                    System.out.println("Please choose one from the business level operations below");
                    System.out.println("1. Add a user specified file to the application");
                    System.out.println("2. Delete a user specified file from the application");
                    System.out.println("3. Search a user specified file from the application");
                    System.out.println("4. Return to Main Menu");
                    System.out.println("5. Quit");
                    ch2 = sc.nextInt();
                    switch(ch2) {
                    case 1 :
                    	BusinessLevelOperations addfilesobj = new BusinessLevelOperations();
                        addfilesobj.addingAFile();
                        break;
                    case 2 :
                    	BusinessLevelOperations delfilesobj = new BusinessLevelOperations();
                        delfilesobj.deletingAFile();
                        break;
                    case 3 :
                    	BusinessLevelOperations serfilesobj = new BusinessLevelOperations();
                        serfilesobj.searchingAFile();
                        break;
                    case 4 :
                        System.out.println("Welcome back to Main Menu");
                        break;
                    case 5 :
                        System.out.println("Thank you for using LockedMe.com.");
                        System.exit(ch2);
                    default :
                        System.out.println("Invalid choice. Please select the correct choice");
                        break;
                    }
                } while(ch2!=4);
                break;
            case 3 :
                System.out.println("Thank you for using LockedMe.com.");
                break;
            default :
                System.out.println("Invalid Choice. Please select the correct choice");
                break;
            }
        } while(ch!=3);
    }
}