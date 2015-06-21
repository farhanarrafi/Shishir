package org.eminencebd.projects.farhan.shishir;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;


public class LoadWebDataActivity extends Activity {

	SQLiteDatabase db;
	DatabaseStorage database;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_load_data);
		
		database = new DatabaseStorage(this);
		database.getWritableDatabase();
		
	}
	
	
}
