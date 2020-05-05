package com.company;

public class Main {

    public static void main(String[] args) {

        // Declarations
        ClassList CollectionList = new ClassList();
        ClassSet CollectionSet = new ClassSet();
        ClassMap CollectionMap = new ClassMap();

        // Add to Collection LIST
        CollectionList.add("H");
        CollectionList.add("H");
        CollectionList.add("14");
        CollectionList.add("H");
        CollectionList.add("J");

        // Add to Collection SET
        CollectionSet.add("A");
        CollectionSet.add("A");
        CollectionSet.add("G");
        CollectionSet.add("A");
        CollectionSet.add("2");

        // Add to Collection MAP
        CollectionMap.add(1, "Primero");
        CollectionMap.add(2, "Segundo");
        CollectionMap.add(3, "Tercero");
        CollectionMap.add(4, "Cuarto");
        CollectionMap.add(6, "Java");

        // Manual prints
        System.out.println(CollectionList.getList());
        System.out.println(CollectionSet.getArray());
        System.out.println(CollectionMap.getMapByKey(6));
        System.out.println(CollectionMap.getMap());

        // Methods with print integrated
        CollectionList.printCharacter("H");
        CollectionSet.printCharacter("2");
        CollectionMap.printCharacterByKey(4);

        // Delete items from the Collections
        System.out.println(CollectionList.deleteElement("14"));
        System.out.println(CollectionSet.deleteElement("G"));
        System.out.println(CollectionMap.deleteElement(1, "Primero"));

        // Reverse order
        System.out.println(CollectionList.orderReverse());
        /* System.out.println(CollectionSet.orderReverse()); */
        CollectionMap.orderReverse();
    }
}
