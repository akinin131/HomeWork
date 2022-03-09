package Lesson8;

import java.util.HashMap;
import java.util.Map;

public class Normal {

    public static void main(String[] args) {
        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", 23));
        customerMap.put("2", new Customer("Олег", 17));
        customerMap.put("3", new Customer("Максим", 48));
        customerMap.put("4", new Customer("Евгения", 67));
        GetOne(customerMap, 22, 100);
    }


    public static void GetOne(HashMap<String, Customer> customerMap, int a,int b){
        HashMap<String, Customer> MapOne = new HashMap<>();
        for(Map.Entry<String, Customer> entry : customerMap.entrySet()){
            if(entry.getValue().getAge()> a && entry.getValue().getAge()> a){
                MapOne.put(entry.getKey(),entry.getValue());
            }

        }
        for (Map.Entry<String, Customer> entry : MapOne.entrySet()) {
            System.out.println(entry.getKey() + " name: " + entry.getValue().getName() + ", Age: " + entry.getValue().getAge());

        }
    }



}
