package listas;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListSimples {
    public void executar(){
        exemploListaString();
    }
    private void exemploListaString(){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Lorenzo");
        nomes.add("Gustavo");
        nomes.add("Judity");
        nomes.add("Jorge");
        nomes.add("Aroldo");

        nomes.set(0, "Lorenzo Ambrósio");

        nomes .remove("Jorge");

        String primeiroNome = nomes.get(0);

        System.out.println("Quantidade de nomes: " + nomes.size());
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("segundo nome: " + nomes.get(1));
        System.out.println("terceiro nome: " + nomes.get(2));
        System.out.println("quarto nome: " + nomes.get(3));
    }

    public void exercicio(){
        ArrayList<Double> gasolina = new ArrayList<>();
        gasolina.add(5.20);
        gasolina.add(6.10);
        gasolina.add(5.90);
        gasolina.add(6.03);
        gasolina.add(5.10);

        System.out.println("Gasolina dia 1: " + gasolina.get(0));
        System.out.println("Gasolina dia 2: " + gasolina.get(1));
        System.out.println("Gasolina dia 3: " + gasolina.get(2));
        System.out.println("Gasolina dia 4: " + gasolina.get(3));
        System.out.println("Gasolina dia 5: " + gasolina.get(4));

        Double soma = gasolina.get(0) + gasolina.get(1) + gasolina.get(2) + gasolina.get(3) + gasolina.get(4);

        System.out.println("Soma dos preços:  "+ soma);

        gasolina.remove(5.10);

        System.out.println("Gasolina dia 1: " + gasolina.get(0));
        System.out.println("Gasolina dia 2: " + gasolina.get(1));
        System.out.println("Gasolina dia 3: " + gasolina.get(2));
        System.out.println("Gasolina dia 4: " + gasolina.get(3));

        System.out.println("Tamanho da Array: " + gasolina.size());



    }

    public void exemploListaFor(){
        ArrayList<String> palavras = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            String palavra = JOptionPane.showInputDialog("Digite uma palavra");
            palavras.add(palavra);
        }

        String menorPalavra = "";
        int quantidadeCaracteresMenorPalavra = 99999999;

        for (int i = 0; i < palavras.size(); i++){
            String palavra = palavras.get(i);

            if (palavra.length() < quantidadeCaracteresMenorPalavra){
                quantidadeCaracteresMenorPalavra = palavra.length();
                menorPalavra = palavra;
            }
        }

        JOptionPane.showMessageDialog(null, "Menor palavra: " + menorPalavra);
    }

    public void exercicio2(){
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            numeros.add(numero);
        }

        String pares = "";

        for (int i = 0; i < 10; i++){
            int numero = numeros.get(i);

            if (numero % 2 == 0) {
                pares += numero + " ";
            }
        }

        JOptionPane.showMessageDialog(null,"Numeros pares: " + pares);

        String positivos = "";

        for (int i = 0; i < 10; i++){
            int numero = numeros.get(i);

            if (numero > 0) {
                positivos += numero + " ";
            }
        }

        JOptionPane.showMessageDialog(null,"Numeros positivos: " + positivos);

        int qunatidadeMaioresDez = 0;

        for (int i = 0; i < 10; i++){
            int numero = numeros.get(i);

            if (numero > 10) {
                qunatidadeMaioresDez += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de numeros maiores que 10:" + qunatidadeMaioresDez);

        int quantidadeImpares = 0;

        for (int i = 0; i < 10; i++){
            int numero = numeros.get(i);

            if (numero % 2 != 0) {
                quantidadeImpares += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de numeros impares: " + quantidadeImpares);

        int somaNegativos = 0;

        for(int i = 0; i < 10; i++){
            int numero = numeros.get(i);
            if (numero < 0) {
                somaNegativos += numero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "soma dos numeros negativos: " + somaNegativos);
        
    }
}
