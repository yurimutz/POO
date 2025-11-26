public final class Enciclopedia extends Livro{

    private String area;

    public void setArea(String area){
        this.area = area;
    }

    public String getArea(){
        return this.area;
    }

    public Enciclopedia(String nome, Double valor, int paginas, String area){
        super(nome, valor, paginas);
        setArea(area);
    }
    
    @Override
    public Double calculoMulta(){
        return super.getValor() * 100.0 * super.getDias();
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Area dessa enciclopedia: " + this.getArea());
    }

}