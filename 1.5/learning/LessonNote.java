package com.company.learning;
import java.util.Map;
import java.util.HashMap;

public class LessonNote extends AbstractNote{
    private Map<String, Integer> notes = new HashMap<>();
    Predicate<Integer> predicate;

    public LessonNote(String name, Predicate<Integer> pr){
        super(name);
        this.predicate = pr;
    }

    public void addNote(String  key, Integer note){
        if (predicate!=null && predicate.filter(note))
            notes.put(key, note);
    }

    public double getValue(){
        double average = 0;

        for (Map.Entry<String, Integer> entry: notes.entrySet())
            average += (double)entry.getValue();

        return average/notes.entrySet().size();
    }

    @Override
    public String toString(){
        String tmp = "";

        for (String key: notes.keySet())
            tmp+= "["+ key + ": " + notes.get(key) + "], ";
        tmp+="\b\b";

        return this.name + ", все оценки: " + tmp;
    }
}
