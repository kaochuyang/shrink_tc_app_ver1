package tw.com.cct.ms2.shrink_tc_app;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class plan_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.plan_setting);
        FloatingActionButton plan_setting_button=(FloatingActionButton)findViewById(R.id.plan_setting_button);

        plan_setting_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//應該要全頁面拿來共用此按鈕
                PopupMenu button_popmenu=new PopupMenu(plan_setting.this,view);
                button_popmenu.getMenuInflater().inflate(R.menu.button_popmenu,button_popmenu.getMenu());


                button_popmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Do something...
                        // YourActivity.this.someFunctionInYourActivity();
//                         switch (item.getItemId()) {
//                        case R.id.item1:
//            ... code ...
//                        return true;
//                        case R.id.item2:
//            ... code ...
//                        return true;
//                        default:
//                        return super.onOptionsItemSelected(item);
//                    }
                        return true;
                    }

                });

                button_popmenu.show();
            }


        });

    }
}
