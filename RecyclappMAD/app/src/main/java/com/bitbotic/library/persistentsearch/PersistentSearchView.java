package com.bitbotic.library.persistentsearch;

import android.content.Context;
import android.support.v7.widget.SearchView;
import android.util.AttributeSet;

/**
 * Created by David on 21/10/2015.
 */
public class PersistentSearchView extends SearchView {

    private static final String LOG_TAG = "PersistentSearchView";

//    mSearchHintIcon

    public PersistentSearchView(Context context) {
        super(context);
    }

    public PersistentSearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
