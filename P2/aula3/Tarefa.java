import static java.lang.System.*;

public class Tarefa{
    private Data d1, d2;
    private String task;

    public Tarefa(Data d1, Data d2, String task){
        this.d1 = d1;
        this.d2 = d2;
        this.task = task;
    }

    public Data inicio(){
        return d1;
    }

    public Data fim(){
        return d2;
    }

    public String texto(){
        return task;
    }

    public String toString() {
        //System.out.println(String.format(d1+" --- "+d2+": "+task));
        return String.format(d1+" --- "+d2+": "+task);
    }

    public boolean intersecta(Tarefa t2){
        return !(d2.compareTo(t2.inicio()) < 0 || d1.compareTo(t2.fim()) > 0);
    }

    public static void sort(Tarefa[] tarefas, int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(tarefas[j].inicio().compareTo(tarefas[i].inicio()) == -1){
                    Tarefa tmp = tarefas[j];
                    tarefas[j] = tarefas[i];
                    tarefas[i] = tmp;
                }
            }
        }
    }
}