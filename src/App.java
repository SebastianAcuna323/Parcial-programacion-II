public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Bienvenido al sistema de Libros ---");

    System.out.println("*** INICIANDO PRUEBA ***");
    
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry");
        Libro libro2 = new Libro();

        libro2.imprimir();
        libro1.imprimir();




}
}
