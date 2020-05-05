package com.company;


import java.util.*;

public class ClassMap {

    public ClassMap() {
        this.myArrayMap = new HashMap<>();
    }

    private Map<Integer, String> myArrayMap;

    public void add(Integer key, String value){
        myArrayMap.put(key, value);
    }

    public String getMapByKey(Integer key){
        return this.myArrayMap.get(key);
    }
    public Map<Integer, String> getMap(){
            return this.myArrayMap;
    }
    public void printCharacterByKey(Integer key){

        System.out.println("Key: " + key + ", Value: " + this.myArrayMap.get(key));
    }

    public Map<Integer, String> deleteElement(Integer key, String value){
        this.myArrayMap.remove(key, value);
        return this.myArrayMap;
    }

    public void orderReverse(){
        ArrayList<Integer> keys = new ArrayList<>(this.myArrayMap.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            System.out.println(this.myArrayMap.get(keys.get(i)));
        }
    }

}
