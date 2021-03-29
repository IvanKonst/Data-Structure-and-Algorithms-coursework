import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *BookList class
 * @author vanka
 */
public class BookList implements IADTbookList {

    private BookNode head;

    /**
     *Default Constructor.
     */
    public BookList() {
        head = null;

    }

    /**
     *Adds a book to the list.
     * @param item - object of class Book.
     */
    @Override
    public void add(Book item) {

        BookNode bn = new BookNode(item);
        bn.setNext(head);
        head = bn;
    }

    /**
     *Searches for book by title.
     * @param title - title to be searched with
     * @return list of books with that title.
     */
    @Override
    public String getByTitle(String title) {
    
        StringBuilder listString = new StringBuilder();
        BookNode tmp = head;
        while (tmp != null) {
      
            if (tmp.getBook().getTitle().equals(title)) {
                listString.append(tmp.getBook());
                listString.append('\n');
            }
            tmp = tmp.getNext();
        }

        return listString.toString();
    }

    /**
     *Searches for book by author.
     * @param author - title to be searched with.
     * @return list of books from that author.
     */
    @Override
    public String getByAuthor(String author) {
        StringBuilder listString = new StringBuilder();
        BookNode tmp = head;
        while (tmp != null) {
            if (tmp.getBook().getAuthor().equals(author)) {
                listString.append(tmp.getBook());
                listString.append('\n');
               
            }
             tmp = tmp.getNext();
        }

        return listString.toString();
    }

    /**
     *Searches for book by genre.
     * @param genre - genre to be searched with.
     * @return list of books of that genre.
     */
    @Override
    public String getByGenre(String genre) {
        StringBuilder listString = new StringBuilder();
        BookNode tmp = head;
        while (tmp != null) {
            if (tmp.getBook().getGenre().equals(genre)) {
                listString.append(tmp.getBook());
                listString.append('\n');
                
            }
            tmp = tmp.getNext();
        }

        return listString.toString();
    }

    /**
     *Gets all books in the list.    
     * @return all the books in the list.
     */
    @Override
    public String getAll() {

        StringBuilder listString = new StringBuilder();
        BookNode tmp = head;
        while (tmp != null) {
            listString.append(tmp.getBook());
            listString.append('\n');
            tmp = tmp.getNext();
        }

        return listString.toString();
    }

    /**
     *Main method.
     * @param args - parameters for the main method.
     */
    public static void main(String[] args) {
        System.out.println("Test addFirst");

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
        
     //  System.out.println("All books by the author :" + (bl.getByAuthor("Kamen Konstantinov")));
   //     System.out.println("All books with that genre :" + (bl.getByGenre("Romance")));
//        System.out.println("All books :" + bl.getAll());
//               
    }
}