package Program;

import entities.Comment;
import entities.Post;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome");

        Post post1 = new Post(sdf.parse("21/06/2018 20:08:10"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        Post post2 = new Post(sdf.parse("28/07/2018 20:08:10"), "Good night guys", "See you tomorrow", 100);
        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post2);

        sc.close();
    }

}