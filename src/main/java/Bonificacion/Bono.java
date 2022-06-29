package Bonificacion;

public class Bono {
    String AreaTrabajo;
    int sueldo, numHijos;

    public Bono(int sueldo, int numHijos, String areaT){
        this.AreaTrabajo = areaT;
        this.numHijos = numHijos;
        this.sueldo = sueldo;
    }

    public void Pagos(){
        double bono = this.AreaTrabajo == "Sistemas" ? 0.25 : this.AreaTrabajo == "Contabilidad" ? 0.20 : 0.10;
        this.sueldo += this.sueldo * bono;
        if (numHijos >= 2){
            this.sueldo += this.numHijos * 150;
        }

    }
}
