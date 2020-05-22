import static java.lang.System.*;

public class Agenda{
    private int numTarefas = 0;
    private Tarefa[] t1 = new Tarefa[1];
    
    public void novaTarefa(Tarefa tar){
        Tarefa[] newTaref = new Tarefa[numTarefas+1];
        arraycopy(t1, 0, newTaref, 0, numTarefas);
        t1 = newTaref;
        t1[numTarefas] = tar;
        numTarefas++;
    }

    public void escreve(){
        System.out.print("Agenda:\n");
        //System.out.println(numTarefas);
        Tarefa.sort(t1, numTarefas);
        //System.out.println(numTarefas);
        for(int i = 0; i < numTarefas; i++){
            //t1[i] = new Tarefa(t1[i].inicio(), t1[i].fim(), t1[i].texto());
            System.out.println(t1[i].toString());
        }
    }

    public Agenda filtra(Data ini, Data fim){
        Agenda new_agenda = new Agenda();
        int j = 0;
        Tarefa[] filtradas = new Tarefa[numTarefas];
        for(int i = 0; i < numTarefas; i++){
            if(t1[i].inicio().compareTo(ini) >= 0 && t1[i].inicio().compareTo(fim) == -1 && t1[i].fim().compareTo(ini) == 1 && t1[i].fim().compareTo(fim) <= 0){
                filtradas[j] = t1[i];
                new_agenda.novaTarefa(filtradas[j]);
                j++;
            }
        }
        return new_agenda;
    }
}
