package Application;

import domain.People;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
		
		People p1 = new People(null, "Maicon", "mdfilipiaki@gmail.com");
		People p2 = new People(null, "douglas", "douglas@gmail.com");
		People p3 = new People(null, "Filipiaki", "filipiaki@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p1);
		em.persist(p1);
		em.getTransaction().commit();
		System.out.println("FINISH COMMIT");

	}

}
