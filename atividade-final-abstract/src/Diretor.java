public final class Diretor extends Funcionario{

    private int qtd_ternos; // quantos ternos ele tem;

    public void setTernos(int ternos){
        this.qtd_ternos = ternos;
    }

    public int getTernos(){
        return this.qtd_ternos;
    }

    //implementacao do metodo abstrato
    public int calculoBonus(){
        return 5 * super.getSalario();
    }

    public Diretor(String nome, int salario, String cargo, int ternos){
        super(nome, salario, cargo);
        setTernos(ternos);
    }

    //implementacao do metodo abstrato
    public void imprimeInformacoes(){
        super.imprimeInformacoesConcreta();
        System.out.println("Qtd de ternos: " + this.getTernos());
        System.out.println("Salario Real: " + this.calculoBonus());
        System.out.println("-----------------------------------");
    }

}