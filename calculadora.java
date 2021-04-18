import java.awt.Color;
import javax.swing.*;

public class calculadora {

  public void ventanabasica(){//Constructor

    JFrame ventana=new JFrame("Calculadora");//CARACTERISTICAS DE LA VENTNA Y TITULO
    ventana.setVisible(true);//Hacer visible la ventana
    ventana.setSize(300, 400);//Dimensiones de la ventana
    ventana.setLocationRelativeTo(null);//Posicion central de la ventana
    ventana.setResizable(false);//Hacer la ventana ajustable o no
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar la ventana al dar en "X"

    JPanel panel=new JPanel();
    panel.setBackground(Color.BLUE);//Configuracion de Color de panel
    ventana.getContentPane().add(panel);//Añadir panel a la ventana

    JLabel etiquetas=new JLabel("Calculadora Basica");//Titulo del programa
    panel.add(etiquetas);
  }

}

