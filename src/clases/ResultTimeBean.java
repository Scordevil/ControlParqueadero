/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Servidor
 */
public class ResultTimeBean {
    
    private long horas;
    private long Minutos;

    public ResultTimeBean(long horas, long Minutos) {
        this.horas = horas;
        this.Minutos = Minutos;
    }

    public long getHoras() {
        return horas;
    }

    public void setHoras(long horas) {
        this.horas = horas;
    }

    public long getMinutos() {
        return Minutos;
    }

    public void setMinutos(long Minutos) {
        this.Minutos = Minutos;
    }

    @Override
    public String toString() {
        return "ResultTimeBean{" + "horas=" + horas + ", Minutos=" + Minutos + '}';
    }
    
    
}
