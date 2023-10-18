/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookManager {

    private final Scanner scanner;

    public BookManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addBook() {
        System.out.println("-------- Adding new book ----------");
        System.out.println("Enter title");
        Book book = new Book();
        book.setTitle(scanner.nextLine());
    }
    
}
