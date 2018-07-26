package com.example.a30daydeclutterchallenge;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.util.Log;

public class CalendarFragment extends Fragment {
    private Fragment fragment;
    private FragmentManager fragmentManager;
    public static int currentDay = 0;
    public static Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
    btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25,
            btn26, btn27, btn28, btn29, btn30;
    public static Button[] arrayOfButtons;

    public CalendarFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragmentManager = getActivity().getSupportFragmentManager();
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);


        btn1 = (Button)view.findViewById(R.id.button1);
        btn2 = (Button)view.findViewById(R.id.button2);
        btn3 = (Button)view.findViewById(R.id.button3);
        btn4 = (Button)view.findViewById(R.id.button4);
        btn5 = (Button)view.findViewById(R.id.button5);
        btn6 = (Button)view.findViewById(R.id.button6);
        btn7 = (Button)view.findViewById(R.id.button7);
        btn8 = (Button)view.findViewById(R.id.button8);
        btn9 = (Button)view.findViewById(R.id.button9);
        btn10 = (Button)view.findViewById(R.id.button10);
        btn11 = (Button)view.findViewById(R.id.button11);
        btn12 = (Button)view.findViewById(R.id.button12);
        btn13 = (Button)view.findViewById(R.id.button13);
        btn14 = (Button)view.findViewById(R.id.button14);
        btn15 = (Button)view.findViewById(R.id.button15);
        btn16 = (Button)view.findViewById(R.id.button16);
        btn17 = (Button)view.findViewById(R.id.button17);
        btn18 = (Button)view.findViewById(R.id.button18);
        btn19 = (Button)view.findViewById(R.id.button19);
        btn20 = (Button)view.findViewById(R.id.button20);
        btn21 = (Button)view.findViewById(R.id.button21);
        btn22 = (Button)view.findViewById(R.id.button22);
        btn23 = (Button)view.findViewById(R.id.button23);
        btn24 = (Button)view.findViewById(R.id.button24);
        btn25 = (Button)view.findViewById(R.id.button25);
        btn26 = (Button)view.findViewById(R.id.button26);
        btn27 = (Button)view.findViewById(R.id.button27);
        btn28 = (Button)view.findViewById(R.id.button28);
        btn29 = (Button)view.findViewById(R.id.button29);
        btn30 = (Button)view.findViewById(R.id.button30);

        arrayOfButtons = new Button[]{
                btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
                btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
                btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30
        };


        for(final Button button: arrayOfButtons){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    currentDay = button.getId();
                    Log.d("My Tag", Integer.toString(currentDay));
                    fragment = new TaskFragment();
                    final FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.main_container, fragment).commit();
                }
            });
        }

        return view;
    }

}

