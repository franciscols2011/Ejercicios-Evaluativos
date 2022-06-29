package Bonificacion;

public class program {
    public static void main(String[] args){
        Bono b = new Bono(300, 2, "Contabilidad");
        b.Pagos();
        System.out.println(b.sueldo);
    }
}
