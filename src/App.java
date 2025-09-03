public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Bienvenido al sistema de Libros ---");

    System.out.println("*** INICIANDO PRUEBA ***");
    
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 2, 0);
        
        Libro libro2 = new Libro();

        System.out.println("-------PRUEBA PRESTAMO------");
        if (libro1.prestamo()) {
            System.out.println("Se presto correctamente el libro");
            
        } else {
                    System.out.println("No se pudo prestar");
        }

       System.out.println("-------------------------------------");
        System.out.println("-------PRUEBA DEVOLUCION------");
        if (libro1.devolucion()) {
            System.out.println("Se devolvio el libro correctamente");
            
        } else {
                    System.out.println("No se pudo devolver");
        }

        System.out.println("-------------------------------------");
        
        libro1.imprimir();

        System.out.println("-------------------------------------");
        libro2.imprimir();




}
}
