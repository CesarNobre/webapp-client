package br.com.fiap.bean;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.swing.JOptionPane;

import org.apache.axis2.AxisFault;

import br.com.fiap.services.UsuarioBOStub;
import br.com.fiap.services.UsuarioBOStub.InserirUsuario;
import br.com.fiap.services.UsuarioBOStub.UsuarioTO;

@ManagedBean
public class UsuarioBean {
	
	private String nome;
	private String cpf;
	private String genero;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<GeneroTO> todosGeneros(){
		ArrayList<GeneroTO> generos = new ArrayList<GeneroTO>();
		generos.add(new GeneroTO('M',"Masculino"));
		generos.add(new GeneroTO('F',"Feminino"));
		return generos;
	}
	
	public void Salvar(){
		
		try {
			UsuarioBOStub ws = new UsuarioBOStub();
			UsuarioTO usuarioTO = new UsuarioTO();
			usuarioTO.setNome(this.nome);
			usuarioTO.setCpf(this.cpf);
			usuarioTO.setGenero(this.genero);
			//usuarioTO.setDataNascimento(new GregorianCalendar(1999,10,1));
			
			InserirUsuario inserir = new InserirUsuario();
			inserir.setUsuarioTO(usuarioTO);
			ws.inserirUsuario(inserir);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
	}
	
	@PostConstruct
	private void init(){
	}
}
