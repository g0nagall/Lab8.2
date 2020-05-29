package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ControllerNews {
    private News[] arrayNews;
    public ControllerNews(News[] arrayNews) {
        this.arrayNews = arrayNews;
    }
    public void view(int id) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd.M.yyyy HH:mm:ss:SSS");
            System.out.println("Назва: " + arrayNews[id].getNews() + "\n" + "Дата створення: " + dateFormat.format(arrayNews[id].getDateCreation().getTime()) + "\n" + "Дата зміни: " + dateFormat.format(arrayNews[id].getDateChange().getTime()));
            System.out.println();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error:");
            ex.printStackTrace();
        }
    }
    public void edit(int id,String title) {
        try {
            arrayNews[id].changeNews(title);
            this.view(id);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error:");
            ex.printStackTrace();
        }
    }

}
