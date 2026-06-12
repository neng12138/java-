package Counter_homework;


public class ComplexDemo {
    private final double real;                       //  实部
    private final double imag;                      //  虚部
    private final String status;                   //  复数

    public ComplexDemo(double real,double imag){           //  输入实部与虚部
        this.real = real;
        this.imag = imag;

        if (imag == 0 ) this.status = ""+real;
        else if (imag == 1) this.status = ""+real+"+i";
        else if (imag == -1) this.status = ""+real+"-i";
        else if (imag > 0) this.status = ""+real+"+"+imag+"i";
        else this.status = ""+real+imag+"i";
    }

    public ComplexDemo(String status){                    //  输入一个复数字符串
        if (isComplex(status)){
            int number =  Complex_judge(status);
            this.status = Complex_trim(status);

            double[] doubles = getForm(number,this.status);
            this.real = doubles[0];
            this.imag = doubles[1];
        }
        else throw new IllegalArgumentException("复数形式错误");       // 抛出异常
    }

    public double getReal(){ return real; }                  // 获取实部
    public double getImag(){ return imag; }                 // 获取虚部
    public String getStatus(){ return status; }            // 获取复数（字符串）


    private static String Complex_trim(String s){
        String[] s1 = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        for (String x : s1){
            if (!x.equals(" ")) s2.append(x);
        }
        return s2.toString();
    }          //  去空格,并返回去空格后的字符串


    private static int Complex_judge(String s){       //  matches(完全匹配)
        s = Complex_trim(s);

        if (s.matches("[+-]?\\d+\\.?\\d*[+-]\\d*\\.?\\d*i")) return 1;    //  a+bi a-bi -a+bi -a-bi  +a+bi  +a-bi
        else if (s.matches("[+-]?\\d*\\.?\\d*i")) return 2;          //  bi  -bi   +bi
        else if (s.matches("[+-]?\\d+\\.?\\d*")) return 3;          //  a  -a   +a
        else return 0;                   //  不是复数的形式
    }            //  判断复数的形式


    public static boolean isComplex(String s){

        return Complex_judge(s) != 0;
    }          //  判断复数形式是否正确（静态方法）


    private double[] getForm(int number,String s){
        if (s.charAt(0) == '+'){
            s = s.substring(1);
        }
        String cut,sign,re=null,unre=null;
        int mon=0;

        switch (number){
            case 1:{
                if (s.contains("+")){sign="+"; cut="1"; mon=1; }           //          a+bi   -a+bi
                else {sign="-"; cut="-1"; }                        //          a-bi    -a-bi

                re = s.substring(0,s.lastIndexOf(sign));
                if (s.lastIndexOf(sign)+1 == s.indexOf('i')) unre = cut;
                else unre = s.substring(s.lastIndexOf(sign)+mon,s.indexOf('i'));
            }break;
            case 2:{
                if (s.contains("-")){cut="-1"; mon=1;}             //  -bi
                else {cut="1";}                            //  bi

                re = "0";
                if (s.indexOf('i') == mon) unre = cut;
                else unre = s.substring(0,s.indexOf('i'));
            }break;
            case 3:{                                           //  a  -a
                re = s;
                unre = "0";
            }
        }

        assert re != null;
        double real_other = Double.parseDouble(re);
        double imag_other = Double.parseDouble(unre);

        return new double[]{real_other,imag_other};
    }         // 根据不同的形式来获取复数的实部和虚部


    public double model(){
        return Double.parseDouble(String.format("%.4f",Math.sqrt(real*real+imag*imag)));
    }                                             //  模的计算（获取复数的模）


    public ComplexDemo add(ComplexDemo complexDemo){
        double re = Double.parseDouble(String.format("%.4f", this.real + complexDemo.getReal()));
        double im = Double.parseDouble(String.format("%.4f",this.imag + complexDemo.getImag())) ;
        return new ComplexDemo(re,im);
    }                       //  加法运算


    public ComplexDemo subtract(ComplexDemo complexDemo){
        double re = Double.parseDouble(String.format("%.4f", this.real - complexDemo.getReal()));
        double im = Double.parseDouble(String.format("%.4f", this.imag - complexDemo.getImag()));
        return new ComplexDemo(re,im);
    }                 //  减法运算


    public ComplexDemo multiply(ComplexDemo complexDemo){
        double re = Double.parseDouble(String.format("%.4f", (this.real*complexDemo.getReal()-this.imag*complexDemo.getImag()) ));
        double im = Double.parseDouble(String.format("%.4f", (this.real*complexDemo.getImag()+this.imag*complexDemo.getReal()) ));
        return new ComplexDemo(re,im);
    }                //  乘法运算


    public ComplexDemo divide(ComplexDemo complexDemo){
//        if(complexDemo.getReal() == 0 && complexDemo.getImage() == 0) return "0";

        double re = Double.parseDouble(String.format("%.4f",(real*complexDemo.getReal()+imag*complexDemo.getImag())
                /(complexDemo.getReal()*complexDemo.getReal()+complexDemo.getImag()*complexDemo.getImag()) ));
        double im = Double.parseDouble(String.format("%.4f",(imag*complexDemo.getReal()-real*complexDemo.getImag())
                /(complexDemo.getReal()*complexDemo.getReal()+complexDemo.getImag()*complexDemo.getImag()) ));
        return new ComplexDemo(re,im);
    }                 //  除法运算

}
