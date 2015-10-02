package signup.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGUSERS")
public class Users {

	@Id @GeneratedValue
	@Column(name = "USERID" )
	private Long uID;

	@Column(name = "USERNAME")
	private String uName;

	@Column(name = "PASSWORD")
	private String uPWord;
	
	@Column(name = "CONPASSWORD")
	private String uConPWord;

	@Column(name = "EMAIL")
	private String uEMail;
	
	@Column(name = "USERMOBILENUMBER")
	private String uMobNumber;
	
	@Column(name = "USERADDRESS")
	private String uAddress;

	public Users() {}

	public Long getuID() {
		return uID;
	}

	public void setuID(Long uID) {
		this.uID = uID;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPWord(){
		return uPWord;
	}
	
	public void setuPWord(String uPWord){
		this.uPWord = uPWord;
	}
	
	public String getuConPWord(){
		return uConPWord;
	}
	
	public void setuConPWord(String uConPWord){
		this.uConPWord = uConPWord;
	}
	
	public String getuEMail(){
		return uEMail;
	}
	
	public void setuEMail(String uEMail){
		this.uEMail = uEMail;
	}
	
	public String getuMobNumber() {
		return uMobNumber;
	}

	public void setuMobNumber(String uMobNumber) {
		this.uMobNumber = uMobNumber;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}



	@Override
	public String toString() {
		return "About [uName=" + uName + ", uEMailr=" + uEMail + "]";
			
	}

	

}
