package com.example.a30daydeclutterchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.CheckBox;


public class TaskFragment extends Fragment {
    public int currentDay = CalendarFragment.currentDay;
    private CheckBox ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10,
            ch11, ch12, ch13, ch14, ch15, ch16, ch19, ch20,
            ch21, ch22, ch23, ch24, ch25, ch26, ch27, ch28, ch29, ch30,
            ch31, ch32, ch33, ch34, ch37, ch38, ch39, ch40,
            ch41, ch42, ch43, ch44, ch45, ch46, ch47, ch48, ch49, ch50,
            ch51, ch52, ch55, ch56, ch57, ch58, ch59, ch60,
            ch61, ch62, ch63, ch64, ch65, ch66, ch67, ch68, ch69, ch70,
             ch73, ch74, ch75, ch76, ch77, ch78, ch79, ch80,
            ch81, ch82, ch83, ch84, ch85, ch86, ch87, ch88, ch89, ch90;

    public TaskFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //AlertDialog Creation
        final AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(getActivity()).create();
        alertDialog.setTitle("Congratulations!");
        alertDialog.setMessage("You have completed today's challenge.");

        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog.dismiss();
                    }
                });


        //Tasks
        View defaultview = inflater.inflate(R.layout.fragment_calendar, container, false);
        View view1 = inflater.inflate(R.layout.task1, container, false);
        View view2 = inflater.inflate(R.layout.task2, container, false);
        View view3 = inflater.inflate(R.layout.task3, container, false);
        View view4 = inflater.inflate(R.layout.task4, container, false);
        View view5 = inflater.inflate(R.layout.task5, container, false);
        View view6 = inflater.inflate(R.layout.task6, container, false);
        View view7 = inflater.inflate(R.layout.task7, container, false);
        View view8 = inflater.inflate(R.layout.task8, container, false);
        View view9 = inflater.inflate(R.layout.task9, container, false);
        View view10 = inflater.inflate(R.layout.task10, container, false);
        View view11 = inflater.inflate(R.layout.task11, container, false);
        View view12 = inflater.inflate(R.layout.task12, container, false);
        View view13 = inflater.inflate(R.layout.task13, container, false);
        View view14 = inflater.inflate(R.layout.task14, container, false);
        View view15 = inflater.inflate(R.layout.task15, container, false);
        View view16 = inflater.inflate(R.layout.task16, container, false);
        View view17 = inflater.inflate(R.layout.task17, container, false);
        View view18 = inflater.inflate(R.layout.task18, container, false);
        View view19 = inflater.inflate(R.layout.task19, container, false);
        View view20 = inflater.inflate(R.layout.task20, container, false);
        View view21 = inflater.inflate(R.layout.task21, container, false);
        View view22  = inflater.inflate(R.layout.task22, container, false);
        View view23 = inflater.inflate(R.layout.task23, container, false);
        View view24  = inflater.inflate(R.layout.task24, container, false);
        View view25 = inflater.inflate(R.layout.task25, container, false);
        View view26  = inflater.inflate(R.layout.task26, container, false);
        View view27 = inflater.inflate(R.layout.task27, container, false);
        View view28  = inflater.inflate(R.layout.task28, container, false);
        View view29 = inflater.inflate(R.layout.task29, container, false);
        View view30  = inflater.inflate(R.layout.task30, container, false);

        //Checkboxes
        ch1 = (CheckBox) view1.findViewById(R.id.checkbox1);
        ch2 = (CheckBox) view1.findViewById(R.id.checkbox2);
        ch3 = (CheckBox) view1.findViewById(R.id.checkbox3);
        ch4 = (CheckBox) view2.findViewById(R.id.checkbox4);
        ch5 = (CheckBox) view2.findViewById(R.id.checkbox5);
        ch6 = (CheckBox) view2.findViewById(R.id.checkbox6);
        ch7 = (CheckBox) view3.findViewById(R.id.checkbox7);
        ch8 = (CheckBox) view3.findViewById(R.id.checkbox8);
        ch9 = (CheckBox) view3.findViewById(R.id.checkbox9);
        ch10 = (CheckBox) view4.findViewById(R.id.checkbox10);
        ch11 = (CheckBox) view4.findViewById(R.id.checkbox11);
        ch12 = (CheckBox) view4.findViewById(R.id.checkbox12);
        ch13 = (CheckBox) view5.findViewById(R.id.checkbox13);
        ch14 = (CheckBox) view5.findViewById(R.id.checkbox14);
        ch15 = (CheckBox) view5.findViewById(R.id.checkbox15);
        ch16 = (CheckBox) view6.findViewById(R.id.checkbox16);
        //ch17 = (CheckBox) view6.findViewById(R.id.checkbox17);
        //ch18 = (CheckBox) view6.findViewById(R.id.checkbox18);
        ch19 = (CheckBox) view7.findViewById(R.id.checkbox19);
        ch20 = (CheckBox) view7.findViewById(R.id.checkbox20);
        ch21 = (CheckBox) view7.findViewById(R.id.checkbox21);
        ch22 = (CheckBox) view8.findViewById(R.id.checkbox22);
        ch23 = (CheckBox) view8.findViewById(R.id.checkbox23);
        ch24 = (CheckBox) view8.findViewById(R.id.checkbox24);
        ch25 = (CheckBox) view9.findViewById(R.id.checkbox25);
        ch26 = (CheckBox) view9.findViewById(R.id.checkbox26);
        ch27 = (CheckBox) view9.findViewById(R.id.checkbox27);
        ch28 = (CheckBox) view10.findViewById(R.id.checkbox28);
        ch29 = (CheckBox) view10.findViewById(R.id.checkbox29);
        ch30 = (CheckBox) view10.findViewById(R.id.checkbox30);
        ch31 = (CheckBox) view11.findViewById(R.id.checkbox31);
        ch32 = (CheckBox) view11.findViewById(R.id.checkbox32);
        ch33 = (CheckBox) view11.findViewById(R.id.checkbox33);
        ch34 = (CheckBox) view12.findViewById(R.id.checkbox34);
        //ch35 = (CheckBox) view12.findViewById(R.id.checkbox35);
        //ch36 = (CheckBox) view12.findViewById(R.id.checkbox36);
        ch37 = (CheckBox) view13.findViewById(R.id.checkbox37);
        ch38 = (CheckBox) view13.findViewById(R.id.checkbox38);
        ch39 = (CheckBox) view13.findViewById(R.id.checkbox39);
        ch40 = (CheckBox) view14.findViewById(R.id.checkbox40);
        ch41 = (CheckBox) view14.findViewById(R.id.checkbox41);
        ch42 = (CheckBox) view14.findViewById(R.id.checkbox42);
        ch43 = (CheckBox) view15.findViewById(R.id.checkbox43);
        ch44 = (CheckBox) view15.findViewById(R.id.checkbox44);
        ch45 = (CheckBox) view15.findViewById(R.id.checkbox45);
        ch46 = (CheckBox) view16.findViewById(R.id.checkbox46);
        ch47 = (CheckBox) view16.findViewById(R.id.checkbox47);
        ch48 = (CheckBox) view16.findViewById(R.id.checkbox48);
        ch49 = (CheckBox) view17.findViewById(R.id.checkbox49);
        ch50 = (CheckBox) view17.findViewById(R.id.checkbox50);
        ch51 = (CheckBox) view17.findViewById(R.id.checkbox51);
        ch52 = (CheckBox) view18.findViewById(R.id.checkbox52);
        //ch53 = (CheckBox) view18.findViewById(R.id.checkbox53);
        //ch54 = (CheckBox) view18.findViewById(R.id.checkbox54);
        ch55 = (CheckBox) view19.findViewById(R.id.checkbox55);
        ch56 = (CheckBox) view19.findViewById(R.id.checkbox56);
        ch57 = (CheckBox) view19.findViewById(R.id.checkbox57);
        ch58 = (CheckBox) view20.findViewById(R.id.checkbox58);
        ch59 = (CheckBox) view20.findViewById(R.id.checkbox59);
        ch60 = (CheckBox) view20.findViewById(R.id.checkbox60);
        ch61 = (CheckBox) view21.findViewById(R.id.checkbox61);
        ch62 = (CheckBox) view21.findViewById(R.id.checkbox62);
        ch63 = (CheckBox) view21.findViewById(R.id.checkbox63);
        ch64 = (CheckBox) view22.findViewById(R.id.checkbox64);
        ch65 = (CheckBox) view22.findViewById(R.id.checkbox65);
        ch66 = (CheckBox) view22.findViewById(R.id.checkbox66);
        ch67 = (CheckBox) view23.findViewById(R.id.checkbox67);
        ch68 = (CheckBox) view23.findViewById(R.id.checkbox68);
        ch69 = (CheckBox) view23.findViewById(R.id.checkbox69);
        ch70 = (CheckBox) view24.findViewById(R.id.checkbox70);
        //ch71 = (CheckBox) view24.findViewById(R.id.checkbox71);
        //ch72 = (CheckBox) view24.findViewById(R.id.checkbox72);
        ch73 = (CheckBox) view25.findViewById(R.id.checkbox73);
        ch74 = (CheckBox) view25.findViewById(R.id.checkbox74);
        ch75 = (CheckBox) view25.findViewById(R.id.checkbox75);
        ch76 = (CheckBox) view26.findViewById(R.id.checkbox76);
        ch77 = (CheckBox) view26.findViewById(R.id.checkbox77);
        ch78 = (CheckBox) view26.findViewById(R.id.checkbox78);
        ch79 = (CheckBox) view27.findViewById(R.id.checkbox79);
        ch80 = (CheckBox) view27.findViewById(R.id.checkbox80);
        ch81 = (CheckBox) view27.findViewById(R.id.checkbox81);
        ch82 = (CheckBox) view28.findViewById(R.id.checkbox82);
        ch83 = (CheckBox) view28.findViewById(R.id.checkbox83);
        ch84 = (CheckBox) view28.findViewById(R.id.checkbox84);
        ch85 = (CheckBox) view29.findViewById(R.id.checkbox85);
        ch86 = (CheckBox) view29.findViewById(R.id.checkbox86);
        ch87 = (CheckBox) view29.findViewById(R.id.checkbox87);
        ch88 = (CheckBox) view30.findViewById(R.id.checkbox88);
        ch89 = (CheckBox) view30.findViewById(R.id.checkbox89);
        ch90 = (CheckBox) view30.findViewById(R.id.checkbox90);


        CheckBox[] arrayOfCheckmarks = new CheckBox[]{
                ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10,
                ch11, ch12, ch13, ch14, ch15, ch16, ch19, ch20,
                ch21, ch22, ch23, ch24, ch25, ch26, ch27, ch28, ch29, ch30,
                ch31, ch32, ch33, ch34, ch37, ch38, ch39, ch40,
                ch41, ch42, ch43, ch44, ch45, ch46, ch47, ch48, ch49, ch50,
                ch51, ch52, ch55, ch56, ch57, ch58, ch59, ch60,
                ch61, ch62, ch63, ch64, ch65, ch66, ch67, ch68, ch69, ch70,
                ch73, ch74, ch75, ch76, ch77, ch78, ch79, ch80,
                ch81, ch82, ch83, ch84, ch85, ch86, ch87, ch88, ch89, ch90,

        };


        for (final CheckBox checkBox : arrayOfCheckmarks) {
            checkBox.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (ch1.isChecked() && ch2.isChecked() && ch3.isChecked()) {
                        alertDialog.show();
                        //CalendarFragment.btn1.setBackgroundResource(R.drawable.button_checked); //change the numbered button to checked
                        //CalendarFragment.btn2.setEnabled(true); //let the next button be open/new task
                    }
                }
            });
        }


        //30 Buttons - Different Categories
        switch (currentDay) {
            case R.id.button1:
               return view1;
            case R.id.button2:
                return view2;
            case R.id.button3:
                return view3;
            case R.id.button4:
                return view4;
            case R.id.button5:
                return view5;
            case R.id.button6:
                return view6;
            case R.id.button7:
                return view7;
            case R.id.button8:
                return view8;
            case R.id.button9:
                return view9;
            case R.id.button10:
                return view10;
            case R.id.button11:
                return view11;
            case R.id.button12:
                return view12;
            case R.id.button13:
                return view13;
            case R.id.button14:
                return view14;
            case R.id.button15:
                return view15;
            case R.id.button16:
                return view16;
            case R.id.button17:
                return view17;
            case R.id.button18:
                return view18;
            case R.id.button19:
                return view19;
            case R.id.button20:
                return view20;
            case R.id.button21:
                return view21;
            case R.id.button22:
                return view22;
            case R.id.button23:
                return view23;
            case R.id.button24:
                return view24;
            case R.id.button25:
                return view25;
            case R.id.button26:
                return view26;
            case R.id.button27:
                return view27;
            case R.id.button28:
                return view28;
            case R.id.button29:
                return view29;
            case R.id.button30:
                return view30;
            default:
                return view3;
        }
    }
}

