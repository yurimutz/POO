import java.time.LocalDateTime;

public class Voto{
    public static int qtd_votos;
    private LocalDateTime data;
    private Candidato candidato;
    private Eleitor eleitor;

    public static int getQtd_votos() {
        return Voto.qtd_votos;
    }
    public static void setQtd_votos(int qtd_votos) {
        Voto.qtd_votos = qtd_votos;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public Candidato getCandidato() {
        return candidato;
    }
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    public Eleitor getEleitor() {
        return eleitor;
    }
    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Voto(Candidato candidato, Eleitor eleitor) throws Exception{
        if(candidato.getEstado().equals(eleitor.getEstado())){
            this.setCandidato(candidato);
            this.setEleitor(eleitor);
            this.data = LocalDateTime.now();
            Voto.qtd_votos++;
        } else {
            throw new Exception("Candidato e eleitor de estados diferentes");
        }
    }
    
    public static void imprimeTotalVotor(){
        System.out.println("Total de votos: " + Voto.getQtd_votos());
    }

}