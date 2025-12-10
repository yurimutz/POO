import java.time.LocalDate;
import java.time.Period;

public class Jogador{
    private String cpf;
    private String nome;
    private LocalDate nasc;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception{
        if(cpf.length() != 11){
            throw new Exception("CPF invalido");
        } else {
            this.cpf = cpf;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getData_nascimento() {
        return nasc;
    }
    public void setData_nascimento(int dia, int mes, int ano) throws Exception{
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(nascimento, hoje);
        if(periodo.getYears() < 16){
            throw new Exception("Jogador com idade abaixo da minima");
        } else {
            this.nasc = nascimento;
        }
    }

    public Jogador(String cpf, String nome, int dia, int mes, int ano) throws Exception{
        this.setCpf(cpf);
        this.setNome(nome);
        this.setData_nascimento(dia, mes, ano);
    }

    public Jogador(String cpf, int dia, int mes, int ano) throws Exception{
        this.setCpf(cpf);
        this.setData_nascimento(dia, mes, ano);
    }
    
}