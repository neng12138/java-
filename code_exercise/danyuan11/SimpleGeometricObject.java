package java_code.danyuan11;

public class SimpleGeometricObject {                                 //  几 何 图 形
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;


  public SimpleGeometricObject(){
    dateCreated = new java.util.Date();
  }

  public SimpleGeometricObject(String color,boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }


  public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color = color;
  }


  public boolean isFilled(){
    return filled;
  }
  public void setFilled(boolean filled){
    this.filled = filled;
  }


  public String getDateCreated(){
    return dateCreated.toLocaleString();
  }


  //     重写Object的toString方法
  public String toString(){
    return "create on "+getDateCreated()+"\ncolor: "+color+" and filled: "+filled+'\n';
  }

}

//                 继承  --  将一些共用的属性和方法放在父类上，子类直接继承 （不满意子类重写）

