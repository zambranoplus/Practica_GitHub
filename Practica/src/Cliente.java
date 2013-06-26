import java.io.*;

public class Cliente        // Clase agregar cliente
{
        private long idCliente[];
        private String nombreCliente[];
        private static int contador=0;
        private String respuesta;

        public void createCliente() throws IOException
        {
            idCliente = new long[ 100 ];
            nombreCliente = new String[ 100 ];
           do
           {
            InputStreamReader leer_entrada = new InputStreamReader( System.in );
            BufferedReader buff = new BufferedReader( leer_entrada );
            System.out.println( "S I S T E M A    B A N C A R I O    INCLUIR CLIENTE" );
            System.out.print( "Identificación... " );
            idCliente[ contador ]= Integer.parseInt( buff.readLine() );
            System.out.print( "Nombre........... " );
            nombreCliente[ contador ] = buff.readLine();
            contador++;
            System.out.print( "Desea Incluir otro S/N ........ " );
            respuesta = buff.readLine();

           }while ( ( respuesta == null ? "S" == null : respuesta.equals("S") ) || ( respuesta == null ? "s" == null : respuesta.equals("s") ) );
          
        }


}
