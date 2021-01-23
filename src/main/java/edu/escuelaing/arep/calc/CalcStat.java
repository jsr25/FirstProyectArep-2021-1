package edu.escuelaing.arep.calc;

import java.text.DecimalFormat;
import java.util.List;

public class CalcStat {

    public static Double media(List<Double> valores ){
        Double respuesta = 0.0;
        DecimalFormat df = new DecimalFormat("#.##");
        for (Double val: valores){
            respuesta = respuesta + val;
        }

        return  (respuesta/valores.size());
    }

    public static Double desStand(List<Double> valores){
        return 0.0;
    }
}
