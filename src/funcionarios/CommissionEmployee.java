package funcionarios;

public class CommissionEmployee extends Employee {

    private double percetual;
    private double vendas;

    CommissionEmployee(String nome, String sobrenome, String numeroSocial, double percentual, double vendas){
        super(nome,sobrenome,numeroSocial);
        this.percetual= percentual;
        this.vendas = vendas;
    }

    public double getPercetual() {
        return percetual;
    }

    public void setPercetual(double percetual) {
        this.percetual = percetual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public double calcLucros() {
        return vendas * percetual;
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nVendas: " + vendas +
                "\nComissão: "+ calcLucros();
    }
}