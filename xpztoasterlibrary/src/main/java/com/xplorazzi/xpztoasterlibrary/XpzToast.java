package com.xplorazzi.xpztoasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class XpzToast {

    public void XpzToastText(Context c, String message){

        Toast.makeText(c,stringFromJNI()+ "  "+ message,Toast.LENGTH_SHORT).show();

    }

    public native String stringFromJNI();


}
