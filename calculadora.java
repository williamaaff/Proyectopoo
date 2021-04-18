import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.*;
public class calculadora {

  ScriptEngineManager calculo=new ScriptEngineManager();//Poder hacer los calculos
  ScriptEngine calculo1=calculo.getEngineByName("JavaScript");//operar "1+2" como int

  public void ventanabasica(){//Constructor

    JFrame ventana=new JFrame("Calculadora");//CARACTERISTICAS DE LA VENTNA Y TITULO
    ventana.setVisible(true);//Hacer visible la ventana
    ventana.setSize(300,400);//Dimensiones de la ventana
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

    //Pantalla ---------------------------------------------------------

    JTextArea pantalla =new JTextArea();
    pantalla.setBounds(10, 45, 225, 50);
    pantalla.setEditable(false);
    panel.add(pantalla);

    //Botones------------------------------------------------------------------------

    

    JButton suma=new JButton("+");//Boton Suma
    suma.setBounds(190, 100, 50, 30);//Tamaño de boton
    suma.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(suma);
    ActionListener accionsuma=new ActionListener(){//Sumatoria a la pantalla
      
      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("+");

      }

    };
    suma.addActionListener(accionsuma);

    JButton resta=new JButton("-");//Boton Resta
    resta.setBounds(190, 150, 50, 30);//Tamaño de boton
    resta.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(resta);
    ActionListener accionresta=new ActionListener(){//resta a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){
        
        pantalla.append("-");

      }

    };
    resta.addActionListener(accionresta);

    JButton multiplicacion=new JButton("*");//Boton multiplicacion
    multiplicacion.setBounds(190, 200, 50, 30);//Tamaño de boton
    multiplicacion.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(multiplicacion);
    ActionListener accionmultiplicar=new ActionListener(){//resta a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){
        
        pantalla.append("*");

      }

    };
    multiplicacion.addActionListener(accionmultiplicar);

    JButton division=new JButton("/");//Boton division
    division.setBounds(190, 250, 50, 30);//Tamaño de boton
    division.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(division);
    ActionListener acciondividir=new ActionListener(){//resta a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){
        
        pantalla.append("/");

      }

    };
    division.addActionListener(acciondividir);



    //números---------------------------------------------------------------

    JButton uno=new JButton("1");
    uno.setBounds(10, 100, 50, 30);//Tamaño de boton
    uno.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(uno);
    ActionListener accion1=new ActionListener(){//Añadir 1 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("1");

      }

    };

    uno.addActionListener(accion1);

    
    JButton dos=new JButton("2");
    dos.setBounds(70, 100, 50, 30);//Tamaño de boton
    dos.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(dos);
    ActionListener accion2=new ActionListener(){//Añadir 2 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("2");

      }

    };
    dos.addActionListener(accion2);

    JButton tres=new JButton("3");
    tres.setBounds(130, 100, 50, 30);//Tamaño de boton
    tres.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(tres);
    ActionListener accion3=new ActionListener(){//Añadir 3 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("3");

      }

    };
    tres.addActionListener(accion3);

    JButton cuatro=new JButton("4");
    cuatro.setBounds(10, 150, 50, 30);//Tamaño de boton
    cuatro.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(cuatro);
    ActionListener accion4=new ActionListener(){//Añadir 4 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("4");

      }

    };
    cuatro.addActionListener(accion4);

    JButton cinco=new JButton("5");
    cinco.setBounds(70, 150, 50, 30);//Tamaño de boton
    cinco.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(cinco);
    ActionListener accion5=new ActionListener(){//Añadir 5 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("5");

      }

    };
    cinco.addActionListener(accion5);

    JButton seis=new JButton("6");
    seis.setBounds(130, 150, 50, 30);//Tamaño de boton
    seis.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(seis);
    ActionListener accion6=new ActionListener(){//Añadir 6 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("6");

      }

    };
    seis.addActionListener(accion6);

    JButton siete=new JButton("7");
    siete.setBounds(10, 200, 50, 30);//Tamaño de boton
    siete.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(siete);
    ActionListener accion7=new ActionListener(){//Añadir 7 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("7");

      }

    };
    siete.addActionListener(accion7);

    JButton ocho=new JButton("8");
    ocho.setBounds(70, 200, 50, 30);//Tamaño de boton
    ocho.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(ocho);
    ActionListener accion8=new ActionListener(){//Añadir 8 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("8");

      }

    };
    ocho.addActionListener(accion8);

    JButton nueve=new JButton("9");
    nueve.setBounds(130, 200, 50, 30);//Tamaño de boton
    nueve.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(nueve);
    ActionListener accion9=new ActionListener(){//Añadir 9 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("9");

      }

    };
    nueve.addActionListener(accion9);

    JButton cero=new JButton("0");
    cero.setBounds(70, 250, 50, 30);//Tamaño de boton
    cero.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(cero);
    ActionListener accion0=new ActionListener(){//Añadir 0 a la pantalla

      @Override 
      public void actionPerformed(ActionEvent ae){

        pantalla.append("0");

      }

    };
    cero.addActionListener(accion0);

    JButton igual=new JButton("=");
    igual.setBounds(190, 300, 50, 30);//Tamaño de boton
    igual.setFont(new Font("Arial",Font.PLAIN,25));
    panel.add(igual);
    ActionListener accionigual=new ActionListener(){//Resultado en la pantalla
      
      @Override 
      public void actionPerformed(ActionEvent ae){
        try {
          String resultado=calculo1.eval(pantalla.getText()).toString(); //evaluar la operacion "1+1" como int 1+1
          pantalla.setText(resultado);//poner resultado en pantalla

        } catch (Exception e) {
          //TODO: handle exception
        }
      }

    };
    igual.addActionListener(accionigual);
 
  }

}
