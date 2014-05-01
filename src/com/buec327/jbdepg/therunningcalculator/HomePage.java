package com.buec327.jbdepg.therunningcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

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
	
	public void aboutButton(View view){
		//Intent about = new Intent(this, SplitCalculator.class);
		//startActivity(about);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_page, menu);
		return true;
	}

}

