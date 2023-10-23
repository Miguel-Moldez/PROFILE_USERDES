package com.example.profileuserdes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openFacebookProfile(View view) {
        String facebookUrl = "https://www.facebook.com/allanmiguel.moldez.1/";
        openUrlInBrowser(facebookUrl);
    }
    public void openGithubProfile(View view) {
       String githubUrl = "https://github.com/Miguel-Moldez";
        openUrlInBrowser(githubUrl);
    }
    public void openInstagramProfile(View view) {
        String instagramUrl = "https://www.instagram.com/bad.gal.miggy/";
        openUrlInBrowser(instagramUrl);
    }
    private void openUrlInBrowser(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
