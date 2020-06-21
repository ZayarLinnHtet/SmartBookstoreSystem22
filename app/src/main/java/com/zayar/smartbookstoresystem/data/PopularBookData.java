package com.zayar.smartbookstoresystem.data;

import android.content.Intent;

public class PopularBookData {

    private int bookId;
    private int bookImage;
    private String bookName;
    private String authorName;
    private String publishYear;
    private String categories;

    public PopularBookData() {

    }

    public PopularBookData(int bookImage, String bookName, String authorName, String publishYear, String categories) {
        this.bookImage = bookImage;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "PopularBookData{" +
                "bookId=" + bookId +
                ", bookImage='" + bookImage + '\'' +
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

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
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
