package unit.barstutus.com.barstutusproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import unit.barstutus.com.barstatuscore.SystemBarColor;

public class BarStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_status);
        //使用方式
        SystemBarColor.parseColor(this, Color.RED);
    }
}
