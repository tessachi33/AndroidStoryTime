package com.epicodus.storytime.model;

/**
 * Created by Tessa on 10/29/15.
 */
public class Choice {

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    private String mText;
    private int mNextPage;

}
