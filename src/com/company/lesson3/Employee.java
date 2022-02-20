package com.company.lesson3;

public class Employee {
    private String fullname;
    private String position;
    private String email;
    private String phone;
    private Double salary;
    private int age;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void info() {

        System.out.println(" ФИО " + fullname + "Возрас = " + age + " Профессия " + position +
                " зарплата " + salary + " Телефон " + phone + " email " + email);

    }
}
