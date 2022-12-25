public class Main {
    public static void main(String[] args) {
        Author author1  = new Author("Лев", "Толстой");
        Author author2  = new Author("Алексей", "Толстой");
        System.out.println(author1);
        System.out.println(author2);
        Book book = new Book ("Война и мир", author1, 2021);
        Book book2 = new Book ("Труд и война", author2, 2022);
        System.out.println(book);
        System.out.println(book2);
    }
}
