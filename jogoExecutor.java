import javax.swing.JOptionPane;

public class jogoExecutor {
    public void executar() {

        Jogo counterStrike2 = new Jogo();

        counterStrike2.nome = "CS2";
        counterStrike2.preco = 0;
        counterStrike2.parcelamentoDisponivel = 0;
        counterStrike2.valorParcelas = calcularValorParcelas(counterStrike2);

        Jogo redDeadRedemption2 = new Jogo();

        redDeadRedemption2.nome = "Red Dead Redemption 2";
        redDeadRedemption2.preco = 220.90;
        redDeadRedemption2.parcelamentoDisponivel = 12;
        redDeadRedemption2.valorParcelas = calcularValorParcelas(redDeadRedemption2);

        Jogo theWitcher3 = new Jogo();

        theWitcher3.nome = "The Whitcher 3: Wild Hunt";
        theWitcher3.preco = 40.00;
        theWitcher3.parcelamentoDisponivel = 2;
        theWitcher3.valorParcelas = calcularValorParcelas(theWitcher3);

        JOptionPane.showMessageDialog(null,
                "=== Jogo 1 ===\n" +
                        "Nome: " + counterStrike2.nome + "\n" +
                        "Preço: R$ " + counterStrike2.preco + "\n" +
                        "Parcelamento: " + counterStrike2.parcelamentoDisponivel + "x\n" +
                        "Valor da Parcela: R$ " + counterStrike2.valorParcelas + "\n\n" +

                        "=== Jogo 2 ===\n" +
                        "Nome: " + redDeadRedemption2.nome + "\n" +
                        "Preço: R$ " + redDeadRedemption2.preco + "\n" +
                        "Parcelamento: " + redDeadRedemption2.parcelamentoDisponivel + "x\n" +
                        "Valor da Parcela: R$ " + redDeadRedemption2.valorParcelas + "\n\n" +

                        "=== Jogo 3 ===\n" +
                        "Nome: " + theWitcher3.nome + "\n" +
                        "Preço: R$ " + theWitcher3.preco + "\n" +
                        "Parcelamento: " + theWitcher3.parcelamentoDisponivel + "x\n" +
                        "Valor da Parcela: R$ " + theWitcher3.valorParcelas);
    }

    private double calcularValorParcelas(Jogo jogo) {
        double valorParcelas = jogo.preco / jogo.parcelamentoDisponivel;
        return valorParcelas;
    }
}
