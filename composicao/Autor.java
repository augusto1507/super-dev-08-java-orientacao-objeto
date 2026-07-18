package composicao;

public class Autor {
    private String nome;
    private String cidadeNascimento;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCiadadeNascimento(String cidadeNacsimento){
        this.cidadeNascimento = cidadeNacsimento;
    }

    public String getCidadeNacsimento(){
        return cidadeNascimento;
    }

}
