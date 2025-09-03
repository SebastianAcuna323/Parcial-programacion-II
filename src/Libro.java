public class Libro {

    private String titulo;
    private String Autor;
    private int numeroEjemplares = 8;
    private int numeroEjemplaresPrestados = 2;

    
    public Libro(String titulo, String autor) {
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

public boolean prestamo (){
    
if (numeroEjemplaresPrestados<numeroEjemplares) {
    numeroEjemplaresPrestados++;
    return true;
} else {
    return false;
}

}    

public boolean devolucion (){
    if (numeroEjemplaresPrestados>0) {
        numeroEjemplaresPrestados--;
        return true;
    
    } else {
        return false;    
    }


}


public void imprimir(){

System.out.println("Libro: "+ titulo);
System.out.println("Autor: " + Autor);
System.out.println("Ejemplares totales: "+ numeroEjemplares);
System.out.println("Ejemplares prestados: " + numeroEjemplaresPrestados);


}

public Libro(){
this("", "");
this.numeroEjemplares=0;    
this.numeroEjemplaresPrestados=0;
}


    



}