package cs.lab;

import java.util.Map;

public class Vacunacion {
    private Map<String, Integer> faltaVacuna;
    private int total;
    private static Vacunacion instance = null;

    public static Vacunacion getUniqueInstance()
    {
        if (instance == null)
            instance = new Vacunacion();
        return instance;
    }

    private Vacunacion() {
        faltaVacuna.put("80 a más", 647355);
        faltaVacuna.put("70 a 79", 1271842);
        faltaVacuna.put("60 a 69", 2221241);
        faltaVacuna.put("50 a 59", 3277134);
        faltaVacuna.put("40 a 49", 4183174);
        faltaVacuna.put("60 a 69", 2221241);
        faltaVacuna.put("18 a 39", 6303670);
    }

}
