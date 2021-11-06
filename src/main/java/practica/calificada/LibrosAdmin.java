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
        autores.add(libro1.Titulo());
        autores.add(libro2.Titulo());
        autores.add(libro3.Titulo());
        autores.add(libro4.Titulo());
        autores.add(libro5.Titulo());
        autores.add(libro6.Titulo());
        autores.add(libro7.Titulo());
        autores.add(libro8.Titulo());
        autores.add(libro9.Titulo());
        autores.add(libro10.Titulo());
        ediciones = new ArrayList();
        ediciones.add(libro1.Titulo());
        ediciones.add(libro2.Titulo());
        ediciones.add(libro3.Titulo());
        ediciones.add(libro4.Titulo());
        ediciones.add(libro5.Titulo());
        ediciones.add(libro6.Titulo());
        ediciones.add(libro7.Titulo());
        ediciones.add(libro8.Titulo());
        ediciones.add(libro9.Titulo());
        ediciones.add(libro10.Titulo());
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
        if (titulo.equals(libro1.Titulo()) && autor.equals(libro1.Autor())){
            response = response + libro1.Edicion()+"; ";
        }
        if (titulo.equals(libro2.Titulo()) && autor.equals(libro2.Autor())){
            response = response + libro2.Edicion()+"; ";
        }
        if (titulo.equals(libro3.Titulo()) && autor.equals(libro3.Autor())){
            response = response + libro3.Edicion()+"; ";
        }
        if (titulo.equals(libro4.Titulo()) && autor.equals(libro4.Autor())){
            response = response + libro4.Edicion()+"; ";
        }
        return  response;
    }
    public String buscarLibro(String referencia){
        String response = "";
        if (referencia.equals(libro1.Titulo())){
            response = response + libro1.Autor() +" " + libro1.Edicion()+"; ";
        }
        if (referencia.equals(libro2.Titulo())){
            response = response + libro2.Autor() +" " + libro4.Edicion()+"; ";
        }
        if (referencia.equals(libro3.Titulo())){
            response = response + libro3.Autor() +" " + libro4.Edicion()+"; ";
        }
        if (referencia.equals(libro4.Titulo())){
            response = response + libro4.Autor() +" " + libro4.Edicion()+"; ";
        }
        if (referencia.equals(libro1.Autor())){
            response = response + libro1.Titulo() +" " + libro1.Edicion()+"; ";
        }
        if (referencia.equals(libro2.Autor())){
            response = response + libro2.Titulo() +" " + libro2.Edicion()+"; ";
        }
        if (referencia.equals(libro3.Autor())){
            response = response + libro3.Titulo() +" " + libro3.Edicion()+"; ";
        }
        if (referencia.equals(libro4.Autor())){
            response = response + libro4.Titulo() +" " + libro4.Edicion()+"; ";
        }
        return  response;
    }

}
