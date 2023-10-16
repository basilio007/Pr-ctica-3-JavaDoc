package Clases;

/**
 * aqui creo la otra clase que herreda de la anterior
 * @author alumnat
 *
 */
public class Estudiante  extends Coche{
	
	 private float aceleracion;
	 
	 /**
	  * en este nuevo constructor he añadido la nueva variable que he creado en esta clase ademas de las dos del objeto principal
	  * @param nombre
	  * @param edad
	  * @param carrera
	  */
	 
	    public Estudiante(String marca, int numero_puertas,String tipo, float aceleracion) {
	        super(marca, numero_puertas, tipo);
	        this.aceleracion = aceleracion;
	    }
	    
	    public float getVelocida() {
	        return aceleracion;
	    }
	    
	    public void setVelocida(int aceleracion) {
	        this.aceleracion = aceleracion;
	    }
	    
	    public void estudiar() {
	        System.out.println("El" + marca + " pasa de 0 a 100 en " + aceleracion);
	    }
	    
	    public void tomarExamenes() {
	        System.out.println("El "+ marca + " es mas rapido que " + marca);
	    }

}

