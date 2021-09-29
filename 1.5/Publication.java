package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    public String name;
    public int rate;
    public String text;
    public List<Comment> comments = new ArrayList<>();
    public List<String> tags = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setComments(Comment ... coms){
        for (Comment c: coms)
            this.comments.add(c);
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setTags(String ... tags){
        for (String s: tags)
            this.tags.add(s);
    }

    private String tagsString(){
        if (tags.isEmpty()) return "Нет тэгов";

        String toRet = "Тэги: ";
        for (String s: tags)
            toRet += s + ", ";
        toRet += "\b\b";
        return toRet;
    }

    private String comString(){
        if (comments.isEmpty()) return "Нет комментариев";

        String toRet = "Комментарии: \n";
        for (Comment c: comments)
            toRet += c;
        toRet += "\b";
        return toRet;
    }



    public String toString(){
        return "(" + rate + ")" + " " + name + "\n\n" + tagsString() +"\n\n" + text + "\n" + comString();
    }
}
