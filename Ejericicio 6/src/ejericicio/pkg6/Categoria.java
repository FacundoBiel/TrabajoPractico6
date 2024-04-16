package ejericicio.pkg6;

public class Categoria {
    private int codigo;
    private String nombre;
  
    public Categoria() {
    }

    public Categoria(int codigo, String nombre,String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
       
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
    
        return nombre;
    }
 
}

