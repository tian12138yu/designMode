package com.company;

public class String1 {

    public static void main(String[] args) {
	// write your code here
        String a="a"+"dada";
        System.out.println(a);
        /**
         * 通过“”直接创建的string和new出的不是同一个对象，一个是存在堆中，一个是存在string常量池中
         */
        String s1="a";
        String s2=new String("a");
        System.out.println(s1==s2);//false
        System.out.println(s1==s2.intern());
//        System.out.println("56666"+s2==s2.intern());

        /**
         * 两个对象通过+拼接形成的String会通过StringBuild拼接返回一个string的实例对象，跟直接“”创建不是同一个对象。
         */
        String s3="ab";
        String s4="cd";
//        String s5=s3+s4;
        String s5="ad"+"cd";
        String s6="abcd";
        System.out.println(s5==s6);//false

        /**
         * JAVA编译器对string + 基本类型/常量 是当成常量表达式直接求值来优化的。
         * 运行期的两个string相加，会产生新的对象的，存储在堆(heap)中
         */
        String s7="ab";
        String s8=s7+"cd";
        System.out.println(s8==s6);//false

        final String s9="ab";
        String s10=s9+"cd";
        System.out.println(s10==s6);//true

        String s14 = new String("f")+new String("dasda");
        System.out.println(s14 == s14.intern());



        System.out.println(s3==s3.intern());

        String str1=new String("khgkjgh");
        System.out.println(str1==str1.intern());


        /**
         * 堆中字符串对象和串池中的通过+返回的是新实例化的堆上的对象。
         */
        String str0 = "123";
        String str2 = "12";
        String str3 = str2 + "3";
        System.out.println(str0 == str3);



    }
}
