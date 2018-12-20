package com.bennu.customresid

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

/**
 * Created by bennu on 2018/12/20.
 */
class MyView : TextView {

    constructor(context: Context?) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        var arr = context.obtainStyledAttributes(attrs, R.styleable.mytools)
        var num = arr.getInt(R.styleable.mytools_toolnum, 0)
        text = num.toString()
        arr.recycle()
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        var arr = context.obtainStyledAttributes(attrs, R.styleable.mytools)
        var num = arr.getInt(R.styleable.mytools_toolnum, 0)
        text = num.toString()
        arr.recycle()
    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes){
        var arr = context.obtainStyledAttributes(attrs, R.styleable.mytools)
        var num = arr.getInt(R.styleable.mytools_toolnum, 0)
        text = num.toString()
        arr.recycle()
    }
}