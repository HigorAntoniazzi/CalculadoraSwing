import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraDesigner  extends JFrame{
    public JPanel designer;
    private JTextField textPrimeiroNumero;
    private JTextField textSegundoValor;
    private JButton bntSomar;
    private JButton bntDiminuir;
    private JButton bntDividir;
    private JButton bntMultiplicar;
    private JButton bntLimpar;
    private JTextField textResultado;

    public CalculadoraDesigner() {
    bntSomar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           Double valor1 = Double.valueOf(textPrimeiroNumero.getText());
           Double valor2 = Double.valueOf(textSegundoValor.getText());

           Double soma = valor1 + valor2;

           textResultado.setText(soma.toString());
        }
    });
    bntDiminuir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valor1 = Double.valueOf(textPrimeiroNumero.getText());
            Double valor2= Double.valueOf(textSegundoValor.getText());

           Double menos = valor1 - valor2;

           textResultado.setText(menos.toString());


        }
    });
    bntDividir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valor1 = Double.valueOf(textPrimeiroNumero.getText());
            Double valor2= Double.valueOf(textSegundoValor.getText());

           Double dividir = valor1 / valor2;

           textResultado.setText(dividir.toString());
        }
    });
    bntMultiplicar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double valor1 = Double.valueOf(textPrimeiroNumero.getText());
            Double valor2= Double.valueOf(textSegundoValor.getText());

            Double multiplicacao = valor1 * valor2;

            textResultado.setText(multiplicacao.toString());
        }
    });
    bntLimpar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textPrimeiroNumero.setText("");
            textSegundoValor.setText("");
            textResultado.setText("");

        }
    });
}
}
