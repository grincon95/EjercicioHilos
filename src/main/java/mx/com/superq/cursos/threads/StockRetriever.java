package mx.com.superq.cursos.threads;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import java.math.BigDecimal;


public class StockRetriever implements Runnable {

   private String company;

//constructor
public StockRetriever(String company) {

   this.company=company;
}

    @Override
    public void run() {

    try {
        Stock stock;
        BigDecimal price;
        stock = YahooFinance.get(company);
        price = stock.getQuote().getPrice();
        System.out.println(price+"-"+Thread.currentThread().getName());
    }catch (Exception e){

    }//catch
     }//fin Run
    



}//fin de la clase
