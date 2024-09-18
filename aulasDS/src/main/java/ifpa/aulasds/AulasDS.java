package ifpa.aulasds;

public class AulasDS {

    public static void main(String[] args) {
        // Considere os laços de repetição abaixo,
//  criados com o objetivo de percorrer o array 
// e exibir seus valores.
        // I.    

        String[] nomes = {"Marta", "Paulo", "Carolina", "Joaquim", "Pedro"};

        System.out.println("\nQ. I.");
        for (String nome : nomes) {
            System.out.println(nome);
        };
        // II. 
        System.out.println("\nQ. II.");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        // III.
        System.out.println("\nQ. III.");
        int indice = 0;
        while (indice < nomes.length) {
            System.out.println(nomes[indice]);
            indice++;
        }
        // IV.
        System.out.println("\nQ. IV.");
        int index = 0;
        do {
            System.out.println(nomes[index]);
            index++;
        } while (index < nomes.length);
    }
}
