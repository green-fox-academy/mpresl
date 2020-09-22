package com2.Models;

public class Message {
    private String error;
    private String welcome_message;

    public Message(String name, String title) {
        if (name == null && title == null) {
            this.error = "Please provide a name and a title!";
        } else if (name == null) {
            this.error = "Please provide a name!";
        } else if (title == null) {
            this.error = "Please provide a title!";
        } else {
            this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
    }

    public Message() {
    }


//    public Message(String name) {
//        this.name = name;
//        this.error = "Please provide a title!";
//    }
//
//    public Message(String title){
//        this.title = title;
//        this.error = "Please provide a name!";
//    }


    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
