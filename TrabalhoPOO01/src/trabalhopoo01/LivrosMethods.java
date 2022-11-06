package trabalhopoo01;

public class LivrosMethods {
    
           public double seloLivroVenda(double pv, String selo){//Selos dos Livros para vendas
                double newPriceVenda = 0;
                 if(selo.equalsIgnoreCase("Premium")){
                     newPriceVenda = pv + (pv * 0.1);
                 }
                 else if(selo.equalsIgnoreCase("Newly Released")){
                     newPriceVenda = pv + (pv * 0.2);
                 }
                 else if(selo.equalsIgnoreCase("Best Seller")){
                     newPriceVenda = pv + (pv * 0.3);
                 }else{
                     newPriceVenda = pv;
                 }
                 return newPriceVenda;
             }
           
            public double seloLivroAluguel(double pa, String selo){//Selos dos Livros para alugeis
                double newPriceAluguel = 0;
                    if(selo.equalsIgnoreCase("Newly Released")){
                     newPriceAluguel = pa + (pa * 0.3);
                 }else if (!selo.equalsIgnoreCase("Newly Released"))
                        newPriceAluguel = pa;
                 return newPriceAluguel;
             }
            
             public int verificaUsersAluguel(String tipoUser, String selo){
                    int resp = 1;// retorna possivel
                    if(!tipoUser.equalsIgnoreCase("Premium") && selo.equalsIgnoreCase("Premium")){
                        resp = 0; // retorna valor para nao alugar livros premiuns
                    }else if(selo.equalsIgnoreCase("Best Seller")){
                        resp = 0; // retorna 0 para nao alugar
                    }else if(tipoUser.equalsIgnoreCase("Premium") && selo.equalsIgnoreCase("Premium")){
                        resp = 1;
                    }
                     return resp;  
                   }
             
             public int verificaUsersCompra(String tipoUser){
                    int resp = 0;// retorna nenhum tipo
                    if(tipoUser.equalsIgnoreCase("Bookworm")){
                        resp = 1; // retorna bookworm, desconto de 5%
                    }else if(tipoUser.equalsIgnoreCase("Geek")){
                        resp = 2; // retorna geek, desconto de 10%
                    }else if(tipoUser.equalsIgnoreCase("Premium")){
                        resp = 3; // retorna premium, desconto de 15%
                    }
                     return resp;  
                   }
             
             public int verificaLivro100(int histAluguel){
                 if(histAluguel >=100){
                     return 1;
                 }else{
                     return 0;
                 }
             }
            
}