public class PessoaJuridica extends Candidato{
    private String razao_social;

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    @Override
    public void validaDocumento(String documento) throws Exception{
        if(documento.length() < 14){
            throw new Exception("Doc PJ invalido");
        } else {
            super.setDocumento(documento);
        }
    }

    public PessoaJuridica(Estado estado, Double patrimonio, String documento, String razao_social) throws Exception{
        super(estado, patrimonio);
        this.validaDocumento(documento);
        this.setRazao_social(razao_social);
    }

    public void imprimePF(){
        super.imprimeCandidato();
        System.out.println("Patrimonio PF: " + super.getPatrimonio() * 1.10);
        System.out.println("Razao social: " + this.getRazao_social());
    }

    @Override
    public void imprimeNome_RazaoSocial() throws Exception{
        if(this.getRazao_social() != null){
            System.out.println("Razao social do candidato: " + this.getRazao_social());
        } else {
            throw new Exception("Razao Null");
        }
    }

}