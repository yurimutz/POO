public class Gerente extends Funcionario{

    private Boolean competencia;

    public void setCompetenca(Boolean comp){
        this.competencia = comp;
    }

    public Boolean getCompetencia(){
        return this.competencia;
    }

    //implementacao do metodo abstrato
    public int calculoBonus(){
        if(this.getCompetencia() == false){
            return 2 * super.getSalario();
        } else {
            return 3 * super.getSalario();
        }
    }

    public Gerente(String nome, int salario, String cargo, Boolean comp){
        super(nome, salario, cargo);
        setCompetenca(comp);
    }

    //implementacao do metodo abstrato
    public void imprimeInformacoes(){
        super.imprimeInformacoesConcreta();
        System.out.println("E competente? " + this.getCompetencia());
        System.out.println("Salario Real: " + this.calculoBonus());        
    }   

}