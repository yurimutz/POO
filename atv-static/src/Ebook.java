public class Ebook extends Material{

    private double bytes;

    public void setBytes(double bytes){
        this.bytes = bytes;
    }

    public double getBytes(){
        return this.bytes;
    }

    public Ebook(String nome, Double valor, double bytes){
        super(nome, valor);
        this.setBytes(bytes);
    }

    @Override
    public Double calculoMulta(){
        return super.getValor() * 2.0 * super.getDias();
    }

    @Override
    public void exibeDados(){
        super.exibeDadosConcreto();
        System.out.println("Tamanho do arquivo: " + this.getBytes());
    }
}