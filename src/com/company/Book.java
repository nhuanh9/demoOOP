package com.company;

public class Book {
    private String name;
    private double price;
    private int amount;
    private String category;
    private String author;

    public Book(String name, double price, int amount, String category, String author) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.category = category;
        this.author = author;
    }

    public Book() {

    }

    public Book(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

