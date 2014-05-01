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
		EditText output_distance = (EditText) findViewById(R.id.editText5);
		EditText hours_input = (EditText) findViewById(R.id.editText2);
		EditText minutes_input = (EditText) findViewById(R.id.editText3);
		EditText seconds_input = (EditText) findViewById(R.id.editText4);
		TextView output = (TextView) findViewById(R.id.textView7);
		
		//Define variables used
		double converted_in_distance = 0;
		double converted_out_distance = 0;
		double in_distance = 0;
		double out_distance = 0;
		double total_split_time = 0;
		double total_output_time = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		int out_hours = 0;
		int out_minutes = 0;
		double out_seconds = 0;
		
		//Get Variables while user checking the input
		
		if(input_distance.getText().toString().equals("")){
			in_distance = 0;
		}else{
			in_distance = Double.valueOf(input_distance.getText().toString());
		}
		
		if(output_distance.getText().toString().equals("")){
			out_distance = 0;
		}else{
			out_distance = Double.valueOf(output_distance.getText().toString());
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
		
		if(input_distance_type.getSelectedItem().toString().equals("Miles")){
			converted_in_distance = in_distance;
		} else if(input_distance_type.getSelectedItem().toString().equals("Kilometers")) {
			converted_in_distance = in_distance*0.621371;
		} else if(input_distance_type.getSelectedItem().toString().equals("Marathon")) {
			converted_in_distance = in_distance*26.2;
		} else if(input_distance_type.getSelectedItem().toString().equals("Meters")) {
			converted_in_distance = in_distance*0.000621371;
		} else if(input_distance_type.getSelectedItem().toString().equals("Yards")) {
			converted_in_distance = in_distance*0.000568182;
		} else if(input_distance_type.getSelectedItem().toString().equals("Feet")) {
			converted_in_distance = in_distance*0.000189394;
		} else if(input_distance_type.getSelectedItem().toString().equals("Nautical Miles")) {
			converted_in_distance = in_distance*1.15078;
		}
		
		if(output_distance_type.getSelectedItem().toString().equals("Miles")){
			converted_out_distance = out_distance;
		} else if(output_distance_type.getSelectedItem().toString().equals("Kilometers")) {
			converted_out_distance = out_distance*0.621371;
		} else if(output_distance_type.getSelectedItem().toString().equals("Marathon")) {
			converted_out_distance = out_distance*26.2;
		} else if(output_distance_type.getSelectedItem().toString().equals("Meters")) {
			converted_out_distance = out_distance*0.000621371;
		} else if(output_distance_type.getSelectedItem().toString().equals("Yards")) {
			converted_out_distance = out_distance*0.000568182;
		} else if(output_distance_type.getSelectedItem().toString().equals("Feet")) {
			converted_out_distance = out_distance*0.000189394;
		} else if(output_distance_type.getSelectedItem().toString().equals("Nautical Miles")) {
			converted_out_distance = out_distance*1.15078;
		}
		
		total_split_time = 3600*hours + 60*minutes + seconds;
		
		total_output_time = (converted_out_distance/converted_in_distance) * total_split_time;
		
		out_hours = (int) (total_output_time/3600);
		total_output_time = total_output_time%3600;
		out_minutes = (int) total_output_time/60;
		total_output_time = total_output_time%60;
		out_seconds =  total_output_time;
		
		String output_one = null;
		String output_two = null;
		String output_message = null;
		
		if(out_hours > 0){
		output_one = Integer.toString(out_hours);
		}		
		if(out_minutes >10 && out_hours >0){
			output_two = output_one +":"+Integer.toString(out_minutes);
		} else if(out_hours >0){
			output_two = output_one +":0"+Integer.toString(out_minutes);
		} else{
			output_two = Integer.toString(out_minutes);
		}
		if(out_seconds > 10){
			output_message = output_two +":"+Double.toString(out_seconds);
		} else{
			output_message = output_two +":0"+Double.toString(out_seconds);
		}
		
		output.setText(output_message);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.split_calculator, menu);
		return true;
	}

}
