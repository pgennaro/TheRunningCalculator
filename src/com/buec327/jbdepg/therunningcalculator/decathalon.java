package com.buec327.jbdepg.therunningcalculator;

import java.util.Hashtable;

public class decathalon {

	double a,b,c;
	Hashtable<String, double[]> male;
	Hashtable<String, double[]> female;


	int toScore(double performance, String event, String gender){
		
		Hashtable<String, double[]> male = new Hashtable<String, double[]>();
		Hashtable<String, double[]> female = new Hashtable<String, double[]>();

		male.put("60m", new double[]{58.01500, 11.50, 1.81});
		male.put("100m", new double[]{25.43470, 18.00, 1.81});
		male.put("400m", new double[]{1.53775, 82.00, 1.81});
		male.put("1000m", new double[]{0.087130, 305.50, 1.85});
		male.put("1500m", new double[]{0.03768, 480.00, 1.85});
		male.put("60m H", new double[]{20.51730, 15.50, 1.92});
		male.put("110m H", new double[]{5.74352, 28.50, 1.92});
		male.put("High Jump", new double[]{0.84650, 75, 1.42});
		male.put("Pole Vault", new double[]{0.27970, 100, 1.35});
		male.put("Long jump", new double[]{0.14354, 220, 1.40});
		male.put("Shot Put", new double[]{51.39000, 1.5, 1.05});
		male.put("Discus", new double[]{12.91000, 4.0, 1.10});
		male.put("Javelin", new double[]{10.14000, 7.0, 1.08});

		female.put("200m", new double[]{4.990870, 42.5, 1.81});
		female.put("800m", new double[]{0.111930, 254.0, 1.880});
		female.put("60m H", new double[]{20.047900, 17.0, 1.835});
		female.put("100m H", new double[]{9.230760, 26.7, 1.835});
		female.put("High Jump", new double[]{1.845230, 75, 1.348});
		female.put("Long Jump", new double[]{0.188807, 210, 1.410});
		female.put("Shot Put", new double[]{56.021100, 1.5, 1.05});
		female.put("Javelin", new double[]{15.980300, 3.8, 1.04});
		
		int score;

		if(gender.equals("m")){
			a = male.get(event)[0];
			b = male.get(event)[1];
			c = male.get(event)[2];
		}else if(gender.equals("f")){
			a = female.get(event)[0];
			b = female.get(event)[1];
			c = female.get(event)[2];
		}else{
			a = 0;
			b = 0;
			c = 0;
		}

		if(event.equals("Long Jump") || event.equals("High Jump") ||  event.equals("Pole Vault") || event.equals("Shot Put") || event.equals("Javelin") || event.equals("Discus") ){
			score = (int) (a*Math.pow((performance-b),c));
		}else{
		score = (int) (a*Math.pow((b-performance),c));
		}
		return score;
	}
	
	double toPerformance(int score, String event, String gender){
		Hashtable<String, double[]> male = new Hashtable<String, double[]>();
		Hashtable<String, double[]> female = new Hashtable<String, double[]>();

		male.put("60m", new double[]{58.01500, 11.50, 1.81});
		male.put("100m", new double[]{25.43470, 18.00, 1.81});
		male.put("400m", new double[]{1.53775, 82.00, 1.81});
		male.put("1000m", new double[]{0.087130, 305.50, 1.85});
		male.put("1500m", new double[]{0.03768, 480.00, 1.85});
		male.put("60m H", new double[]{20.51730, 15.50, 1.92});
		male.put("110m H", new double[]{5.74352, 28.50, 1.92});
		male.put("High Jump", new double[]{0.84650, 75, 1.42});
		male.put("Pole Vault", new double[]{0.27970, 100, 1.35});
		male.put("Long jump", new double[]{0.14354, 220, 1.81});
		male.put("Shot Put", new double[]{51.39000, 1.5, 1.05});
		male.put("Discus", new double[]{12.91000, 4.0, 1.10});
		male.put("Javelin", new double[]{10.14000, 7.0, 1.08});

		female.put("200m", new double[]{4.990870, 42.5, 1.81});
		female.put("800m", new double[]{0.111930, 254.0, 1.880});
		female.put("60m H", new double[]{20.047900, 17.0, 1.835});
		female.put("100m H", new double[]{9.230760, 26.7, 1.835});
		female.put("High Jump", new double[]{1.845230, 75, 1.348});
		female.put("Long Jump", new double[]{0.188807, 210, 1.410});
		female.put("Shot Put", new double[]{56.021100, 1.5, 1.05});
		female.put("Javelin", new double[]{15.980300, 3.8, 1.04});
		
		double performance;

		if(gender.equals("m")){
			a = male.get(event)[0];
			b = male.get(event)[1];
			c = male.get(event)[2];
		}else if(gender.equals("f")){
			a = female.get(event)[0];
			b = female.get(event)[1];
			c = female.get(event)[2];
		}else{
			a = 0;
			b = 0;
			c = 0;
		}

		performance = b-Math.pow((score/a),(1/c));
		return performance;
	}

}
