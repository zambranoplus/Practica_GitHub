import java.io.*;

public class Retiro
{
        private long idCliente[];
        private String nombreCliente[];
        private long idCuentaBancaria[];
        private long idTipoOperacion;
        private String claveOperacion;
        private long idOperacion;
        private static int contador=0;
        private String respuesta;
        private long monto;

        public void registrarRetiro() throws IOException
        {
            idCliente = new long[ 100 ];
            idCuentaBancaria = new long[ 100 ];
           do
           {
            InputStreamReader leer_entrada = new InputStreamReader( System.in );
            BufferedReader buff = new BufferedReader( leer_entrada );
            System.out.println( "S I S T E M A    B A N C A R I O    RETIRO" );
            System.out.print( "Identificación Cliente... " );
            idCliente[ contador ]= Integer.parseInt( buff.readLine() );
            System.out.print( "Identificación Cuenta.... " );
            idCuentaBancaria[ contador ] = Integer.parseInt( buff.readLine() );
            System.out.print( "Monto del Retiro......... " );
            monto = Integer.parseInt( buff.readLine() );
            contador++;
            System.out.print( "Desea Registrar Otro Retiro S/N ........ " );
            respuesta = buff.readLine();

           }while ( ( respuesta == null ? "S" == null : respuesta.equals("S") ) || ( respuesta == null ? "s" == null : respuesta.equals("s") ) );

        }


}
