/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshithub;

/**
 *
 * @author
 */
public class TipoCuenta {
    
    String descripcion;
    long idTipocuenta;

    public TipoCuenta() {
        descripcion = "";
        idTipocuenta = -1;
    }

    public TipoCuenta(String descripcion, long idTipocuenta) {
        this.descripcion = descripcion;
        this.idTipocuenta = idTipocuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public long getIdTipocuenta() {
        return idTipocuenta;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdTipocuenta(long idTipocuenta) {
        this.idTipocuenta = idTipocuenta;
    }
    
    
    
    
    
}
