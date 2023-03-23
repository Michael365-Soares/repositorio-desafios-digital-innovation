package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.handler.BusinessException;
import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UserRepository repository;

	@GetMapping("/listarUsuarios")
	public List<Usuario> getUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/buscarUsuarioId/{id}")
	public Usuario buscarUsarioId(@PathVariable("id") Integer id) {
		return repository.finById(id);
	}
	
	@DeleteMapping("/deletarUsuario/{id}")
	public void delete(@PathVariable("id") Integer id) {
		if(id==null) {
			throw new BusinessException("O campo  é obrigatório!");
		}
		repository.remove(id);
	}
	
	@PostMapping("/salvarUsuario")
	public void postUsuario(@RequestBody Usuario u) {
		if(u.getId()==null) {
			throw new BusinessException("O campo login é obrigatório!");
		}
		repository.save(u);
	}
	
	@PutMapping("/salvarUsuario")
	public void postUsuarioId(@RequestBody Usuario u) {
		repository.save(u);
	}
	
}
