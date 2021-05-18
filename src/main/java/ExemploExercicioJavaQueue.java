import java.util.LinkedList;
import java.util.Queue;

public class ExemploExercicioJavaQueue {
    public static void main(String[] args) {

        // Crie uma fila e execute as seguintes operações:
        Queue<String> filaSopa = new LinkedList<>();

        //- Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João;
        filaSopa.add("Juliana");
        filaSopa.add("Pedro");
        filaSopa.add("Carlos");
        filaSopa.add("Larissa");
        filaSopa.add("João");

        //- Navegue na fila exibindo cada nome no console;
        for (String pessoaNaFila: filaSopa) {
            System.out.println("Pessoa na fila: " + pessoaNaFila);
        }

        //- Retorne o primeiro item da fila, sem removê-lo;
        System.out.println("Primeira pessoa da fila: " + filaSopa.peek());
        System.out.println("Fila: " + filaSopa);

        //- Retorne o primeiro item da fila, removendo o mesmo;
        System.out.println("Primeira pessoa da fila: " + filaSopa.poll());
        System.out.println("Fila: " + filaSopa);

        //- Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila;
        filaSopa.add("Daniel");
        System.out.println("Adicionando Daniel à fila: " + filaSopa);

        //- Retorne o tamanho da lista;
        System.out.println("Tamanho da fila: " + filaSopa.size());

        //- Verifique se a lista está vazia;
        System.out.println("Verificando se a fila está vazia: " + filaSopa.isEmpty());

        //- Verifique se o nome Carlos está na lista.
        System.out.println("Verificando se o nome Carlos está na fila: " + filaSopa.contains("Carlos"));
    }
}
