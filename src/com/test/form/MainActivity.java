package com.test.form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnSubmit;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnSubmit = (Button) this.findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            public void onClick(View sourceView) {
                Intent submitIntent = new Intent();
                submitIntent.setClass(MainActivity.this, FormSubmitted.class);
                startActivity(submitIntent);
                MainActivity.this.finish();
            }
        });
    }
}
