package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(null, "Fulano da Silva", "fulano@email.com");
		Pessoa pessoa2 = new Pessoa(null, "Ciclano Matos", "ciclano@email.com");
		Pessoa pessoa3 = new Pessoa(null, "Joao Pedro", "joao@email.com");
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin();
		em.persist(pessoa);
		em.persist(pessoa2);
		em.persist(pessoa3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		
		
		
		


	
	}
}
