import java.util.ArrayList;
import java.util.List; 

public class Jogo{
    private String data_hora;
    private String endereco;
    private Time mandante;
    private Time visitante;
    private List<Ponto> pontos;

    public String getData_hora() {
        return data_hora;
    }
    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Time getMandante() {
        return mandante;
    }  
    public void setMandante(Time mandante) {
        this.mandante = mandante;
    }   
    public Time getVisitante() {
        return visitante;
    }
    public void setVisitante(Time visitante) {
        this.visitante = visitante;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(Ponto ponto) throws Exception{
        if((getMandante().verificaJogador(this.getMandante(), ponto.getJogador()) == 0) && (getVisitante().verificaJogador(this.getVisitante(), ponto.getJogador()) == 0)){
            throw new Exception("Jogador nao existe nos times. Ponto invalido");
        } else {
            this.pontos.add(ponto);
            Ponto.atualiza_total_pontos();
        }
    }
    
    public void setTimes(Time visitante, Time mandante) throws Exception{
        if(visitante.getTipo_time().equals(mandante.getTipo_time())){
            throw new Exception("Times de mesmo tipo");
        } else if((visitante.getJogadores().size() != 3) || (mandante.getJogadores().size() != 3)){
            throw new Exception("Algum time nao possui exatamente 3 jogadores");
        } else {
            this.setVisitante(visitante);
            this.setMandante(mandante);
            
        }
    }
    public Jogo(String data_hora, String endereco, Time visitante, Time mandante) throws Exception{
        this.setData_hora(data_hora);
        this.setEndereco(endereco);
        this.setTimes(visitante, mandante);
        this.pontos = new ArrayList<Ponto>();
    }
    
}