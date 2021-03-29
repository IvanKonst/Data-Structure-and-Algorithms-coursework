/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *class BookNode
 * @author vanka
 */
public class BookNode {

    /**
     *Default Constructor.
     */
    public BookNode()
    {
        this.next = null;
    }

    /**
     *Sets a book as a node to the linked list.
     * @param book - object of class Book.
     */
    public BookNode(Book book) {
        this.book = book;
        this.next = null;
    }
    private Book book;
    private BookNode next;

    /**
     *Getter for the book.
     * @return the book.
     */
    public Book getBook() {
        return book;
    }

    /**
     *Setter for the book.
     * @param book - object of class Book.
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     *Returns the next element of the list.
     * @return the next element of the list.
     */
    public BookNode getNext() {
        return next;
    }

    /**
     *Sets the next book in the linked list.
     * @param next - object of class BookNode.
     */
    public void setNext(BookNode next) {
        this.next = next;
    }
    
}
