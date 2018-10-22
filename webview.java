package org.androidtown.mywebview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private WebView mWebview;
    private WebSettings mWebSettings;
    boolean AppInstalledChecking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //마켓링크
        Intent marketIntent = new Intent(Intent.ACTION_VIEW);
        marketIntent.setData(Uri.parse("market://details?id=com.Chrome"));
        //어플 설치여부 매소드
        AppInstalledChecking = isInstallApp("com.android.chrome");
        if(AppInstalledChecking == true){
            Toast.makeText(getApplicationContext(), "Chrome이 설치된 상태입니다.", Toast.LENGTH_LONG).show();
        }else{
            //마켓으로 크롬설치 유도
            Toast.makeText(getApplicationContext(), "Chrome설치를 위해 마켓으로 이동합니다.", Toast.LENGTH_LONG).show();
            //startActivity(marketIntent);
        }

        //웹뷰 세팅
        mWebview = (WebView)findViewById(R.id.webview); //레이어와 연결
        //mWebview.setWebViewClient(new WebViewClient()); //클릭시 새창 안뜨게
        mWebview.setWebChromeClient(new WebChromeClient());
        mWebSettings = mWebview.getSettings(); //세부 세팅 등록
        mWebSettings.setJavaScriptEnabled(true);//자바스크립트 사용 허용


        mWebview.loadUrl("https://m.naver.com/");

    }
    
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        mWebview.goBack();
    }
    //Chrome 설치여부 확인
    private boolean isInstallApp(String pakageName){
        Intent intent = getPackageManager().getLaunchIntentForPackage(pakageName);
        if(intent==null){
            //미설치
            return false;
        }else{
            //설치
            return true;
        }
        //출처: http://superwony.tistory.com/16 [개발자 키우기]
    }

}
