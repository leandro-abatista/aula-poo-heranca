package cursojava.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cursojava.classes.Usuario;

public class escreveGson {

	public static void main(String[] args) throws Exception {
		
		
		Usuario usuario1 = new Usuario();
		usuario1.setId(1L);
		usuario1.setNome("leandro amorim");
		usuario1.setCpf("12356");
		usuario1.setLogin("admin");
		usuario1.setSenha("admin");
		
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(2L);
		usuario2.setNome("estefane garcia");
		usuario2.setCpf("123789");
		usuario2.setLogin("dir");
		usuario2.setSenha("dir");
		
		Usuario usuario3 = new Usuario();
		usuario3.setId(3L);
		usuario3.setNome("mariana freitas");
		usuario3.setCpf("798456");
		usuario3.setLogin("mariana");
		usuario3.setSenha("mariana");
		
		Usuario usuario4 = new Usuario();
		usuario4.setId(4L);
		usuario4.setNome("joão algas");
		usuario4.setCpf("123456");
		usuario4.setLogin("joao");
		usuario4.setSenha("123");
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
//		FileWriter fileWriter = new FileWriter("C:\\ws-alex-dev-treinamento\\aula-poo-heranca\\src\\cursojava\\main\\arquivo.json");
//		
//		fileWriter.write(jsonUser);
//		fileWriter.flush();
//		fileWriter.close();
		/*segunda forma de fazer o gson*/
		
		OutputStreamWriter escreve_no_arquivo = 
				new OutputStreamWriter(
						new FileOutputStream("C:\\ws-alex-dev-treinamento\\aula-poo-heranca\\src\\cursojava\\main\\arquivo.json"), "UTF-8");
		
		escreve_no_arquivo.write(jsonUser);
		escreve_no_arquivo.flush();
		escreve_no_arquivo.close();
		
		System.out.println("Arquivo criado com sucesso!");
	}

}
