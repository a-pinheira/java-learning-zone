package br.com.alura.forum.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.controller.form.TopicoFormDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import br.com.alura.forum.repository.TopicosRepository;

@RestController
@RequestMapping("topicos")
public class TopicosController {
	
	/*
	 * Para fazer injeção usa-se p @Autowired
	 * Injeção de dependencia
	 */
	@Autowired
	private TopicosRepository topicoRepositoy;

	@Autowired
	private CursoRepository cursoRepositoy;
	
	@GetMapping
	public List<TopicoDto> lista(String nomeCurso) {
		//System.out.println("Nome do Curso: " + nomeCurso);
		/*
		 * findAll(): metodo que faz uma consulta carregando todos os dados
		 * / registros do BD
		 */
		if (nomeCurso == null) {
		List<Topico> topicos = topicoRepositoy.findAll();
		/*
		 * apaga essa linha:
		 * Topico topico = new Topico("Duvida", "Dúvida com Spring", new Curso("Spring", "Programação"));
		 * pois cria o tópico em memória, agora vamos acessar o BD 
		 * e apaga tmb a linha do array asList
		 * return TopicoDto.converter(Arrays.asList(topico, topico, topico));
		 */
		return TopicoDto.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepositoy.findByCursoNome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
	}
	@PostMapping
	private ResponseEntity<TopicoDto> Cadastrar(@RequestBody @Valid TopicoFormDto form, UriComponentsBuilder uriBuilder) {
		Topico topico = form.converter(cursoRepositoy);
		topicoRepositoy.save(topico);
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoDto(topico));
		

	}

}
