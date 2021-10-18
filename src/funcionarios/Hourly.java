package funcionarios;

public class Hourly extends Employee {


    private double horas;
    private double valorHora;

    Hourly(String nome, String sobrenome, String numeroSocial, double horas, double valorHora){
        super(nome,sobrenome,numeroSocial);
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public double getHoras() {
        return horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void  setHoras(double horas) {
        if(horas >=0 ) {
            this.horas = horas;
        }
    }


    @Override
    public double calcLucros() {
        if (horas <= 40){
            return  horas * valorHora;
        }else{
            return  40 * valorHora + ((horas-40)*valorHora*1.5);
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nValor das Horas: " + valorHora+
                "\nTotal de Horas: "+ horas+
                "\nTotal: " + calcLucros();
    }
}
