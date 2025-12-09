public class Eleitor{
    private Estado estado;
    private String nome;
    private String titulo;

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) throws Exception{
        if(!estado.equals(Estado.ES) && ! estado.equals(Estado.SP)){
            throw new Exception("Estado invalido");
        } else {
            this.estado = estado;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Eleitor(Estado estado, String nome) throws Exception{
        this.setNome(nome);
        this.setEstado(estado);
    }

    public Eleitor(Estado estado, String titulo, String nome) throws Exception{
        this.setTitulo(titulo);
        this.setEstado(estado);
        this.setNome(nome);
    }
    
    public void imprimeEleitor(){
        System.out.println("Estado eleitor: " + this.getEstado());
        System.out.println("Nome eleitor: " + this.getNome());
        System.out.println("Titulo eleitor: " + this.getTitulo());
    }
    
}