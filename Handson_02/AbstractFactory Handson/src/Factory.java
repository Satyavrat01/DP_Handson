//this class lets a class to return the factory of classes
//in this case MercedesFactory and AudiFactory
//MercedesFactory returns mercedesHeadlight and mercedesTires
//similarly audifactory 

public abstract class Factory {
	public abstract Headlight makeHeadLight();
	public abstract Tire makeTire();
	

}
