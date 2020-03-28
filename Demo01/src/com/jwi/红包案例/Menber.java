package com.jwi.红包案例;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Random;

public class Menber extends User {
    public Menber(String username, double leftMoney) {
        super(username, leftMoney);
    }
    public void kai(ArrayList<Double> list){
        Random random = new Random();
        int i = random.nextInt(list.size());
        double v = getLeftMoney() + list.get(i);
        setLeftMoney(v);
        list.remove(i);
        System.out.println(getUsername()+"抢到了"+v);
    }
}
