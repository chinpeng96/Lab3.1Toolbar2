package my.edu.tarc.lab31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import static my.edu.tarc.lab31toolbar.R.id.WebViewAbout;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView webViewAbout = (WebView)findViewById(WebViewAbout);
        webViewAbout.loadUrl("http://bait2073.000webhostapp.com/welcome.html");
    }
}
