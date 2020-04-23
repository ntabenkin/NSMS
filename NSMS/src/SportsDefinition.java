
public class SportsDefinition {
		
		int _SportCode; 
		
		String _SportDescription;
		
		char _units; 
		
		SportsDefinition(int code, String description, char units)
		{
			_SportCode = code; 
			_SportDescription = description; 
			_units = units;
			
		}
		
		
		public char getUnit(){
			
			return _units;
			
		}
		public int getSportCode(){
			
			return _SportCode;
			
		}
		
		public String getSportDescription()
		{
			
			return _SportDescription;
		}
		
		public void setUnits(char units)
		{
			_units = units;
			
		}
		
		public void setSportCode(int code) 
		{
			_SportCode = code;
			
		}
		public void setSportDescription(String description) 
		{
			_SportDescription = description;
			
		}
		
		
		
	
		public String toString() { 
			
			return "Location Code:" + _SportCode + " " + "Name" + _SportDescription  + " " + "units " + _units;
		}
		
		
		
		
	}


