package $PACKAGE.domain;

@Entity
@Table(name="user_roles")
public class Groups {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String role;
	
	public Groups() {}
	
	public Groups(String username, String role) {
		this.username = username;
		this.role = role;
	}

	public String toString() {
		return "UserRoles [id=" + id + ", username="
				+ username + ", role=" + role + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
