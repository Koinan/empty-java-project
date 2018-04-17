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
        float f=6.77f; //32 bits. float necesita terminar en f por ser de 32 bits
        double d=65.78; //64 bits. no necesita letra
        boolean bol= false; //1 bit

        System.out.println(h);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bol);

    }

}
