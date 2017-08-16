package app;
import java.time.LocalDate;

import entidade.*;
import java.util.Arrays;


public class principal {

	
	public static void main(String[] args) {
		
		Departamento departamento = new Departamento();
		Projeto projeto = new Projeto();
		Dependente dependente = new Dependente();
		Funcionario funcionario = new Funcionario();
		Equipe equipe = new Equipe();
		
	
	
	//dados de equipe
		equipe.setNome("Equipe show");
		equipe.setDescricao("uma equipe show do k7");		
		
	//dados de departamento
		departamento.setNomeFantasia("Empresa show");
		departamento.setSetor("setor show");
		
	//dados de projeto
		projeto.setCodigo(1);
		projeto.setDataInicio(LocalDate.now());
		projeto.setDataEntrega(LocalDate.of(2017, 9, 21));
		
		
	//dados de dependente
		dependente.setFiliacao("Filho show");
		dependente.setNome("Xarlin");		
		
		
	//atribuição de dados de funcionario a dependentes
		dependente.setFuncionario(funcionario);
	
	//atribuição de dados de dependente/equipe a funcionario
		funcionario.setDependente(dependente);
		funcionario.setEquipe(Arrays.asList(equipe));
		
		
	//atribuição de dados de equipe a departamento
		departamento.setEquipe(equipe);

	//atribuição de dados de equipe a departamento
		projeto.setEquipe(Arrays.asList(equipe));
		
//atribuição de dados a equipe
		equipe.setDepartamento(departamento);
		equipe.setFuncionario(funcionario);
		equipe.setProjeto(projeto);
		equipe.setDependente(dependente);
		
		
		//metodo para alocar funcionario		
		equipe.alocaFunc();	
		

		
	
	System.out.println("---------Equipe Show--------- " + equipe);
	System.out.println("=================================");
	System.out.println("---------Dados do Funcionario---------");
	System.out.println(funcionario);

	
	
	}
	
	
	
}
