import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import javax.print.attribute.standard.DateTimeAtCreation;

public class App {

     public static void main(String[] args){ //metodo para testar o programa
        String[] nomes = {"CARLOS","EDUARDO","DA","COSTA","XAVIER"};
        String nomecompleto = concaternarStrings(nomes);
        System.out.println(nomecompleto);

        String data = formatarDatas("01/05/2018");
        System.out.println(data);

        int[] numeros = {334,568,123,796,225};
        int maiorNumero = procurarMaior(numeros);
        System.out.println(maiorNumero);
     }



    public static String formatarDatas(String dataInserida) {
     
        // formatos possíveis
        SimpleDateFormat[] formatos = {
            new SimpleDateFormat("dd/MM/yyyy"),
            new SimpleDateFormat("dd MM yyyy"),
            new SimpleDateFormat("ddMMyyyy"),
            new SimpleDateFormat("yyyy MM dd"),
        };
        Date data = null; 
        for (SimpleDateFormat sdf : formatos) {
            try {
                data = sdf.parse(dataInserida);
                break;
            } catch (ParseException e) {
                System.out.println("String está no formato inválido, tentar o próximo");
            }
        }
        if (data == null) {
            System.out.println("Não foi possível obter a data");
        }
                
        return ""+formatos[3].format(data);
        
    }


    public static String concaternarStrings (String[] listaComNomes) {
        String nomeCompleto = "";

        for(int i = 0; i< listaComNomes.length;i++){
            nomeCompleto = nomeCompleto +" "+ listaComNomes[i];
        }

        return nomeCompleto;
    }


    public static int procurarMaior (int[] numeros) {
        int MaiorNumero = 0;

        for(int i = 0; i< numeros.length;i++){
            if(numeros[i] > MaiorNumero){
                MaiorNumero = numeros[i];
            }
        }

        return MaiorNumero;
    }



}
