public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Bienvenido al sistema de Libros ---");

    System.out.println("*** INICIANDO PRUEBA ***");
    
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 0, 1);
        

        System.out.println("prueba prestamo");
        if (libro1.prestamo()) {
            System.out.println("Se presto correctamente el libro campeon");
            
        } else {
                    System.out.println("No se pudo prestar");
        }

        System.out.println("prueba devolucion");
        if (libro1.devolucion()) {
            System.out.println("Se devolvio el libro campeon");
            
        } else {
                    System.out.println("No se pudo devolver");
        }


        
        libro1.imprimir();




}
}
