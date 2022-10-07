package es.bibliotecaivan.app;

public class Libro extends Documentacion{
	
	protected boolean prestado = false;

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
	

}
