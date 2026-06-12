package Counter_homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStringDemo {
    public static void main(String[] args) {
        System.out.println("Open:");

//        String  s = " a +bi ";                         //  去空格
//        String[] s1 = s.split(" ");
//        String s2 = "";
//        for (String x : s1){
//            if (!x.equals(" ")) s2 = s2+x;
//        }
//        s = s2;
//        System.out.println(s);


//        while (true){                                    //  简单判断
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter a String:");
//            String s = input.nextLine();
////        input.nextLine();
//            if (s.matches("\\d+[+-]\\d*i")) System.out.println("a+bi 或 a-bi");
//            else if (s.matches("-\\d+[+-]\\d*i")) System.out.println("-a+bi 或 -a-bi");
//            else if (s.matches("\\d+")) System.out.println("a");
//            else if (s.matches("-\\d+")) System.out.println("-a");
//            else if (s.matches("\\d*i")) System.out.println("bi");
//            else if (s.matches("-\\d*i")) System.out.println("-bi");
//            else System.out.println("error");
//
//            System.out.println();
//        }



//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a String:");
//        String s = input.nextLine();
//        double real,unreal;
//        String re,unre;

        //  a+bi
//        re = s.substring(0,s.indexOf('+'));
//        if (s.indexOf('+')+1 == s.indexOf('i')){
//            unre = "1";
//        }
//        else unre = s.substring(s.indexOf('+')+1,s.indexOf('i'));


        //  a-bi
//        re = s.substring(0,s.indexOf('-'));
//        if (s.indexOf('-')+1 == s.indexOf('i')) unre = "-1";
//        else unre = s.substring(s.indexOf('-'),s.indexOf('i'));

        // -a+bi
//        re = s.substring(0,s.indexOf('+'));
//        if (s.indexOf('+')+1 == s.indexOf('i')) unre ="1";
//        else unre = s.substring(s.indexOf('+')+1,s.indexOf('i'));

        // -a-bi
//        re = s.substring(0,s.lastIndexOf('-'));
//        if (s.lastIndexOf('-')+1 == s.indexOf('i')) unre = "-1";
//        else unre = s.substring(s.lastIndexOf('-'),s.indexOf('i'));

//          a
//        re = s;
//        unre = "0";

//         -a
//        re = s;
//        unre = "0";

        // bi
//        re = "0";
//        if (s.indexOf('i') == 0) unre = "1";
//        else unre = s.substring(0,s.indexOf('i'));

        // -bi
//        re = "0";
//        if (s.indexOf('i') == 1) unre = "-1";
//        else unre = s.substring(0,s.indexOf('i'));



//        real = Double.parseDouble(re);
//        unreal = Double.parseDouble(unre);
//        System.out.println(re +"  "+ unre);
//        System.out.println(real+"  "+unreal);



//        while (true){                                    //  复数判断
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter a String:");
//            String s = input.nextLine();
//
//            if (s.matches("\\d+\\.?\\d*[+-]\\d*\\.?\\d*i") || s.matches("-\\d+\\.?\\d*[+-]\\d*\\.?\\d*i")) System.out.println(1);
//            else if (s.matches("\\d*\\.?\\d*i") || s.matches("-\\d*\\.?\\d*i")) System.out.println(2);
//            else if (s.matches("\\d+\\.?\\d*") || s.matches("-\\d+\\.?\\d*")) System.out.println(3);
//            else System.out.println(0);
//
//            System.out.println();
//        }

//        double x = 0;
//        double x1 = 0.0;
//        System.out.println(x==0);
//        System.out.println(x1==0);

//        double x = 4.1;
//        double x1 = 4.0;
//        if (x-(int)x > 0) System.out.println(true);
//        else System.out.println(false);
//
//        if (x1-(int)x1 > 0) System.out.println(true);
//        else System.out.println(false);

//        String s = "+2-2i";
//        if (s.charAt(0) == '+'){
//            s = s.substring(1);
//            System.out.println(s);
//        }
//        else System.out.println(s);

//        while (true) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter a String:");
//            String s = input.next();
//
////            if (s.matches("\\[\\s+-]?\\d+\\.?\\d*[+-]\\d*\\.?\\d*i")) System.out.println(1);
////            //  a+bi a-bi -a+bi -a-bi  +a+bi  +a-bi
////            else if (s.matches("\\[\\s+-]?\\d*\\.?\\d*i")) System.out.println(2);
////            //  bi  -bi   +bi
////            else if (s.matches("\\[\\s+-]?\\d+\\.?\\d*")) System.out.println(3);
////            //  a  -a   +ai
////            else System.out.println(0);
//
//            if (s.matches("[+-]?\\d+\\.?\\d*[+-]\\d*\\.?\\d*i")) System.out.println(1);
//            else System.out.println(0);
//        }



//        Scanner input = new Scanner(System.in);
//        String s = input.next();                           //  格式正确 (问题：优先级，符号一致)
//        ComplexDemo complexDemo;
//        String[] string = s.split("[+-]",2);
//        for(String x : string){
//            System.out.print(x+"  ");
//        }
//        complexDemo = new ComplexDemo(string[0]);
//        for (int i = 1; i < string.length; i++) {
//            complexDemo = complexDemo.add(new ComplexDemo(string[i]));
//        }
//        System.out.println('\n'+complexDemo.getStatus());


//        while (true) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a String:");
//            String s = input.next();                          //  1.没空格   2.复数格式正确
//            ArrayList<String> strings = new ArrayList<>();
//            int flag = 0;
//
//            if (s.contains("*")){
////                 s = s.replaceAll("[*]","");             //  (2-2i)*3 ->  2-2i  3
//                 String[] str =  s.split("[()*]");
//                 for(String text : str){
//                     if (!text.isEmpty()) strings.add(text);
//                 }
//                 flag = 1;
//            }
//            else if (s.contains("/")){
////                s = s.replaceAll("[/]","");
//                String[] str =  s.split("[()/]");
//                for(String text : str){
//                    if (!text.isEmpty()) strings.add(text);
//                }
//                flag = 2;
//            }
//            else if (s.contains("➖")){
////                s = s.replaceAll("➖","");
//                String[] str =  s.split("[➖]");
//                for(String text : str){
//                    if (!text.isEmpty()) strings.add(text);
//                }
//                flag = 3;
//            }
//            else if (s.contains("➕")){
////                s = s.replaceAll("➕","");
//                String[] str =  s.split("[➕]");
//                for(String text : str){
//                    if (!text.isEmpty()) strings.add(text);
//                }
//                flag = 4;
//            }
//
//            ComplexDemo complexDemo = new ComplexDemo(strings.get(0));
//            for (int i = 1; i < strings.size(); i++) {
//                switch (flag){
//                    case 1: complexDemo = complexDemo.multiply(new ComplexDemo(strings.get(i)));break;
//                    case 2: complexDemo = complexDemo.divide(new ComplexDemo(strings.get(i)));break;
//                    case 3: complexDemo = complexDemo.subtract(new ComplexDemo(strings.get(i)));break;
//                    case 4: complexDemo = complexDemo.add(new ComplexDemo(strings.get(i)));
//                }
//            }
//            System.out.println(complexDemo.getStatus());
//        }


//        Pattern p = Pattern.compile("\\d+");                        // Matcher类 -> 匹配
//        System.out.println("==========find 方法==========");
//        Matcher m = p.matcher("aaa2223bb2223");
//        m.find();
//        System.out.println(m.find());// 匹配2223
//        System.out.println(m.start());// 返回3
//        System.out.println(m.end());// 返回7,返回的是2223后的索引号
//        System.out.println(m.group());// 返回2223
//
//        System.out.println(m.find());// 匹配2223
//        System.out.println(m.start());// 返回3
//        System.out.println(m.end());// 返回7,返回的是2223后的索引号
//        System.out.println(m.group());// 返回2223

//        while (m.find()){
//            System.out.println(m.start());// 返回3
//            System.out.println(m.end());// 返回7,返回的是2223后的索引号
//            System.out.println(m.group());// 返回2223
//        }


//        while (true) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a String:");
//            String s = input.next();                          //  1.没空格   2.复数格式正确
//            ArrayList<String> strings = new ArrayList<>();
//            ArrayList<Integer> list = new ArrayList<>();       // 标记 ： 0-》+   1-》-   2-》*  3-》/
//
//            if (s.contains("➕") || s.contains("➖")){             //  加 减 混 用
//                Pattern p = Pattern.compile("[➕➖]");
//                Matcher m = p.matcher(s);
//                while (m.find()){
////                    System.out.println(m.group());
//                    if (m.group().equals("➕")) list.add(0);
//                    else list.add(1);
//                }
//
//                String[] str =  s.split("[➕➖]");
//                for(String text : str){
//                    if (!text.isEmpty()) strings.add(text);
//                }
//            }
//            else if (s.contains("*") || s.contains("/")){          //  乘 除 混 用
//                Pattern p = Pattern.compile("[*/]");
//                Matcher m = p.matcher(s);
//                while (m.find()){
////                    System.out.println(m.group());
//                    if (m.group().equals("*")) list.add(2);
//                    else list.add(3);
//                }
//
//                String[] str =  s.split("[()*/]");
//                for(String text : str){
//                    if (!text.isEmpty()) strings.add(text);
//                }
//            }
//
//            ComplexDemo complexDemo = new ComplexDemo(strings.get(0));
//            for (int i = 1; i < strings.size(); i++) {
//                switch (list.get(i-1)){
//                    case 0: complexDemo = complexDemo.add(new ComplexDemo(strings.get(i)));break;
//                    case 1: complexDemo = complexDemo.subtract(new ComplexDemo(strings.get(i)));break;
//                    case 2: complexDemo = complexDemo.multiply(new ComplexDemo(strings.get(i)));break;
//                    case 3: complexDemo = complexDemo.divide(new ComplexDemo(strings.get(i)));
//                }
//            }
//            System.out.println(complexDemo.getStatus());
//        }


        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a String:");
            String s = input.next();                          //  1.没空格   2.复数格式正确
            ArrayList<String> strings = new ArrayList<>();      // 记录每个复数的字符串的形式
            ArrayList<Integer> list = new ArrayList<>();       //  记录复数间的运算关系
            // 标记 ： 0-》+   1-》-   2-》*  3-》/

            Pattern p = Pattern.compile("[➕➖*/]");       //  制 定 匹 配 规 则
            Matcher m = p.matcher(s);                    //  设 置 匹 配 器
            while (m.find()){                           //  find() -》  局部搜索
//                System.out.println(m.group());
                switch (m.group()) {                  //  判断运算的类型
                    case "➕": list.add(0);break;
                    case "➖": list.add(1);break;
                    case "*": list.add(2);break;
                    case "/": list.add(3);break;
                }
            }

            String[] str =  s.split("[➕➖()*/]");         //  划分原字符串，存储每个复数的字符串形式
            for(String text : str){
                if (!text.isEmpty()) strings.add(text);       //  用列表strings记录
            }
//            System.out.println(strings);
//            System.out.println(list);

            if (list.contains(2) || list.contains(3)) {         // 根据优先级会先进行乘除运算（更新strings 和 list）
                for (int i = 0; i < list.size();) {
                    boolean flag = true;
                    if (list.get(i) == 2){   //  *
                        ComplexDemo x = new ComplexDemo(strings.get(i)).multiply(new ComplexDemo(strings.get(i+1)));
                        strings.remove(i+1);
                        strings.remove(i);
                        list.remove(i);        //  删除乘号
                        strings.add(i,x.getStatus());      //  将乘运算的结果放回strings列表中
                        flag = false;
                    }
                    else if (list.get(i) == 3){   //  /
                        ComplexDemo x = new ComplexDemo(strings.get(i)).divide(new ComplexDemo(strings.get(i+1)));
                        strings.remove(i+1);
                        strings.remove(i);
                        list.remove(i);         // 删除除号
                        strings.add(i,x.getStatus());       //  将除运算的结果放回strings列表中
                        flag = false;
                    }
                    if (flag) i++;             //  如果没找到则向下继续找
                }
            }

            ComplexDemo complexDemo = new ComplexDemo(strings.get(0));
            for (int i = 1; i < strings.size(); i++) {         //  进行加减运算
                if (list.get(i-1) == 0) complexDemo = complexDemo.add(new ComplexDemo(strings.get(i)));
                else if (list.get(i-1) == 1) complexDemo = complexDemo.subtract(new ComplexDemo(strings.get(i)));
            }
            System.out.println("Result :"+complexDemo.getStatus());

            //  布局时最后 : strings.clear(); list.clear();   ->   清空

        }



        /*
                    最后的优化 ： 只用一个加号和减号
                           ->  让括号里的加号和减号不被处理...
        */




    }
}
