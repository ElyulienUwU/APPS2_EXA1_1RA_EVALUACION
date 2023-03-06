package clases_examen;


public class TestCovid {
    private int edad;
    private boolean tiene_enfermedad;
    private double peso;
    private double altura;
    
     public TestCovid(){
            edad = 0;
            tiene_enfermedad = false;
            peso = 0.0;
            altura = 0.0;
     }
     
     public TestCovid (int a, boolean b, double c, double d, double e, String f){
         edad = a;
         tiene_enfermedad = b;
         peso = c;
         altura = d;
     }
     
            public int getEdad() {
		return edad;}
	public boolean getTiene_enfermedad() {
		return tiene_enfermedad;}
	public double getPeso() {
		return peso;}
            public double getAltura(){
                    return altura;}
            
            public void setEdad(int j) {
		edad = j;
                    System.out.println("edad:" + edad);}
	public void setTiene_enfermedad(boolean k) {
		tiene_enfermedad = k;
                    System.out.println("tiene_enfermedad:" + tiene_enfermedad);}
	public void setPeso(double l) {
		peso = l;
                    System.out.println("peso:" + peso);}
            public void setAltura(double m){
                    altura = m;
                    System.out.println("altura:" + altura);}
            
            public void CalcularPersonaRiesgo(){
                
                double imc = peso / (altura * altura);
                if ((edad >= 65) || (tiene_enfermedad == true) || imc >= 30)
                    System.out.println("Persona en riesgo");
                else{
                    System.out.println("Persona sin riesgo");
               }
                     }

            
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    // TODO code application logic here
     TestCovid paciente = new TestCovid();
     paciente.setEdad(18);
     paciente.setTiene_enfermedad(false);
     paciente.setPeso(80);
     paciente.setAltura(1.71);
     paciente.CalcularPersonaRiesgo();


}
}