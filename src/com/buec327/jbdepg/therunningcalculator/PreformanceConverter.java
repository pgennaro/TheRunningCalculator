package com.buec327.jbdepg.therunningcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ToggleButton;


public class PreformanceConverter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preformance_converter);
	}
	

	//Sets the spinner values for the correct gender
	public void onToggleOneClicked(View view) {
	    // Is the toggle on?
	    boolean on = ((ToggleButton) view).isChecked();
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);	
	    if (on) {
	        ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.preformance_array_women));
	       spinner.setAdapter(spinner1ArrayAdapter);
	    	
	    } else {
	        // Man if off
	       ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.preformance_array_men));
	       spinner.setAdapter(spinner1ArrayAdapter);
	    }
	}
	
	public void onToggleTwoClicked(View view) {
	    // Is the toggle on?
	    boolean on = ((ToggleButton) view).isChecked();
		Spinner spinner = (Spinner) findViewById(R.id.spinner2);	
	    if (on) {
	        ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.preformance_array_women));
	       spinner.setAdapter(spinner1ArrayAdapter);
	    	
	    } else {
	        // Man if off
	       ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.preformance_array_men));
	       spinner.setAdapter(spinner1ArrayAdapter);
	    }
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.preformance_converter, menu);
		return true;
	}


}
