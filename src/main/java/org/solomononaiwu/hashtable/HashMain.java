package org.solomononaiwu.hashtable;

public class HashMain {
    public static void main(String[] args) {
        Employee solomonOnaiwu = new Employee("Solomon","Onaiwu");
        Employee mercyOkoduwa = new Employee("Mercy","Okoduwas");
        Employee osasDaniel = new Employee("Osas","Daniela");
        SimpleHashTable sh = new SimpleHashTable();

        sh.put("Onaiwu",solomonOnaiwu);
        sh.put("Okoduwas",mercyOkoduwa);
        sh.put("Daniela",osasDaniel);

        System.out.println(sh.get("Okoduwas"));
//        sh.printHashtable();

    }
}
