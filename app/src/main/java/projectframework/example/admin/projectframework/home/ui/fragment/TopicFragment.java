package projectframework.example.admin.projectframework.home.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import projectframework.example.admin.projectframework.R;

/**
 * 话题
 * Created by admin on 2017/7/2.
 */

public class TopicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view=inflater.inflate(R.layout.fragment_topic, container, false);
        return view;
    }
}

