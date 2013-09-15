package no.hig.GlenGrongan.trainingcontrol;

public class exercise {
	private long id;
	private String exerciseName;
	private int nrReps;
	private int nrTimes;
	private float highestWeight;
	private int repsWithWeight;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExerciseName() {
		return exerciseName;
	}
	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}
	public int getNrReps() {
		return nrReps;
	}
	public void setNrReps(int nrReps) {
		this.nrReps = nrReps;
	}
	public int getNrTimes() {
		return nrTimes;
	}
	public void setNrTimes(int nrTimes) {
		this.nrTimes = nrTimes;
	}
	public float getHighestWeight() {
		return highestWeight;
	}
	public void setHighestWeight(float highestWeight) {
		this.highestWeight = highestWeight;
	}
	public int getRepsWithWeight() {
		return repsWithWeight;
	}
	public void setRepsWithWeight(int repsWithWeight) {
		this.repsWithWeight = repsWithWeight;
	}
	
	@Override
	public String toString(){
		return exerciseName;
	}

}
