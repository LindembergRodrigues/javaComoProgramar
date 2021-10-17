package funcionarios;

public class Hourly extends Employee {

    double horas;
    double valorHora;

    Hourly(String nome, String sobrenome, String numeroSocial, double horas, double valorHora){
        super(nome,sobrenome,numeroSocial);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public void  setHoras(double horas) throws InterruptedException {
        if(horas >=0 ) {
            this.horas = horas;
        }else{
            throw  new
        }
    }
    @Override
    public double calcLucros() {

    }

    @Override
    public String toString() {
        return null;
    }
}
