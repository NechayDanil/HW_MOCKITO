import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    @Test
    public void test() {
        Manager manager = new Manager();
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFive() {
        Manager manager = new Manager();
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSix() {
        Manager manager = new Manager();
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");
        manager.addMoves("Film 6");
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLast() {
        Manager manager = new Manager();
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSixLast1() {
        Manager manager = new Manager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSixLastss() {
        Manager manager = new Manager();
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");
        manager.addMoves("Film 6");
        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSixLastsss() {
        Manager manager = new Manager();
        manager.addMoves("Film 1");
        manager.addMoves("Film 2");
        manager.addMoves("Film 3");
        manager.addMoves("Film 4");
        manager.addMoves("Film 5");
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}