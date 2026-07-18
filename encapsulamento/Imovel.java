package encapsulamento;

public class Imovel {
    /*
     * private (acessivel somente dentro da mesma classe)
     * private (acessivel somente na propria packege ou na herança)
     * public (acessivel em qualquer lugar)
     */

    private int quantidadeQuartos;
    public int quantidadeBanheiros;
    public int metragem;
    public boolean possuiGaragem;
    public String endereco;

    public void setQuantidadeQuartos(int quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setPossuiGaragem(boolean possuiGaragem){
        this.possuiGaragem = possuiGaragem;
    }

    public boolean getPossuiGaragem(){
        return possuiGaragem;
    }

    public void setMetragem(int metragem){
        this.metragem = metragem;
    }

    public int getMetragem(){
        return metragem;
    }

    public void setQuantidadeBanheiros(int quantidadeBanheiros){
        this.quantidadeBanheiros = quantidadeBanheiros;
    }

    public int getQuantidadeBanheiros(){
        return quantidadeBanheiros;
    }

}