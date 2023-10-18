/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class book {
    String title;
    int publishedYear;
    Author[] authors;

    public book() {
    }

    public book(String title, int publishedYear, Author[] authors) {
        this.title = title;
        this.publishedYear = publishedYear;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.title);
        hash = 17 * hash + this.publishedYear;
        hash = 17 * hash + Arrays.deepHashCode(this.authors);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final book other = (book) obj;
        if (this.publishedYear != other.publishedYear) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book{" + "title=" + title
                + ", publishedYear=" + publishedYear
                + ", authors=" + authors + '}';
    }
    
}
