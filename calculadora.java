import javax.swing.JFrame;

public class calculadora {

  public void ventana(){

    JFrame ventana=new JFrame("Calculadora");
    ventana.setVisible(true);
    ventana.setSize(300, 150);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
