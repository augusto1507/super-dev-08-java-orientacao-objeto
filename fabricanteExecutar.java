import javax.swing.JOptionPane;

public class fabricanteExecutar {
    public void executar() {
        Fabricante weg = new Fabricante();

        weg.nome = "WEG";
        weg.cnpj = "66.586.633/0001-31";
        weg.faturamento = 3500000;
        weg.percentualLucro = 67;
        weg.lucro = calcularLucro(weg);

        Fabricante marcopolo = new Fabricante();

        marcopolo.nome = "Marcopolo";
        marcopolo.cnpj = "80.553.190/0001-03";
        marcopolo.faturamento = 676767;
        marcopolo.percentualLucro = 42;
        marcopolo.lucro = calcularLucro(marcopolo);

        JOptionPane.showMessageDialog(null,
                "=== Fabricante SC ===\n" +
                        "Nome: " + weg.nome + "\n" +
                        "CNPJ: " + weg.cnpj + "\n" +
                        "Faturamento: R$ " + weg.faturamento + "\n" +
                        "Percentual de lucro " + weg.percentualLucro + "%\n" +
                        "Lucro: R$ " + weg.lucro + "\n\n" +

                        "=== Fabricante RS ===\n" +
                        "Nome: " + marcopolo.nome + "\n" +
                        "CNPJ: " + marcopolo.cnpj + "\n" +
                        "Faturamento: R$ " + marcopolo.faturamento + "\n" +
                        "Percentual de lucro " + marcopolo.percentualLucro + "%\n" +
                        "Lucro: R$ " + marcopolo.lucro + "\n\n"
                    );
    }

    private double calcularLucro(Fabricante fabricante){
        double lucro = fabricante.faturamento * (fabricante.percentualLucro / 100.00);
        return lucro;
    }

}
