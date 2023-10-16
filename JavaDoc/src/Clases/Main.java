package Clases;

public class Main {

	public static void main(String[] args) {
		
		 Coche persona = new Coche("Ferarri", 2, "deportivo");
	        System.out.println("Marca: " + persona.getNombre());
	        System.out.println("Numero de puertas: " + persona.getPuertas());
	        System.out.println("tipo: " + persona.getTipo());
	        persona.descripcion();
	        persona.CanticaPuesras();
	        persona.TippoDeCoche();
	        //System.out.println("El coche tiene: " + persona.calc);
	        
	        System.out.println();

	        try {
	            persona.lanzarExcepcion();
	        } catch (RuntimeException e) {
	            System.out.println("Excepción capturada: " + e.getMessage());
	        }
	        System.out.println();

	        Estudiante estudiante = new Estudiante("Bugati", 2, "Deportivo", 0.9f);
	        System.out.println("Nombre: " + estudiante.getNombre());
	        System.out.println("Edad: " + estudiante.getPuertas());
	        System.out.println("Carrera: " + estudiante.getVelocida());
	        estudiante.estudiar();
	        estudiante.tomarExamenes();

	}

}
