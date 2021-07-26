package cs.lab;

public class CentroVacunacion {

    private String name;
    boolean deAlta;

    CentroVacunacion(String nombre){
        this.name = nombre;
        deAlta = false;
    }

    public void setDeAlta(boolean deAlta) {
        this.deAlta = deAlta;
    }

}
