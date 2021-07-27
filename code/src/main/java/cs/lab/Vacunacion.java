package cs.lab;

import java.util.Map;
import java.util.logging.Logger;

public class Vacunacion {
    private Map<String, Integer> faltaVacuna;
    private static Vacunacion instance = null;
    private int vacunaCompleta;
    private int vacunaParcial;
    private int cobertura;
    static final Logger logger = Logger.getLogger(General.class.getName());


    public static Vacunacion getUniqueInstance()
    {
        if (instance == null)
            instance = new Vacunacion();
        return instance;
    }

    private Vacunacion() {
        setFaltaVacuna();
    }

    public void setFaltaVacuna(){
        faltaVacuna.put("80 a más", 647355);
        faltaVacuna.put("70 a 79", 1271842);
        faltaVacuna.put("60 a 69", 2221241);
        faltaVacuna.put("50 a 59", 3277134);
        faltaVacuna.put("40 a 49", 4183174);
        faltaVacuna.put("18 a 39", 6303670);
    }

    public float getPorcentaje(String edadRango) {
        if (faltaVacuna.get(edadRango) != null){
            return 0;
        }
        else{
            return ((faltaVacuna.get(edadRango)*100)/cobertura);
        }
    }



}
