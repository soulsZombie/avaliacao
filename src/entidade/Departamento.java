package entidade;



public class Departamento {

	
	private String setor;
	private String nomeFantasia;
	
	private Equipe equipe;
	
	public Departamento()
	{
		
	}
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  setor +"\nNome do Departamento: " + nomeFantasia ;
	}
	
	
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	


	
	
}
