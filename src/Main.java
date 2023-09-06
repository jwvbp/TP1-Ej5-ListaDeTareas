import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unlu.tareas.Tarea;

public class Main {
	public static LocalDate fechaHoy = LocalDate.parse("2023-08-30");

	public static void main(String[] args) {

		/*
		 * public static LocalDate hoy = new LocalDate.now();
		 * 
		 * LocalDate.now() no funciona por eso invente la fecha 2023-08-30
		 *                 como si fuera HOY 
		 */
		ArrayList<Tarea> misTareas = new ArrayList<>();

		Tarea a = new Tarea("Ir al supermercado mañana", 1, "Incompleta", "2023-09-20");
		misTareas.add(a);

		Tarea b = new Tarea("Consultar repuesto del auto", 1, "Completa", "2023-08-20");
		misTareas.add(b);

		Tarea c = new Tarea("Ir al cine a ver la nueva pelicula de Marvel", 1, "Incompleta", "2023-08-20");
		misTareas.add(c);

		int i = 0;
		while (i < misTareas.size()) {

			misTareas.get(i).mostrar(fechaHoy);
			i++;
		}

	}
}
