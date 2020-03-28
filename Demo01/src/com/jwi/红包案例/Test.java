package com.jwi.红包案例;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        GroupMaster mayu = new GroupMaster("马玉", 100);
        ArrayList<Double> list = mayu.sendRedBag(50, 4);

        Menber xiaoliu = new Menber("小刘", 0);
        xiaoliu.kai(list);
    }
}
