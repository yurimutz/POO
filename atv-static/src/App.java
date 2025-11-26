public class App {
    public static void main(String[] args) throws Exception {
        
        Material rev = new Revista("Veja", 10.0, "CR7");  
        Material eb = new Ebook("Como ficar rico", 10.0, 100.0);
        Material liv = new Livro("Quincas Borba", 10.0, 200);   
        Material enc = new Enciclopedia("Atlas", 2.0, 2000, "Botanica");
    
        Material[] materiais = {rev, eb, liv, enc};

        System.out.println("Numero de materiais no total:" + Material.getMateriais());
        for(int i=0; i<materiais.length; i++){
            materiais[i].exibeDados();
            System.out.println("-----------------");
        }

        rev.registrarAtraso(true);
        eb.registrarAtraso(false);
        liv.registrarAtraso(10);

        for(int i=0; i<materiais.length; i++){
            materiais[i].exibeDados();
            System.out.println("-----------------");
        }
        
        rev.registrarAtraso(15);
        liv.registrarAtraso(false);

        for(int i=0; i<materiais.length; i++){
            materiais[i].exibeDados();
            System.out.println("-----------------");
        }

    }
}
