/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package claseshithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author
 */
public class ClasesHitHub {

    
    private static int cantidadClientes = 0;
    private static int cantidadCuentasBancarias=0;
    private static int cantidadOperacionBancaria=0;
    private static int cantidadTipoCuenta=0;
    private static int cantidadTipoOperacion=0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Cliente vectorClientes [] = new Cliente[100];
        CuentaBancaria cuentaBancarias[] = new CuentaBancaria[100];
        //menu
        int op;
        do
        {
            System.out.println("Bienvenidos");
            System.out.println("1.- Agregar Nuevo Cliente");
            System.out.println("2.- Agregar Nueva Cuenta Bancaria");
            System.out.println("3.- Realizar Operacion");
            System.out.println("4.- Consultar Cliente");
            System.out.println("5.- Consultar Cuenta Bancaria");
            System.out.println("6.- Listados de Clientes");
            System.out.println("7.- Listado de Tipos de Operaciones");
            System.out.println("8.- Listado de Tipos de Cuentas");
            System.out.println("9.- Salir");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            String texto = br.readLine();
            op = Integer.parseInt(texto);
            
            switch (op)
            {
                case 1: 
                    vectorClientes[cantidadClientes] = new Cliente();
                    System.out.println( "S I S T E M A    B A N C A R I O    INCLUIR CLIENTE" );
                    System.out.print( "Identificación del Cliente: " );
                    InputStreamReader leer = new InputStreamReader(System.in);
                    BufferedReader lectura = new BufferedReader (leer);
                    String linea = lectura.readLine();
                    vectorClientes[cantidadClientes].setIdCliente(Integer.parseInt(linea));
                    System.out.print( "Nombre del Cliente: " );
                    linea = lectura.readLine();
                    vectorClientes[cantidadClientes].setNombreCliente(linea);
                    cantidadClientes++;
                        break;
                case 2: 
                    cuentaBancarias[cantidadCuentasBancarias] = new CuentaBancaria();
                    System.out.println( "S I S T E M A    B A N C A R I O    Agregar Cuenta Bancaria" );
                    System.out.print( "Identificación del Cliente a agregar Cuenta: " );
                    InputStreamReader leer1 = new InputStreamReader(System.in);
                    BufferedReader lectura1 = new BufferedReader (leer1);
                    String linea1 = lectura1.readLine();
                    int idCliente = Integer.parseInt(linea1);
                    //buscamos el cliente a agregar cuenta
                    int posCliente = -1;
                    for(int i =0;i<cantidadClientes;i++)
                    {
                        if(vectorClientes[i].getIdCliente()== idCliente)
                        {
                            posCliente = i;
                        }
                    }
                    if(posCliente!=-1)
                    {
                        cuentaBancarias[cantidadCuentasBancarias].setCliente(vectorClientes[posCliente]);
                        //pedimos la info del tipo de cuenta
                        TipoCuenta tipo = new TipoCuenta();
                        tipo.setIdTipocuenta(cantidadTipoCuenta);
                        cantidadTipoCuenta++;
                        System.out.print( "Descripcion de Tipo de Cuenta: " );
                        linea1 = lectura1.readLine();
                        tipo.setDescripcion(linea1);
                        cuentaBancarias[cantidadCuentasBancarias].setTipoCuenta(tipo);
                        //llenamos la info de la cuenta como tal
                        cuentaBancarias[cantidadCuentasBancarias].setIdCuentaBancaria(cantidadCuentasBancarias);
                        System.out.print( "Numero Cuenta: " );
                        linea1 = lectura1.readLine();
                        cuentaBancarias[cantidadCuentasBancarias].setNumeroCuenta(linea1);
                        cantidadCuentasBancarias++;
                    }
                    else
                    {
                        System.out.print( "Cliente no existe" );
                    }
                        break;
                case 3: System.out.println( "...En Construcción..." );
                        break;
                case 4: System.out.println( "...En Construcción..." );
                        break;
                case 5: System.out.println( "...En Construcción..." );
                        break;
                case 6: System.out.println( "...En Construcción..." );
                        break;
                case 7: System.out.println( "...En Construcción..." );
                        break;
                case 8: System.out.println( "...En Construccion..." );
                        break;
                case 9: System.out.println( "...Fin de Sistema..." );
                        break;
                default:System.out.println( "...Opción Invalida..." );

            }
            
            
        }while(op!=9);
        
    }
}
