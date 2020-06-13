package com.zayar.smartbookstoresystem.data;

public class BookData {

    private int bookId;
    private String bookName;
    private String authorName;
    private String publishYear;
    private String categories;

    public BookData() {

    }

    public BookData(int bookId, String bookName, String authorName, String publishYear, String categories) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "BookData{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", categories='" + categories + '\'' +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
