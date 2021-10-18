package funcionarios;

public abstract class Employee {
    /**
     * Nome do func. comissionado
     */
    private String nome;
    /**
     * sobrenome do func. comissionado
     */
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public Employee(String nome, String sobrenome, String numeroDoSeguroSocial) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroDoSeguroSocial = numeroDoSeguroSocial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroDoSeguroSocial() {
        return numeroDoSeguroSocial;
    }

    public void setNumeroDoSeguroSocial(String numeroDoSeguroSocial) {
        this.numeroDoSeguroSocial = numeroDoSeguroSocial;
    }

    /**
     * numero do seguro social
     */
    private String numeroDoSeguroSocial;


    public abstract double calcLucros();

    public String toString(){
        return "\n" + getNome() + " " + getSobrenome()+
                "\nNumero social: " + getNumeroDoSeguroSocial();
    }

}
