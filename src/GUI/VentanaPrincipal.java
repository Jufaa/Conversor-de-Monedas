package GUI;

import javax.swing.*;
import java.text.DecimalFormat;

public class VentanaPrincipal extends JFrame {
  public VentanaPrincipal() {
    String[] opciones = {"Conversor de Monedas", "Km a Metros", "Opción 3"};
    String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Título del cuadro de diálogo", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    ConvertirPesosAMonedas x = new ConvertirPesosAMonedas();
    ConvertirMonedasAPesos y = new ConvertirMonedasAPesos();
    while (true) {
      switch (opcionSeleccionada) {
        case "Conversor de Monedas":
          String valorIngresado = JOptionPane.showInputDialog(null, "Ingrese su monto que quiere cambiar:");
          int monto = Integer.parseInt(valorIngresado);
          String[] opcionesMonto = {"Peso a Dolar", "Peso a Euros", "Peso a Libras Esterlinas", "Peso a Yen Japonés", "Peso a Won sul-corean", "Convertir de Dólar a Peso", "Convertir de Euros a Peso", "Convertir de Libras Esterlinas a Peso", "Convertir de Yen Japonés a Peso", "Convertir de Won sul-coreano a Peso"};
          String converSelec = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Título del cuadro de diálogo", JOptionPane.PLAIN_MESSAGE, null, opcionesMonto, opcionesMonto[0]);
          if (converSelec != null)
            switch (converSelec) {

              case "Peso a Dolar":
                x.PesoADolar(monto);
                break;
              case "Peso a Euros":
                x.PesoAEuros(monto);
                break;
              case "Peso a Libras Esterlinas":
                x.PesoALibras(monto);
                break;
              case "Peso a Yen Japonés":
                x.PesoAYen(monto);
                break;
              case "Peso a Won sul-corean":
                x.PesoAWon(monto);
                break;
              case "Convertir de Dólar a Peso":
                y.DolarAPeso(monto);
                break;
              case "Convertir de Euros a Peso":
                y.EurosAPeso(monto);
                break;
              case "Convertir de Libras Esterlinas a Peso":
                y.LibrasAPeso(monto);
                break;
              case "Convertir de Yen Japonés a Peso":
                y.YenAPeso(monto);
                break;
              case "Convertir de Won sul-coreano a Peso":
                y.WonAPeso(monto);
                break;
              default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
            }
          break;
        case "Km a Metros":
          System.out.println("Ha seleccionado la opción 2.");
          // Aquí puedes colocar la acción que deseas realizar para la opción 2
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opción inválida");
          break;
      }

      int opcionFinal = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No", "Cancelar"}, "Cancelar");

      if (opcionFinal == JOptionPane.YES_OPTION) {
        opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Título del cuadro de diálogo", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
      } else if (opcionFinal == JOptionPane.NO_OPTION) {
        System.exit(0); // Salir del programa
      } else {
        break; // Salir del bucle interno y volver a mostrar el primer switch
      }
    }
  }

  public static void main(String[] args) {
    VentanaPrincipal ventana = new VentanaPrincipal();
  }
}
