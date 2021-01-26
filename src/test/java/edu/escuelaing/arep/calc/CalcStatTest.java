package edu.escuelaing.arep.calc;


import edu.escuelaing.arep.calc.CalcStat;
import edu.escuelaing.arep.util.LinkedList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CalcStatTest extends TestCase{
        private DecimalFormat format;
        private List<Double> valores1;
        private List<Double> valores2;
        public CalcStatTest(String textName){
                super(textName);
                format= new DecimalFormat("#########.##");
                valores1 = new LinkedList<Double>();
                valores1.add(160.0);
                valores1.add(591.0);
                valores1.add(114.0);
                valores1.add(229.0);
                valores1.add(230.0);
                valores1.add(270.0);
                valores1.add(128.0);
                valores1.add(1657.0);
                valores1.add(624.0);
                valores1.add(1503.0);
                valores2 = new LinkedList<Double>();
                valores2.add(15.0);
                valores2.add(69.9);
                valores2.add(6.5);
                valores2.add(22.4);
                valores2.add(28.4);
                valores2.add(65.9);
                valores2.add(19.4);
                valores2.add(198.7);
                valores2.add(38.8);
                valores2.add(138.2);
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
                Double resultadoEsperado=550.6;
                Double resusltadoObtenido= CalcStat.media(valores1);
                assertEquals(format.format(resultadoEsperado),format.format(resusltadoObtenido));

        }

        public void testMediaC2(){
                Double resultadoEsperado=60.32;
                Double resusltadoObtenido= CalcStat.media(valores2);
                assertEquals(format.format(resultadoEsperado),format.format(resusltadoObtenido));

        }

        public void testDesC1(){
                Double resultadoEsperado = 572.03;
                Double resusltadoObtenido = CalcStat.desStand(valores1);
                assertEquals(format.format(resultadoEsperado),format.format(resusltadoObtenido));
        }

        public void testDesC2(){
                Double resultadoEsperado = 62.26;
                Double resusltadoObtenido = CalcStat.desStand(valores2);
                assertEquals(format.format(resultadoEsperado),format.format(resusltadoObtenido));
        }

}
