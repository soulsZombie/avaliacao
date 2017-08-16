package entidade;

public class Equipe {
	
	private String nome;
	private String descricao;
	
	
	private Departamento departamento;
	private Funcionario funcionario;
	private Projeto projeto;
	private Dependente dependente;
	
	public Equipe()
	{
		
	}
	
	
	@Override
	public String toString() {
		return "\nNome: " + nome + "\nDescrisção: " + descricao + "\nDepartamento: " + departamento + "\nFuncionario: " + funcionario.getNome()
				+ "\nProjeto: " + projeto.getCodigo() + "\nData de Inicio: " + projeto.getDataInicio() + "\nData de Entrega: " + projeto.getDataEntrega();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	public Dependente getDependente() {
		return dependente;
	}


	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	
	
public void alocaFunc()
{ 
	
funcionario.setNome("Carlin");
funcionario.setMatricula(2201);
funcionario.setEmail("Carlin@hotmail.com");
funcionario.setSalario(1400);

}





	

}
