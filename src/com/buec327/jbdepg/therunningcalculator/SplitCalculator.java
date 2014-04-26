package com.buec327.jbdepg.therunningcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SplitCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_split_calculator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.split_calculator, menu);
		return true;
	}

}
