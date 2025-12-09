public class App {
    public static void main(String[] args) throws Exception {
    
        try{
            PessoaFisica pf1 = new PessoaFisica(Estado.ES, 10.0, "19829378928", "Pedro", "Pereira");                                                                
            PessoaJuridica pj1 = new PessoaJuridica(Estado.SP, 100.0, "19829378928271", "8128382184");               
            //PessoaJuridica pj2 = new PessoaJuridica(Estado.SP, -2.0, "19829378928271", "8128382184"); //patrimonio negativo;

            Eleitor eleitor1 = new Eleitor(Estado.ES, "Carlos");        
            Eleitor eleitor2 = new Eleitor(Estado.ES, "129321949812", "Carlos");
            eleitor2.imprimeEleitor();
        
            Voto voto1 = new Voto(pf1, eleitor1);
            //Voto voto2 = new Voto(pj1, eleitor2); //estados diferentes;

            voto1.imprimeTotalVotor();

        } catch (Exception e){

            System.out.println(e.getMessage());

        }
        
        
        

    }
}
