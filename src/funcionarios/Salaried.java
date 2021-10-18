package funcionarios;

public class Salaried extends Employee{
    private double salarioSemanal;

    Salaried(String nome, String sobrenome, String numeroSocil, double salarioSemanal){
        super(nome,sobrenome,numeroSocil);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioFixo) {
        this.salarioSemanal =salarioSemanal;
    }

    @Override
    public double calcLucros() {
        return getSalarioSemanal();
    }

    @Override
    public  String toString(){
        return super.toString() +
                "\nPagamento da Semana: " + getSalarioSemanal();
    }
}
