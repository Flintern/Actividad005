package metodos;

/**
 *
 * @author jesus
 */
public class MaquinaGolosinas {

    String nombresGolosinas[][];
    double precio[][];
    double cantidad[][];

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
    
   
    

}
