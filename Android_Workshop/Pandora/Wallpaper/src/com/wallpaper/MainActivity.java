package com.wallpaper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	b1 = (Button)findViewById(R.id.button1);
	b1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent i = new Intent(Intent.ACTION_SET_WALLPAPER);
			startActivity(Intent.createChooser(i, "Set Wallpaper"));
		}
	});

	}	

}
