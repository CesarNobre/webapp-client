package br.com.fiap.consoleapp;

import java.rmi.RemoteException;
import java.util.Scanner;

import org.apache.axis2.AxisFault;

import br.com.fiap.services.UsuarioBOStub;
import br.com.fiap.services.UsuarioBOStub.BuscarUsuario;
import br.com.fiap.services.UsuarioBOStub.BuscarUsuarioResponse;
import br.com.fiap.services.UsuarioBOStub.InserirUsuario;
import br.com.fiap.services.UsuarioBOStub.UsuarioTO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		UsuarioBOStub ws = null;
		
		System.out.println("Menu");
		System.out.println("Digite 1 para cadastrar novo usuario");
		System.out.println("Digite 2 para buscar usuario");
		System.out.println("Digite 0 para sair");
		int s1 = scan.nextInt();
        
		while (s1 != 0) {
	        
	        if(s1 == 1){
	        	UsuarioTO usuarioTO = new UsuarioTO();
	        	System.out.println("Digite o nome do novo usuario");
	        	usuarioTO.setNome(scan.next());
	        	System.out.println("Digite o cpf do novo usuario");
	    		usuarioTO.setCpf(scan.next());	    		

	    		InserirUsuario inserir = new InserirUsuario();
	    		inserir.setUsuarioTO(usuarioTO);
	    		try {
	    			ws = new UsuarioBOStub();
					ws.inserirUsuario(inserir);
					System.out.println("Usuario inserido com sucesso!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Ops, não conseguimos inserir, tente novamente");
				}
	        }
	        
	        if(s1 == 2){
	        	BuscarUsuario param = new BuscarUsuario();
				System.out.println("Digite o nome do usuario");
	        	param.setNome(scan.next());
				
				BuscarUsuarioResponse response;
				try {
					ws = new UsuarioBOStub();
					response = ws.buscarUsuario(param);
					UsuarioTO usuarioEncontrado = response.get_return();
					System.out.println("Nome encontrado: " + usuarioEncontrado.getNome());
					System.out.println("Cpf encontrado: " + usuarioEncontrado.getCpf());
					System.out.println("Codigo encontrado: " + usuarioEncontrado.getCodigo());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
				
	        }
	        
	        s1 = scan.nextInt();
	      }
		scan.close();
	}

}
