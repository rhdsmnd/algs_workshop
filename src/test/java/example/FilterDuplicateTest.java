package example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilterDuplicateTest {

    @Test
    public void filterSimpleCase() {
        List<Tweet> tweets = Arrays.asList(
                new Tweet("Jon A.", "Book tour starting today!"),
                new Tweet("Mary E.", "On the road again"),
                new Tweet("Jon A.", "Live on stage rn"),
                new Tweet("David F.", "Brunch vibes"),
                new Tweet("Jon A.", "Had a great show today")
        );

        List<String> authors = FilterDuplicates.getDailyAuthors(tweets.iterator());

        assertEquals(3, authors.size());
        assertTrue(authors.contains("Jon A."));
        assertTrue(authors.contains("Mary E."));
        assertTrue(authors.contains("David F."));
    }

    @Test
    public void noDups() {
        List<Tweet> tweets = Arrays.asList(
                new Tweet("Jon A.", "Book tour starting today!"),
                new Tweet("Mary E.", "On the road again"),
                new Tweet("David F.", "Brunch vibes")
        );

        List<String> authors = FilterDuplicates.getDailyAuthors(tweets.iterator());

        assertEquals(3, authors.size());
        assertTrue(authors.contains("Jon A."));
        assertTrue(authors.contains("Mary E."));
        assertTrue(authors.contains("David F."));
    }

    @Test
    public void filterOneAuthor() {
        List<Tweet> tweets = Arrays.asList(
                new Tweet("Jon A.", "Book tour starting today!"),
                new Tweet("Jon A.", "Had a great show today")
        );

        List<String> authors = FilterDuplicates.getDailyAuthors(tweets.iterator());

        assertEquals(1, authors.size());
        assertTrue(authors.contains("Jon A."));
    }

}
