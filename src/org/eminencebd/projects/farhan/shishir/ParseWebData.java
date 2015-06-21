package org.eminencebd.projects.farhan.shishir;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import android.os.AsyncTask;
import android.webkit.WebView;

public class ParseWebData extends AsyncTask<String, Integer, String> {

	WebView webview;
	public AsyncReqResp response = null;
	
	public ParseWebData(WebView webview,AsyncReqResp response) {
		super();
		this.webview = webview;
		this.response = response;
	}

	@Override
	protected String doInBackground(String... array) {
		
		Elements table;
		Document doc;
		
		String url = array[0];
		
		try {
			
			doc = Jsoup.connect(url).get();
			table = doc.getElementsByTag("table");
			
			
			
			//return table.html();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	protected void onPostExecute(String result) {
		//super.onPostExecute(result);
		response.sendResult(result);
		
		
		
	}
	
	

}
