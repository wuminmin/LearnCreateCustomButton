package com.wuminmin.learncreatecustombutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by wuminmin on 3/4/16.
 */
public class MyButton extends Button {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context,AttributeSet attributeSet){
        super(context,attributeSet);
    }

    public MyButton(Context context,AttributeSet attributeSet,int defStyle){
        super(context,attributeSet,defStyle);
    }
}
