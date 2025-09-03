public class Libro {

    private String titulo;
    private String Autor;
    private int numeroEjemplares = 0;
    private int numeroEjemplaresPrestados = 0;

    
    private Libro(String titulo, String autor) {
        this.titulo = titulo;
        Autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return Autor;
    }


    public void setAutor(String autor) {
        Autor = autor;
    }


    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }


    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }


    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }


    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    


    



}