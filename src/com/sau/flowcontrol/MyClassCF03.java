package com.sau.flowcontrol;

public class MyClassCF03 {
    //กลุ่มที่ 2 Loop (while, do-while, for)
    public static void main(String[] args) {
        //while
        int i = 1;
        while( i <= 5 ){
            System.out.println("Hi...");
            i = i + 1; //i++ หรือ ++i หรือ i += 1
        }

        System.out.print("--------------------------");
        //do-while
        int j = 1;
        do{
            System.out.print("Hi...");
            j = j + 1;
        }while( j <= 5 );

        System.out.print("--------------------------");
        for( int k = 1; k <= 5; k = k + 1){
            System.out.println("Hoo...");
        }
    }
}
