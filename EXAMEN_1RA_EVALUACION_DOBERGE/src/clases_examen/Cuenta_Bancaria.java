package clases_examen;

	public class Cuenta_Bancaria {
	      private String cliente;
	      private int Ncuenta;
	      private double saldo;
	      
	      public Cuenta_Bancaria(){
	          cliente = "";
	          Ncuenta = 0;
	          saldo = 0;
	      }
	      public String getcliente(){
	          return cliente;
	      }
	      public void setcliente(String valor){
	          cliente = valor;
	      }
	      public int getNcuenta(){
	          return Ncuenta;
	      }
	      public void setNcuenta(int valor){
	          Ncuenta = valor;
	      }
	      public double getsaldo(){
	          return saldo;
	      }
	      public void setsaldo(double valor){
	          saldo = valor;
	      }

	      public void imprimirdatos(){
	          System.out.println("nombre del cliente:  "+cliente);
	          System.out.println("numero de cuenta:  "+Ncuenta);
	          System.out.println("tienes un saldo de:  "+saldo);
	          
	          
	      }
	      
	      public void depositarEnCuenta(double cantidad){
	          saldo += cantidad;
	          System.out.println("ahora tienes :" +saldo);
	      }
	      public void retirarDeCuenta(double cantidad){
	        saldo -= cantidad;

	          if (saldo<=0.00){
	              System.out.println("no tienes saldo");
	            
	          }else{
	            System.out.println("ahora tienes: "+saldo);
	          }
	      }
	      public static void main(String args) {
	    	        Cuenta_Bancaria Ban1 = new  Cuenta_Bancaria();
	    	            Ban1.setcliente("Mario");
	    	            Ban1.setNcuenta(1235);
	    	            Ban1.setsaldo(500.00);
	    	            Ban1.imprimirdatos();
	    	            Ban1.depositarEnCuenta(400.50);
	    	            Ban1.retirarDeCuenta(500.50);
	    	    }
	      }
