package nsmsfx;

public class Coach 
{
	private int _number;
	private String _fName;
	private String _mInitial;
	private String _lName;
	private long _tele;
	private String _email;
	protected String _teamCode;
	
	public Coach(int number, String fName, String mInitial, String lName, long tele, String email, String teamCode)
	{
		_number = number;
		_fName = fName;
		_mInitial = mInitial;
		_lName = lName;
		_tele = tele;
		_email = email;
		_teamCode = teamCode;
	}
        
       
	public int get_number() {
		return _number;
	}

	public void set_number(int number) {
		_number = number;
	}

	public String get_fName() {
		return _fName;
	}

	public void set_fName(String fName) {
		_fName = fName;
	}

	public String get_mInitial() {
		return _mInitial;
	}

	public void set_mInitial(String mInitial) {
		_mInitial = mInitial;
	}

	public String get_lName() {
		return _lName;
	}

	public void set_lName(String lName) {
		_lName = lName;
	}

	public long get_tele() {
		return _tele;
	}

	public void set_tele(long tele) {
		_tele = tele;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String email) {
		_email = email;
	}

	public String get_teamCode() {
		return _teamCode;
	}

	public void set_teamCode(String teamCode) {
		_teamCode = teamCode;
	}
        
		public String toString() { 
			
			return "Location Code:" + _number + " " + "Name" + _fName  + " " + "middle " + _mInitial+ "last " + _lName+ "middle " +_tele;
		}
	
	
}
