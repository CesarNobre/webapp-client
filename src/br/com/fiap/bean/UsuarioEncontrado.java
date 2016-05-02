package br.com.fiap.bean;

import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;

import br.com.fiap.services.UsuarioBOStub;
import br.com.fiap.services.UsuarioBOStub.BuscarUsuario;
import br.com.fiap.services.UsuarioBOStub.BuscarUsuarioResponse;
import br.com.fiap.services.UsuarioBOStub.InserirUsuario;
import br.com.fiap.services.UsuarioBOStub.UsuarioTO;

@ManagedBean
public class UsuarioEncontrado {

	private String nome;
	private String nomeUsuarioEncontrado;
	private String cpf;
	private int codigo;
	private String genero;
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeUsuarioEncontrado() {
		return nomeUsuarioEncontrado;
	}

	public void setNomeUsuarioEncontrado(String nomeUsuarioEncontrado) {
		this.nomeUsuarioEncontrado = nomeUsuarioEncontrado;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void Buscar(){
		try{
			UsuarioBOStub ws = new UsuarioBOStub();
			
			BuscarUsuario param = new BuscarUsuario();
			param.setNome(this.nome);
			
			BuscarUsuarioResponse response = ws.buscarUsuario(param);	
			
			UsuarioTO usuarioEncontrado = response.get_return();
			
			this.nomeUsuarioEncontrado = usuarioEncontrado.getNome();
			this.cpf = usuarioEncontrado.getCpf();
			this.codigo = usuarioEncontrado.getCodigo();
			this.genero = usuarioEncontrado.getGenero();
		}catch(Exception ex){
			this.nomeUsuarioEncontrado = "NÃO ENCONTRAMOS";
		}
		
	}
}
