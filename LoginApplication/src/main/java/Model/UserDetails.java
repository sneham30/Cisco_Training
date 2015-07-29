package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class UserDetails {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(name = "UserName")
	private String userName;
	@Column(name = "Password")
	private String password;

	public UserDetails(String userName, String password) {
		this.userName = userName;
		this.password = password;


	}

}
