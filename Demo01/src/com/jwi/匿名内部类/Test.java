package com.jwi.匿名内部类;

public class Test {
    public static void main(String[] args) {
//        LanCat lanCat = new LanCat();
//        lanCat.eat();
        new Cat(){

            @Override
            public void eat() {
                System.out.println("吃鱼鱼哦");
            }
        }.eat();
    }
}
