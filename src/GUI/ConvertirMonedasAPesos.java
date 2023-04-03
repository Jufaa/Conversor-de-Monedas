package GUI;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConvertirMonedasAPesos {
  public void DolarAPeso(double monto){
    double DaP = monto * 208.98;
    DecimalFormat df6 = new DecimalFormat("#.##");
    DaP = Double.valueOf(df6.format(DaP));
    JOptionPane.showMessageDialog(null, "Total: $" + DaP + "!");
  }
  public void EurosAPeso(double monto){
    double EuaP = monto * 226.59 ;
    DecimalFormat df7 = new DecimalFormat("#.##");
    EuaP = Double.valueOf(df7.format(EuaP));
    JOptionPane.showMessageDialog(null, "Total: $" + EuaP + "!");
  }
  public void LibrasAPeso(double monto){
    double ESaP = monto * 257.64;
    DecimalFormat df8 = new DecimalFormat("#.##");
    ESaP = Double.valueOf(df8.format(ESaP));
    JOptionPane.showMessageDialog(null, "Total: $" + ESaP + "!");
  }
  public void YenAPeso(double monto){
    double YaP = monto * 1.57;
    DecimalFormat df9 = new DecimalFormat("#.##");
    YaP = Double.valueOf(df9.format(YaP));
    JOptionPane.showMessageDialog(null, "Total: $" + YaP + "!");
  }
  public void WonAPeso(double monto) {
    double WaP = monto * 0.16;
    DecimalFormat df0 = new DecimalFormat("#.##");
    WaP = Double.valueOf(df0.format(WaP));
    JOptionPane.showMessageDialog(null, "Total: $" + WaP + "!");
  }




}
