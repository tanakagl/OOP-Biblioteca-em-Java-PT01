package trabalhopoo01;

public class UserMethods {
    
 public double vendasUsers(double pv, String tipoUser){//Tipos de usuarios para compra
                double newPriceVenda = 0;
                 if(tipoUser.equalsIgnoreCase("Bookworm")){
                     newPriceVenda = pv - (pv * 0.05);
                 }
                 else if(tipoUser.equalsIgnoreCase("Geek")){
                     newPriceVenda = pv - (pv * 0.1);
                 }
                 else if(tipoUser.equalsIgnoreCase("Premium")){
                     newPriceVenda = pv - (pv * 0.15);
                 }else{
                     newPriceVenda = pv;
                 }
                 return newPriceVenda;
             }
  public double aluguelUsers(double pa, String tipoUser){//Tipos de usuarios para aluguel
      
                double newPriceAluguel = 0;

                 if(tipoUser.equalsIgnoreCase("Premium")){
                     newPriceAluguel = 0;
                 }else{
                     newPriceAluguel = pa;
                 }
                 return newPriceAluguel;
             }
   public double leituraUsers(double pl, String tipoUser){//Tipos de usuarios para aluguel
      
                double newPriceLeitura = 0;
                
                 if(tipoUser.equalsIgnoreCase("Geek")){
                     newPriceLeitura = 0;
                 }else if(tipoUser.equalsIgnoreCase("Premium")){
                     newPriceLeitura = 0;
                 }else{
                     newPriceLeitura = pl;
                 }
                 return newPriceLeitura;
             }
   
  
   
    
}


