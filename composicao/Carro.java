package composicao;

public class Carro {
    private String modelo;
    private String cor;
    private Motor motor;
    private Boolean escada;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public Motor getMotor(){
        return motor;
    }

    public void setEscada(Boolean escada){
        this.escada = escada;
    }

    public boolean isEscada(){
        return escada;
    }

    /*Sempre q for boolean usar is ao inves de get */

    @Override
    public String toString(){
        return String.format("""
                Carro: 
                Modelo: %s
                Cor: %s
                Tem escada: %s
                """, modelo, cor, escada);
    }
}
