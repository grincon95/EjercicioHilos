package mx.com.superq.cursos.threads;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StockRetriever  {

   private String company;


//constructor
public StockRetriever(String company) {

   this.company=company;
}


  public BigDecimal getStockRetriever()throws IOException {
    Stock stock;
    BigDecimal price;
    stock= YahooFinance.get(company);
    price=stock.getQuote().getPrice();
  // stock.print();
return price;
  }


    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {

        return company;
    }

}//fin de la clase
