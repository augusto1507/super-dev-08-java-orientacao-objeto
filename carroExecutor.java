import javax.swing.JOptionPane;

public class carroExecutor {
    public void executar(){
        Carro uno = new Carro();

        uno.motor = 3.5;
        uno.modelo = "Uno com escada";
        uno.cor = "Claro";
        uno.isEletrico = false;
        uno.marca = "Fiat";
        uno.aro = 15;

        uno.modelo = "Uno com dupla escada";
        uno.motor = 7.0;
        uno.cor = "Relampago do marquinhos";

        Carro carro1 = new Carro();

        carro1.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        carro1.cor = JOptionPane.showInputDialog("Digite a cor do carro");
        carro1.isEletrico = Boolean.parseBoolean(JOptionPane.showInputDialog("CArro elétrico? [true/false]"));
        carro1.motor = Double.parseDouble(JOptionPane.showInputDialog("Dogote a potencia do motor"));
        carro1.marca = JOptionPane.showInputDialog("Digite a marca do carro");
        carro1.aro = Integer.parseInt(JOptionPane.showInputDialog("Digite o aro do carro"));

        JOptionPane.showMessageDialog(null,
            "=== Dados do Uno ===\n" +
            "Modelo: " + uno.modelo +
            "\nCor: " + uno.cor + 
            "\nElétrico: " + uno.isEletrico +
            "\nMotor: " + uno.marca +
            "\nMarca: " + uno.marca +
            "\nAro: " + uno.aro + "\n\n" +

            "=== Dados do Carro 1 ===\n" +
            "Modelo: " + carro1.modelo +
            "\nCor: " + carro1.cor + 
            "\nElétrico: " + carro1.isEletrico +
            "\nMotor: " + carro1.marca +
            "\nMarca: " + carro1.marca +
            "\nAro: " + carro1.aro + "\n\n"
        );
    }

}
