package edu.escuelaing.arep.calc;


import edu.escuelaing.arep.calc.CalcStat;
import edu.escuelaing.arep.util.LinkedList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.List;

public class CalcStatTest extends TestCase{

        public CalcStatTest(String textName){
                super(textName);
        }

        @Override
        protected void setUp() throws Exception{
                super.setUp();
        }

        @Override
        protected void tearDown() throws Exception{
                super.tearDown();
        }

        public void testMediaC1(){
                List<Double> valores = new LinkedList<Double>();
                valores.add(160.0);
                valores.add(591.0);
                valores.add(114.0);
                valores.add(229.0);
                valores.add(230.0);
                valores.add(270.0);
                valores.add(128.0);
                valores.add(1657.0);
                valores.add(624.0);
                valores.add(1503.0);
                Double resultadoEsperado=550.6;
                Double resusltadoObtenido= CalcStat.media(valores);
                assertEquals(resultadoEsperado,resusltadoObtenido);

        }

        public void testMediaC2(){
                List<Double> valores = new ArrayList<>();
                valores.add(15.0);
                valores.add(69.9);
                valores.add(6.5);
                valores.add(22.4);
                valores.add(28.4);
                valores.add(65.9);
                valores.add(19.4);
                valores.add(198.7);
                valores.add(38.8);
                valores.add(138.2);
                Double resultadoEsperado=60.32;
                Double resusltadoObtenido= CalcStat.media(valores);
                System.out.println(resusltadoObtenido);
                assertEquals(resultadoEsperado,resusltadoObtenido);

        }


}
