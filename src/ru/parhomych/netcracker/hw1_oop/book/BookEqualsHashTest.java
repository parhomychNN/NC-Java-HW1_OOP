package ru.parhomych.netcracker.hw1_oop.book;

public class BookEqualsHashTest {
    public static void main(String[] args) {
        Author author1 = new Author("Вася", "zefirko@mail.ru", 'm');
        Author author2 = new Author("Вася", "zefirko@mail.ru", 'm');
        Author author3 = new Author("Петяля", "lapot@mail.ru", 'f');

        Book book1 = new Book("Одинаковые авторы рулят", new Author[]{author1, author2},15.6);
        Book book2 = new Book("Одинаковые авторы рулят", new Author[]{author1, author2},15.6);
        Book book3 = new Book("Одинаковые авторы вообще не рулят", new Author[]{author1, author3},15.2);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        System.out.println();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);


        System.out.println("author1.equals(author2) --> " + author1.equals(author2));
        System.out.println("author1.equals(author3) --> " + author1.equals(author3));
        System.out.println("book1.equals(book2) --> " + book1.equals(book2));
        System.out.println("book1.equals(book3) --> " + book1.equals(book3));

        System.out.println();
        System.out.println("book1.hashCode() --> " + book1.hashCode());
        System.out.println("book2.hashCode() --> " + book2.hashCode());
        System.out.println("book3.hashCode() --> " + book3.hashCode());

        System.out.println();
        System.out.println("author1.hashCode() --> " + author1.hashCode());
        System.out.println("author2.hashCode() --> " + author2.hashCode());
        System.out.println("author3.hashCode() --> " + author3.hashCode());
    }
}
