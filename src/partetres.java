import javax.swing.JOptionPane;

public class ParteTres {

    public static class Partetres {
        private String nombre;
        private String apellido;
        private int edad;
        private String direccion;

        public Partetres(String nombre, String apellido, int edad, String direccion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.direccion = direccion;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" +
                   "Apellido: " + apellido + "\n" +
                   "Edad: " + edad + "\n" +
                   "Dirección: " + direccion;
        }
    }

    public static class Orden {
        private int numeroOrden;
        private String fecha;
        private String cliente;
        private double montoTotal;

        public Orden(int numeroOrden, String fecha, String cliente, double montoTotal) {
            this.numeroOrden = numeroOrden;
            this.fecha = fecha;
            this.cliente = cliente;
            this.montoTotal = montoTotal;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Número de Orden: " + numeroOrden + "\n" +
                   "Fecha: " + fecha + "\n" +
                   "Cliente: " + cliente + "\n" +
                   "Monto Total: " + montoTotal;
        }
    }

    public static class Mascota {
        private String nombre;
        private String tipo;
        private int edad;
        private String dueño;

        public Mascota(String nombre, String tipo, int edad, String dueño) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.edad = edad;
            this.dueño = dueño;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" +
                   "Tipo: " + tipo + "\n" +
                   "Edad: " + edad + "\n" +
                   "Dueño: " + dueño;
        }
    }

    public static class Proveedor {
        private String nombre;
        private String empresa;
        private String telefono;
        private String email;

        public Proveedor(String nombre, String empresa, String telefono, String email) {
            this.nombre = nombre;
            this.empresa = empresa;
            this.telefono = telefono;
            this.email = email;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" +
                   "Empresa: " + empresa + "\n" +
                   "Teléfono: " + telefono + "\n" +
                   "Email: " + email;
        }
    }

    public static class Factura {
        private int numeroFactura;
        private String fecha;
        private String cliente;
        private double importeTotal;

        public Factura(int numeroFactura, String fecha, String cliente, double importeTotal) {
            this.numeroFactura = numeroFactura;
            this.fecha = fecha;
            this.cliente = cliente;
            this.importeTotal = importeTotal;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Número de Factura: " + numeroFactura + "\n" +
                   "Fecha: " + fecha + "\n" +
                   "Cliente: " + cliente + "\n" +
                   "Importe Total: " + importeTotal;
        }
    }

    public static class Universidad {
        private String nombre;
        private String direccion;
        private int numeroEstudiantes;
        private int ranking;

        public Universidad(String nombre, String direccion, int numeroEstudiantes, int ranking) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.numeroEstudiantes = numeroEstudiantes;
            this.ranking = ranking;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" +
                   "Dirección: " + direccion + "\n" +
                   "Número de Estudiantes: " + numeroEstudiantes + "\n" +
                   "Ranking: " + ranking;
        }
    }

    public static class Juego {
        private String titulo;
        private String plataforma;
        private int añoLanzamiento;
        private String genero;

        public Juego(String titulo, String plataforma, int añoLanzamiento, String genero) {
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.añoLanzamiento = añoLanzamiento;
            this.genero = genero;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Título: " + titulo + "\n" +
                   "Plataforma: " + plataforma + "\n" +
                   "Año de Lanzamiento: " + añoLanzamiento + "\n" +
                   "Género: " + genero;
        }
    }

    public static class Hotel {
        private String nombre;
        private String direccion;
        private int numeroHabitaciones;
        private int estrellas;

        public Hotel(String nombre, String direccion, int numeroHabitaciones, int estrellas) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.numeroHabitaciones = numeroHabitaciones;
            this.estrellas = estrellas;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null, toString());
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + "\n" +
                   "Dirección: " + direccion + "\n" +
                   "Número de Habitaciones: " + numeroHabitaciones + "\n" +
                   "Estrellas: " + estrellas;
        }
    }

    public static void main(String[] args) {
        // Instancias de las clases
        Partetres persona1 = new Partetres("Ana", "García", 28, "Calle Falsa 123");
        Partetres persona2 = new Partetres("Luis", "Martínez", 34, "Avenida Siempre Viva 456");

        Orden orden1 = new Orden(1001, "2024-08-01", "Carlos Pérez", 250.75);
        Orden orden2 = new Orden(1002, "2024-08-02", "Laura Sánchez", 180.50);

        Mascota mascota1 = new Mascota("Rex", "Perro", 5, "Juan López");
        Mascota mascota2 = new Mascota("Miau", "Gato", 3, "María Fernández");

        Proveedor proveedor1 = new Proveedor("Pedro", "TecnoS.A.", "555-1234", "pedro@tecnosa.com");
        Proveedor proveedor2 = new Proveedor("Ana", "Proveedora Ltda.", "555-5678", "ana@proveedora.com");

        Factura factura1 = new Factura(2001, "2024-08-01", "Carlos Pérez", 500.00);
        Factura factura2 = new Factura(2002, "2024-08-02", "Laura Sánchez", 320.00);

        Universidad universidad1 = new Universidad("Universidad Central", "Calle Universitaria 789", 15000, 10);
        Universidad universidad2 = new Universidad("Instituto Técnico", "Avenida del Saber 101", 8000, 25);

        Juego juego1 = new Juego("Aventura Épica", "PC", 2024, "RPG");
        Juego juego2 = new Juego("Carrera Extrema", "PS5", 2023, "Carreras");

        Hotel hotel1 = new Hotel("Hotel Grand", "Calle Principal 123", 100, 5);
        Hotel hotel2 = new Hotel("Hostal Sol", "Calle Secundaria 456", 50, 3);

        // Mostrar información usando JOptionPane
        persona1.imprimirInfo();
        persona2.imprimirInfo();
        orden1.imprimirInfo();
        orden2.imprimirInfo();
        mascota1.imprimirInfo();
        mascota2.imprimirInfo();
        proveedor1.imprimirInfo();
        proveedor2.imprimirInfo();
        factura1.imprimirInfo();
        factura2.imprimirInfo();
        universidad1.imprimirInfo();
        universidad2.imprimirInfo();
        juego1.imprimirInfo();
        juego2.imprimirInfo();
        hotel1.imprimirInfo();
        hotel2.imprimirInfo();
    }
}
