package com.company;

import java.util.Calendar;
public class News {
    private String title;
    private Calendar dateCreation;
    private Calendar dateChange;
    public News(String title) {
        this.title = title;
        this.dateCreation = Calendar.getInstance();
        this.dateChange = Calendar.getInstance();
    }
    public String getNews() {
        return this.title;
    }
    public Calendar getDateCreation() {
        return this.dateCreation;
    }
    public Calendar getDateChange() {
        return this.dateChange;
    }
    public void changeNews(String title) {
        this.title = title;
        this.dateChange = Calendar.getInstance();
    }


}