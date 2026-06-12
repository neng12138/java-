package code_week13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise17_15 {
    public static void main(String[] args) throws IOException {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a inputfilename: ");
        String f1 = scanner.next();
        File file1 = new File(Exercise17_14.class.getResource("").getPath()+f1);    // 加密文件

        if (file1.exists()){
            System.out.print("Enter a outputfilename: ");
            String f2 = scanner.next();
            File file2 = new File(Exercise17_14.class.getResource("").getPath()+f2);    // 解密文件

            Scanner intput = new Scanner(file1);
            PrintWriter output = new PrintWriter(file2);

            while (intput.hasNext()){
                output.print(intput.nextInt()+" ");

                for (int i = 0; i < 5; i++) {
                    intput.nextInt();
                }
            }
            output.close();
            intput.close();

        }
        else System.out.println("The filename is not created");

    }
}
