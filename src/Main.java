public class Main {
    public static void main(String[] args) {

      CalculadoraDesigner form = new CalculadoraDesigner();
        form.setContentPane(form.designer);
        form.setVisible(true);
        form.setSize(500,500);
        form.setTitle("Operação feita");
    }
    }
