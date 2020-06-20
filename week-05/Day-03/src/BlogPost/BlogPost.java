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

    public static void main(String[] args){
        BlogPost lorem = new BlogPost();
        lorem.author = "John Doe";
        lorem.text = "Lorem ipsum dolor sit amet";
        lorem.datePub = "2000.05.04";
        lorem.title = "Lorem Ipsum";
        lorem.sharePost();

        BlogPost wait = new BlogPost();
        wait.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        wait.author = "Tim Urban";
        wait.title = "Wait but why";
        wait.datePub = "2010.10.10";
        wait.sharePost();

        BlogPost engineer = new BlogPost();
        engineer.datePub = "2017.03.28";
        engineer.title = "One Engineer Is Tring to Get IBM to Reckon With Trump";
        engineer.author = "William Turton";
        engineer.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        engineer.sharePost();


    }

}
