package GUI;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConvertirPesosAMonedas {
  public void PesoADolar(double monto){
    double PaD = monto * 0.0048;
    DecimalFormat df = new DecimalFormat("#.##");
    PaD = Double.parseDouble(df.format(PaD));
    JOptionPane.showMessageDialog(null, "Total: $" + PaD + "!");
  }

  public void PesoAEuros(double monto){
    double PaEu = monto * 0.0045;
    DecimalFormat df2 = new DecimalFormat("#.##");
    PaEu = Double.parseDouble(df2.format(PaEu));
    JOptionPane.showMessageDialog(null, "Total: $" + PaEu + "!");
  }
  public void PesoALibras(double monto){
    double PaES = monto * 0.0039;
    DecimalFormat df3 = new DecimalFormat("#.##");
    PaES = Double.parseDouble(df3.format(PaES));
    JOptionPane.showMessageDialog(null, "Total: $" + PaES + "!");
  }
  public void PesoAYen(double monto){
    double PaY = monto * 0.64;
    DecimalFormat df4 = new DecimalFormat("#.##");
    PaY = Double.parseDouble(df4.format(PaY));
    JOptionPane.showMessageDialog(null, "Total: $" + PaY + "!");

  }

  public void PesoAWon(double monto){
    double PaW = monto * 6.26;
    DecimalFormat df5 = new DecimalFormat("#.##");
    PaW = Double.parseDouble(df5.format(PaW));
    JOptionPane.showMessageDialog(null, "Total: $" + PaW + "!");
  }
}
