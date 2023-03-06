package clases_examen;

public class contraseña {
	private String usuario;
	private String password;
	
	public contraseña() {
		usuario = "Anonimo";
		password = "PwordD";
	}
	
	public contraseña(String U, String P) {
		usuario = U;
		password = P;
	}
	
	//sets 
	public void setUsuario(String x) {
		usuario = x;
	}
	public void setPassword(String y) {
		password = y;
	}
	//si introduces la misma contraseña podras acceder a tu usuario
	public void verificarAcceso(String x, String y) {
		String user = x;
		String acceso = y;
		if (user == usuario && acceso == password) {
		boolean pase = true;
		System.out.println("Acceso " + pase);
		}else {
			boolean pase = false;
		System.out.println("Acceso " + pase);
		}
	}
	

	public static void main(String[] args) {
		
		contraseña Usuario2 = new contraseña("Elihu","1212");
		Usuario2.verificarAcceso("Elihu","1212");
		
		contraseña Usuario1 = new contraseña();
		//Permite poner el nombre de usuario y la contraseña
		Usuario1.setUsuario("Julian Ortiz");
		Usuario1.setPassword("J0305");
		
		//Para acceder se debe colocar el mismo usuario y la contraseña del mismo
		Usuario1.verificarAcceso("Julian Ortiz","J030");
		Usuario1.verificarAcceso("Julian Ortiz", "J0305");
		Usuario1.verificarAcceso("Julian Orti", "J0305");
	}

}



