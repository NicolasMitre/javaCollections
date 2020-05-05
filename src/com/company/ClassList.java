package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassList {
    public ClassList() {
        this.myArrayList = new ArrayList<>();
    }

    private List<String> myArrayList;

    public void add(String list){
        this.myArrayList.add(list);
    }

    public List<String> getList(){
        return this.myArrayList;
    }

    public void printCharacter(String character){
        for(int i = 0; i < this.myArrayList.size(); i++){
            if (this.myArrayList.get(i) == character) System.out.println(this.myArrayList.get(i));
        }
    }

    public List<String> deleteElement(String element){
        myArrayList.remove(element);
        return this.myArrayList;
    }

    public List<String> orderReverse(){
        Collections.sort(this.myArrayList, Collections.reverseOrder());
        return this.myArrayList;
    }
}
