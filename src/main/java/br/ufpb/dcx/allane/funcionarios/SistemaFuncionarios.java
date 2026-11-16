package br.ufpb.dcx.allane.funcionarios;

import java.util.List;

public interface SistemaFuncionarios {
    public void cadastrarFuncionario(String cpf, String nome, int cargaHorariaSemanal, String funcao);
    public Funcionario pesquisarFuncionarioPorCpf(String cpf);
    public List<Funcionario> pesquisarFuncionariosPorFuncao(String funcao);
    public List<Funcionario> pesquisarFuncionariosQueTrabalhamMaisQue(int cargaHoraria);
    public boolean atualizarCargaHorariaDeFuncionario(String cpf, int novaCargaHoraria);
}
