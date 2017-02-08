
package Exercises;

import java.util.Scanner;

public class BankAccount {
     private String[] nombre;
    private Integer ncuenta;
    private Double saldo;
    
public BankAccount(String a,Integer b, Double c){
    
    
}   
public void setnombre(String[] j){
    nombre=j;
}    
public String[] getingrediente(){
    return nombre;
}
public void setnumcuenta(Integer l){
    ncuenta=l;
}    
public Integer getpan(){
    return ncuenta;
}
public void setprecio(Double t){
    saldo=t;
}    
public Double getprecio(){
    return saldo;
}
public Double deductMonthlyFee(Double a){
    
    return a-4.00;
}
public void explainAccountPolicy(){
    System.out.println("Por cada mes el saldo de su cuenta se reducira en $4.00");
    
}
 public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("Ingrese su nombre");
     String nombre=teclado.next();
     System.out.println("Ingrese su numero de cuenta");
     int numcuenta=teclado.nextInt();
     System.out.println("Ingrese su saldo ultimo");
     double saldo=teclado.nextDouble();
     
     BankAccount cuenta=new BankAccount(nombre,numcuenta,saldo);
     System.out.println("Su saldo en este momento es: "+cuenta.deductMonthlyFee(saldo) );
     cuenta.explainAccountPolicy();
 }
}
