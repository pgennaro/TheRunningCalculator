package com.buec327.jbdepg.therunningcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SplitCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_split_calculator);
	}

	public void GoGoPowerRangers(View view){
		//Define where the input is coming from
		Spinner input_distance_type = (Spinner) findViewById(R.id.spinner1);
		Spinner output_distance_type = (Spinner) findViewById(R.id.spinner2);
		EditText input_distance = (EditText) findViewById(R.id.editText1);
		EditText hours_input = (EditText) findViewById(R.id.editText1);
		EditText minutes_input = (EditText) findViewById(R.id.editText1);
		EditText seconds_input = (EditText) findViewById(R.id.editText1);
		TextView output = (TextView) findViewById(R.id.textView7);
		
		//Difine variables used
		double distance = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		//Get Variables while user checking the input
		
		if(input_distance.getText().toString().equals("")){
			distance = 0;
		}else{
			distance = Double.valueOf(input_distance.getText().toString());
		}
		
		if(hours_input.getText().toString().equals("")){
			hours = 0;
		}else{
			hours = Integer.valueOf(hours_input.getText().toString());
		}
		
		if(minutes_input.getText().toString().equals("")){
			minutes = 0;
		}else{
			minutes = Integer.valueOf(minutes_input.getText().toString());
		}
		
		if(seconds_input.getText().toString().equals("")){
			seconds = 0;
		}else{
			seconds = Integer.valueOf(seconds_input.getText().toString());
		}
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.split_calculator, menu);
		return true;
	}

}
