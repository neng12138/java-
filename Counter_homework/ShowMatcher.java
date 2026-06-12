package Counter_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShowMatcher {
    public static void main(String[] args) {
        System.out.println();

        Pattern p = Pattern.compile("\\d+");

        System.out.println("==========find 方法==========");
        Matcher m = p.matcher("aaa2223bb");
        System.out.println(m.find());// 匹配2223
        System.out.println(m.start());// 返回3
        System.out.println(m.end());// 返回7,返回的是2223后的索引号
        System.out.println(m.group());// 返回2223

        System.out.println("==========lookingAt 方法==========");
        m = p.matcher("2223bb");
        System.out.println(m.lookingAt()); // 匹配2223
        System.out.println(m.start()); // 返回0,由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时,start()方法总是返回0
        System.out.println(m.end()); // 返回4
        System.out.println(m.group()); // 返回2223

        System.out.println("==========matches 方法==========");
        m = p.matcher("2223bb");
        System.out.println(m.matches()); // 匹配整个字符串，返回false，所以后边的执行会报错
        System.out.println(m.start());
        System.out.println(m.end());
        System.out.println(m.group());

    }
}

/*
                匹配器类 Matcher ：   Matcher  m = Pattern.compile（匹配规则）.matcher（要匹配的字符串对象） ;
                               //   匹 配 规 则 -》 正 则 表 达 式
                                   字 符 串 对 象 -》 要 处 理 的 字 符 串 对 象


                匹配方式 ：   m.find() ->  局部匹配  （ 下次 m.find()时匹配位置会自动向后移动 ）
                             m.matches()  ->   完全匹配
                            m.lookingAt()  ->   开头匹配


                常用方法 ：   m.start() ->  返回匹配到的子串的第一个字符在原字符串中的索引位置
                            m.end()  ->   返回匹配到的子串的最后一个字符在原字符串中的索引位置 + 1
                            m.group()  ->  返回匹配到的子串

               //     m.reset()  ->  重置匹配器
 */
