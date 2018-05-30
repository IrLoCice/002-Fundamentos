package com.cice.fundamentos;

public class Operadores {

    //Operadores de Relación

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    //Operadores Lógicos && &; || |; !; ^;



    public static void main (String... args){

        System.out.println("Operadores de Relación");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("Operadores Lógicos");
        System.out.println((r1 && r2));
        System.out.println((r2 || r3));
        System.out.println((!r4));
        System.out.println((r5 ^ r6));

        System.out.println("Operadores de Asignación");
        int a = 5;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        a*=2; //a = a*2
        System.out.println(a);
        a/=5;
        System.out.println(a);

        int b = 5;
        System.out.println(b++); //hace la operación tras mostrar en pantalla
        System.out.println(++b);

        b+=3;
        System.out.println(b);

        b%=5; //muestra el resto de dividir por 5
        System.out.println(b);




     }
}
