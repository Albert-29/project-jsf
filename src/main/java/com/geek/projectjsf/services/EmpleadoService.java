/**
 * 
 */
package com.geek.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.geek.projectjsf.entity.Empleado;

/**
 * @author Alberto
 * Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		/**
		 * Metodo que permite consultar la lista de empleados de empresas de TI
		 * @return {@link Empleado} lista de empleados.
		 */
		
		
		//Generar la lista de empleados a consultar.
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setStatus(true);
		
		empleadoMicrosoft.setNombre("Alberto");
		empleadoMicrosoft.setPrimerApellido("Miranda");
		empleadoMicrosoft.setSegundoApellido("Pacheco");
		empleadoMicrosoft.setPuesto("Junior Developer Java");
		empleadoMicrosoft.setStatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Rodriguez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setStatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
}
