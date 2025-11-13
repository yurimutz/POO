public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario dir = new Diretor("Carlos", 100, "Diretor", 5);
        Funcionario ger = new Gerente("Jonas", 50, "Gerente", false);
        Funcionario ger2 = new Gerente("Himmel", 50, "Gerente", true);
        
        Funcionario[] colaboradores = {ger, dir, ger2};

        for(int i=0; i<colaboradores.length; i++){
            colaboradores[i].imprimeInformacoes();
        }

    }
}
