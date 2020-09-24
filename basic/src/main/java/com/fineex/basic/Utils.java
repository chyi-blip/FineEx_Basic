package com.fineex.basic;

import android.util.Log;

/**
 * @Author： Chen
 * @Date： 2020/9/24
 * @Desc：
 */
public class Utils {
    private static final String TAG = Utils.class.getSimpleName();

    private static String sData = "";

    public static void printLog(String str){
        Log.i(TAG, "printLog() str=" + str);
    }

    public static void setData(String data){
        sData = data;
    }

    public static String getData(){
        return sData;
    }
}
