package projectframework.example.admin.projectframework.home.ui.activity;

import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import projectframework.example.admin.projectframework.R;
import projectframework.example.admin.projectframework.home.ui.base.BaseActivity;
import projectframework.example.admin.projectframework.home.ui.fragment.MemberFragment;
import projectframework.example.admin.projectframework.home.ui.fragment.NewsFragment;
import projectframework.example.admin.projectframework.home.ui.fragment.ReadFragment;
import projectframework.example.admin.projectframework.home.ui.fragment.TopicFragment;
import projectframework.example.admin.projectframework.home.ui.fragment.VaFragment;

/**
 * 主布局
 * Created by admin on 2017/7/1.
 */

@SuppressWarnings("deprecation")
public class HomeAcivity extends BaseActivity implements View.OnClickListener {

    private FragmentManager fragmentManager;// Fragment管理
    private NewsFragment newsFragment;
    private ReadFragment readFragment;
    private VaFragment vaFragment;
    private TopicFragment topicFragment;
    private MemberFragment memberFragment;

    private ImageView newsIv;
    private ImageView readIv;
    private ImageView vaIv;
    private ImageView topicIv;
    private ImageView memberIv;

    private TextView newsTv;
    private TextView readTv;
    private TextView vaTv;
    private TextView topicTv;
    private TextView memberTv;
    private String tag = "0";
    private boolean isAppExit; // app退出标志位
    public static final int APPEXIT = -1;//

    @Override
    protected void setContentView() {
        setContentView(R.layout.activity_home);
    }

    @Override
    protected void initView() {
        newsIv = (ImageView) findViewById(R.id.id_news_iv);
        readIv = (ImageView) findViewById(R.id.id_read_iv);
        vaIv = (ImageView) findViewById(R.id.id_va_iv);
        topicIv = (ImageView) findViewById(R.id.id_topic_iv);
        memberIv = (ImageView) findViewById(R.id.id_pc_iv);

        newsTv = (TextView) findViewById(R.id.id_news_tv);
        readTv = (TextView) findViewById(R.id.id_read_tv);
        vaTv = (TextView) findViewById(R.id.id_va_tv);
        topicTv = (TextView) findViewById(R.id.id_topic_tv);
        memberTv = (TextView) findViewById(R.id.id_pc_tv);
    }

    @Override
    protected void setListener() {
        findViewById(R.id.id_news_ll).setOnClickListener(this);
        findViewById(R.id.id_read_ll).setOnClickListener(this);
        findViewById(R.id.id_va_ll).setOnClickListener(this);
        findViewById(R.id.id_topic_ll).setOnClickListener(this);
        findViewById(R.id.id_pc_iv).setOnClickListener(this);

        newsIv.setOnClickListener(this);
        readIv.setOnClickListener(this);
        vaIv.setOnClickListener(this);
        topicIv.setOnClickListener(this);
        memberIv.setOnClickListener(this);
    }

    @Override
    protected void loadData() {
        fragmentManager = getSupportFragmentManager();
        setTabSelection(0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_news_ll:
            case R.id.id_news_iv:
                setTabSelection(0);
                break;
            case R.id.id_read_ll:
            case R.id.id_read_iv:
                setTabSelection(1);
                break;
            case R.id.id_va_ll:
            case R.id.id_va_iv:
                setTabSelection(2);
                break;
            case R.id.id_topic_ll:
            case R.id.id_topic_iv:
                setTabSelection(3);
                break;
            case R.id.id_pc_ll:
            case R.id.id_pc_iv:
                setTabSelection(4);
                break;
            default:
                break;
        }
    }

    /**
     * @param index
     */
    private void setTabSelection(int index) {
        // 每次选中之前先清除掉上次的选中状态
        clearSelection();
        // 开启一个Fragment事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // 先隐藏掉所有的Fragment，以防止有多个Fragment显示在界面上的情况
        hideFragments(transaction);
        switch (index) {
            case 0:
                tag = "0";
//                newsIv.setBackgroundResource(R.drawable.biz_navigation_tab_news_selected);
                newsTv.setTextColor(getResources().getColor(R.color.color_eb413d));
                if (newsFragment == null) {
                    // 如果BrandSaleFragment为空，则创建一个并添加到界面上
                    newsFragment = new NewsFragment();
                    // mallFragment.setArguments(bundle);
                    transaction.add(R.id.home_fl, newsFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(newsFragment);
                }
                break;
            case 1:
                tag = "1";
//                readIv.setBackgroundResource(R.drawable.biz_navigation_tab_read_selected);
                readTv.setTextColor(getResources().getColor(R.color.color_eb413d));
                if (readFragment == null) {
                    // 如果BrandSaleFragment为空，则创建一个并添加到界面上
                    readFragment = new ReadFragment();
                    // mallFragment.setArguments(bundle);
                    transaction.add(R.id.home_fl,readFragment);

                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(readFragment);
                }
                break;
            case 2:
                tag = "2";
//                vaIv.setBackgroundResource(R.drawable.biz_navigation_tab_va_selected);
                vaTv.setTextColor(getResources().getColor(R.color.color_eb413d));
                if (vaFragment == null) {
                    // 如果BrandSaleFragment为空，则创建一个并添加到界面上
                    vaFragment = new VaFragment();
                    // mallFragment.setArguments(bundle);
                    transaction.add(R.id.home_fl, vaFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(vaFragment);
                }
                break;
            case 3:
                tag = "3";
//                topicIv.setBackgroundResource(R.drawable.biz_navigation_tab_topic_selected);
                topicTv.setTextColor(getResources().getColor(R.color.color_eb413d));
                if (topicFragment == null) {
                    // 如果BrandSaleFragment为空，则创建一个并添加到界面上
                    topicFragment = new TopicFragment();
                    // mallFragment.setArguments(bundle);
                    transaction.add(R.id.home_fl, topicFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(topicFragment);
                }
                break;
            case 4:
                tag = "4";
//                memberIv.setBackgroundResource(R.drawable.biz_navigation_tab_pc_selected);
                memberTv.setTextColor(getResources().getColor(R.color.color_eb413d));
                if (memberFragment == null) {
                    // 如果BrandSaleFragment为空，则创建一个并添加到界面上
                    memberFragment = new MemberFragment();
                    // mallFragment.setArguments(bundle);
                    transaction.add(R.id.home_fl, memberFragment);
                } else {
                    // 如果MessageFragment不为空，则直接将它显示出来
                    transaction.show(memberFragment);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * 清除掉所有的选中状态。
     */

    private void clearSelection() {
//        newsIv.setBackgroundResource(R.drawable.biz_navigation_tab_news);
//        readIv.setBackgroundResource(R.drawable.biz_navigation_tab_read);
//        topicIv.setBackgroundResource(R.drawable.biz_navigation_tab_topic);
//        vaIv.setBackgroundResource(R.drawable.biz_navigation_tab_va);
//        memberIv.setBackgroundResource(R.drawable.biz_navigation_tab_pc);

        newsTv.setTextColor(getResources().getColor(R.color.color_aaaaaa));
        readTv.setTextColor(getResources().getColor(R.color.color_aaaaaa));
        topicTv.setTextColor(getResources().getColor(R.color.color_aaaaaa));
        vaTv.setTextColor(getResources().getColor(R.color.color_aaaaaa));
        memberTv.setTextColor(getResources().getColor(R.color.color_aaaaaa));
    }

    /**
     * 将所有的Fragment都置为隐藏状态。
     *
     * @param transaction
     *            用于对Fragment执行操作的事务
     */
    private void hideFragments(FragmentTransaction transaction) {
        if (newsFragment != null) {
            transaction.hide(newsFragment);
        }
        if (readFragment != null) {
            transaction.hide(readFragment);
        }
        if (topicFragment != null) {
            transaction.hide(topicFragment);
        }
        if (vaFragment != null) {
            transaction.hide(vaFragment);
        }
        if (memberFragment != null) {
            transaction.hide(memberFragment);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (tag.equals("1") || tag.equals("2") || tag.equals("3")|| tag.equals("4")) {
                setTabSelection(0);
            } else if (tag.equals("0")) {
                appExit();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * 退出app
     */
    public void appExit() {
        if (!isAppExit) {
            isAppExit = true;
            Toast.makeText(this, "再按一次,退出应用", Toast.LENGTH_SHORT).show();
            handler.sendEmptyMessageDelayed(APPEXIT, 2000);
        } else {
            // 2s内再次按back时,isExit= true，执行以下操作，app退出
            System.exit(0);
        }
    }

    Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            switch (msg.what) {
                case APPEXIT:
                    isAppExit = false;
                    break;
                default:
                    break;
            }
        };
    };
}
