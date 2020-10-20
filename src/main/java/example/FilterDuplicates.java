package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FilterDuplicates {

    public static List<String> getDailyAuthors(Iterator<Tweet> tweetStream) {
        HashSet<String> seenAuthors = new HashSet<String>();

        while (tweetStream.hasNext()) {
            Tweet tweet = tweetStream.next();
            String author = tweet.getAuthor();

            if (seenAuthors.contains(author)) {
                continue;
            } else {
                seenAuthors.add(author);
            }
        }

        List<String> seenAuthorsList = new ArrayList<String>();
        seenAuthorsList.addAll(seenAuthors);

        return seenAuthorsList;
    }


}
