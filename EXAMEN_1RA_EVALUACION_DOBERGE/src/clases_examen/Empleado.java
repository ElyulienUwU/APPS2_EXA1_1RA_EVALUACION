package clases_examen;

public class Empleado {
    private String nombre;
    private int edad;
    private String direcion;
    private int añodeingreso;
    private int añot;//años trabajados
    private int salario;

  
  public Empleado(){
    nombre="****";
    edad=0;
    direcion="*****";
    añodeingreso=0;
        añot=0;
       salario=0;
    
    
}
      public String getnombre(){
        
        return nombre;
    }
    public String setnombre(String valor){
        nombre=valor;
        return valor;
    }
      public int getedad(){
        return edad;
    }
    public int setedad(int valor){
        edad=valor;
        return valor;
    }
       public String getdirecion(){
        return direcion;
    }
    public String setdireccion(String valor){
        direcion=valor;
        return valor;
    }
        public int getañodeingreso(){
        return añodeingreso;
    }
    public int setañodeingreso(int valor){
        añodeingreso=valor;
        return añodeingreso;
    }
   public int getsalario(){
        return salario;
    }
    public int setsalario(int valor){
        salario=valor;
        return valor;
    }
     public int getañot(){
        return  añot;
    }
           public void setañot(int valor){//SET
        añot = valor;
}
         public void imprimirdatos(){
             
        System.out.println("empleado:    "+nombre );
        System.out.println("edad:     " + edad);
        System.out.println("direccion"+direcion);
        System.out.println("añodeingreso    " + añodeingreso );
        System.out.println("salario:    " + salario);
        System.out.println("años trabajando :    " + añot );
}
              public void Empleado(){
           if (añot<=1){
               System.out.println("tiene 6 dias de vacaciones");
            }else {
               if ((añot>=2)&&(añot<=3)){
                    System.out.println("se le otorgaron 8 dias de vacaciones");
                }else{
                        if((añot>=4)&&(añot<5)){
                                System.out.println("se le otorga 10 dias de vacaciones");
                        }else{
                                if ((añot>=5)&&(añot<=6)){
                                    System.out.println("se le otoran 14 dias de vacaciones");
                                }else{
                                    if ((añot>=7)&&(añot<8)){
                                        System.out.println("se le otrogan 16 dias de vacaciones");
                                    }else{
                                        if ((añot>=9)&&(añot<=9))
                                            System.out.println("se le otorgan 18 dias de vacaciones");
                                    }
                                        if ((añot>=10)&&(añot==15))
                                            System.out.println("se le otorgan 22 dias de vacaciones si tiene10 años si tiene 15 son 34 dias");
                                        
                                    }
                                if ((añot>=11)&&(añot<12))
                             
                                    System.out.println("se le otorgan 24 dias");
                                }
                                   
                                if ((añot>=12)&&(añot<13))
                             
                                    System.out.println("se le otorgan 26 dias");
                                }
                                if ((añot>=13)&&(añot<14))
                             
                                    System.out.println("se le otorgan 28 dias");
                                }
                                if ((añot>=14)&&(añot<=15))
                             
                                    System.out.println("se le otorgan 30 dias");
                                }
                                   
              public static void main(String[] args) {
                  // TODO code application logic here
                Empleado EMP1=new Empleado();
                  System.out.println("datos del empleado");
                  EMP1.setnombre("Jesus alberto");
                   EMP1.setedad(18);
                  EMP1.setdireccion("fco.i.madero");
                  EMP1.setañodeingreso(2020);
                  EMP1.setañot(3);
                   EMP1.setsalario(2000);
                  EMP1.imprimirdatos();
                EMP1.Empleado();       
                                }
}
       