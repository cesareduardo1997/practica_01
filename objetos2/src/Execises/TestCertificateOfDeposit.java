package Execises;

import java.util.Scanner;

public class TestCertificateOfDeposit {

    public static void main(String[] args) {
        Integer dia = 0;
        Integer mes = 0;
        Integer year = 0;
        Integer dia1 = 0;
        Integer mes1 = 0;
        Integer year1 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA EL NUMERO DE TU CERTIFICADO");
        Integer certificado = teclado.nextInt();
        System.out.println("INGRESA TU APELLIDO");
        String apellido = teclado.next();
        System.out.println("INGRESA  TU SALDO DE CUENTA");
        Integer saldo = teclado.nextInt();
        CertificateOfDeposit alumno1 = new CertificateOfDeposit(certificado, apellido, saldo);
        alumno1.setNcertificado(certificado);
        alumno1.setApellido(apellido);
        alumno1.setSaldo(saldo);

        System.out.println("CERTIFICADO:" + alumno1.getNcertificado());
        System.out.println("APELLIDO: " + alumno1.getApellido());
        System.out.println("SALDO: " + alumno1.getSaldo());
        alumno1.FechaEmision(dia, mes, year);
        alumno1.FechaVencimiento(dia, mes, year);

        System.out.println("INGRESA EL NUMERO DE TU CERTIFICADO");
        Integer certificado1 = teclado.nextInt();
        System.out.println("INGRESA TU APELLIDO");
        String apellido1 = teclado.next();
        System.out.println("INGRESA  TU SALDO DE CUENTA");
        Integer saldo1 = teclado.nextInt();
        CertificateOfDeposit alumno2 = new CertificateOfDeposit(certificado1, apellido1, saldo1);
        alumno2.FechaEmision(dia1, mes1, year1);
        alumno2.FechaVencimiento(dia1, mes1, year1);
    }
}
