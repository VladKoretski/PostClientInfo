package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Иван";
        post.surname = "Иванов";
        post.passport = "9999 № 999999";
        post.patronomyc = "Иванович";
        post.phone = "+7 (963)-999-99-99";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1996;
    }
}