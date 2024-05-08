package org.solomononaiwu.hashtable.jdk;

import org.solomononaiwu.hashtable.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashJdk {

    public static void main(String[] args) {
        Employee solomon = new Employee("Solomon","Onaiwu");
        Employee mercy = new Employee("Mercy","Onaiwu");
        Employee daniel = new Employee("Daniel","Onaiwu");

        Map<String,Employee> hashMap = new HashMap<>();
        hashMap.put("Solomon",solomon);
        hashMap.put("Mercy",mercy);
        hashMap.put("Daniel",daniel);
//
//        Iterator<Employee> iterator = hashMap.values().iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        hashMap.forEach((k,v)->{
//            System.out.println("KEY : "+k + " - "+"VALUE : "+v);
//        });
//
        for(Employee e: hashMap.values()) {
            System.out.println(e);
        }
    }
}
