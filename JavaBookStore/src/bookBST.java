
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class bookBST
 * @author vanka
 */
public class bookBST {
    
    private BinarySearchTree<Book> bst; 

    /**
     *Default constructor that creates BinaySearchTree.
     */
    public bookBST()
   {
       bst = new BinarySearchTree<Book>();
   }
    /**
     *Takes the filepath of a file and takes all the data in it.
     * @param filepath takes a file and loads the data from it using Scanner
     */
    public void loadData(String filepath) {
        File file = new File(filepath);
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {           
                Book book = new Book();
                book.setISBN(scan.nextLine());
                book.setTitle(scan.nextLine());
                book.setAuthor(scan.nextLine());
                book.setPublisher(scan.nextLine());
                book.setNumberOfPages(Integer.valueOf(scan.nextLine()));
                book.setPublicationDate(scan.nextLine());
                book.setFormat(scan.nextLine());
                book.setGenre(scan.nextLine());
                book.setNumberOfBorrows(Integer.valueOf(scan.nextLine()));
                bst.add(book);
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
    }

    /**
     * Gets all the books in ascending author order.
     * @return the books in ascending author order.
     */
    public String getByAscendingOrder()
    {
        return bst.inorderToString();
    }

    /**
    * Gets all the books in descending author order.
     * @return the books in descending author order.
     */
    public String getByDescendingOrder()
    {
        return bst.postorderToString();
    }

    /**
     *Gets all the authors for all the books.
     * @return all the authors for all the books.
     */
    public String getAuthors()
    {
         bst.toList();
         List<Book> list = bst.toList();
         String names = "";
         for (Book book : list) {
            names += book.getAuthor() + ",";
        }
         return names;
    }
}
