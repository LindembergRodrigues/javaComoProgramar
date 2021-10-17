package funcionarios;

public class BasePlusCommissionEmployee extends  Employee {
    private double salBase;
    private double vendas;

    BasePlusCommissionEmployee(String nome, String sobrenome, String numeroSocial, double salBase, double vendas){
        super(nome,sobrenome,numeroSocial);
        this.salBase = salBase;
        this.vendas = vendas;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public double calcLucros() {
        return (vendas * 0.1) + salBase;
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nSalário Base: " + salBase+
                "\nVendas: " + vendas+
                "\nComissão: " + (vendas*0.1);
    }
}