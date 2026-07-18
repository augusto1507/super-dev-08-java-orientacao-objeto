package composicao;

public class Motor {

    private double cilindradas;
    private String combustivel;

    public void setCilindradas(double cilindradas){
        this.cilindradas = cilindradas;
    }

    public double getCilindradas(){
        return cilindradas;
    }

    public void setCombustivel(String combustivel){
        this.combustivel = combustivel;
    }

    public String getCombustivel(){
        return combustivel;
    }

    @Override
    public String toString(){
        return "Motor: \nCilindradas: " + cilindradas + "\nCombustivel: " + combustivel;
    }
}
