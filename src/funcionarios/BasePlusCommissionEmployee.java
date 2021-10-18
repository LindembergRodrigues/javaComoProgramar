package funcionarios;

public class BasePlusCommissionEmployee extends  CommissionEmployee {
    private double salBase;


    BasePlusCommissionEmployee(String nome, String sobrenome, String numeroSocial, double vendas,double salBase){
        super(nome,sobrenome,numeroSocial,0.1,vendas);
        this.salBase = salBase;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    @Override
    public double calcLucros() {
        return super.calcLucros();
    }

    @Override
    public String toString(){
        return super.toString()+
                "\nSalário Base: " + salBase+
                "\nTotal: " + (salBase + calcLucros());
    }
}