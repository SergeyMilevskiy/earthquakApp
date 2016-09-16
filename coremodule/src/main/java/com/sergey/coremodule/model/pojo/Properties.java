package com.sergey.coremodule.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sergey on 06.08.16.
 */
public class Properties {

    @SerializedName("mag")
    @Expose
    private Float mag;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("updated")
    @Expose
    private Long updated;
    @SerializedName("tz")
    @Expose
    private String tz;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("detail")
    @Expose
    private String detail;
    @SerializedName("felt")
    @Expose
    private String felt;
    @SerializedName("cdi")
    @Expose
    private String cdi;
    @SerializedName("mmi")
    @Expose
    private String mmi;
    @SerializedName("alert")
    @Expose
    private String alert;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("tsunami")
    @Expose
    private String tsunami;
    @SerializedName("sig")
    @Expose
    private String sig;
    @SerializedName("net")
    @Expose
    private String net;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("ids")
    @Expose
    private String ids;
    @SerializedName("sources")
    @Expose
    private String sources;
    @SerializedName("types")
    @Expose
    private String types;
    @SerializedName("nst")
    @Expose
    private String nst;
    @SerializedName("dmin")
    @Expose
    private String dmin;
    @SerializedName("rms")
    @Expose
    private String rms;
    @SerializedName("gap")
    @Expose
    private String gap;
    @SerializedName("magType")
    @Expose
    private String magType;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;

    /**
     *
     * @return
     * The mag
     */
    public Float getMag() {
        return mag;
    }

    /**
     *
     * @param mag
     * The mag
     */
    public void setMag(Float mag) {
        this.mag = mag;
    }

    /**
     *
     * @return
     * The place
     */
    public String getPlace() {
        return place;
    }

    /**
     *
     * @param place
     * The place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     *
     * @return
     * The time
     */
    public Long getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The updated
     */
    public Long getUpdated() {
        return updated;
    }

    /**
     *
     * @param updated
     * The updated
     */
    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    /**
     *
     * @return
     * The tz
     */
    public String getTz() {
        return tz;
    }

    /**
     *
     * @param tz
     * The tz
     */
    public void setTz(String tz) {
        this.tz = tz;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     *
     * @param detail
     * The detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     *
     * @return
     * The felt
     */
    public String getFelt() {
        return felt;
    }

    /**
     *
     * @param felt
     * The felt
     */
    public void setFelt(String felt) {
        this.felt = felt;
    }

    /**
     *
     * @return
     * The cdi
     */
    public String getCdi() {
        return cdi;
    }

    /**
     *
     * @param cdi
     * The cdi
     */
    public void setCdi(String cdi) {
        this.cdi = cdi;
    }

    /**
     *
     * @return
     * The mmi
     */
    public String getMmi() {
        return mmi;
    }

    /**
     *
     * @param mmi
     * The mmi
     */
    public void setMmi(String mmi) {
        this.mmi = mmi;
    }

    /**
     *
     * @return
     * The alert
     */
    public String getAlert() {
        return alert;
    }

    /**
     *
     * @param alert
     * The alert
     */
    public void setAlert(String alert) {
        this.alert = alert;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The tsunami
     */
    public String getTsunami() {
        return tsunami;
    }

    /**
     *
     * @param tsunami
     * The tsunami
     */
    public void setTsunami(String tsunami) {
        this.tsunami = tsunami;
    }

    /**
     *
     * @return
     * The sig
     */
    public String getSig() {
        return sig;
    }

    /**
     *
     * @param sig
     * The sig
     */
    public void setSig(String sig) {
        this.sig = sig;
    }

    /**
     *
     * @return
     * The net
     */
    public String getNet() {
        return net;
    }

    /**
     *
     * @param net
     * The net
     */
    public void setNet(String net) {
        this.net = net;
    }

    /**
     *
     * @return
     * The code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     * The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     * The ids
     */
    public String getIds() {
        return ids;
    }

    /**
     *
     * @param ids
     * The ids
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     *
     * @return
     * The sources
     */
    public String getSources() {
        return sources;
    }

    /**
     *
     * @param sources
     * The sources
     */
    public void setSources(String sources) {
        this.sources = sources;
    }

    /**
     *
     * @return
     * The types
     */
    public String getTypes() {
        return types;
    }

    /**
     *
     * @param types
     * The types
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     *
     * @return
     * The nst
     */
    public Object getNst() {
        return nst;
    }

    /**
     *
     * @param nst
     * The nst
     */
    public void setNst(String nst) {
        this.nst = nst;
    }

    /**
     *
     * @return
     * The dmin
     */
    public String getDmin() {
        return dmin;
    }

    /**
     *
     * @param dmin
     * The dmin
     */
    public void setDmin(String dmin) {
        this.dmin = dmin;
    }

    /**
     *
     * @return
     * The rms
     */
    public String getRms() {
        return rms;
    }

    /**
     *
     * @param rms
     * The rms
     */
    public void setRms(String rms) {
        this.rms = rms;
    }

    /**
     *
     * @return
     * The gap
     */
    public String getGap() {
        return gap;
    }

    /**
     *
     * @param gap
     * The gap
     */
    public void setGap(String gap) {
        this.gap = gap;
    }

    /**
     *
     * @return
     * The magType
     */
    public String getMagType() {
        return magType;
    }

    /**
     *
     * @param magType
     * The magType
     */
    public void setMagType(String magType) {
        this.magType = magType;
    }

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
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}