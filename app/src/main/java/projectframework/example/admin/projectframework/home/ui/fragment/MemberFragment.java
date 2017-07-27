package projectframework.example.admin.projectframework.home.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import projectframework.example.admin.projectframework.R;

/**
 * 我
 * Created by admin on 2017/7/1.
 */

public class MemberFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view=inflater.inflate(R.layout.fragment_pc, container, false);
        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        // TODO Auto-generated method stub
        super.onHiddenChanged(hidden);
        if(hidden){// 不在最前端界面显示

        }else{// 重新显示到最前端中

        }
    }
}
