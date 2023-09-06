package ar.edu.unlu.tareas;

import java.time.LocalDate;

public class Tarea {

	private String descripcion;
	private int prioridad;
	private String estado;
	private LocalDate fechaLimite;

	public Tarea(String descripcion, int prioridad, String estado, String fechaLimite) {
		super();
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.estado = estado;
		this.fechaLimite = LocalDate.parse(fechaLimite);
	}

	public void mostrar(LocalDate hoy) {
		int valor = fechaLimite.compareTo(hoy);
		if ((valor < 0) && estado == "Incompleta") {
			System.out.println("-->Vencida<-- ");
		}
		System.out.println(descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}
}
