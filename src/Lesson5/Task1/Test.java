package Lesson5.Task1;

import Lesson5.Task1.IPhone;

public class Test {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("13ProMax","  металл",1200,100,1);
        IPhone iPhone1 = new IPhone("iPhone7","  металл",1200,100,1);
        System.out.println(iPhone1.equals(iPhone));


        System.out.println(iPhone.hashCode());
        System.out.println(iPhone1.hashCode());
    }
}
