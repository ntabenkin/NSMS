package nsmsfx;
public class SportsDefinition {
		
		int _SportCode; 
		
		String _SportDescription;
		
		String _units; 
		
		SportsDefinition(int code, String description, String units)
		{
			_SportCode = code; 
			_SportDescription = description; 
			_units = units;
			
		}
		
		
		public String getUnit(){
			
			return _units;
			
		}
		public int getSportCode(){
			
			return _SportCode;
			
		}
		
		public String getSportDescription()
		{
			
			return _SportDescription;
		}
		
		public void setUnits(String units)
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


