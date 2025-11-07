class Produto {
    String name;
    double price;
}
class produtoImportado extends Produto{
    String taxaImportacao;
}

public class Product{
    public static void main (String[] args){
        produtoImportado p = new produtoImportado();
        p.name = "Notebook";
        p.price = 3500.00;
        p.taxaImportacao = "15%";
        
        System.out.println("Nome do produto: " + p.name);
        System.out.println("Preço: " + p.price);
        System.out.println("Taxa de Importação: " + p.taxaImportacao);
    }
}
