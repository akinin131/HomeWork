package com.company.lesson3;

import static jdk.internal.org.jline.utils.Log.info;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setAge(30);
        employee1.setFullname("Акинин Илья Сергеевич");
        employee1.setEmail("ilya@com.ru");
        employee1.setPhone("99999999");
        employee1.setPosition("Программист");
        employee1.setSalary(100000.0);

        employee2.setAge(50);
        employee2.setFullname("Полина Моисеева Олеговна");
        employee2.setEmail("email@com");
        employee2.setPhone("8888888");
        employee2.setSalary(1100000.0);
        employee2.setPosition("Химик технолог");

        employee3.setAge(60);
        employee3.setFullname("Василий Акинин Сергеевич");
        employee3.setEmail("email123@com");
        employee3.setPhone("8883244");
        employee3.setSalary(11340000.0);
        employee3.setPosition("SSM специалист");


        Employee[] arr = new Employee[3];
        arr[0] = employee1;
        arr[1] = employee2;
        arr[2] = employee3;
        int r = 0;

        for (int i = 0; i < arr.length; i++) {
            r = arr[i].getAge();
            if (r > 40) {
                arr[i].info();
            }
        }

    }
}
