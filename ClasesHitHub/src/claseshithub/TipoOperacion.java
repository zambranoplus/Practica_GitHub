/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshithub;

/**
 *
 * @author
 */
public class TipoOperacion {
    
    String descripcion;
    long idTipooperacion;

    public TipoOperacion() {
        descripcion = "";
        idTipooperacion = -1;
    }

    public TipoOperacion(String descripcion, long idTipooperacion) {
        this.descripcion = descripcion;
        this.idTipooperacion = idTipooperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public long getIdTipooperacion() {
        return idTipooperacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdTipooperacion(long idTipooperacion) {
        this.idTipooperacion = idTipooperacion;
    }
    
    
    
}
