package practica.calificada;


import java.util.ArrayList;
import java.util.List;

public class LibrosAdmin {
    private Libros.Libro1 libro1;
    private Libros.Libro2 libro2;
    private Libros.Libro3 libro3;
    private Libros.Libro4 libro4;
    private Libros.Libro5 libro5;
    private Libros.Libro6 libro6;
    private Libros.Libro7 libro7;
    private Libros.Libro8 libro8;
    private Libros.Libro9 libro9;
    private Libros.Libro10 libro10;
    private List<String>  titulos;
    private List<String>  autores;
    private List<String>  ediciones;

    public  LibrosAdmin(){
        libro1 = new Libros.Libro1();
        libro2 = new Libros.Libro2();
        libro3 = new Libros.Libro3();
        libro4 = new Libros.Libro4();
        libro5 = new Libros.Libro5();
        libro6 = new Libros.Libro6();
        libro7 = new Libros.Libro7();
        libro8 = new Libros.Libro8();
        libro9 = new Libros.Libro9();
        libro10 = new Libros.Libro10();
        titulos = new ArrayList();
        titulos.add(libro1.Titulo());
        titulos.add(libro2.Titulo());
        titulos.add(libro3.Titulo());
        titulos.add(libro4.Titulo());
        titulos.add(libro5.Titulo());
        titulos.add(libro6.Titulo());
        titulos.add(libro7.Titulo());
        titulos.add(libro8.Titulo());
        titulos.add(libro9.Titulo());
        titulos.add(libro10.Titulo());
        autores = new ArrayList();
        autores.add(libro1.Autor());
        autores.add(libro2.Autor());
        autores.add(libro3.Autor());
        autores.add(libro4.Autor());
        autores.add(libro5.Autor());
        autores.add(libro6.Autor());
        autores.add(libro7.Autor());
        autores.add(libro8.Autor());
        autores.add(libro9.Autor());
        autores.add(libro10.Autor());
        ediciones = new ArrayList();
        ediciones.add(libro1.Edicion());
        ediciones.add(libro2.Edicion());
        ediciones.add(libro3.Edicion());
        ediciones.add(libro4.Edicion());
        ediciones.add(libro5.Edicion());
        ediciones.add(libro6.Edicion());
        ediciones.add(libro7.Edicion());
        ediciones.add(libro8.Edicion());
        ediciones.add(libro9.Edicion());
        ediciones.add(libro10.Edicion());
    }
    public Integer contarLibros(String titulo,String autor){
        Integer cont = 0;
        for (int i=0; i<titulos.size();i++){
            if(titulo.equals(titulos.get(i)) && autor.equals(autores.get(i))){
                cont = cont+1;
            }
        }
        return cont;
    }
    public Integer contarLibros(String referencia){
        Integer cont = 0;
        for (int i=0; i<titulos.size();i++){
            if(referencia.equals(titulos.get(i))){
                cont = cont+1;
            }
        }
        for (int i=0; i<titulos.size();i++){
            if(referencia.equals(autores.get(i))){
                cont = cont+1;
            }
        }
        return  cont;
    }
    public String buscarLibro(String titulo,String autor){
        String response = "";
        for (int i=0; i<titulos.size();i++){
            if(titulo.equals(titulos.get(i)) && autor.equals(autores.get(i))){
                response = response + ediciones.get(i)+"; ";
            }
        }
        return  response;
    }
    public String buscarLibro(String referencia){
        String response = "";
        for (int i=0; i<titulos.size();i++){
            if(referencia.equals(titulos.get(i))){
                response = response + autores.get(i) +" " + ediciones.get(i)+"; ";
            }
        }
        for (int i=0; i<titulos.size();i++){
            if(referencia.equals(autores.get(i))){
                response = response + titulos.get(i) +" " + ediciones.get(i)+"; ";
            }
        }
        return  response;
    }

}
