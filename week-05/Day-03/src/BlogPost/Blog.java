package BlogPost;

import java.util.ArrayList;

public class Blog {
    ArrayList<BlogPost> blog = new ArrayList<>();

    public void addBlogPost(BlogPost blogPost) {
        blog.add(blogPost);
    }

    void deleteBlogPost(int location){
        blog.remove(location);
    }
    void updatePost(int location, BlogPost blogPost){
        blog.add(location, blogPost);
    }

}
