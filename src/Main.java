import javax.swing.*;

public class Main {
  public  static void main(String[] args){
    JFrame frame = new JFrame("Mi aplicación");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    JLabel label = new JLabel("Hola, mundo!");
    frame.getContentPane().add(label);
    frame.setVisible(true);
  }
}
