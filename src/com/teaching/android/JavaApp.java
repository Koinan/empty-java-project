package com.teaching.android;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        byte h=65; // 8 bits. puedo poner la letra que quiera (b por h en este caso)
        char c='A'; //16 bits.
        short s=30; //16 bits. el número se lo indico yo
        int i=65; //32 bits.
        long l=6555555L; //64 bits.
        float f=6.66f; //32 bits. float necesita terminar en f por ser de 32 bits
        double d=65.78; //64 bits. no necesita letra
        boolean bol= false; //1 bit

        System.out.println(2+5-3*2);
        System.out.println(2*4*2/2);
        System.out.println(1/2);
        System.out.println(5*(1/2)); //los decimales sólo salen si ponemos el tipo float
        System.out.println(5f*1/2);

    }
}
