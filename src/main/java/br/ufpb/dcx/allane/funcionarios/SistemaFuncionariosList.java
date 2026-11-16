package br.ufpb.dcx.allane.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class SistemaFuncionariosList implements SistemaFuncionarios{
    private List<Funcionario> funcionarios;

    //construtor
    public SistemaFuncionariosList(){
        this.funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(String cpf, String nome,
                                      int cargaHorariaSemanal, String funcao){
        Funcionario novoFuncionario = new Funcionario(cpf, nome, cargaHorariaSemanal, funcao);
        this.funcionarios.add(novoFuncionario);
    }

    public Funcionario pesquisarFuncionarioPorCpf(String cpf){
        int encontrado = 0;
        Funcionario funEncontrado;
        for(Funcionario f: this.funcionarios){
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }
    public List<Funcionario> pesquisarFuncionariosPorFuncao(String funcao){
        List<Funcionario> listaFuncionarioFuncao = new ArrayList<>();
        for(Funcionario f: this.funcionarios){
            if (f.getFuncao().equalsIgnoreCase(funcao)) {
                listaFuncionarioFuncao.add(f);
            }
        }
        return listaFuncionarioFuncao;
    }

    public List<Funcionario> pesquisarFuncionariosQueTrabalhamMaisQue(int numHorasSemanais){
        List<Funcionario> listaFunQueTrabalhamMaisQue = new ArrayList<>();
        for(Funcionario funcionario: this.funcionarios){
            if(funcionario.getCargaHorariaSemanal() > numHorasSemanais){
                listaFunQueTrabalhamMaisQue.add(funcionario);
            }
        }
        return listaFunQueTrabalhamMaisQue;
    }
    public boolean atualizarCargaHorariaDeFuncionario(String cpf, int novaCargaHoraria){
        for (Funcionario f: this.funcionarios){
            if (f.getCpf().equals(cpf)) {
                f.setCargaHorariaSemanal(novaCargaHoraria);
                return true;
            }
        }
        return false;
    }

}
