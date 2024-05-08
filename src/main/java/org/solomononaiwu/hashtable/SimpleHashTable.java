package org.solomononaiwu.hashtable;

public class SimpleHashTable {
    private Employee[] hashTable;

    public SimpleHashTable(){
        this.hashTable = new Employee[10];
    }

    public void put(String key,Employee data){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null){
            System.out.println("Collision occured at "+hashedKey);
        } else {
            hashTable[hashedKey] = data;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printHashtable(){
        for (Employee e: hashTable){
            System.out.println(e);
        }
    }

    private int hashKey(String key){
        return key.length()%hashTable.length;
    }
}
