package com.sau.flowcontrol;

public class MyClassCF02 {
    public static void main(String[] args) {
        //พิสูจนหลายครั้ง : if-else-if ใช้ได้ทุกกรณี
        //switch-case ใช้ได้เฉพาะพิสูจน์ ตัวเลข ตัวอักษร เเละเท่ากันหรือไม่เท่านั้น
        int score = 75;

        if( score > 80 ){
            System.out.println("Grade A ");
        }else if( score > 70 ){
            System.out.println("Grade B ");
        }else if( score > 60){
            System.out.println("Grade C ");
        }else if( score > 50 ){
            System.out.println("Grade D");
        }else{ //ไม่จําเป็นต้องมี if
            System.out.println("Grade F");
        }
        System.out.println("---------------------------");
        //switch-case ใช้ได้เฉพาะพิสูจน์เท่ากันหรือไม่เท่านั้น เเละใช้ไม่ได้กันทศนิยม
        int busnumber = 84;
        switch( busnumber ){
            case 80 :
                System.out.println("Go to PATA");
                break;
            case 81 :
                System.out.println("Go to Siriraj");
                break;
            case 84 :
                System.out.println("Go to Wat rai king");
                break;
            case 123 :
                System.out.println("Go to Central Pinkla");
                break;
            default:
                System.out.println("Do not have data T_T");
        }
    }
}
