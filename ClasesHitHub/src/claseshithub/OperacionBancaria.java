/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshithub;

import java.util.Date;

/**
 *
 * @author
 */
public class OperacionBancaria {
    
    String claveOperacion;
    Date fechaOperacion;
    long idOperacion;
    
    TipoOperacion tipoOperacion;
    CuentaBancaria cuentaBancaria;

    public OperacionBancaria() {
        tipoOperacion = new TipoOperacion();
        cuentaBancaria = new CuentaBancaria();
    }

    public String getClaveOperacion() {
        return claveOperacion;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public long getIdOperacion() {
        return idOperacion;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setClaveOperacion(String claveOperacion) {
        this.claveOperacion = claveOperacion;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public void setIdOperacion(long idOperacion) {
        this.idOperacion = idOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    
    
    
    
}
