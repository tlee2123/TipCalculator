package com.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

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
	
	public void calculateTip(View view) {
		Button button = (Button) view;
		String tipPercent = button.getText().toString();
		tipPercent = tipPercent.substring(0, tipPercent.length() - 1);
		double tip = Double.parseDouble(tipPercent);
		
		EditText editText = (EditText) findViewById(R.id.editText_total_amount);
		double sales = Double.parseDouble(editText.getText().toString());
		
        double tipAmount = 0.01 * tip * sales;
        
        TextView tipView = (TextView) findViewById(R.id.textView_tip_amount);
        tipView.setText(String.format("%.2f", tipAmount));
	}
}
