public class PessoaFisica extends Candidato{
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public PessoaFisica(Estado estado, Double patrimonio, String documento, String nome, String sobrenome) throws Exception{
        super(estado, patrimonio);
        this.validaDocumento(documento);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    @Override
    public void validaDocumento(String documento) throws Exception{
        if(documento.length() < 11){
            throw new Exception("Doc PF invalido");
        } else {
            super.setDocumento(documento);
        }
    }

    public void imprimePF(){
        super.imprimeCandidato();
        System.out.println("Patrimonio PF: " + super.getPatrimonio() * 1.05);
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobrenome: " + this.getSobrenome());

    }
}