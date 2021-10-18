package funcionarios;

public class MiniFolha {
    public static void main(String[] args) {
        System.out.println("Folha de Pagamento com 4 fun");

        BasePlusCommissionEmployee basePlus = new BasePlusCommissionEmployee("Lindemberg", "Rodrigues","12345",900,1100);
        CommissionEmployee commission = new CommissionEmployee("João", "Paulo", "754812",0.05,500);
        Hourly hourly = new Hourly("Maria", "Joana", "65241389", 52,10);
        Salaried salaried = new Salaried("Maria", "Elizabeth","9451273",500);

        Employee[] funcionarios = {basePlus,commission,hourly,salaried};

        for (Employee employee: funcionarios){
            System.out.println(employee.toString());
        }

    }
}
