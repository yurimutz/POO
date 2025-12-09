public abstract class Candidato{
    private Estado estado;
    private Double patrimonio;
    private String documento;

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) throws Exception {
        // if(estado == "ES" ) this.estado = Estado.ES;
        // else if(estado == "SP") this.estado = Estado.SP;
        // else throw new Exception("Estado invalido");

        if(!estado.equals(Estado.ES) && ! estado.equals(Estado.SP)){
            throw new Exception("Estado invalido");
        } else {
            this.estado = estado;
        }

    }
    public Double getPatrimonio() {
        return patrimonio;
    }
    public void setPatrimonio(Double patrimonio) throws Exception{
        if(patrimonio < 0){         
            throw new Exception("Valor negativo");
        }else {
            this.patrimonio = patrimonio;
        }
    }

    public abstract void validaDocumento(String documento) throws Exception; 

    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Candidato(Estado estado, Double patrimonio) throws Exception{
        this.setPatrimonio(patrimonio);
        this.setEstado(estado);
    }

    public final void imprimeCandidato(){
        System.out.println("Estado: " + getEstado());
        System.out.println("Documento: " + getDocumento());
    }
}