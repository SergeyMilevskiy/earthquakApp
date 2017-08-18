package com.sergey.earthqukeapp;

/**
 * Created by smilevkiy on 18.08.17.
 */

public interface Presenter<T extends UI> {

    void attacheUI(T ui);

    void detachUI();

}
