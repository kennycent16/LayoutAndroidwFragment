package com.example.telkomnewuiwfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private List<com.example.telkomnewui.Item> itemList = new ArrayList<>();
    private com.example.telkomnewuiwfragment.RecycleAdapter adapter;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        RecyclerViewIndicator tab_layout =view.findViewById(R.id.tab_layout);
        RecyclerView recycleview1 = view.findViewById(R.id.recycleview1);


        adapter=new RecycleAdapter(itemList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recycleview1.setLayoutManager(mLayoutManager);
        recycleview1.setItemAnimator(new DefaultItemAnimator());
        recycleview1.setAdapter(adapter);
        tab_layout.setRecyclerView(recycleview1);
        dataList();
        return view;
    }

    private void dataList()
    {
        com.example.telkomnewui.Item item = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","50 GB", "Rp 150.000","Rp 199.000","Combo Extra Internet OMG!","30 Hari");
        itemList.add(item);

        com.example.telkomnewui.Item item2 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","17 GB", "Rp 150.000","Rp 103.000","Internet OMG!","30 Hari");
        itemList.add(item2);

        com.example.telkomnewui.Item item3 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","18 GB", "Rp 109.000","Rp 106.000","Internet PROMO Asia Australia","30 Hari");
        itemList.add(item3);

        com.example.telkomnewui.Item item4 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 3 hari","20 GB", "Rp 150.000","Rp 199.000","Paket Bundling CloudMAX","30 Hari");
        itemList.add(item4);

        com.example.telkomnewui.Item item5 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","5 GB", "Rp 60.000","Rp 51.000","Paket Internet","30 Hari");
        itemList.add(item5);

        com.example.telkomnewui.Item item6 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","7 GB", "Rp 80.000","Rp 71.000","MAXstream","30 Hari");
        itemList.add(item6);

        com.example.telkomnewui.Item item7 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","10 GB", "Rp 95.000","Rp 81.000","Combo MAXstream","30 Hari");
        itemList.add(item7);

        com.example.telkomnewui.Item item8 = new com.example.telkomnewui.Item(R.drawable.itemimage,"Promo - Berakhir dalam 1 hari","13 GB", "Rp 103.000","Rp 92.000","Combo Mantap Internet OMG!","30 Hari");
        itemList.add(item8);
    }
}
