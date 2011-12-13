package com.fedorvlasov.lazylist;

import com.fedorvlasov.imageloader.ImageLoader;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class AnotherExampleActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.anotherexample);
        
        ImageView image1 = (ImageView)findViewById(R.id.image1);
        ImageView image2 = (ImageView)findViewById(R.id.image2);
        ImageView image3 = (ImageView)findViewById(R.id.image3);
        
        ImageLoader imageLoader = new ImageLoader(getApplicationContext());
        
        imageLoader.DisplayImage("http://farm8.staticflickr.com/7006/6474896991_1aa2a8f83d_m.jpg", image1);
        imageLoader.DisplayImage("http://farm8.staticflickr.com/7145/6484871999_b71ed4212b_m.jpg", image2);
        imageLoader.DisplayImage("http://farm8.staticflickr.com/7028/6481375371_cb9d8b3692_m.jpg", image3);
        
        
	}
}
