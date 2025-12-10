public class App {
    public static void main(String[] args) throws Exception {

        try{
        Jogador jog_mand1 = new Jogador("19829248569", "Joao", 12, 5, 2000);
        Jogador jog_mand2 = new Jogador("28916284749", "Carlos", 20, 7, 1999);
        Jogador jog_mand3 = new Jogador("09828794718", "Roberto", 8, 9, 2002);

        Jogador jog_vis1 = new Jogador("28172947591", "Alberto", 7, 7, 1977);
        Jogador jog_vis2 = new Jogador("12762333678", "Antony do Betis", 16, 9, 2001);
        Jogador jog_vis3 = new Jogador("11116667584", "Ola Pereira", 12, 12, 1912);
        Jogador jog_vis4 = new Jogador("11116667522", "HEHE Silva", 12, 12, 1912);

        Time mandante = new Time("Mandante");
        Time visitante = new Time ("Visitante");

        mandante.setJogadores(jog_mand1);
        mandante.setJogadores(jog_mand2);
        mandante.setJogadores(jog_mand3);

        visitante.setJogadores(jog_vis1);
        visitante.setJogadores(jog_vis2);
        visitante.setJogadores(jog_vis3);

        Jogo jogo = new Jogo ("Dia 10/10/10 as 10:10", "UFES", visitante, mandante);

        //Jogador fora dos times
        //Ponto ponto1 = new Ponto(TipoPonto.ataque, jog_vis4);
        //jogo.setPontos(ponto1);

        Ponto ponto2 = new Ponto(TipoPonto.contra_ataque, jog_vis1);
        jogo.setPontos(ponto2);

        Ponto ponto3 = new Ponto(TipoPonto.contra_ataque, jog_mand3);
        jogo.setPontos(ponto3);

        Ponto.imprimeTotalPontos();

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
