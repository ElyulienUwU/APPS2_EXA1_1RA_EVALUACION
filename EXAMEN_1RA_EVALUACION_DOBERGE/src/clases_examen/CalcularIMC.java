package clases_examen;

public class CalcularIMC {

    private double imc;
    private void imc(){
        TestCovid XL = new TestCovid();
        XL.getAltura();
        XL.getPeso();
        double imc = ( 300 / (1.71 * 1.71));
                        System.out.println(imc);
}
    public double getImc(){
        return imc;}
    public void main(String[] args){
        System.out.println(imc);
}
    }