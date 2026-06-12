package Counter_homework;

import java.util.Scanner;

public class ComplexText {
    public static void main(String[] args) {
        System.out.println();

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a Complex:");
            ComplexDemo c = new ComplexDemo("1+i");
            String s = input.nextLine();
//            if (ComplexDemo.isComplex(s)){
                ComplexDemo complexDemo = new ComplexDemo(s);
                System.out.print("The real is: "+complexDemo.getReal()+'\n');
                System.out.print("The image is: "+complexDemo.getImag()+'\n');
                System.out.println("The complex is: "+complexDemo.getStatus());
                System.out.println("The complex model is: "+complexDemo.model());
                System.out.println("add complex(1,1) is: "+complexDemo.add(c).getStatus());
                System.out.println("subtract complex(1,1) is: "+complexDemo.subtract(c).getStatus());
                System.out.println("multiply complex(1,1) is: "+complexDemo.multiply(c).getStatus());
                System.out.println("divide complex(1,1) is: "+complexDemo.divide(c).getStatus());
//            }
//            else System.out.println("Error");

            System.out.println();
        }



    }
}
