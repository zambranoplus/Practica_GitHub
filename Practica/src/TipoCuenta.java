import java.io.*;


public class TipoCuenta {           

	private String descripcion[];       // Descripcion de la cuenta
	private long idTipocuenta[];       // Tipo de Cuenta
        private static int contador=0;      // Contador 
        private String respuesta;

	public void addTipoCuenta() throws IOException {
            
            descripcion = new String[ 100 ];
            idTipocuenta = new long[ 100 ]; 
            do
            {
                InputStreamReader leer_entrada = new InputStreamReader( System.in );
                BufferedReader buff = new BufferedReader( leer_entrada );
                System.out.println( "S I S T E M A    B A N C A R I O    INCLUIR CUENTAS" );
                System.out.print( "Tipo de Cuenta " );
                idTipocuenta[ contador ]= Integer.parseInt( buff.readLine() );
                System.out.print( "Descripcion de la cuenta... " );
                descripcion[ contador ] = buff.readLine();
                contador++;
                System.out.print( "Desea Incluir otro S/N ........ " );
                respuesta = buff.readLine();

           }while ( ( respuesta == null ? "S" == null : respuesta.equals("S") ) || ( respuesta == null ? "s" == null : respuesta.equals("s") ) );
          
        }


                
	}

