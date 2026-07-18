package composicao;
import java.time.LocalDate;

public class Livro {
    private String nome;
    private String descricao;
    private Autor autor;
    private String isbn;
    private String resumo;
    private LocalDate dataLancamento;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Autor getAutor(){
        return autor;
    }
     public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return isbn;
    }

     public void setResumo(String resumo){
        this.resumo = resumo;
    }

    public String getResumo(){
        return resumo;
    }

     public void setDataLancamento(LocalDate dataLancamento){
        this.dataLancamento = dataLancamento;
    }

    public LocalDate getDataLancamento(){
        return dataLancamento;
    }
}
