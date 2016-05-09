/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Servidor
 */
public class TiempoRegistroBean {

    private static String fechaRegistro;
    private static String tiempoReg;
    private static int horaReg;
    private static int minutoReg;
    
    private static Calendar calendario = new GregorianCalendar();

    public static String getFechaRegistro() {
        Date myDate = new Date();
        fechaRegistro= new SimpleDateFormat("MM-dd-yyyy").format(myDate);
        return fechaRegistro;
    }

    
    public static String getTiempoReg() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tiempoReg = formateador.format(ahora);
        return tiempoReg;
    }

    public static int getHoraReg() {
        horaReg =calendario.get(Calendar.HOUR_OF_DAY);
        return horaReg;
    }

    public static int getMinutoReg() {
        minutoReg = calendario.get(Calendar.MINUTE);
        return minutoReg;
    }

}
