package com.example.telkomnewuiwfragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

import net.cachapa.expandablelayout.ExpandableLayout;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TopFragment extends Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RelativeLayout rl1,rl2;
    private CardView cv1;
    private ToggleButton btn_isi,btn_kirim;
    private TextView tv_pulsa,tv_money,texthadiah,tv_paketpulsa;
    private RelativeLayout.LayoutParams params,params2;
    public TopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopFragment newInstance(String param1, String param2) {
        TopFragment fragment = new TopFragment();
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

        View view = inflater.inflate(R.layout.fragment_top, container, false);
        tv_pulsa = view.findViewById(R.id.tv_pulsa);
        tv_money = view.findViewById(R.id.tv_money);
        btn_kirim=view.findViewById(R.id.btn_kirim);
        cv1 = view.findViewById(R.id.cv1);
        rl1 = view.findViewById(R.id.rl1);
        rl2 = view.findViewById(R.id.rl2);
        params = (RelativeLayout.LayoutParams) rl1.getLayoutParams();
        params2= (RelativeLayout.LayoutParams) rl2.getLayoutParams();
        btn_isi = view.findViewById(R.id.btn_isi);

        btn_isi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(btn_isi.isChecked())
               {
                   params.width= 1000;
                   rl1.setLayoutParams(params);
                   rl2.setVisibility(View.INVISIBLE);
               }
               else
               {
                   params.width= 400;
                   rl1.setLayoutParams(params);
                   rl2.setVisibility(View.VISIBLE);
               }
            }
        });

        btn_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn_kirim.isChecked())
                {
                    params2.width= 1000;
                    rl2.setLayoutParams(params2);
                    rl1.setVisibility(View.INVISIBLE);
                }
                else
                {
                    params2.width= 400;
                    rl2.setLayoutParams(params2);
                    rl1.setVisibility(View.VISIBLE);
                }
            }
        });

        return view;

    }

}



