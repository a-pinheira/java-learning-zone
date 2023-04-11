package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicosRepository;

@RestController
public class TopicosController {
	
	/*
	 * Para fazer injeção usa-se p @Autowired
	 */
	@Autowired
	private TopicosRepository topicoRepositoy;
	
	@RequestMapping(value = "/topicos", method = RequestMethod.GET)
	@GetMapping("/topicos")
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
	@RequestMapping(value = "/topicos", method = RequestMethod.POST)
	@PostMapping("/topicos")
	private void Cadastrar() {
		

	}

}
