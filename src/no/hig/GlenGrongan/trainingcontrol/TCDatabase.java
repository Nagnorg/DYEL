package no.hig.GlenGrongan.trainingcontrol;

import android.content.Context;
import android.database.sqlite.*;
import android.util.Log;

public class TCDatabase extends SQLiteOpenHelper{
	public static final String TABLE_PROGRAM = "Program";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_PNAME = "name";
	
	public static final String TABLE_EXERCISE = "Exercise";
	public static final String COLUMN_NAME = "exerciseName";
	public static final String COLUMN_REPS = "nrReps";
	public static final String COLUMN_TIMES = "nrTimes";
	public static final String COLUMN_WEIGHT = "highestWeight";
	public static final String COLUMN_AMOUNT = "repsWithWeight";
	
	private static final String DATABASE_NAME = "program.db";
	private static final int DATABASE_VERSION = 1;
	
	private static final String DATABASE_CREATE = "create table "
			+ TABLE_PROGRAM + "(" + COLUMN_ID
			+ "integer primary key autoincrement, " + COLUMN_PNAME
			+ "text not null); create table "
			+ TABLE_EXERCISE + "(" + COLUMN_ID
			+ "integer primary key autoincrement, " + COLUMN_NAME
			+ "text not null, " + COLUMN_REPS
			+ "integer not null, " + COLUMN_TIMES
			+ "integer not null, " + COLUMN_WEIGHT
			+ "integer default null, " + COLUMN_AMOUNT
			+ "integer default null);";
	
	public TCDatabase(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase database){
		database.execSQL(DATABASE_CREATE);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		Log.w(TCDatabase.class.getName(),
				"Upgrading database from version"+oldVersion+" to "
				+newVersion+", which will destroy all old data");
		db.execSQL("DROP TABLE IF EXISTS" + TABLE_PROGRAM + ", " + TABLE_EXERCISE);
		onCreate(db);
	}
}
