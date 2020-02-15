package fr.nlco.biblioc.bibliocweb.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Model représentant un Livres
 */
@Getter
@Setter
public class Book implements Serializable {
    private String title;
    private String author;
    private String type;
    private Integer nbCopy;
    private Integer nbAvailable;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", nbCopy=" + nbCopy +
                ", nbAvailable=" + nbAvailable +
                '}';
    }
}
