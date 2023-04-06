import java.util.ArrayList;
import java.util.List;

public class SequenciaFibonacci {
    public static void main(String[] args) {
       
        int numero = 6; // número a ser verificado
        
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        
        // Adiciona novos valores à sequência enquanto o último valor for menor ou igual ao número
        while (sequence.get(sequence.size() - 1) <= numero) {
            int new_value = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            sequence.add(new_value);
        }
        
        // Verifica se numero está na sequência
        if (sequence.contains(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}