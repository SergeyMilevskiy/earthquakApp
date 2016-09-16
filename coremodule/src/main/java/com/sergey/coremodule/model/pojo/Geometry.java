package com.sergey.coremodule.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by sergey on 06.08.16.
 */
public class Geometry {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("coordinates")
    @Expose
    private float coordinates [] ;

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The coordinates
     */
    public float[] getCoordinates() {
        return coordinates;
    }

    /**
     *
     * @param coordinates
     * The coordinates
     */
    public void setCoordinates(float [] coordinates) {
        this.coordinates = coordinates;
    }

    public float getLatitude(){
        return getCoordinates()[0];
    }

    public float getLongtitude(){
        return getCoordinates()[1];
    }

}