package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1111 № 111111";
        post.patronymic = "Иванович";
        post.phone = "+7 (888) 111-11-22";
        post.surname = "Иванов";
        post.subscription = "true";

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 4;
        post.birthday.year = 1996;
    }
}