package tw.com.cct.ms2.shrink_tc_app;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by user on 2018/3/2.
 */

public class function_list extends BaseObservable{
    public String LCN;
    public String power_group;
    public String date_group;
    public String version_group;
    public String report_set_group;
    public String password_group;
    public String commnicat_state;
    public String v3_content;
    public String manual_set;

    @Bindable
    public String getLCN()
    {return LCN;}


    //一般日時制設定

    //特別日時至設定

    //紅燈倒數選項

    //鐵路連鎖

    //行人觸動

}


