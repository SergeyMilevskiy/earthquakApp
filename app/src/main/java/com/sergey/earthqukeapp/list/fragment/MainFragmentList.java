package com.sergey.earthqukeapp.list.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sergey.earthqukeapp.R;
import com.sergey.earthqukeapp.list.FragmentListAdapter;
import com.sergey.earthqukeapp.list.presenter.MainFragmentListPresenter;

/**
 * Created by smilevkiy on 17.08.17.
 */

public class MainFragmentList extends Fragment implements MainFragmentListPresenter.MainFragmentListUI{



    private FragmentListAdapter fragmentListAdapter;

    public static MainFragmentList newInstance() {
        return new MainFragmentList();
    }


    @Override
    public void onResume() {
        super.onResume();



    }

    @Override
    public void onPause() {
        super.onPause();


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_list, container, false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycleView);
        recyclerView.setAdapter(fragmentListAdapter = new FragmentListAdapter(getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));

        return view;
    }
}
