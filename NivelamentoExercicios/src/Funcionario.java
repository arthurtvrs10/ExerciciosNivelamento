class Funcionarios {
    String name = "José Antonio";
    double Salary = 2500.00;
}

class Gerente extends Funcionarios {
    String departamento = "RH";
}



public class Funcionario{
    public static void main(String[] args){
        Gerente g = new Gerente();
        System.out.println("nome:"+ g.name);
        System.out.println("Salário:" + g.Salary);
        System.out.println("Departamento:"+ g.departamento);
    }
}

