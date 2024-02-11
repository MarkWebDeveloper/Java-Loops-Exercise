package dev.mark;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Iterator iterator = new Iterator(6);
        System.out.println(iterator.printMultTable(iterator.getSelectedNumber()));
    }
}
