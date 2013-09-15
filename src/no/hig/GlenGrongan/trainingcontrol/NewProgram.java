package no.hig.GlenGrongan.trainingcontrol;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.EditText;

public class NewProgram extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_program);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_program, menu);
		return true;
	}
	
	public void saveProgram(){
	    Intent intent = getIntent();
	    String programName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
	    EditText editText = (EditText) findViewById(R.id.exercise_1_name);
	    String exerciseName = editText.getText().toString();
	    editText = (EditText) findViewById(R.id.exercise_1_reps);
	    String exerciseReps = editText.getText().toString();
	    editText = (EditText) findViewById(R.id.exercise_1_times);
	    String exerciseTimes = editText.getText().toString();
	    TCDatabase tcDatabase = new TCDatabase(getBaseContext());
	    SQLiteDatabase db = tcDatabase.getWritableDatabase();
	    finish();
	}

}
