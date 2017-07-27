package projectframework.example.admin.projectframework.home.ui.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

/**
 * activity基类
 * Created by admin on 2017/7/1.
 */

public class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView();
        initView();
        setListener();
        loadData();
    }

    protected void setContentView() {
    }

    protected void initView() {
    }

    protected void setListener() {
    }

    protected void loadData() {
    }

}
