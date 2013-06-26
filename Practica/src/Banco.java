// Actualización Tecnológica
// Práctica de Clases con GitHub
//
// Adrian
// Alfredo
// Wilson
// Hernán

import java.io.*;

public class Banco {               // Clase principal
    static int opcion;

    public static void main(String[] args) throws IOException
    {
      do
      {
        InputStreamReader leer_entrada = new InputStreamReader( System.in );
        BufferedReader buff = new BufferedReader( leer_entrada );
        System.out.println( "S I S T E M A    B A N C A R I O" );
        System.out.print( "Incluir Cliente... [1]" );
        System.out.print( "      Crear Cuenta...... [2]" );
        System.out.println( "      Abrir Cuenta...... [3]" );
        System.out.print( "Deposito.......... [4]" );
        System.out.print( "      Retiro............ [5]" );
        System.out.println( "      Retiro Cajero..... [6]" );
        System.out.print( "Reportes.......... [7]" );
        System.out.print( "      Salir............. [8]" );
        System.out.print( "      Opción............ " );
        opcion= Integer.parseInt( buff.readLine() );
        switch (opcion)
        {
            case 1: Cliente cliente1 = new Cliente();
                    cliente1.createCliente();
                    break;
            case 2: System.out.println( "...En Construcción..." );
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
            case 8: System.out.println( "...Fin de Sistema..." );
                    break;
            default:System.out.println( "...Opción Invalida..." );

        }
        
      }while ( opcion != 8);

    }

}
