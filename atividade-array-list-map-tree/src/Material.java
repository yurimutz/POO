public class Material implements Comparable<Material>{
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Material(Double preco){
        this.preco = preco;
    }

    @Override
    public int compareTo(Material m){
        return this.preco.compareTo(m.getPreco());
    }
}
