package org.eminencebd.projects.farhan.shishir;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseStorage extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "shishir";
	private final String TABLE_NAME = "information";
	
	private String SQL_CREATE_TABLE_INFORMATION = "CREATE TABLE IF NOT EXISTS "+
								 "`information`" + 
								 "` ( " +
								 "`info_id` INTEGER PRIMARY KEY AUTOINCREMENT"+
								 "`info_type` VARCHAR"+
								 "`info_name` VARCHAR"+
								 "`info_address` TEXT"+
								 " );";
	
	
	public DatabaseStorage(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}


	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(SQL_CREATE_TABLE_INFORMATION);
	}
	

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
