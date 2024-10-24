package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }
    


    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new Tarefa(descricao));
    }


    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaLista){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }

        }
        tarefaLista.removeAll(tarefaParaRemover);
    }


    public int obterNumeroTotalTarefas() {
        return tarefaLista.size();
    }
    

    public void obterDescricoesTarefas(){
        System.out.println(tarefaLista);
    }

    public static void main(String[] args) {
        
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Teste 01");
        listaTarefa.adicionarTarefa("Teste 02");
        listaTarefa.adicionarTarefa("Teste 03");
        listaTarefa.adicionarTarefa("Teste 02");        
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
        
        listaTarefa.removerTarefa("Teste 02");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }

}
