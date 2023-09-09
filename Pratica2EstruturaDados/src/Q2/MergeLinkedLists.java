package Q2;

import java.util.LinkedList;
import java.util.Random;

public class MergeLinkedLists {

    public static void main(String[] args) {

        LinkedList<String> noiva = new LinkedList<>();
        LinkedList<String> noivo = new LinkedList<>();

        System.out.println("Lista de casamento da noiva: ");

        for (int i = 0; i < 60; i++) {
            String nome = generateRandomName();
            noiva.add(nome);
        }
        System.out.print(noiva + ", ");

        System.out.println();
        System.out.println("Lista de casamento do noivo: ");

        for (int i = 0; i < 55; i++) {
            String nome = generateRandomName();
            noivo.add(nome);
        }
        System.out.print(noivo + ", ");


        System.out.println();

        LinkedList<String> convidados = new LinkedList<>();

        int i = 0;
        int j = 0;
        while (i < noiva.size() && j < noivo.size()) {
            if (noiva.get(i).compareTo(noivo.get(j)) < 0) {
                convidados.add(noiva.get(i));
                i++;
            } else {
                convidados.add(noivo.get(j));
                j++;
            }
        }

        while (i < noiva.size()) {
            convidados.add(noiva.get(i));
            i++;
        }

        while (j < noivo.size()) {
            convidados.add(noivo.get(j));
            j++;
        }

        System.out.println();
        System.out.println("A lista de casamentos dos noivos é: ");

        int x;
        for (String convidado : convidados) {
            for (x = 1; x <= 115; x++) {
                System.out.println("Convidado número " + x + " " + convidado);
            }
        }
    }

    private static String generateRandomName() {
        String[] nomes = {
                "João", "Maria", "José", "Ana", "Pedro", "Fernanda", "Carlos", "Julia", "Lucas", "Isabela"
        };
        String[] sobrenomes = {
                "Silva", "Santos", "Ferreira", "Oliveira", "Costa", "Pereira", "Rodrigues", "Alves", "Gomes", "Lima"
        };

        Random random = new Random();

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];

        return nome + " " + sobrenome;
    }
}
