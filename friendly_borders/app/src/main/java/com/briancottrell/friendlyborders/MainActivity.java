package com.briancottrell.friendlyborders;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.gotoassist.concierge.Concierge;
import com.gotoassist.concierge.ConciergeError;
import com.gotoassist.concierge.SessionType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        if (connectivityManager.getActiveNetworkInfo() == null) {
            myWebView.setVisibility(View.GONE);
            RelativeLayout offlineLayout = (RelativeLayout) findViewById(R.id.offline_map);
            ImageView logo = (ImageView) findViewById(R.id.logo);
            offlineLayout.setVisibility(View.VISIBLE);
            logo.setVisibility(View.GONE);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            Button usa = (Button)findViewById(R.id.usa);
            assert usa != null;
            usa.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("United States of America")
                            .setMessage("This country is LGBTIQ friendly\n\nEmergency: 911")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
            Button canada = (Button)findViewById(R.id.canada);
            assert canada != null;
            canada.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Canada")
                            .setMessage("This country is LGBTIQ friendly\n\nEmergency: 911\n\nUS Embassy: 490 Sussex Dr, Ottawa, ON K1N 1G8\n\nNo visa required")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
            Button mexico = (Button)findViewById(R.id.mexico);
            assert mexico != null;
            mexico.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Mexico")
                            .setMessage("This country is LGBTIQ friendly\n\nEmergency: 911\n\nUS Embassy: Paseo de la Reforma 305\n"+"Colonia Cuauhtemoc\n"+"06500 Mexico, D.F.\n\nNo visa required")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
            Button brazil = (Button)findViewById(R.id.brazil);
            assert brazil != null;
            brazil.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Brazil")
                            .setMessage("This country is LGBTIQ friendly\n\nEmergency\nPolice: 190\nAmbulance: 192\nFire: 193\n\nUS Embassy:\nR. Gonçalves Maia, 163 - Boa Vista, Recife - PE, 50070-060, Brazil\n\nVisa required prior to arrival")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
            Button russia = (Button)findViewById(R.id.russia);
            assert russia != null;
            russia.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Russia")
                            .setMessage("This country has freedom of expression restrictions\n\nEmergency: 112\n\nUS Embassy:\nBolshoy Devyatinskiy pereulok, 8, Moscow, Russia, 121099\n\nVisa required prior to arrival")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
            Button china = (Button)findViewById(R.id.china);
            assert china != null;
            china.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("China")
                            .setMessage("This country is LGBTIQ friendly\n\nEmergency\nPolice: 110\nAmbulance: 120\nFire: 119\n\nUS Embassy: No. 55 An Jia Lou Lu 100600, Beijing China\n\nVisa required prior to arrival")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
            Button india = (Button)findViewById(R.id.india);
            assert india != null;
            india.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("India")
                            .setMessage("This country has laws agains homosexuality\n\nEmergency\nPolice: 100\nAmbulance: 102\nFire: 101\n\nUS Embassy: Shantipath, Chanakyapuri, New Delhi, Delhi 110021, India\n\nVisa issued on arrival")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            });
            Button saudi = (Button)findViewById(R.id.saudi);
            assert saudi != null;
            saudi.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Saudi Arabia")
                            .setMessage("In this country homosexuality is punishable by death\n\nEmergency: 112 or 911\n\nUS Embassy: P.O. Box 94309\n"+"Riyadh 11693\n"+"Saudi Arabia\n\nVisa required prior to arrival")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }
            });
            Button australia = (Button)findViewById(R.id.australia);
            assert australia != null;
            australia.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Australia")
                            .setMessage("This country is LGBTIQ friendly\n\nEmergency: 000\n\nUS Embassy: Moonah Pl, Yarralumla ACT 2600\n\nElectronic clearance or eVisa")
                            .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.btn_star_big_on)
                            .show();
                }
            });
        } else {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.getSettings().setDomStorageEnabled(true);
            myWebView.loadUrl("https://briancottrell.github.io/friendly-borders-mobile/");

            myWebView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return false;
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_video:
                try {
                    //Set your Application Key from the Concierge Dashboard
                    Concierge.setApplicationKey("<concierge application key>");

                    //NOTE: If the name is not set, customer name will be "Anonymous"
                    Concierge.setCustomerName("Friendly Borders");

                    //Start Session will open the Concierge UI and create a session
                    Concierge.startSession(SessionType.video);
                } catch (ConciergeError conciergeError) {
                    conciergeError.printStackTrace();
                }
                return true;
            case R.id.action_audio:
                try {
                    //Set your Application Key from the Concierge Dashboard
                    Concierge.setApplicationKey("<concierge application key>");

                    //NOTE: If the name is not set, customer name will be "Anonymous"
                    Concierge.setCustomerName("Friendly Borders");

                    //Start Session will open the Concierge UI and create a session
                    Concierge.startSession(SessionType.audio);
                } catch (ConciergeError conciergeError) {
                    conciergeError.printStackTrace();
                }
                return true;
            case R.id.action_text:
                try {
                    //Set your Application Key from the Concierge Dashboard
                    Concierge.setApplicationKey("<concierge application key>");

                    //NOTE: If the name is not set, customer name will be "Anonymous"
                    Concierge.setCustomerName("Friendly Borders");

                    //Start Session will open the Concierge UI and create a session
                    Concierge.startSession(SessionType.chat);
                } catch (ConciergeError conciergeError) {
                    conciergeError.printStackTrace();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
