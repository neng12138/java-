package code_week10;

import java.util.ArrayList;

public class USBDeviceDemo {
  public static void main(String[] args) {
    System.out.println();

    Computer computer = new Computer();             //  电脑只有3个USB口

    computer.connectUSB(new HDD(),2);
    computer.connectUSB(new SSD(125.81),2);
    computer.connectUSB(new USBMouse(),1);
    System.out.println();

    computer.show_totalUSB();



    computer.connectUSB(new SSD(),1);
    computer.connectUSB(new HDD(1000),3);
    System.out.println();

    computer.show_totalUSB();

    computer.setCapacity(1,1000);
    computer.connectUSB(new USBMouse(),3);
    computer.setCapacity(3,100);
    System.out.println("The total computer capacity is "+computer.getTotalCapacity()+"G");


  }
}


class Computer{
  private USB[] usbs = new USB[3];

  public void connectUSB(USB staff,int USB_number){                   //   给 USB接口 插上设备 （ 保存在usbs数组中 ）
    if(USB_number > 3 && USB_number < 1){
      System.out.println("The USB interfece Error");
      return;
    }

    if (usbs[USB_number-1] != null){
      usbs[USB_number-1].setWorking(false);
      System.out.print("The USB"+USB_number+" : ");
      usbs[USB_number-1].work();
    }

    usbs[USB_number-1] = staff;
    staff.setWorking(true);

    System.out.print("The USB"+USB_number+" : ");
    staff.work();
  }

  public double getTotalCapacity(){                                  //   获取USB接口的capacity总和 （ 查数组usbs ）
    double sum = 0;
    for( USB staff : this.usbs){
      if (staff != null && (staff instanceof StorageDevice) ){
        sum += ((StorageDevice) staff).getCapacity();
      }
    }

    return sum;
  }

  public void setCapacity(int USB_number,double capacity){                                  //  修改USB接口设备的capacity的值
    if(USB_number > 3 || USB_number < 0) System.out.println("No this USB interface!");
    else{
      if (usbs[USB_number-1] == null) System.out.println("The USB interface no access device!");
      else if(usbs[USB_number-1] instanceof StorageDevice){
        ((StorageDevice)usbs[USB_number-1]).setCapacity(capacity);
      }
      else System.out.println("The device is not have capacity!");
    }
  }


  public void show_totalUSB(){                                                //  显示当前computer的接口情况
    System.out.println("The USB situtation :");
    int number = 1;
    for( USB staff : this.usbs){
      if (staff == null) System.out.println("The USB"+number+" is: null");
      else{
        System.out.print("The USB"+number+" is: ");
        staff.work();
      }

      number++;
    }
    System.out.println("The total computer capacity is "+getTotalCapacity()+"G"+'\n');
  }

}



abstract class USB{
  private boolean working = false;

  boolean isWorking(){ return working;}
  void setWorking(boolean working){ this.working = working;}

  abstract void work();
}


interface StorageDevice{
  double getCapacity();
  void setCapacity(double capacity);
}


class HDD extends USB implements StorageDevice{
  private double capacity = 256.0;

  HDD(){}

  HDD(double capacity){
    this.capacity = capacity;
  }

  public double getCapacity(){ return this.capacity;}
  public void setCapacity(double capacity){ this.capacity = capacity;}

  void work(){
    if (isWorking()) System.out.println("HDD 开始运行");
    else System.out.println("HDD 停止运行");
  }
}


class SSD extends USB implements StorageDevice{
  private double capacity = 256.0;

  SSD(){}

  SSD(double capacity){
    this.capacity = capacity;
  }

  public double getCapacity(){ return this.capacity;}
  public void setCapacity(double capacity){ this.capacity = capacity;}

  void work(){
    if (isWorking()) System.out.println("SSD 开始运行");
    else System.out.println("SSD 停止运行");
  }
}


class USBMouse extends USB{

  void work(){
    if (isWorking()) System.out.println("鼠标 开始运行");
    else System.out.println("鼠标 停止运行");
  }
}


