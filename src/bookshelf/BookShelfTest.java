package bookshelf;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("book1");
        shelfQueue.enQueue("book2");
        shelfQueue.enQueue("book3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());

    }
}
