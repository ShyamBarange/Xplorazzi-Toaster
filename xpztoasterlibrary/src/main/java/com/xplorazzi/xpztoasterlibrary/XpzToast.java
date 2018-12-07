package com.xplorazzi.xpztoasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class XpzToast {

    public static void XpzToastText(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }


}
