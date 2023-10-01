public class Book {
    private static int counter = 0;
    private int id;
    private String title;
    private String author;
    private int pageCount;
    private String genre;
    private boolean isHardcover;
    private boolean isFiction;
    private int currentChapter;

    public Book() {
        id = ++ counter;
        System.out.println("Book" + id + " is opened.");
    }

    public void read() {}
    public void teach() {}
    public void has_pictures() {}
}
