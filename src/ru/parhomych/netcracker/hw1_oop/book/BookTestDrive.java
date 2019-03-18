package ru.parhomych.netcracker.hw1_oop.book;

public class BookTestDrive {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("******************** Home Work #1, OOP *********************");
        System.out.println("******************* by Parkhomenko Ilya ********************");
        System.out.println("*************************** Book ***************************");
        System.out.println("************************************************************");
        System.out.println();

        Author author1 = new Author("Шилдт", "shildt@ya.ru", 'm');
        Author author2 = new Author("Хорстманн", "horstmann@ya.ru", 'm');

        Author[] javaAuthors = {author1, author2};

        Book javaBook = new Book("Java", javaAuthors, 20.6, 2_000);

        System.out.println("Инфо о книге ниже:");
        System.out.println(javaBook);
        System.out.println("Авторы этой книги: " + javaBook.getAuthorNames());

        System.out.println("Меняем цену и количество:");
        javaBook.setPrice(40.5);
        javaBook.setQty(50_000);
        System.out.println(javaBook);
    }
}
