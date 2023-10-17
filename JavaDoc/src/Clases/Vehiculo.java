package Clases;

/**
 * aqui creo la otra clase que herreda de la anterior
 * @author alumnat
 *
 */
public class Vehiculo  extends Coche{
	
	 private float aceleracion;
	 
	 /**
	  * en este nuevo constructor he añadido la nueva variable que he creado en esta clase ademas de las dos del objeto principal
	  * @param nombre
	  * @param edad
	  * @param carrera
	  */
	 
	    public Vehiculo(String marca, int numero_puertas,String tipo, float aceleracion) {
	        super(marca, numero_puertas, tipo);
	        this.aceleracion = aceleracion;
	    }
	    /**
	     * los seter y geters
	     * @return
	     */
	    
	    public float getVelocida() {
	        return aceleracion;
	    }
	    
	    public void setVelocida(int aceleracion) {
	        this.aceleracion = aceleracion;
	    }
	    /**
	     * las dos funciones
	     */
	    
	    public void tiempoaceleracion() {
	        System.out.println("El " + marca + " pasa de 0 a 100 en " + aceleracion +" segundos");
	    }
	    
	    public void Ddeterminacion() {
	        System.out.println("El "+ marca + " es mas rapido");
	    }

}

