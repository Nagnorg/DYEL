package no.hig.GlenGrongan.trainingcontrol;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class UseProgram extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		String programName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		try{
			FileInputStream fis;
			fis = openFileInput(programName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setContentView(R.layout.activity_use_program);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.use_program, menu);
		return true;
	}

}
