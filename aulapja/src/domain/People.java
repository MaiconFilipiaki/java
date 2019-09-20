package domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity // Serve pra dizer que esse objeto pertence a uma tabela
public class People implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id // Diz que eé o id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Pra gerar o numero aleatorio pra tabela
	private Integer id;
	//@Column(name="nomecompleto") // estou dizendo que quando for criar a tabela usar esse nome na tabela
	private String name;
	private String email;
	
	public People(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
