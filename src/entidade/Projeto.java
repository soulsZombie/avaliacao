package entidade;
import java.time.LocalDate;
import java.util.List;
public class Projeto {

	private int codigo;
	private LocalDate dataInicio;
	private LocalDate dataEntrega;
	
	private List<Equipe> equipe;
	
	public Projeto()
	{
		
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}


	public List<Equipe> getEquipe() {
		return equipe;
	}


	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	}
	
	
	
	
	
	
}
