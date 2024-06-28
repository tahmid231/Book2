/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

class Book {
    // Class variable
    static String genre = "Fiction";

    // Object variables
    String title;
    String author;
    int year;

    // Parameterized constructor
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Object method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

    // Class method to display total number of books
    static int count = 0;
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 3 book objects
        Book book1 = new Book(getInput("Title 1: "), getInput("Author 1: "), Integer.parseInt(getInput("Enter year of 1st book: ")));
        Book book2 = new Book(getInput("Title 2: "), getInput("Author 2: "), Integer.parseInt(getInput("Enter year of 2nd book: ")));
        Book book3 = new Book(getInput("Title 3: "), getInput("Author 3: "), Integer.parseInt(getInput("Enter year of 3rd book: ")));

        // Increment the count for each book object created
        Book.count++;
        Book.count++;
        Book.count++;

        // Display book details
        System.out.println("Book 1 details:");
        book1.displayBookDetails();
        System.out.println("Book 2 details:");
        book2.displayBookDetails();
        System.out.println("Book 3 details:");
        book3.displayBookDetails();

        // Display total number of books
        Book.displayTotalBooks();
    }

    // Helper method to get input from user
    static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
