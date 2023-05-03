package br.com.requisicaodemateriais.entities.projections;

/*
 * Projeção User para trazer somenta campos necessários.
 * É importante que os métodos getters estejam com a mesma nomenclatura da entidade.
 * Ao se precisar de um campo que está em um objeto dentro da classe, utiliza-se o Get do objeto 
 * concatenado com o nome do campo a trazer Ex: getPessoaCodigoG()
 */
public interface UserProjection {
	String getUserName();
	String getIdCodigoUser(); 
	String getPessoaIdCodigoG();
	String getPessoaNameG();
	
}
