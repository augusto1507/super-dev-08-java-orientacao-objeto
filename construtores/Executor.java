package construtores;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Executor {
    public void executar(){
        executarRemedio();
    }

    private void executarRemedio(){
        Remedio paracetamol = new Remedio("Paracetamol", 500, true, LocalDate.of(2026, 12, 31));
        paracetamol.setFabricante("EuroFarma");

        String remedioGenerico = paracetamol.isGenerico() == true ? "sim" : "Não";
        String nomeFabricante = paracetamol.getFabricante() != null ? paracetamol.getFabricante() : "Sem fabricante";

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatador.format(paracetamol.getDataVencimento());

        System.out.println(String.format("""
                Remédio: %s
                Miligramagem: %s
                Genérico: %s
                Data de validade: %s
                Fabricante: %s
                """, paracetamol.getNome(), paracetamol.getMiligramagem(), remedioGenerico, dataFormatada, nomeFabricante));
    }
}
