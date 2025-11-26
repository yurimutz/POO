public class Livro extends Material{

    private int paginas;

    public void setPaginas(int paginas){
        this.paginas = paginas;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public Livro(String nome, Double valor, int paginas){
        super(nome, valor);
        this.setPaginas(paginas);
    }
    
    @Override
    public Double calculoMulta(){
        return super.getValor() * 2.0 * super.getDias();
    }

    @Override
    public void exibeDados(){
        super.exibeDadosConcreto();
        System.out.println("Numero de paginas: " + this.getPaginas());
    }
}