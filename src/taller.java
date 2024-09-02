import javax.swing.JOptionPane;

public class taller {

    public class Libro {
        private String isbn;
        private String titulo;
        private String autor;
        private String disponible;

        public Libro(String isbn, String titulo, String autor, String disponible) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = disponible;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "ISBN: " + isbn + "\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Disponible: " + disponible);
        }
    }

    public class Estudiante {
        private String nombre;
        private int edad;
        private String carrera;
        private double promedio;

        public Estudiante(String nombre, int edad, String carrera, double promedio) {
            this.nombre = nombre;
            this.edad = edad;
            this.carrera = carrera;
            this.promedio = promedio;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Carrera: " + carrera + "\n" +
                "Promedio: " + promedio);
        }
    }

    public class Empleado {
        private String nombre;
        private String puesto;
        private double salario;
        private int antiguedad;

        public Empleado(String nombre, String puesto, double salario, int antiguedad) {
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
            this.antiguedad = antiguedad;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                "Puesto: " + puesto + "\n" +
                "Salario: " + salario + "\n" +
                "Antigüedad: " + antiguedad);
        }
    }

    public class Producto {
        private String codigo;
        private String nombre;
        private double precio;
        private int stock;

        public Producto(String codigo, String nombre, double precio, int stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Código: " + codigo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Stock: " + stock);
        }
    }

    public class Coche {
        private String marca;
        private String modelo;
        private int año;
        private double precio;

        public Coche(String marca, String modelo, int año, double precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.año = año;
            this.precio = precio;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + año + "\n" +
                "Precio: " + precio);
        }
    }

    public class Cliente {
        private String nombre;
        private String direccion;
        private String telefono;
        private String email;

        public Cliente(String nombre, String direccion, String telefono, String email) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                "Dirección: " + direccion + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Email: " + email);
        }
    }

    public class Paciente {
        private String nombre;
        private int edad;
        private String enfermedad;
        private String doctor;

        public Paciente(String nombre, int edad, String enfermedad, String doctor) {
            this.nombre = nombre;
            this.edad = edad;
            this.enfermedad = enfermedad;
            this.doctor = doctor;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Enfermedad: " + enfermedad + "\n" +
                "Doctor: " + doctor);
        }
    }

    public class Curso {
        private String nombre;
        private String codigo;
        private int creditos;
        private String profesor;

        public Curso(String nombre, String codigo, int creditos, String profesor) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.creditos = creditos;
            this.profesor = profesor;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                "Código: " + codigo + "\n" +
                "Créditos: " + creditos + "\n" +
                "Profesor: " + profesor);
        }
    }

    public class Pedido {
        private String codigoPedido;
        private String producto;
        private int cantidad;
        private double precioTotal;

        public Pedido(String codigoPedido, String producto, int cantidad, double precioTotal) {
            this.codigoPedido = codigoPedido;
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioTotal = precioTotal;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Código del pedido: " + codigoPedido + "\n" +
                "Producto: " + producto + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Precio total: " + precioTotal);
        }
    }

    public class Evento {
        private String nombre;
        private String fecha;
        private String lugar;
        private int asistentes;

        public Evento(String nombre, String fecha, String lugar, int asistentes) {
            this.nombre = nombre;
            this.fecha = fecha;
            this.lugar = lugar;
            this.asistentes = asistentes;
        }

        public void imprimirInfo() {
            JOptionPane.showMessageDialog(null,
                "Nombre: " + nombre + "\n" +
                "Fecha: " + fecha + "\n" +
                "Lugar: " + lugar + "\n" +
                "Asistentes: " + asistentes);
        }
    }

    public static void main(String[] args) {
        taller taller = new taller();

        Libro libro = taller.new Libro("978-0-452-28423-4", "1984", "George Orwell", "sí");
        libro.imprimirInfo();

        Estudiante estudiante = taller.new Estudiante("Ana Gómez", 22, "Biología", 9.2);
        estudiante.imprimirInfo();

        Empleado empleado = taller.new Empleado("Carlos Pérez", "Analista de sistemas", 3200.0, 3);
        empleado.imprimirInfo();

        Producto producto = taller.new Producto("AB456", "Laptop", 1200.50, 25);
        producto.imprimirInfo();

        Coche coche = taller.new Coche("Audi", "A4", 2021, 35000.0);
        coche.imprimirInfo();

        Cliente cliente = taller.new Cliente("Laura Martínez", "Calle Falsa 123", "555-7890", "laura.martinez@example.com");
        cliente.imprimirInfo();

        Paciente paciente = taller.new Paciente("Jorge Hernández", 45, "Hipertensión", "Dra. Ana López");
        paciente.imprimirInfo();

        Curso curso = taller.new Curso("Matemáticas Avanzadas", "MAT405", 4, "Dr. Luis Ramírez");
        curso.imprimirInfo();

        Pedido pedido = taller.new Pedido("PED-001", "Mouse inalámbrico", 10, 150.0);
        pedido.imprimirInfo();

        Evento evento = taller.new Evento("Feria de Tecnología", "10/11/2024", "Palacio de Congresos", 500);
        evento.imprimirInfo();
    }
}
