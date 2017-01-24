/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinggit;

/**
 *
 * @author Angel
 */
public class Movie {
    private  String title;
    private String author;
    private int numberPages;
    
    public Movie(String title, String author, int numberPages){
        
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }
}
