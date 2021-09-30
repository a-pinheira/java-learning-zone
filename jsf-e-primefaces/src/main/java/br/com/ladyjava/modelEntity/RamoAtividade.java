package br.com.ladyjava.modelEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//informa ao hibernate no jpa que esta é uma table do BD
@Entity
//nomeia o nome da tabela com a propriedade name do BD
@Table(name = "ramo_atv")
public class RamoAtividade implements Serializable {
	private static final long serialVersionUID = 1L;
	//mapeando os campos da entidade/table ou variáveis da classe model/entidade
	
	//pode especificar o nome do campo que deseja apareca na table
	// @Column(name = "id_ramo_atv")
	
	//esta anotação informa que esta é uma propriedade, referente ao primarykey do BD
	@Id
	//para deixar o ID automatico(autoincremento), o sql  atribui um valor pro primarykey 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RamoAtividade other = (RamoAtividade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RamoAtividade [id=" + id + "]";
	}
	
	
	
		
	
}
