import java.util.HashMap;
import java.util.Map;

public class Time{
    private String tipo_time;
    //private List<Jogador> jogadores;
    private Map<String, Jogador> jogadores;

    public String getTipo_time() {
        return tipo_time;
    }
    public void setTipo_time(String tipo_time) {
        this.tipo_time = tipo_time;
    }
    public Map<String, Jogador> getJogadores() {
        return jogadores;
    }
    public void setJogadores(Jogador jogador) throws Exception{
        if(this.getJogadores().size() < 12){
            getJogadores().put(jogador.getCpf(), jogador);
        } else {
            throw new Exception("Numero maximo de jogadores atingido");
        }
        
    }

    public Time(String tipo_time){
        this.setTipo_time(tipo_time);
        //this.jogadores = new ArrayList<Jogador>();
        this.jogadores = new HashMap<>();
    }
    
    public int verificaJogador(Time time, Jogador jogador){
        Jogador aux = time.getJogadores().get(jogador.getCpf());
        if(aux != null){
            return 1;
        } else {
            return 0;
        }
    }

}