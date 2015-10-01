package com.hrules.wavelayout.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.hrules.wavelayout.WaveLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WaveLayout waveLayout = (WaveLayout) findViewById(R.id.waveLayout);
        waveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (waveLayout.getDirection() == WaveLayout.DIRECTION_OUTWARDS) {
                    waveLayout.setStrokeWidth(4f);
                    waveLayout.setDirection(WaveLayout.DIRECTION_INWARDS);

                } else {
                    waveLayout.setStyle(WaveLayout.STYLE_FILL);
                    waveLayout.setDirection(WaveLayout.DIRECTION_OUTWARDS);
                }
            }
        });
    }
}
