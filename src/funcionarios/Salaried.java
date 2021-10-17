package funcionarios;

public class Salaried extends Employee{
    double salarioFixo;
    Salaried(String nome, String sobrenome, String numeroSocil, double salarioFixo){
        super(nome,sobrenome,numeroSocil);
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcLucros() {
        return getSalarioFixo();
    }

    @Override
    public  String toString(){
        return super.toString() +
                "\nSalário Fixo: " + getSalarioFixo();
    }
}
