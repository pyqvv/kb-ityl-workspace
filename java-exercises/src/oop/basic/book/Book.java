package oop.basic.book;

public class Book {
    private String title;
    private int price;

    public Book() {
    }

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
