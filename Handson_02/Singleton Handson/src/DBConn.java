
public class DBConn {
	
	//static member holds only one instance of the DBConn class.  
	private static DBConn instance=new DBConn();
	
	//prevents the instantiation from any other class.
	private DBConn() {
		
	}
	
	public static DBConn getInstance()
	{
		return instance;
	}
	
	/*
	 * This is done to retrieve same insatance(i.e. same hashcode) of the class,irrespective of requests
	 * */
}
