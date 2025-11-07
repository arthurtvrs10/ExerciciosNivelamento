class ContaBancaria {
    String numero;
    Double saldo;
}

class ContaPoupanca extends ContaBancaria{
    String taxaDeJuros;
}

public class ContaBancariaApp{
    public static void main(String[] args){
        ContaPoupanca c = new ContaPoupanca();
        c.numero = "12345-6";
        c.saldo = 1000.00;
        c.taxaDeJuros = "5% ao ano";
        
        System.out.println("Número da conta: "+ c.numero);
        System.out.println("Saldo: "+ c.saldo);
        System.out.println("Taxa de Juros: "+ c.taxaDeJuros);
    }
}
