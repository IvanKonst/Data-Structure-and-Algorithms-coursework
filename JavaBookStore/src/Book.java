/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanka
 */
public class Book implements Comparable<Book> {

    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private int numberOfPages;
    private String publicationDate;
    private String format;
    private String genre;
    private int numberOfBorrows;

    /**
     *
     * @param ISBN  String contatining the ISBN.
     * @param title String contatining the title.
     * @param author String contatining the author.
     * @param publisher String contatining the publisher.
     * @param numberOfPages String contatining the numberOfPages.
     * @param publicationDate String contatining the publicationDate.
     * @param format String contatining the format.
     * @param genre String contatining the genre.
     * @param numberOfBorrows String contatining the numberOfBorrows.
     */
    public Book(String ISBN, String title, String author, String publisher,
            int numberOfPages, String publicationDate, String format,
            String genre, int numberOfBorrows) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
        this.format = format;
        this.genre = genre;
        this.numberOfBorrows = numberOfBorrows;
    }

    /**
     * Default constructor.
     */
    public  Book() {
        
    }

    /**
     *Getter for the ISBN of the Book
     * @return Returns ISBN.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     *Setter for the ISBN of the Book
     * @param ISBN - Sets ISBN.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     *Getter for the Title of the Book
     * @return Returns Title.
     */
    public String getTitle() {
        return title;
    }

    /**
     *Setter for the Title of the Book
     * @param title - Sets Title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *Getter for the author of the Book
     * @return Returns author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     *Setter for the author of the Book
     * @param author - Sets author.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *Getter for the publisher of the Book
     * @return Returns publisher.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     *Setter for the publisher of the Book
     * @param publisher - Set publisher.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     *Getter for the the numberOfPages of the Book
     * @return Returns numberOfPages.
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     *Setter for the the numberOfPages of the Book
     * @param numberOfPages - Sets numberOfPages.
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     *Getter for the the publicationDate of the Book
     * @return Returns publicationDate.
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     *Setter for the the publicationDate of the Book
     * @param publicationDate - Sets publicationDate.
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     *Getter of the format of the Book.
     * @return Returns format.
     */
    public String getFormat() {
        return format;
    }

    /**
     *Setter of the format of the Book.
     * @param format - Sets format.
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     *Getter of the genre of the Book.
     * @return Returns Genre.
     */
    public String getGenre() {
        return genre;
    }

    /**
     *Setter of the genre of the Book.
     * @param genre - Sets genre.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     *Getter of the numberOfBorrows of the Book.
     * @return Return numberOfBorrows.
     */
    public int getNumberOfBorrows() {
        return numberOfBorrows;
    }

    /**
     *Setter of the numberOfBorrows of the Book.
     * @param numberOfBorrows - Sets numberOfBorrows.
     */
    public void setNumberOfBorrows(int numberOfBorrows) {
        this.numberOfBorrows = numberOfBorrows;
    }

    /**
     *Method that returns a book with all of its parameters.
     * @return Returns Book string with all the parameters of the book.
     */
    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author +
                ", publisher=" + publisher + ", numberOfPages=" + numberOfPages +
                ", publicationDate=" + publicationDate + ", format=" + format
                + ", genre=" + genre + ", numberOfBorrows=" + numberOfBorrows + '}';
    }
    
    /**
     * Main method.
     * @param args 
     */
    public static void main(String[] args) {

    }
    
    /**
     * The method compares the authors of the books.
     * @param o - object of class Book.
     * @return Comparison between the authors of the books.
     */
    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.getAuthor());
    }
}
