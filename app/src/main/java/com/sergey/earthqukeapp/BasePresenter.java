package com.sergey.earthqukeapp;

/**
 * Created by sergey on 25.09.16.
 */
public abstract class BasePresenter<T extends UI> implements Presenter<T>{
    protected T ui;

    @Override
    public void attacheUI(T ui) {
        this.ui = ui;
    }

    @Override
    public void detachUI() {
        ui = null;
    }

}
