public abstract class Material{

    private static int num_materiais;
    private String nome;
    private Double valor;
    private Boolean atraso;
    private int dias_atraso;

    public static int getMateriais(){
        return Material.num_materiais;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return this.valor;
    }

    public void setDias(int dias){
        this.dias_atraso = dias;
    }

    public int getDias(){
        return this.dias_atraso;
    }

    public void setAtraso(Boolean atraso){
        this.atraso = atraso;
    }

    public Boolean getAtraso(){
        return this.atraso;
    }

    public Material(String nome, Double valor){
        this.setNome(nome);
        this.setValor(valor);
        this.registrarAtraso(false);
        Material.num_materiais++;
    }  

    public void registrarAtraso(Boolean atraso){
        setAtraso(atraso);
        if(atraso == false){
            setDias(0);
        }
    }

    public void registrarAtraso(int dias){
        this.dias_atraso = this.dias_atraso + dias;
        setAtraso(true);
    }

    public final void exibeDadosConcreto(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Tem atraso? " + this.atraso);
        if(getAtraso() == true){
           System.out.println("Dias de atraso: " + this.getDias()); 
           System.out.println("Multa a pagar: " + this.calculoMulta());
        } 
    }

    public abstract void exibeDados();
    public abstract Double calculoMulta();

}