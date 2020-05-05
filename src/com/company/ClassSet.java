package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassSet {
    public ClassSet() {
        this.myArraySet = new HashSet<>();
    }

    private Set<String> myArraySet;

    public void add(String list){
        this.myArraySet.add(list);
    }

    public Set<String> getArray(){
        return this.myArraySet;
    }

    public void printCharacter(String character){
        this.myArraySet.forEach (e -> {
            if(e.equals(character))
            {
                System.out.println(e);
            }
        });
    }

    public Set<String> deleteElement(String element){
        myArraySet.remove(element);
        return this.myArraySet;
    }
}
