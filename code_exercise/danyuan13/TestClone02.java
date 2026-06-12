package java_code.danyuan13;

public class TestClone02 {
  public static void main(String[] args) throws CloneNotSupportedException{
    System.out.println();

    House house1 = new House(1,1750.50);
    House house2 = (House)house1.clone();
  }
}


class House implements Cloneable,Comparable<House>{
  private int id;
  private double area;
  private java.util.Date whenBuilt;

  House(){
    whenBuilt = new java.util.Date();
  }

  House(int id,double area){
    this.id = id ;
    this.area = area;
    whenBuilt = new java.util.Date();
  }

  public int getId(){ return id;}
  public double getArea(){ return area;}
  public java.util.Date getWhenBuilt(){ return whenBuilt;}


  @Override
  protected Object clone() throws CloneNotSupportedException{               //  实 现 Cloneable接口  =>  实现clone()方法
    return super.clone();
  }


  @Override
  public int compareTo(House o){                                        //   实现 Comparable<E>接口  =>  实现Arrays.sort()方法
    if (this.area > o.area) return 1;
    else if (this.area < o.area) return -1;
    else return 0;
  }
}