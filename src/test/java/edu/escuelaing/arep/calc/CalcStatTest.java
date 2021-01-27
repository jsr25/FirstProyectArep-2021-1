package edu.escuelaing.arep.calc;


import edu.escuelaing.arep.calc.CalcStat;
import edu.escuelaing.arep.util.LinkedList;
import edu.escuelaing.arep.util.Reader;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.text.DecimalFormat;
import java.util.List;

public class CalcStatTest extends TestCase{
        private DecimalFormat format;
        private List<Double> valores1;
        private List<Double> valores2;
        public CalcStatTest(String textName){
                super(textName);
                format= new DecimalFormat("#########.##");
                valores1 = Reader.lector("src/main/resources/Datos1.txt");
                valores2 = Reader.lector("src/main/resources/Datos2.txt");
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
