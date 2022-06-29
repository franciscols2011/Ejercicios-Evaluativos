package Pasar_M_a_K;

import java.util.Scanner;

public class Millas_Kilometros {
    public static void main(String[] args){
        int millas;
        double km;
        do{
            Scanner capture = new Scanner(System.in);
            System.out.println("Ingrese las Millas que quiere convertir a Kilometros: \n" + "0 - Salir del programa.");
            millas = capture.nextInt();

            if(millas !=0){
                km = millas * 1.6093;
                System.out.println(km);
            }
        }while(millas !=0);
    }
}
