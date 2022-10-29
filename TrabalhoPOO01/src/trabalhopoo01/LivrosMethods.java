package trabalhopoo01;

public class LivrosMethods {
    
           public double seloLivroVenda(double pv, String selo){//Selos dos Livros para vendas
                double newPriceVenda = 0;
                 if(selo.equals("Premium")){
                     newPriceVenda = pv + (pv * 0.1);
                 }
                 else if(selo.equals("Newly Released")){
                     newPriceVenda = pv + (pv * 0.2);
                 }
                 else if(selo.equals("Best Seller")){
                     newPriceVenda = pv + (pv * 0.3);
                 }else{
                     newPriceVenda = pv;
                 }
                 return newPriceVenda;
             }
           
            public double seloLivroAluguel(double pa, String selo){//Selos dos Livros para alugeis
                double newPriceAluguel = 0;
                    if(selo.equals("Newly Released")){
                     newPriceAluguel = pa + (pa * 0.3);
                 }else if (!selo.equals("Newly Released"))
                        newPriceAluguel = pa;
                 return newPriceAluguel;
             }
            
}