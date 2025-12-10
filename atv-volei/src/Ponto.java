import java.time.LocalDate;

public class Ponto{
    private static int total_pontos;
    private LocalDate data;
    private TipoPonto tipo_ponto;
    private Jogador jogador;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = LocalDate.now();
    }
    public TipoPonto getTipo_ponto() {
        return tipo_ponto;
    }
    public void setTipo_ponto(TipoPonto tipo_ponto) {
        this.tipo_ponto = tipo_ponto;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public static int getTotal_pontos() {
        return total_pontos;
    }
    public static void setTotal_pontos(int total_pontos) {
        Ponto.total_pontos = total_pontos;
    }

    public static void atualiza_total_pontos(){
        Ponto.total_pontos++;
    }

    public Ponto(TipoPonto tipo, Jogador jogador){
        this.setTipo_ponto(tipo_ponto);
        this.setJogador(jogador);
        //Ponto.total_pontos++;
    }
    
    public static void imprimeTotalPontos(){
        System.out.println("Total de pontos do jogo: " + Ponto.getTotal_pontos());
    }

}