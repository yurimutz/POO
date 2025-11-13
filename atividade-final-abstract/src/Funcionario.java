public abstract class Funcionario{

    private String nome;
    private int salarioBase;
    private String cargo;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setSalario(int salario){
        this.salarioBase = salario;
    }
    public int getSalario(){
        return this.salarioBase;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }

    public Funcionario(String nome, int salario, String cargo){
        this.setNome(nome);
        this.setSalario(salario);
        this.setCargo(cargo);
    }

    public final void imprimeInformacoesConcreta(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salario Base:" + this.getSalario());
    }

    public abstract void imprimeInformacoes();

    public abstract int calculoBonus();

}