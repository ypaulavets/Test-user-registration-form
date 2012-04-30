/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 *
 * @author yahor
 */
public class FormSubmitted extends Activity {

    Button btnReturn;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        // ToDo add your GUI initialization code here
        setContentView(R.layout.submitted);

        btnReturn = (Button) this.findViewById(R.id.btnReturnToMain);
        btnReturn.setOnClickListener(new OnClickListener() {

            public void onClick(View sourceView) {
                Intent submitIntent = new Intent();
                submitIntent.setClass(FormSubmitted.this, MainActivity.class);
                startActivity(submitIntent);
                FormSubmitted.this.finish();
            }
        });

    }
}
