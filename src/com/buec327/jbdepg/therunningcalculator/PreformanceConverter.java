package com.buec327.jbdepg.therunningcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;


public class PreformanceConverter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preformance_converter);
		Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

		ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.multi_array_men));
	    spinner1.setAdapter(spinner1ArrayAdapter);
	}

	//Sets the spinner values for the correct gender
	public void onToggleOneClicked(View view) {
	    // Is the toggle on?
	    boolean on = ((ToggleButton) view).isChecked();
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);	
	    if (on) {
	        ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.multi_array_women));
	       spinner.setAdapter(spinner1ArrayAdapter);

	    } else {
	        // Man if off
	       ArrayAdapter<String> spinner1ArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.multi_array_men));
	       spinner.setAdapter(spinner1ArrayAdapter);
	    }
	}

	
	final Context context = this;
	public void startHelp(View view){
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
 
			// set title
			alertDialogBuilder.setTitle("Multi Event Calculator Help");
 
			// set dialog message
			alertDialogBuilder.setMessage("Enter time in seconds (n.b. 1 min = 60 sec, 2 min = 120 sec, 3 min = 180 sec, 4 min = 240 sec, 5 min = 300 sec, 6 min = 360 sec). Enter distance in meters");
			alertDialogBuilder.setCancelable(false);
			alertDialogBuilder.setNegativeButton("Okay",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
						dialog.cancel();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
	}

	public void calculatePoints(View view){
		
		Spinner event_type = (Spinner) findViewById(R.id.spinner1);
		ToggleButton gender_button = (ToggleButton) findViewById(R.id.switch1);
		TextView output_text = (TextView) findViewById(R.id.output_text);
		EditText input = (EditText) findViewById(R.id.editText1);
		decathalon user = new decathalon();
		String gender = "f";
		if(gender_button.getText().equals("Male")){
			gender = "m";
		}
		String event = event_type.getSelectedItem().toString();
		
		double performance = 0;
		if (input.getText().toString().equals("")){
			performance = 0;
		} else{
			performance = 0 + Double.valueOf(input.getText().toString());
		}
		
		if(event.equals("Long Jump") || event.equals("High Jump") ||  event.equals("Pole Vault")){
			performance = performance * 100;
		}
		
		
		int output_number = user.toScore(performance, event, gender);
		
		String output = Integer.toString(output_number);
		
		output_text.setText(output);
		
		
		
		
		
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.preformance_converter, menu);
		return true;
	}
}