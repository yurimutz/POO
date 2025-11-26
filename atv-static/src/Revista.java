public class Revista extends Material{

    private String capa;

    public void setCapa(String capa){
        this.capa = capa;
    }

    public String getCapa(){
        return this.capa;
    }

    public Revista(String nome, Double valor, String capa){
        super(nome, valor);
        this.setCapa(capa);
    }
    
    @Override
    public Double calculoMulta(){
        return super.getValor() * 2.0 * super.getDias();
    }

    @Override
    public void exibeDados(){
        super.exibeDadosConcreto();
        System.out.println("Quem esta na capa?: " + this.getCapa());
    }
}