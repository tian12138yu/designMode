package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author tjy
 * @Date 2020/4/11 14:20
 */

 class test1 {

    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            //99
//            if(i / 10 == 9) {
//                count++;
//                System.out.println(i);
//            }
//            if(i % 10 == 9) {
//                count++;
//                System.out.println(i);
//            }
//        }
//        System.out.println(count);

//        for(int i = 100;i < 999; i++){
//            int x=i/100;
//            int y=(i%100)/10;
//            int z=i%10;
//            if(Math.pow(x, 3)+Math.pow(y, 3)+Math.pow(z, 3)==i){
//                System.out.println(i+"是水仙花数");
//            }
//        }
//        int i = jige1(16);
//        System.out.println(i);
//        print(7);

        int[] a = {4,5,7,5,5};
        int[] b=a;
        System.out.println(Arrays.toString(b));
//        ninenine(9);
    }
    public static int jige1(int i){

        int count=0;
        while (i!=0){
            i=i&(i-1);
            count++;
        }
        return count;
    }

    public static void print(int x){
        List<Integer> al=new ArrayList<>();
        while(x>0){
            al.add(x%2);
            x=x/2;
        }

        System.out.println("奇数序列：");
        for(int i = al.size()-1; i >= 0 ; i-=2){
            System.out.println(al.get(i));
        }

        System.out.println("偶数序列：");
        for(int i = al.size()-2; i >= 0; i-=2){
            System.out.println(al.get(i));
        }
    }

    public static void ninenine(int x){
        for(int i=1;i <= x; i++){
            for(int j = 1;j <= i; j++){
                System.out.print(j+"*"+i+"="+i*j+" ");

            }
            System.out.println();
        }

        int[] a={4,5,5};

    }

    public static void bubbleSort(int[] array) {
        int last;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                }
            }
        }
    }
}

//class Test {
//    public static void hello() {
//        System.out.println("hello");
//    }
//}
//public class MyApplication {
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Test test=null;
//        test.hello();
//    }
//}
