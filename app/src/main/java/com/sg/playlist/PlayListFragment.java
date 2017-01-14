package com.sg.playlist;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sg.MusicLayer.IMusicSource;
import com.sg.MusicLayer.MusicSource;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayListFragment extends Fragment {

    private IMusicSource mMusicSource = new MusicSource();
    private int mSelectedButton = 0;
    private List<Button> buttons = new ArrayList<Button>();

    public PlayListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.playlist_frame, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.playListLayout);
        LinearLayoutCompat.LayoutParams lp = new LinearLayoutCompat.LayoutParams(LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT);

        for(int i=0; i<mMusicSource.getPlayLists().length; i++){
            Button myButton = new Button(getActivity());
            myButton.setTag(i);
            myButton.setText(mMusicSource.getPlayLists()[i]);
            linearLayout.addView(myButton);
            buttons.add(myButton);
        }

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int x = (int)v.getTag();
                mSelectedButton = x;
                setButtonSelected();
            }
        });

        setButtonSelected();
    }

    private void setButtonSelected(){
        for(Button b: buttons) {
            if ((int)b.getTag() == mSelectedButton){
                b.setBackgroundColor(Color.CYAN);
            }else{
                Drawable d = b.getBackground();
                b.setBackground(d);
            }
        }
    }


}
