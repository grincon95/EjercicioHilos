package mx.com.superq.cursos.threads;

import javax.xml.bind.PrintConversionEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.List;

public class TestStock {

    public static void main(String[]args)throws IOException {


  long Inicio=System.nanoTime();
  long Fin=System.nanoTime();

        String file="/Users/grincon/IdeaProjects/EjercicioHilos/src/test/resources/list.txt";

        List<String> linea= Files.readAllLines(Paths.get(file));

        BigDecimal price=new BigDecimal(0.0);

        Inicio=System.nanoTime();

        for (String empresa:linea) {

            StockRetriever stock =new StockRetriever(empresa);
            price=price.add(stock.getStockRetriever());


        }
        Fin=System.nanoTime();


        System.out.println(price);

        System.out.println(((Fin-Inicio)/1000000000));
        System.out.println((Inicio/1000000000)+"-"+(Fin/1000000000));


    } //

}//fin de la clase
