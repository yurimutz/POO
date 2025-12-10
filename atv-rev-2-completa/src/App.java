import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
    
        try{
            Eleitor eleitor1 = new Eleitor(Estado.ES, "001", "Fulano");
            Eleitor eleitor2 = new Eleitor(Estado.ES, "002", "Ciclano");
            Eleitor eleitor3 = new Eleitor(Estado.ES, "003");

            List<Eleitor> eleitorArray = new ArrayList<Eleitor>();
            eleitorArray.add(eleitor1);
            eleitorArray.add(eleitor2);
            eleitorArray.add(eleitor3);

            for(int i=0; i<eleitorArray.size(); i++){
                eleitorArray.get(i).imprimeEleitor();
            }

            Candidato pf = new PessoaFisica(Estado.ES, 5000.00, "11111111111", "João", "Pereira");
            Candidato pj = new PessoaJuridica(Estado.SP, 250000.00, "00000000000014", "Eleita Ltda");

            Set<Candidato> setCandidato = new HashSet<>();
            Iterator<Candidato> iterator = setCandidato.iterator();
            setCandidato.add(pj);
            setCandidato.add(pf);

            Map<String, Voto> mapVotos = new HashMap<>();

            Voto voto1 = new Voto(pf, eleitor1);
            mapVotos.put(eleitor1.getTitulo(), voto1);
            Voto voto2 = new Voto(pf, eleitor2);
            mapVotos.put(eleitor2.getTitulo(), voto2);

            //Como estado diferente, CATCH!
            // Voto voto3 = new Voto(pj, eleitor3);
            // mapVotos.put(eleitor3.getTitulo(), voto3);

            Voto voto3 = new Voto(pf, eleitor3);
            mapVotos.put(eleitor3.getTitulo(), voto3);

            Scanner scan = new Scanner(System.in);
      
            String chave = scan.nextLine();
            Voto c = mapVotos.get(chave);
            try{
                c.imprimeVoto();
            } catch (Exception e){
                System.out.println("Voto nao encontrado");
            }
                
            Voto.imprimeTotalVotos();

        } catch (Exception e){

            System.out.println(e.getMessage());

        }
        
        
        

    }
}
