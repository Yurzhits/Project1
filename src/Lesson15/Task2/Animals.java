package Lesson15.Task2;

import java.util.ArrayDeque;

public class Animals {
    private ArrayDeque<String> names = new ArrayDeque<>();

    public void addAnimal (String name){
        names.offerFirst(name);
    }

    public void deleteAnimal (){
        names.pollLast();
    }

    public void names (){
        System.out.println(names);
    }
}
