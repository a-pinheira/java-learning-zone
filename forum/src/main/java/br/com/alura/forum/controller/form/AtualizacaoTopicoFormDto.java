package br.com.alura.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicosRepository;

public class AtualizacaoTopicoFormDto {
	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	private String mensagem;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Topico atualizar(Long id, TopicosRepository topicoRepositoy) {
		Topico topico = topicoRepositoy.getOne(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);

		return topico;
	}
	

}