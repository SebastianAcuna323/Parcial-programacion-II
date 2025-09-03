public class Libro {

    private String titulo;
    private String Autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados = 2;

    
  

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        Autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
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

public boolean prestamo (){
    
if (numeroEjemplaresPrestados<numeroEjemplares) {
    numeroEjemplaresPrestados++;
    return true;
} else {
    return false;
}

}    

public boolean devolucion (){
    if (numeroEjemplaresPrestados==0) {
        numeroEjemplaresPrestados--;
        return false;
    
    } else {
        return true;    
    }


}

 public Libro() {
        this.titulo = "";
        this.Autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }


public void imprimir(){

System.out.println("Libro: "+ titulo);
System.out.println("Autor: " + Autor);
System.out.println("Ejemplares totales: "+ numeroEjemplares);
System.out.println("Ejemplares prestados: " + numeroEjemplaresPrestados);


}






    



}