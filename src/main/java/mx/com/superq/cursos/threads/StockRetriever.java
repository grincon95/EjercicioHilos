package mx.com.superq.cursos.threads;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StockRetriever implements Runnable {

   private String company;

   public StockRetriever() {

    }


//constructor
public StockRetriever(String company) {

   this.company=company;
}

    @Override
    public void run() {

    try {
        getStockRetriever();
        System.out.println(getStockRetriever()+"-"+Thread.currentThread().getName());
    }catch (Exception e){

    }//catch
     }//fin Run

        public BigDecimal getStockRetriever ()throws IOException {
            Stock stock;
            BigDecimal price;
            stock = YahooFinance.get(company);
            price = stock.getQuote().getPrice();
            // stock.print();
            return price;
        }//fin getStockRetriever





    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {

        return company;
    }


}//fin de la clase
