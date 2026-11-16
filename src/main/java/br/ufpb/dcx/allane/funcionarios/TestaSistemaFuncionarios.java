package br.ufpb.dcx.allane.funcionarios;

public class TestaSistemaFuncionarios {
    public static void main(String[] args) {
        SistemaFuncionarios sistema = new SistemaFuncionariosList();
        sistema.cadastrarFuncionario("333.333.333-33", "José da Silva", 10, "Programador");
        sistema.cadastrarFuncionario("444.444.444-44", "Maria da Silva", 40, "Gerente");
        List<Funcionario> lista = sistema.pesquisaFuncionariosQueTrabalhamMaisQue(20);
        for (Funcionario f : lista) {
            System.out.println(f.toString());
        }
        Funcionario funcionarioAchado = sistema.pesquisaFuncionarioPorCPF("333.333.333-33");
        System.out.println(funcionarioAchado.getFuncao());
        //TODO: completar a partir daqui
    }
}

