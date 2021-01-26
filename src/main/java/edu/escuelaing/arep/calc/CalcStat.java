package edu.escuelaing.arep.calc;

import java.util.List;

public class CalcStat {

    public static Double media(List<Double> valores ){
        Double respuesta = 0.0;
        for (Double val: valores){
            respuesta = respuesta + val;
        }

        return  (respuesta/valores.size());
    }

    public static Double desStand(List<Double> valores){
        Double media = CalcStat.media(valores);
        Double respuesta = 0.0;
        for (Double val: valores){
            Double temp = val - media;
            respuesta = respuesta + Math.pow(temp,2);
        }
        Double temp = respuesta / (valores.size()-1);
        respuesta = Math.sqrt(temp);
        return respuesta;
    }
}
