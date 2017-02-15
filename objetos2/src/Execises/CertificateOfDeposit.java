package Execises;

import java.util.Calendar;

public class CertificateOfDeposit {

    private Integer Ncertificado;
    private String apellido;
    private Integer saldo;
    private Integer yaer;
    private Integer mes;
    private Integer dia;

    public CertificateOfDeposit(Integer Ncertificado, String apellido, Integer saldo) {
        this.Ncertificado = Ncertificado;
        this.apellido = apellido;
        this.saldo = saldo;
    }

    public Integer getNcertificado() {
        return Ncertificado;
    }

    public void setNcertificado(Integer Ncertificado) {
        this.Ncertificado = Ncertificado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
      public static void FechaEmision(Integer year, Integer mes, Integer dia) {
        Calendar calendario = Calendar.getInstance();
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        year = calendario.get(Calendar.YEAR);
        System.out.println("La fecha de emision es ; " + dia + "/" + mes + "/" + year );
      }
      
      public static void FechaVencimiento(Integer year, Integer mes, Integer dia) {
        Calendar calendario = Calendar.getInstance();
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        year = calendario.get(Calendar.YEAR)+1;
        System.out.println("La fecha de vencimineto es ; " + dia + "/" + mes + "/" + year );
      }
}
