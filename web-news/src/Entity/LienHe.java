package Entity;

public class LienHe {
	private int ID;
	private String Name;
	private String Email;
	private String Subject;
	private String Message;
	
	public LienHe(String name, String email, String subject, String message) {
		Name = name;
		Email = email;
		Subject = subject;
		Message = message;
	}
	
	public LienHe(int iD, String name, String email, String subject, String message) {
		ID = iD;
		Name = name;
		Email = email;
		Subject = subject;
		Message = message;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public LienHe() {
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return Name + "-" + Email + "-" + Subject + "-" + Message;
	}

}
