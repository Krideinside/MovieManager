import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MovieManager;

public class MovieManagerTest {

    @Test
    public void shouldAddFilms() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd0Films() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdd1Films() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        manager.findLast();

        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast3() {
        MovieManager manager = new MovieManager(3);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");

        manager.findLast();

        String[] expected = {"Film V", "Film IV", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast7() {
        MovieManager manager = new MovieManager(7);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IV");
        manager.add("Film V");
        manager.add("Film VI");
        manager.add("Film VII");

        manager.findLast();

        String[] expected = {"Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}