import java.awt.*;
import javax.swing.*;

public class calculadora {

  public void ventanabasica(){//Constructor

    JFrame ventana=new JFrame("Calculadora");//CARACTERISTICAS DE LA VENTNA Y TITULO
    ventana.setVisible(true);//Hacer visible la ventana
    ventana.setSize(300, 400);//Dimensiones de la ventana
    ventana.setLocationRelativeTo(null);//Posicion central de la ventana
    ventana.setResizable(true);//Hacer la ventana ajustable o no
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar la ventana al dar en "X"

    JPanel panel=new JPanel();
    panel.setLayout(null);//Quitar el diseño por defecto del panel por defecto
    // panel.setBackground(Color.white);//Configuracion de Color de panel
    ventana.getContentPane().add(panel);//Añadir panel a la ventana

    JLabel Titulo=new JLabel("Calculadora Basica");//Titulo del programa 
    Titulo.setSize(150,239);
    Titulo.setForeground(Color.black);//Color Letra   
    Titulo.setBounds(10, 0, 300, 50);//Posicion del texto
    Titulo.setFont(new Font("Arial",Font.PLAIN,20));//Configuracion de texto
    panel.add(Titulo);

    //Botones de operaciones ------------------------------------------------------------------------

    JButton suma=new JButton("+");//Boton Suma
    suma.setBounds(190, 100, 50, 30);//Tamaño de boton
    suma.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(suma);

    JButton resta=new JButton("-");//Boton Resta
    resta.setBounds(190, 150, 50, 30);//Tamaño de boton
    resta.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(resta);

    JButton multiplicacion=new JButton("-");//Boton multiplicacion
    multiplicacion.setBounds(190, 200, 50, 30);//Tamaño de boton
    multiplicacion.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(multiplicacion);

    JButton division=new JButton("/");//Boton division
    division.setBounds(190, 250, 50, 30);//Tamaño de boton
    division.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(division);

    //Pantalla ---------------------------------------------------------

    JLabel pantalla=new JLabel("_");
    pantalla.setBounds(10, 40, 100, 40);
    panel.add(pantalla);

    //Teclado númerico---------------------------------------------------------------

    JButton uno=new JButton("1");
    uno.setBounds(10, 100, 50, 30);//Tamaño de boton
    uno.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(uno);
    
    JButton dos=new JButton("2");
    dos.setBounds(70, 100, 50, 30);//Tamaño de boton
    dos.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(dos);

    JButton tres=new JButton("3");
    tres.setBounds(130, 100, 50, 30);//Tamaño de boton
    tres.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(tres);

    JButton cuatro=new JButton("4");
    cuatro.setBounds(10, 150, 50, 30);//Tamaño de boton
    cuatro.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(cuatro);

    JButton cinco=new JButton("5");
    cinco.setBounds(70, 150, 50, 30);//Tamaño de boton
    cinco.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(cinco);

    JButton seis=new JButton("6");
    seis.setBounds(130, 150, 50, 30);//Tamaño de boton
    seis.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(seis);

    JButton siete=new JButton("7");
    siete.setBounds(10, 200, 50, 30);//Tamaño de boton
    siete.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(siete);

    JButton ocho=new JButton("8");
    ocho.setBounds(70, 200, 50, 30);//Tamaño de boton
    ocho.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(ocho);

    JButton nueve=new JButton("9");
    nueve.setBounds(130, 200, 50, 30);//Tamaño de boton
    nueve.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(nueve);

    JButton cero=new JButton("0");
    cero.setBounds(70, 250, 50, 30);//Tamaño de boton
    cero.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(cero);
    
  }

}
