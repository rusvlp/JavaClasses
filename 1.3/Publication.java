package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    public String name;
    public int rate;
    public String text;
    public List<Comment> comments = new ArrayList<>();
    public List<String> tags = new ArrayList<>();

    
}
