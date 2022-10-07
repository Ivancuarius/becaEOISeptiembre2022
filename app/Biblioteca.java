package es.bibliotecaivan.app;

public class Biblioteca {

	public static Documentacion[] documentaciones = new Documentacion[100];
	public static void main(String[] args) {
		initData();
		Menu.printMenuPrincipal();
		
		
		
		
		
	}
	
	public static void initData() {
		int posicion=0;
		
		Libro libro1 = new Libro();

		libro1.setCodigo(posicion+1);
		libro1.setTitulo("Libro1");
		libro1.setAnyo(2012);
		documentaciones[posicion++] = libro1;
		
		Libro libro2 = new Libro();
		
		libro2.setCodigo(posicion+1);
		libro2.setTitulo("Libro2");
		libro2.setAnyo(2020);
		documentaciones[posicion++] = libro2;

		Revista revista1 = new Revista();
		
		revista1.setCodigo(posicion+1);
		revista1.setTitulo("Revista1");
		revista1.setAnyo(2018);
		revista1.setNumero(1);
		documentaciones[posicion++] = revista1;
		
		Revista revista2 = new Revista();
		
		revista2.setCodigo(posicion+1);
		revista2.setTitulo("Revista2");
		revista2.setAnyo(2021);
		revista2.setNumero(2);
		documentaciones[posicion++] = revista2;
		
		
		for(int i = 0; i<documentaciones.length;i++) {
			if(documentaciones[i] instanceof Libro) {
				Libro libro = (Libro)documentaciones[i];
				System.out.print("Libro - Codigo: "+libro.codigo 
						+" Titulo: "+libro.titulo
						+" Año: "+libro.anyo);
				
				if(libro.isPrestado()) {
					System.out.println(" Esta Prestado");
				}else {
					System.out.println(" No esta prestado");
				}
				
			}else if(documentaciones[i] instanceof Revista){
				Revista revista=(Revista)documentaciones[i];
				System.out.println("Revista - Codigo: "+revista.codigo 
						+" Titulo: "+revista.titulo
						+" Año: "+revista.anyo
						+" Numero: "+revista.numero);
			}
		}
	}
	
	public static void Mostrar(String accion) {
		
		switch(accion) {
		
		}
		
	}
	
	

}
