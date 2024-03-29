package no.hig.GlenGrongan.trainingcontrol;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "no.hig.GlenGrongan.TrainingControl.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void newProgram(View view){
		Intent intent = new Intent(this, NewProgram.class);
		EditText editText = (EditText) findViewById(R.id.program_name);
		String programName = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, programName);
		startActivity(intent);
	}
	
	public void fillProgram(View view){
		Intent intent = new Intent(this, UseProgram.class);
		EditText editText = (EditText) findViewById(R.id.program_name);
		String programName = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, programName);
		startActivity(intent);
	}
}
