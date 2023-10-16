package Clases;


/**
 * clase del objeto principal
 * @author alumnat
 *
 */
public class Coche {
	
	  public String marca;
	    public int numero_puertas;
	    public String tipo;
	    
	    /**
	     * aqui he creado el constructor pasandodole las variables creadas
	     * @param nombre
	     * @param edad
	     */
	    public Coche(String marca, int numero_puetas, String tipo) {
	        this.marca = marca;
	        this.numero_puertas = numero_puetas;
	        this.tipo = tipo;
	    }
	    
	    /**
	     * aqui comienzan los seterers y geters
	     * @return
	     */
	    public String getNombre() {
	        return marca;
	    }
	    
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    
	    public int getPuertas() {
	        return numero_puertas;
	    }
	    
	    public void setPuertas(int numero_puetas) {
	        this.numero_puertas = numero_puetas;
	    }
	    /////
	    public String getTipo() {
	        return tipo;
	    }
	    
	    public void setTpo(String tipo) {
	        this.tipo = tipo;
	    }
	    /**
	     * aqui he creado unas tres funciones
	     */
	    
	    public void descripcion() {
	        System.out.println("La marca del coche es " + marca +" tiene " +numero_puertas+ " puertas");
	    }
	    
	    public void CanticaPuesras() {
	        numero_puertas++;
	    }
	    
	    public void TippoDeCoche() {
	    	System.out.println("El cochhe es un" + tipo);
	    }
	        
	    
	    /**
	     * por ultimo he creado una excepción
	     * @throws RuntimeException
	     */
	    public void lanzarExcepcion() throws RuntimeException {
	        throw new RuntimeException("¡Esto es una excepción!");
	    }

}
