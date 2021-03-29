
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *Main class for the program.
 * @author vanka
 */
public class Menu {

    /**
     * Main method
     * @param args - Parameters for the main method.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = true;        
        Book book = new Book("1234567", "The Book", "Somebody famous",
                "Newtimes Publishers", 256, "25.06.2012", "pdf", "Fantasy", 10);

        Book secondbook = new Book("5367986", "The mine", "Kamen Konstantinov",
                "Egmont Publishing", 156, "20.07.2020", "pdf", "Adventure", 250);

        Book thirdbook = new Book("5367984", "The asd", "Kamen Konstantinov",
                "Egmont Publishing", 156, "20.07.2020", "pdf", "Adventure", 40);

        BookList bl = new BookList();

        Book forthbook = new Book("1451241", "Howling roar", "Somebody not very famous",
                "Denrod Publishing", 580, "10.05.2018", "pdf", "Crime", 30);

        Book fifthbook = new Book("2135124", "Sunnlight", "Somebody smart",
                "Simba Publishing", 570, "10.05.2018", "pdf", "Romance", 50);

        bl.add(book);
        bl.add(secondbook);
        bl.add(thirdbook);
        bl.add(forthbook);
        bl.add(fifthbook);
        bookBST bst = new bookBST();
        bst.loadData("books.txt");

        System.out.println(
                "1 - Search for a specific book by Title :" + '\n'
                + "2 - Search for a book(s) by a specific Author." + '\n'
                + "3 - Display all the books for a given genre in the list" + '\n'
                + "4 - Display all the books in the list" + '\n'
                + "5 - Display a list of all the books in ascending Author order" + '\n'
                + "6 - Display a list of all the books in descending Author order." + '\n'
                + "7 - Display a list of all the books that are available." + '\n'
                + "8 - Display a list of all the Author names for all the books." + '\n'
                + "exit" + '\n' + "help");
        while (exit) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                exit = false;
            }
            if (input.equalsIgnoreCase("1")) {
                System.out.println("Search for a specific book by Title :");
                String getUserData = scan.nextLine();
                System.out.println("Book found :" + bl.getByTitle(getUserData));
            }
            if (input.equalsIgnoreCase("2")) {
                System.out.println("Search for a specific book by Author :");
                String getUserData = scan.nextLine();
                System.out.println("Book found :" + bl.getByAuthor(getUserData));
            }
            if (input.equalsIgnoreCase("3")) {
                System.out.println("Display all the books for a given genre in the list.");
                String getUserData = scan.nextLine();
                System.out.println("Book found :" + bl.getByGenre(getUserData));
            }
            if (input.equalsIgnoreCase("4")) {
                System.out.println("Display all the books.");
                System.out.println("Book found :" + bl.getAll());
            }
            if (input.equalsIgnoreCase("5")) {

                System.out.println("Display a list of all the books in ascending Author order.");
                System.out.println(bst.getByAscendingOrder());

            }
            if (input.equalsIgnoreCase("6")) {
                System.out.println("Display a list of all the books in descending Author order.");
                System.out.println(bst.getByDescendingOrder());
            }
            if (input.equalsIgnoreCase("7")) {
                System.out.println("Display all the books.");
                System.out.println("Book found :" + bl.getAll());
            }
            if (input.equalsIgnoreCase("8")) {
                System.out.println(bst.getAuthors());
            }
            if (input.equalsIgnoreCase("menu")) {
                System.out.println(
                        "1 - Search for a specific book by Title :" + '\n'
                        + "2 - Search for a book(s) by a specific Author." + '\n'
                        + "3 - Display all the books for a given genre in the list" + '\n'
                        + "4 - Display all the books in the list" + '\n'
                        + "5 - Display a list of all the books in ascending Author order" + '\n'
                        + "6 - Display a list of all the books in descending Author order." + '\n'
                        + "7 - Display a list of all the books that are available." + '\n'
                        + "8 - Display a list of all the Author names for all the books." + '\n'
                        + "exit" + '\n' + "help");
            }
            if (input.equalsIgnoreCase("help")) {
                System.out.println("Write : menu to display the menu." + '\n'
                        + "Write : exit to close the applciation");
            }         
        }
    }

}
