class Animals {
    public void fazerSom(){
        System.out.println("O animal faz um som");
    }
    
}

class Cachorro extends Animals{
    @Override // Para sobreescrever um método
    public void fazerSom(){
        System.out.println("O cachorro late");
    }
}

public class Animal {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.fazerSom();
        
    }
}