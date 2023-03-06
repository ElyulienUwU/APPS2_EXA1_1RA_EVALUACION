package clases_examen;

public class pelicula {
	private String peli;
	private String estudio;
	private char edad;

	public pelicula() {
		peli = "ratatouille";
		estudio = "Pixar";
		edad = 'A';
	}
	//sets
	public void setPeli(String x) {
		peli = x;}
	
	public void setEstudio(String z) {
		estudio = z;}
	//A = todo publio
	//B = 12 años en adelante
	//C = 18 años en adelante
	//D = adultos mayores de 21 años
	public void setEdad(char y) {
		edad = y;}
	
	//gets
	public String getPeli() {
		return peli;}
	
	public String getEstudio() {
		return estudio;}
	
	public int getEdad() {
		return edad;}
	//imprime los datos de la peli colocados en main con sets
	public void imprimirdatos() {
		System.out.println("La pelicula es " + peli);
		System.out.println("Su estudio es " + estudio);
		System.out.println("La edad recomendada es " + edad);
	}
	//Clasificacion que se uso para el programa
	//A = todo publico
	//B = 12 años en adelante
	//C = 18 años en adelante
	//D = adultos mayores de 21 años
	
	//Dependiendo de la clasificacion de la pelicula A,B,C,D y la edad del cliente
	//o de quien desea ver la peli, tendra acceso a la pelicula o no
	public void evaluarEdad(int x) {
		int acceso = x;
		if (edad == 'A') {
			 System.out.println("Puedes ver la pelicula");
		 }else if (edad == 'B' && acceso > 11) {
			 System.out.println("Puedes ver la pelicula");
		 }else if (edad == 'C' && acceso > 17) {
			 System.out.println("Puedes ver la pelicula");
		 }else if (edad == 'D' && acceso > 20) {
			 System.out.println("Puedes ver la pelicula");
		 }else {
			 System.out.println("No puedes ver la pelicula");
		 }
			 
			 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pelicula p1 = new pelicula();
		p1.setPeli("Monster inc");
		p1.setEstudio("Pixar");
		//A = todo publico
		//B = 12 años en adelante
		//C = 18 años en adelante
		//D = adultos mayores de 21 años
		p1.setEdad('A');
		
		p1.getPeli();
		p1.getEstudio();
		p1.getEdad();
		
		p1.imprimirdatos();
		//colocar edad para ver si tienes permitido ver la pelicula
		p1.evaluarEdad(18);
	}

}
