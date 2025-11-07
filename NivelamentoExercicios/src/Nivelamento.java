
class Veiculo {
    String marca;
}

class Carro extends Veiculo { 
    
    String modelo;
}

public class Nivelamento {
    public static void main(String[] args) {
        Carro c = new Carro();
        
        c.marca = "Toyota";
        c.modelo = "Corolla";
        
        System.out.println("Marca:"+ c.marca);
        System.out.println("Modelo:"+ c.modelo);

    }
}
