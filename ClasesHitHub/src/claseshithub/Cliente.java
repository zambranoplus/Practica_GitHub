/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshithub;

/**
 *
 * @author
 */
public class Cliente {
    
    long idCliente;
    String nombreCliente;

    public Cliente() {
        idCliente = -1;
        nombreCliente = "";
    }

    public Cliente(long idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    
    
}
