package com.jwi.红包案例;

import java.util.ArrayList;

public class GroupMaster extends User {
    public GroupMaster(String username, double leftMoney) {
        super(username, leftMoney);
    }
    //群主发红包
    public ArrayList<Double> sendRedBag(int money,int count){
        ArrayList<Double> list=new ArrayList<>();
        if(this.getLeftMoney()<money){
                return  null;
        }
        money=money*100/count;
        double item=money/count;
        int yu=money%count;
        for (int i = 0; i < count; i++) {
            if(i<count-1){
                list.add(item/100);
            }else {
                list.add((item+yu)/100);
            }
        }
        //自己的金额减少
        setLeftMoney(getLeftMoney()-money/100);
        return list;
    };
}
