package clases_examen;
/*

iv. Crear un método imprimirFicha, que imprima los datos del libro en formato 
APA (puede capturar una ficha en Word, e irse al menú Referencias, 
Bibliografía, Bibliografía y ver como se imprimen los datos de un libro). (5 
PUNTOS)

 */


public class FichaBibliografica {
	private String autor;
	private String titulo;
	private int año;
	private String ciudad;
	private String estado;
	private String pais;
	private String editorial;
	private String editor;
	private int volumen;
	private int nvolumenes;
	private String traductor;
	private String tbreve;
	private String ISBN;
	private int paginas;
	private int edicion;

	//Atributos Mi libro Favorito
	public FichaBibliografica() {
		autor = "Diana Wynne Jones";
		titulo = "Howl's Moving Castle";
		año = 1986;
		ciudad = "Londres";
		estado = "inglaterra";
		pais = "Reino Unido";
		editorial = "Ace Books";
		editor = "Diana Wynne Jones";
		volumen = 1;
		nvolumenes = 3;
		traductor = "Jhon Gurney";
		tbreve = "Moving Castle";
		ISBN = "0-441-34664-2";
		paginas = 212;
		edicion = 4;
	}
	//Sets
	public void setAutor(String x) {
		autor = x;
	}
	public void setTitulo(String y) {
		titulo = y;
	}	public void setAño(int z) {
		año = z;
	}	public void setCiudad(String xz) {
		ciudad = xz;
	}	public void setEstado(String xy) {
		estado = xy;
	}	public void setPais(String xx) {
		pais = xx;
	}	public void setEditorial(String x) {
		editorial = x;
	}	public void setEditor(String x) {
		editor = x;
	}	public void setVolumen(int x) {
		volumen = x;
	}	public void setNvolumenes(int x) {
		nvolumenes = 3;
	}	public void setTraductor(String x) {
		autor = x;
	}	public void setTbreve(String x) {
		tbreve = x;
	}public void setISBN(String x) {
		ISBN = x;
	}	public void setPaginas(int x) {
		paginas = x;
	}	public void setEdicion(int x) {
		edicion = x;
	}
	
	//gets
	
	public String getAutor() {
		return autor;
	}	public String getTitulo() {
		return titulo;
	}	public int getAño() {
		return año;
	}	public String getCiudad() {
		return ciudad;
	}	public String getEstado() {
		return estado;
	}	public String getPais() {
		return pais;
	}	public String getEditorial() {
		return editorial;
	}	public String getEditor() {
		return editor;
	}	public int getVolumen() {
		return volumen;
	}	public int getNvolumenes() {
		return nvolumenes;	
	}	public String getTraductor() {
		return traductor;
	}	public String getTbreve() {
		return tbreve;
	}	public String getISBN() {
		return ISBN;
	}	public int getPaginas() {
		return paginas;
	}	public int getEdicion() {
		return edicion;
	}
	
	public FichaBibliografica(String A,String T,int N, String C, String E) {
		autor = A;
		titulo = T;
		año = N;
		ciudad = C;
		editorial = E;
	}
	public void imprimirFicha() {
		System.out.println("" + autor + " (" + año + "), " + titulo + ", " + ciudad + ", " + editorial);
	}
	
	
	public static void main(String[] args) {
		FichaBibliografica Libro1 = new FichaBibliografica("Javier","Escuela=Trabajo",2000,"Chihuahua","MexicoBook");
		Libro1.imprimirFicha();
	}

}
