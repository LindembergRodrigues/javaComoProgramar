package funcionarios;
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeFuncionario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<CommissionEmployee> funcComissionado = new ArrayList<>();
        List<BasePlusCommissionEmployee> funcBase = new ArrayList<>();

        while(true) {
            switch (menu(in)) {
                case "C" -> cadastrar(in,funcComissionado,funcBase);
                case "L" -> listar(funcComissionado, funcBase);
                case "R" -> remover(in, funcComissionado, funcBase);
                case "S" -> {
                    break;
                }
                default -> System.out.println("Opção invalida, tente novamente!");
            }
        }
    }


    public static String menu(Scanner in){
        System.out.print("\n(C)adastrar: "+
                "\n(L)istar Funcionários: " +
                "\n(R)emover: "+
                "\n(S)air: ");
        String op = in.nextLine();
        System.out.println();
        return op.toUpperCase();
    }

    public static void  cadastrar(Scanner in, List<CommissionEmployee> funcComissionado, List<BasePlusCommissionEmployee> funcBase){
        CommissionEmployee funcionario;

        System.out.println("Nome: ");
        String nome = in.nextLine();
        System.out.println("Sobrenome: ");
        String sobrenome = in.nextLine();
        System.out.println("Numero programa social: ");
        String numProgSocial = in.nextLine();
        System.out.println("Percentagem da comissão: ");
        double comissao = in.nextDouble();
        System.out.println("Total das vendas: ");
        double totalVendas = in.nextDouble();
        in.nextLine();
        System.out.println("É Funcionário Base?\n\t(S)im\t(N)ão");
        String op = in.nextLine();

        if (op.toUpperCase().equals("S")){
            System.out.println("Salário Base: ");
            double base = in.nextDouble();
            in.nextLine();
            funcionario = new BasePlusCommissionEmployee(nome,sobrenome,numProgSocial,comissao,totalVendas,base);
            funcBase.add((BasePlusCommissionEmployee) funcionario);
        }else{
            //funcionario = new CommissionEmployee(nome,sobrenome,numProgSocial,comissao,totalVendas);
            //funcComissionado.add(funcionario);
        }


    }


    private static String remover(Scanner in, List<CommissionEmployee> funcComissionado, List<BasePlusCommissionEmployee> funcBase) {
        System.out.print("Funcionário (C)omissionado ou Funcionário (B)ase: ");
        String op = in.nextLine().toUpperCase();
        int posicao;
        if (!op.equals("C") && !op.equals("B")){
            return "Tipo funcionário informado incorretamente, tente novamente!";
        }

        System.out.print("\nQual a posição que deseja remover?");
        posicao = in.nextInt();

        if (op.equals("C")){
            if (!funcComissionado.isEmpty()) {
                if (posicao >= 0 && posicao <= funcComissionado.size()) {
                    funcComissionado.remove(posicao - 1);
                    return funcComissionado.get(posicao - 1).toString();
                }
            }
        }else if(op.equals("B")){
            if (!funcBase.isEmpty()){
                if (posicao>= 0 && posicao<=funcBase.size()){
                    funcBase.remove(posicao-1);
                    return funcBase.get(posicao-1).toString();
                }
            }
        }
        return "erro";
    }

    private static void listar(List<CommissionEmployee> funcComissionado, List<BasePlusCommissionEmployee> funcBase) {
        System.out.println("-Lista de Comissionado-");
        for(CommissionEmployee func: funcComissionado){
            System.out.println(func.toString());
        }
        System.out.println("-Lista de Base-");
        for(BasePlusCommissionEmployee func: funcBase){
            System.out.println(func.toString());
        }

    }
}
*/