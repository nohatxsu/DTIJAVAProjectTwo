package com.sau.flowcontrol;

public class MyClassCF01 {
    //Control Flow / Control Statement
    //กลุ่มที่ 1 Selection/Condition (if, if=else, if-else-if, switch-case)
    public static void main(String[] args) {
        //พิสูจนครั้งเดียวจริงทํา เท็จไม่ทํา : if
        int a = 50;
        if( a < 35 ){
            System.out.println("Hello....");
        }
        System.out.println("-----------------------------");
        //พิสูจนครั้งเดียวจริงทํา เท็จก็ทํา : if-else
        String b = "xyz";
        if( b.equals("SAU")){
            System.out.println("Southeast Asia University");
        }else {
            System.out.println("No no no....");
        }
    }
}
