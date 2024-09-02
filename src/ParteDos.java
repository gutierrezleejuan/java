import javax.swing.JOptionPane;

public class ParteDos {

    public static class Partedos {
        private String nombre;
        private String director;
        private int año;
        private String genero; // Cambiado a String para representar el género de la película

        // Constructor para inicializar todos los atributos
        public Partedos(String nombre, String director, int año, String genero) {
            this.nombre = nombre;
            this.director = director;
            this.año = año;
            this.genero = genero;
        }

        // Método para mostrar la información usando JOptionPane
        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        // Método toString para imprimir la información de la película
        @Override
        public String toString() {
            return "Nombre de la película: " + nombre + "\n" +
                   "Director: " + director + "\n" +
                   "Año: " + año + "\n" +
                   "Género: " + genero;
        }
    }

    public static class Restaurante {
        private String nombre;
        private String direccion;
        private String tipoCocina;
        private double calificacion;

        // Constructor para inicializar todos los atributos
        public Restaurante(String nombre, String direccion, String tipoCocina, double calificacion) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.tipoCocina = tipoCocina;
            this.calificacion = calificacion;
        }

        // Métodos getter
        public String getNombre() {
            return nombre;
        }

        public String getDireccion() {
            return direccion;
        }

        public String getTipoCocina() {
            return tipoCocina;
        }

        public double getCalificacion() {
            return calificacion;
        }

        // Métodos setter
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public void setTipoCocina(String tipoCocina) {
            this.tipoCocina = tipoCocina;
        }

        public void setCalificacion(double calificacion) {
            this.calificacion = calificacion;
        }

        // Método toString para imprimir la información del restaurante
        @Override
        public String toString() {
            return "Nombre del restaurante: " + nombre + "\n" +
                   "Dirección: " + direccion + "\n" +
                   "Tipo de cocina: " + tipoCocina + "\n" +
                   "Calificación: " + calificacion;
        }

        // Método para mostrar la información usando JOptionPane
        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }
    }

    public static void main(String[] args) {
        // Crear instancias de Partedos
        Partedos pelicula1 = new Partedos("Deadpool 3", "Tim Miller", 2024, "Acción");
       
        // Mostrar información de las películas usando JOptionPane
        pelicula1.imprimirInfo();
    
        // Crear instancias de Restaurante
        Restaurante restaurante1 = new Restaurante("La Bella Italia", "Calle Roma 12", "Italiana", 4.5);
        
        // Mostrar información de los restaurantes usando JOptionPane
        restaurante1.imprimirInfo();
       
    }
}
