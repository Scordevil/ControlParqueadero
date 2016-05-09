/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.utils;

import clases.ResultTimeBean;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Servidor
 */
public class Utils {

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean isDouble(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static ResultTimeBean DiferenciaFechas(String vinicio, String vfinal) {

        Date dinicio = null, dfinal = null;
        long milis1, milis2, diff;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            // PARSEO STRING A DATE
            dinicio = sdf.parse(vinicio);
            dfinal = sdf.parse(vfinal);

        } catch (ParseException e) {

            System.out.println("Se ha producido un error en el parseo");
        }

        //INSTANCIA DEL CALENDARIO GREGORIANO
        Calendar cinicio = Calendar.getInstance();
        Calendar cfinal = Calendar.getInstance();

        //ESTABLECEMOS LA FECHA DEL CALENDARIO CON EL DATE GENERADO ANTERIORMENTE
        cinicio.setTime(dinicio);
        cfinal.setTime(dfinal);

        milis1 = cinicio.getTimeInMillis();

        milis2 = cfinal.getTimeInMillis();

        diff = milis2 - milis1;

         // calcular la diferencia en segundos
        long diffSegundos = Math.abs(diff / 1000);

     // calcular la diferencia en minutos
        long diffMinutos = Math.abs(diff / (60 * 1000));

        long restominutos = diffMinutos % 60;

     // calcular la diferencia en horas
        long diffHoras = (diff / (60 * 60 * 1000));

     // calcular la diferencia en dias
        long diffdias = Math.abs(diff / (24 * 60 * 60 * 1000));

        /*
         System.out.println("En segundos: " + diffSegundos + " segundos.");
 
         System.out.println("En minutos: " + diffMinutos + " minutos.");
 
         System.out.println("En horas: " + diffHoras + " horas.");
 
         System.out.println("En dias: " + diffdias + " dias.");
         */
        
        String devolver = String.valueOf(diffHoras + "H " + restominutos + "m ");
        ResultTimeBean obje=new ResultTimeBean(diffHoras, restominutos);
        
        return obje;
    }

    public static void main(String[] args) {
        System.out.println(DiferenciaFechas("2016-03-21 12:30:00","2016-03-22 18:56:00"));
        String value="2016-03-22 20:50:20";
        String value2="2016-03-22 20:50:20";
        
        System.out.println(""+value.length());
        System.out.println(""+value.substring(11, 19));
    }
}
