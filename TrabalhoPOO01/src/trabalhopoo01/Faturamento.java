package trabalhopoo01;


public class Faturamento{
    public double valoresCompra;
    public double valoresAluguel;
    public double valoresMensal;
    
   public double totalCaixa(){
       double total = 0;
       total = valoresCompra + valoresAluguel + valoresMensal;
       return total;
   }
   
   public double mensalidade(String tipoUser){
       double mensal = 0;
       if(tipoUser.equalsIgnoreCase("Geek")){
           mensal = 50;
       }else if(tipoUser.equalsIgnoreCase("Premium")){
           mensal = 70;
       }else{
           mensal = 0;
       }
       
       return mensal;
   }
   
    
}
