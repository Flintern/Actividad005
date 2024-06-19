package metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jesus
 */
public class MaquinaGolosinas {

    String nombresGolosinas[][];
    double precio[][];
    double cantidad[][];
    double ventas[][];

    public MaquinaGolosinas() {
        this.nombresGolosinas = new String[][] {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}

        };

        this.precio = new double[][] {
            {1000, 200, 500, 950},
            {1800, 100, 120, 100},
            {1750, 130, 120, 800},
            {1500, 110, 720, 350}

        };
        this.cantidad = new double[][] {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5}

        };
        this.ventas = new double[][] {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };    
    }

    public String[][] getNombresGolosinas() {
        return nombresGolosinas;
    }

    public void setNombresGolosinas(String[][] nombresGolosinas) {
        this.nombresGolosinas = nombresGolosinas;
    }

    public double[][] getPrecio() {
        return precio;
    }

    public void setPrecio(double[][] precio) {
        this.precio = precio;
    }

    public double[][] getCantidad() {
        return cantidad;
    }

    public void setCantidad(double[][] cantidad) {
        this.cantidad = cantidad;
    }
    
    public void pedirGolosina(JTextField jtfFila, JTextField jtfColumna) {
 
        
        int fila = Integer.parseInt(jtfFila.getText());
        int columna = Integer.parseInt(jtfColumna.getText());
        String info;

        if (fila >= 0 && fila < 4 && columna >= 0 && columna < 4) {
            if (cantidad[fila][columna] > 0) {
                cantidad[fila][columna]--;
                ventas[fila][columna]++;
                info="Has comprado: " + nombresGolosinas[fila][columna] + " por "+precio[fila][columna]+" unidades.";
  
                JOptionPane.showMessageDialog(null,info);
            } else {
                info= "Lo siento, no quedan más " + nombresGolosinas[fila][columna];
                JOptionPane.showMessageDialog(null,info );
            }
        } else {
            JOptionPane.showMessageDialog(null,"Codigo invalido");
        }
    }
    

}
