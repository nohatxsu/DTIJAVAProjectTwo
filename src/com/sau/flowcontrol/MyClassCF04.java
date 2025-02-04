package com.sau.flowcontrol;

public class MyClassCF04 {
    public static void main(String[] args) {
        //break
        for( int k = 1; k <= 5; k++ ){
            if (k == 3){
                break;
            }
            System.out.println(k + "Hoo...");
       }

        System.out.println("+++++++++++++++++++++++++++");
        //continue
        for(int k = 1; k <= 5; k++){
            if (k == 3){
                continue;
            }
            System.out.println("Hey...");
        }

    }
}
