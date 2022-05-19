package com.bridgelab;


//types of variable
//local variable
//static variable
//instance variable

public class Main {

      int instancevar = 420;

      long instancevar2 = 360;

      boolean instancevar3 = true;
      static void m1(){
    }
    public static void main(String [] args){
        Main obj2 = new Main();
         m1();
         byte b = 123;
         short s = 2;
         int x = 0;
         long l = 23;
         double d = 20.6666;
         boolean val = true;// khujbjvh

        System.out.println(b);
        System.out.println(s);
        System.out.println(x);
        System.out.println(obj2.instancevar + "....."+ obj2.instancevar2 + "........" + obj2.instancevar3);
        // left part is non primitive data type along with referance variable
        int var = 2;
        Main obj1 = new Main();
        System.out.println(obj1.instancevar + "....."+ obj1.instancevar2 + "........" + obj1.instancevar3);

    }
}
