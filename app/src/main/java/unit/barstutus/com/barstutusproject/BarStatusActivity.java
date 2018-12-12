package unit.barstutus.com.barstutusproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import unit.barstutus.com.barstatuscore.SystemBarColor;
import unit.barstutus.com.barstatuscore.utils.SystemBarTintManager;

public class BarStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_status);
        //使用方式
        SystemBarColor.parseColor(this,R.color.colorPrimaryDark);
    }
}
