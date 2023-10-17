package Clases;

public class Main {

	public static void main(String[] args) {
		/**
		 * creacion y llamada a las clases anteriores
		 */
		
		 Coche car = new Coche("Range Rover", 4, "deportivo");
	        System.out.println("Marca: " + car.getNombre());
	        System.out.println("Numero de puertas: " + car.getPuertas());
	        System.out.println("tipo de Coche: " + car.getTipo());
	        car.descripcion();
	        car.CanticaPuesras();
	        car.TippoDeCoche();
	        //System.out.println("El coche tiene: " + persona.calc);
	        
	        System.out.println();
	        
	        /**
	         * la ecepcion concatenada con el mensaje de la clase Vehiculo
	         */

	        try {
	        	car.lanzarExcepcion();
	        } catch (RuntimeException e) {
	            System.out.println("Excepción capturada: " + e.getMessage());
	        }
	        System.out.println();

	        Vehiculo type = new Vehiculo("Bugati", 2, "Deportivo", 0.9f);
	        System.out.println("Marca: " + type.getNombre());
	        System.out.println("Numero de puertas: " + type.getPuertas());
	        System.out.println("Aceleración: " + type.getVelocida());
	        type.tiempoaceleracion();
	        type.Ddeterminacion();

	}

}
