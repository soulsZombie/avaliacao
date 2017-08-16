package entidade;
import java.util.List;
public class Funcionario {

	private int matricula;
	private String nome;
	private String email;
	private float salario;
	
	private Dependente dependente;
	private List<Equipe> equipe;
	
	public Funcionario()
	{
		
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nEmail: " + email + "\nSalario: " + salario + "\nDependente: " + dependente.getNome() 
		+ "\nFiliação: " + dependente.getFiliacao();
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}
	



	
}
