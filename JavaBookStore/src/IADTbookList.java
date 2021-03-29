/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanka
 */
public interface IADTbookList {

    /**
     *Adds new book to the list.
     * @param item - object of class Book.
     */
    public void add(Book item);

    /**
     *Takes the title and return all the books with this title.
     * @param title - The title to be searched.
     * @return String with the Books with this title.
     */
    public String getByTitle(String title);

    /**
     *Takes All the author and returns all the books with that author.
     * @param author The author to be searched by.
     * @return String with all the Books with this author.
     */
    public String getByAuthor(String author);

    /**
     * Takes genre and returns all the books with that genre.
     * @param genre - The genre to be searched.
     * @return String with all books with that genre.
     */
    public String getByGenre(String genre);

    /**
     * Return all the books currently in the list.
     * @return All the books in the list.
     */
    public String getAll();    
}
