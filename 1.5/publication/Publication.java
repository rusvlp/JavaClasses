package com.company.publication;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    final String name;
    public int rate;
    public String text;
    public List<Comment> comments = new ArrayList<>();
    public List<String> tags = new ArrayList<>();
    private boolean isCommented = false;
    private boolean isRatingChanged = false;

    public Publication(String name, int rate) {
        this.rate = rate;
        this.name = name;
    }

    public void setRate(int rate) {
        if (rate > 1 || rate < -1)
            throw new IllegalArgumentException("Publication's rating can be changed to 1 or -1");
        this.rate += rate;
    }

    public void setText(String text) {
        if (isCommented || isRatingChanged)
            throw new IllegalArgumentException("Publication's rating is changed, or publication was commented");
        this.text = text;
    }

    public void setComments(List<Comment> comments) {
        isCommented = true;
        this.comments = comments;
    }

    public void setComments(Comment ... coms){
        isCommented = true;
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

    public boolean isChangeble(){
        return !(isCommented || isRatingChanged);
    }

    public String toString(){
        return "(" + rate + ")" + " " + name + "\n\n" + tagsString() +"\n\n" + text + "\n" + comString();
    }
}

