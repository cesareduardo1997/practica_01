package Exercises;

import java.util.Scanner;

public class BankAccount {

    private String nombre;
    private Integer ncuenta;
    private Double saldo;

    public BankAccount(String nombre, Integer ncuenta, Double saldo) {
        this.nombre = nombre;
        this.ncuenta = ncuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(Integer ncuenta) {
        this.ncuenta = ncuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double deductMonthlyFee(Double saldo) {
        return saldo - 4.00;
    }

    public static void explainAccountPolicy() {
        System.out.println("Por cada mes el saldo de su cuenta se reducira en $4.00");
    }

}
