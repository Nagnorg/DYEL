package no.hig.GlenGrongan.trainingcontrol;


public class Program {
	private long id;
	private String name;
	
	public long getID(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		return name;
	}
}
