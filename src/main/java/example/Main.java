package example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        if (args.length > 0 && args[0].equals("Filter")) {
            testFilterDups();
        } else {
            testReverseLL();
        }
    }

    public static void testReverseLL() {

        Node third = new Node(3, null);
        Node second = new Node(2, third);
        Node first = new Node(1, second);


        System.out.println("Original List: " + first);
        System.out.println("Reversed List: " + ReverseLinkedList.reverseLL(first));

    }

    public static void testFilterDups() {

        List<Tweet> tweets = Arrays.asList(
                    new Tweet("Jon A.", "Book tour starting today!"),
                    new Tweet("Mary E.", "On the road again"),
                    new Tweet("Jon A.", "Live on stage rn"),
                    new Tweet("David F.", "Brunch vibes"),
                    new Tweet("Jon A.", "Had a great show today")
                );
        List<String> authors = FilterDuplicates.getDailyAuthors(tweets.iterator());

        String authorsList = "";
        for (String author: authors) {
            authorsList += "\"" + author + "\", ";
        }
        authorsList = authorsList.substring(0, authorsList.length() - 2);

        System.out.println("Number of authors: " + authors.size());
        System.out.println("Authors are: " + authorsList);
    }
}
