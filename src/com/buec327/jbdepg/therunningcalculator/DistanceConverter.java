package com.buec327.jbdepg.therunningcalculator;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DistanceConverter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance_converter);
	}

	//When Button is pressed
	
	public void convertDistance(View view){
		Spinner original = (Spinner) findViewById(R.id.spinner1);
		Spinner convert_to = (Spinner) findViewById(R.id.spinner2);
		TextView output = (TextView) findViewById(R.id.output);
		EditText enter = (EditText) findViewById(R.id.editText1);
		double entered_distance = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		//Converts the entered distance to miles, than converts miles to desired distance
		if(enter.getText().toString().equals("")){
			entered_distance = 0;
		}else{
			entered_distance = Double.valueOf(enter.getText().toString());
		}
		double distance_in_miles = 0;
		double converted_distance;
		if(original.getSelectedItem().toString().equals("Miles")){
			distance_in_miles = entered_distance;
		} else if(original.getSelectedItem().toString().equals("Kilometers")) {
			distance_in_miles = entered_distance*0.621371;
		} else if(original.getSelectedItem().toString().equals("Marathon")) {
			distance_in_miles = entered_distance*26.2;
		} else if(original.getSelectedItem().toString().equals("Meters")) {
			distance_in_miles = entered_distance*0.000621371;
		} else if(original.getSelectedItem().toString().equals("Yards")) {
			distance_in_miles = entered_distance*0.000568182;
		} else if(original.getSelectedItem().toString().equals("Feet")) {
			distance_in_miles = entered_distance*0.000189394;
		} else if(original.getSelectedItem().toString().equals("Nautical Miles")) {
			distance_in_miles = entered_distance*1.15078;
		}
		if(convert_to.getSelectedItem().toString().equals("Miles")){
			converted_distance = distance_in_miles;
			output.setText(df.format(converted_distance) + " Miles");
		} else if(convert_to.getSelectedItem().toString().equals("Kilometers")) {
			converted_distance = distance_in_miles*1.60934;
			output.setText(df.format(converted_distance) + " Kilometers");
		} else if(convert_to.getSelectedItem().toString().equals("Marathon")) {
			converted_distance = distance_in_miles*0.03816793893;
			output.setText(df.format(converted_distance) + " Marathon");
		} else if(convert_to.getSelectedItem().toString().equals("Meters")) {
			converted_distance = distance_in_miles*1609.34;
			output.setText(df.format(converted_distance) + " Meters");
		} else if(convert_to.getSelectedItem().toString().equals("Yards")) {
			converted_distance = distance_in_miles*1760;
			output.setText(df.format(converted_distance) + " Yards");
		} else if(convert_to.getSelectedItem().toString().equals("Feet")) {
			converted_distance = distance_in_miles*5280;
			output.setText(df.format(converted_distance) + " Feet");
		} else if(convert_to.getSelectedItem().toString().equals("Nautical Miles")) {
			converted_distance = distance_in_miles*0.868976;
			output.setText(df.format(converted_distance) + " Nautical Miles");
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.distance_converter, menu);
		return true;
	}

}
