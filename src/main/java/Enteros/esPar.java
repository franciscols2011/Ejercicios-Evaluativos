package Enteros;

public class esPar {
    public static boolean Par(int numero){
        return numero % 2 == 0;
    }

    public static void main (String[] args){
        int numero = 8;
        if (Par(numero)){
            System.out.println("Si es par");
        }else{
            System.out.println("No es par");
        }
    }
}
