package org.eminencebd.projects.farhan.shishir;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;


@SuppressLint("SetJavaScriptEnabled") public class MainActivity extends Activity implements AsyncReqResp {
	
	ParseWebData parsedata;
	private WebView webView_Shishir;
	
	private String data = "<h1>NO DATA FOUND</h1>", ret="";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        webView_Shishir = (WebView) findViewById(R.id.webView_Shishir);
        
        String data = "<h1>NO DATA FOUND</h1>";
        
        parsedata = new ParseWebData(webView_Shishir, this);
        
        try {
//        	ret = parsedata.execute("http://shishir.site11.com/data/bloodbank.html").get();
        	parsedata.execute("http://shishir.site11.com/data/hospitals.html");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        
		//webView_Shishir.loadData(ret, "text/html", "utf-8");
    }
    

	@Override
	public void sendResult(String result) {
		data = result;
		Toast.makeText(getApplicationContext(), "RESULT", Toast.LENGTH_SHORT).show();
		
		webView_Shishir.getSettings().setJavaScriptEnabled(true);
		webView_Shishir.loadData(data, "text/html", "utf-8");
		Toast.makeText(getApplicationContext(), "DISPLAY", Toast.LENGTH_SHORT).show();
	}
}
