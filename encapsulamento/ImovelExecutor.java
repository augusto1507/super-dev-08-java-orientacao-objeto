package encapsulamento;


import javax.swing.JOptionPane;

public class ImovelExecutor {
    public void executar(){
        Imovel imovelLoriLori = new Imovel();

        imovelLoriLori.setQuantidadeQuartos(5);
        imovelLoriLori.setEndereco("Ruas das maçãs");
        imovelLoriLori.setPossuiGaragem(true);;
        imovelLoriLori.setQuantidadeBanheiros(3);;
        imovelLoriLori.setMetragem(150);;
        
        JOptionPane.showMessageDialog(null, 
            "Imovel: " + imovelLoriLori.getEndereco() +
            "\nQuantidade quartos: " + imovelLoriLori.getQuantidadeQuartos() +
            "\nMetragem: " + imovelLoriLori.getMetragem() +
            "\nQuantidade Banheiros: " + imovelLoriLori.getQuantidadeBanheiros() +
            "\nPossui garagem? " + imovelLoriLori.getPossuiGaragem()
        );
    }
}
