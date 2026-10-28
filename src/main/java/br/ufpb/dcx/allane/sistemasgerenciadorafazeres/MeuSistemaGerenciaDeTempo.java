package br.ufpb.dcx.allane.sistemasgerenciadorafazeres;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo{
    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo(){
        this.tarefas = new ArrayList<>();
    }

    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria){
        List<Tarefa> tarefasPesquisar = new ArrayList<>();
        for (Tarefa tarefa: this.tarefas){
            if(tarefa.getCategoria().equals(categoria)){
                tarefasPesquisar.add(tarefa);
            }
        }
        return tarefasPesquisar;
    }

    @Override
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos) {
        return List.of();
    }

    @Override
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa) {
        return 0;
    }

    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos){
        Tarefa novaTarefa = new Tarefa(descricao, categoria, tempoEmMinutos);
        this.tarefas.add(novaTarefa);
    }
    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa){
        int tempoTotal = 0;
        for(Tarefa f: this.tarefas){
            if(f.getDescricao().equals(descricaoTarefa)){
                tempoTotal += f.getTempoTarefaEmMinutos();
            }
        }
        return tempoTotal;
    }

    @Override
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao) {
        return List.of();
    }
}
//outros métodos