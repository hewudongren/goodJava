package com.jwi.多态的练习;

public class Bjb  {
  public void run(){
      System.out.println("我正在运行");
  }
  public void guanji(){
      System.out.println("我正在关机");
  }

  public void shiyongUSB(Usb usb) {
      usb.close();
      usb.open();
  }
}
