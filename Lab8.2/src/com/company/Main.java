package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
    public static void main(String[] args) {
        News[] news = {
                new News("Хорошая новость"),
                new News("Новость про коронавирус"),
                new News("Новость про образование"),
                new News("Ещё одна новость про коронавирус"),
                new News("Новость про 5G")
        };
        ControllerNews controller = new ControllerNews(news);
        String[] path = {
                new String("view/1"),
                new String("edit/2"),
                new String("view/3"),
                new String("edit/4"),
                new String("view/5"),
        };
        for (String method : path) {
            StringTokenizer str = new StringTokenizer(method,"/");
            String[] result = new String[2];
            for(int i = 0;str.hasMoreTokens() == true;i++) {
                result[i] = str.nextToken();
            }
            if (result[result.length - 2].equals("view")) {
                controller.view(Integer.parseInt(result[result.length - 1]) - 1);
            }
            else if (result[result.length - 2].equals("edit")) {
                System.out.printf("Введіть новий текст новини для заміни (%s):",news[(Integer.parseInt(result[result.length - 1])) - 1].getNews());
                String newTitleNews = new Scanner(System.in).next();
                controller.edit(Integer.parseInt(result[result.length - 1]) - 1, newTitleNews);
            }
        }
    }
}
