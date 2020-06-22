package BlogPost;

public class BlogPost {
    String author;
    String title;
    String text;
    String datePub;

    public void sharePost(){
        System.out.println("\""+title+"\" written by "+author+" posted on "+datePub+".");
        System.out.println(text);
    }
}
