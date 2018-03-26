package tw.com.cct.ms2.shrink_tc_app;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import tw.com.cct.ms2.shrink_tc_app.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    /*static {
        System.loadLibrary("native-lib");
    }*/
    Button goto_tod_setting;
    Intent intent_tod_setting_xml;// = new Intent();
    public ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        Student stu = new Student("how", "you");
//        activityMainBinding.setStudent(stu);
        setContentView(R.layout.activity_main);

        goto_tod_setting = (Button) findViewById(R.id.go_to_tod_setting);

        goto_tod_setting.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent_tod_setting_xml = new Intent();
                intent_tod_setting_xml.setClass(MainActivity.this,tod_layout.class);
                startActivity(intent_tod_setting_xml);
        }

        });


    }

}