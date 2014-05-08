package com.buec327.jbdepg.therunningcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

import com.buec327.jbdepg.therunningcalculator.R;

public class HomePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_page);
	}
	
	public void calculateSplit(View view){
		Intent split = new Intent(this, SplitCalculator.class);
		startActivity(split);
	}
	
	public void convertDistance(View view){
		Intent dist = new Intent(this, DistanceConverter.class);
		startActivity(dist);
	}
	
	public void convertPreformance(View view){
		Intent preformance = new Intent(this, PreformanceConverter.class);
		startActivity(preformance);
	}
	
	final Context context = this;
	public void aboutButton(View view){
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);
 
			// set title
			alertDialogBuilder.setTitle("About the Running Calculator");
 
			// set dialog message
			alertDialogBuilder.setMessage("The Running Calculator was developed in 2014.  The Multi Event calculator uses the most recently published scoring formulas from the IAAF; however, The Running Calculator is not intended to substitue official results.");
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
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_page, menu);
		return true;
	}

}

