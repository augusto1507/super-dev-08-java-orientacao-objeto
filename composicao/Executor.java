package composicao;
import java.time.LocalDate;

public class Executor {
    public void executar(){
        executarLivro();
    }

    private void executarCarro(){
        Motor motorPalio = new Motor();
        motorPalio.setCilindradas(150);
        motorPalio.setCombustivel("Flex");

        Carro palio = new Carro();
        palio.setModelo("Palio com escada");
        palio.setCor("Vermelho");
        palio.setMotor(motorPalio);
        palio.setEscada(true);

        System.out.println(palio.toString());
        System.out.println(motorPalio.toString());
    }

    private void executarLivro(){
        Autor machadoAssis = new Autor();
        machadoAssis.setNome("Machado de Assis");
        machadoAssis.setCiadadeNascimento("Rio de Janeiro");

        Autor janeAusten = new Autor();
        janeAusten.setNome("Jane Austen");
        janeAusten.setCiadadeNascimento("Steventon");

        Autor toniMorrison = new Autor();
        toniMorrison.setNome("Toni Morrison");
        toniMorrison.setCiadadeNascimento("Lorain");

        Livro domCasmurro = new Livro();
        domCasmurro.setNome("Dom Casmurro");
        domCasmurro.setDescricao("acompanha Bento Santiago (Bentinho) na velhice. Solitário, ele narra sua juventude no Rio de Janeiro, o amor por Capitu e o ciúme obsessivo pelo melhor amigo, Escobar, que o leva a duvidar da própria paternidade e rejeitar o filho.");
        domCasmurro.setAutor(machadoAssis); 
        domCasmurro.setIsbn("9786556404721");
        domCasmurro.setResumo("é um clássico romance psicológico brasileiro escrito por Machado de Assis em 1899. O narrador, Bento Santiago, relata suas memórias para \\\"atar as duas pontas da vida\\\": sua infância no Rio de Janeiro (Rua de Matacavalos), o amor por Capitu e o ciúme obsessivo que o leva a suspeitar de traição.");
        domCasmurro.setDataLancamento(LocalDate.of(1899, 12, 05));

        Livro emma = new Livro();
        emma.setNome("Emma");
        emma.setDescricao("Rica, bela e inteligente, ela é uma jovem espirituosa e mimada que se diverte bancando a \"casamenteira\", mas suas tentativas de interferir na vida amorosa alheia frequentemente causam mal-entendidos e confusões.");
        emma.setAutor(janeAusten);
        emma.setIsbn("9780140430103");
        emma.setResumo("acompanha Emma Woodhouse, uma jovem rica, inteligente e mimada que adora bancar a cupido na pequena cidade de Highbury. Suas tentativas equivocadas de manipular a vida amorosa alheia causam confusões, mas também a levam a um importante processo de amadurecimento e autoconhecimento.");
        emma.setDataLancamento(LocalDate.of(1815,12,23));


        Livro amada = new Livro();
        amada.setNome("Amada");
        amada.setDescricao("a obra acompanha o trauma de Sethe, uma mulher que foge da escravidão, e aborda de forma profunda as feridas, a desumanização e as marcas geradas pelo sistema");
        amada.setAutor(toniMorrison);
        amada.setIsbn("9780330305372");
        amada.setResumo("A ex-escrava Sethe vive em Cincinnati assombrada pelo fantasma da filha bebê, que ela matou para evitar que fosse escravizada. Quando uma jovem misteriosa chamada Amada surge, ela encarna o trauma do passado e desestrutura a vida da família.");
        amada.setDataLancamento(LocalDate.of(1987,9, 2));


        System.out.println(String.format("""
                Livro: %s
                Descrição: %s
                ISBN: %s
                Resumo: %s
                Data de lancamento: %s
                Autoor: %s
                Cidade de nascimento do autor : %s
                """ ,domCasmurro.getNome(),domCasmurro.getDescricao(),domCasmurro.getIsbn(),domCasmurro.getResumo(),domCasmurro.getDataLancamento(),domCasmurro.getAutor(),machadoAssis.getCidadeNacsimento()) );
                         System.out.println(String.format("""
                Livro: %s
                Descrição: %s
                ISBN: %s
                Resumo: %s
                Data de lancamento: %s
                Autoor: %s
                Cidade de nascimento do autor : %s
                """ ,emma.getNome(),emma.getDescricao(),emma.getIsbn(),emma.getResumo(),emma.getDataLancamento(),emma.getAutor(),janeAusten.getCidadeNacsimento()) );
                         System.out.println(String.format("""
                Livro: %s
                Descrição: %s
                ISBN: %s
                Resumo: %s
                Data de lancamento: %s
                Autoor: %s
                Cidade de nascimento do autor : %s
                """ ,amada.getNome(),amada.getDescricao(),amada.getIsbn(),amada.getResumo(),amada.getDataLancamento(),amada.getAutor(),machadoAssis.getCidadeNacsimento()) );
    }
}
