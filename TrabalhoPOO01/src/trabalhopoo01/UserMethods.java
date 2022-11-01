package trabalhopoo01;

public class UserMethods {
    
 public double vendasUsers(double pv, String tipoUser){//Tipos de usuarios para compra
                double newPriceVenda = 0;
                 if(tipoUser.equals("Bookworm")){
                     newPriceVenda = pv - (pv * 0.05);
                 }
                 else if(tipoUser.equals("Geek")){
                     newPriceVenda = pv - (pv * 0.1);
                 }
                 else if(tipoUser.equals("Premium")){
                     newPriceVenda = pv - (pv * 0.15);
                 }else{
                     newPriceVenda = pv;
                 }
                 return newPriceVenda;
             }
  public double aluguelUsers(double pa, String tipoUser){//Tipos de usuarios para aluguel
      
                double newPriceAluguel = 0;

                 if(tipoUser.equals("Premium")){
                     newPriceAluguel = 0;
                 }else{
                     newPriceAluguel = pa;
                 }
                 return newPriceAluguel;
             }
   public double leituraUsers(double pl, String tipoUser){//Tipos de usuarios para aluguel
      
                double newPriceLeitura = 0;
                
                 if(tipoUser.equals("Geek")){
                     newPriceLeitura = 0;
                 }else if(tipoUser.equals("Premium")){
                     newPriceLeitura = 0;
                 }else{
                     newPriceLeitura = pl;
                 }
                 return newPriceLeitura;
             }
   
  
   
    
}


