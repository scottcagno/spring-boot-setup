package $PACKAGE.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String email;
	private String username;
	private String password;
	private String role;
	private Short enabled;
	
	@Temporal(TemporalType.DATE)
	private Date created;
	@Temporal(TemporalType.DATE)
	private Date touched;
	
	public User() {}
	
	public User(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = 1;
		this.created = new Date();
		this.touched = new Date();
	}
	
	public User(String name, String email, String username, String password, String role) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = 1;
		this.created = new Date();
		this.touched = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Short getEnabled() {
		return enabled;
	}

	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getTouched() {
		return touched;
	}

	public void setTouched(Date touched) {
		this.touched = touched;
	}
	
}
