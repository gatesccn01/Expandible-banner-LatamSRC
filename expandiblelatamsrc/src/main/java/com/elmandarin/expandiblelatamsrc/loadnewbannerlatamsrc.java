package com.elmandarin.expandiblelatamsrc;

import static com.google.android.gms.ads.AdSize.LARGE_BANNER;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/**
 * SOURCE CODE BY LATAMSRC
 *  ECHO EL 29 DE MAYO DE 2024
 *  EL MANDARIN SNIFF
 */
public class loadnewbannerlatamsrc extends LinearLayout {
    public LinearLayout gatesbanner;
    public AdView adView;
    private loadnewbannerlatamsrc (Context context){
        super (context);
        initilize (context);
    }
    public loadnewbannerlatamsrc (Context context, AttributeSet attributeSet){
        super (context);
        initilize (context);

    }
    private void initilize (Context context){
        inflate(context,R.layout.latamsrcbannerads,this);
        gatesbanner = (LinearLayout) findViewById(R.id.latamsrcbannernuevo);
        adView = new AdView(context);
        adView.setAdUnitId(context.getString(R.string.admobexpandible));

        AdSize adSize = LARGE_BANNER;
        adView.setAdSize(adSize);
        // Create an extra parameter that aligns the bottom of the expanded ad to
        // the bottom of the bannerView.
        Bundle extras = new Bundle();
        extras.putString("collapsible", "bottom");

        AdRequest adRequest = new AdRequest.Builder()
                .addNetworkExtrasBundle(AdMobAdapter.class, extras)
                .build();
        gatesbanner.addView(adView);
        adView.loadAd(adRequest);
    }




}
