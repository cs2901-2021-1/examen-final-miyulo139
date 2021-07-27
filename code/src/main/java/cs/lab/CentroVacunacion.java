package cs.lab;

public class CentroVacunacion {

    private String name;
    private int vacunaCompleta;
    private int vacunaParcial;
    private int cobertura;
    boolean deAlta;

    CentroVacunacion(String nombre){
        this.name = nombre;
        deAlta = false;
    }

    public void setDeAlta(boolean deAlta) {
        this.deAlta = deAlta;
    }
    public boolean isDeAlta() {
        return deAlta;
    }

    public String reportar(){
        String info = " ";
        if (isDeAlta()){
            info += "Vacunas Completas "+ vacunaCompleta;
            info += "Vacunas Parciales "+ vacunaParcial;
            info += "Cobertura de vacunas "+ cobertura;
            return info;
        }
        else return info;
    }

}
