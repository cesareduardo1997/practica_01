package Execises;

import java.util.Calendar;

public class YeardEnd {

    private Integer yaer;
    private Integer mes;
    private Integer dia;

    public YeardEnd(Integer yaer, Integer mes, Integer dia) {
        this.yaer = yaer;
        this.mes = mes;
        this.dia = dia;
    }

    public Integer getYaer() {
        return yaer;
    }

    public void setYaer(Integer yaer) {
        this.yaer = yaer;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public static void Diaspasaelsiguienteaño(Integer year, Integer mes, Integer dia) {
        Calendar calendario = Calendar.getInstance();
        Integer x, d = null, falta;
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH);
        year = calendario.get(Calendar.YEAR);

        /*5140441*/
        if ((year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0)) {
            x = 29;
        } else {
            x = 28;
        }

        switch (mes) {
            case 1:
                d = 0;
                break;

            case 2:
                d = 31;
                break;

            case 3:
                d = 31 + x;
                break;

            case 4:
                d = 31 + x + 31;
                break;

            case 5:
                d = 31 + x + 31 + 30;
                break;

            case 6:
                d = 31 + x + 31 + 30 + 31;
                break;

            case 7:
                d = 31 + x + 31 + 30 + 31 + 30;
                break;

            case 8:
                d = 31 + x + 31 + 30 + 31 + 30 + 31;
                break;

            case 9:
                d = 31 + x + 31 + 30 + 31 + 30 + 31 + 31;
                break;

            case 10:
                d = 31 + x + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;

            case 11:
                d = 31 + x + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;

            case 12:
                d = 31 + x + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }
        falta = ((337 + x) - (dia + d));
        System.out.println("La fecha actual es: " + dia + "/" + mes + "/" + year + " y faltan " + falta + " dias para finalizar el año.");
    }

    public static void main(String[] args) {
        Integer mes = 0;
        Integer year = 0;
        Integer dia = 0;
       YeardEnd fecha= new YeardEnd(dia,mes,year);
      Diaspasaelsiguienteaño(dia,mes,year);

    }
}
