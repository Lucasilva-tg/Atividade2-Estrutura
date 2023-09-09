package Q1;

import java.util.LinkedList;

public class FilaAtendimento {
    public static void main(String[] args) {
        LinkedList<Integer> filaPrioridade = new LinkedList<>();
        LinkedList<Integer> filaNormal = new LinkedList<>();

        filaPrioridade = new LinkedList<>();
        filaNormal = new LinkedList<>();

        for (int i = 1; i <= 200; i++) {
            filaNormal.add(i);
        }

        for (int i = 0; i < filaNormal.size(); i++) {
            int senha = filaNormal.get(i);
            if (senha % 2 == 1 && senha <= 100) {
                filaPrioridade.add(senha);
                filaNormal.set(i, null); // Remover da fila comum
            }
        }

        filaNormal.removeIf(senha -> senha == null); //removo itens nulos lista comum

        System.out.println("A fila de prioridade é:");
        for (int senha : filaPrioridade) {
            System.out.print(senha + ", ");
        }

        System.out.println();

        System.out.println("A fila normal é:");
        for (int senha : filaNormal) {
            System.out.print(senha + ", ");
        }
    }
}