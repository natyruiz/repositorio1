package br.fatec.integracao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.dominio.Empresa;
import br.fatec.persistencia.HibernateEmpresaDAO;

public class UC03ExcluirEmpresa {

	public static HibernateEmpresaDAO empresaDAO;
	public static Empresa empresa;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		empresaDAO = new HibernateEmpresaDAO();
		empresa = new Empresa();
		//89.424.232/0001-80
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresa x");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("12121212");
		empresa.setResponsavel("jose silva");
		empresa.setTelefoneResponsavel("121212");
		empresa.setSetor("contabilidade");
		empresa.setEmail("jsilva@gmail.com");
		empresaDAO.cadastra(empresa);
	}
	@Test
	public void test() {
		assertEquals (1,empresaDAO.exclui("89424232000180"));
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}
