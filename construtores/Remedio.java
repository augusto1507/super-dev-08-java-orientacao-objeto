package construtores;
import java.time.LocalDate;

public class Remedio {
    private String nome;
    private int miligramagem;
    private boolean generico;
    private LocalDate dataVencimento;
    private String fabricante;

    public Remedio(String nome, int miligramagem, boolean generico, LocalDate dataVencimento){
        this.nome = nome;
        this.miligramagem = miligramagem;
        this.generico = generico;
        this.dataVencimento = dataVencimento;
    }

    public String getNome(){
        return nome;
    }

    public int getMiligramagem(){
        return miligramagem;
    }

    public Boolean isGenerico(){
        return generico;
    }

    public LocalDate getDataVencimento(){
        return dataVencimento;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

}
