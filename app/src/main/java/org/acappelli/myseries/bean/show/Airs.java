
package org.acappelli.myseries.bean.show;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Airs {

    @Expose
    private String day;
    @Expose
    private String time;
    @Expose
    private String timezone;

    /**
     * 
     * @return
     *     The day
     */
    public String getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The day
     */
    public void setDay(String day) {
        this.day = day;
    }

    public Airs withDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * 
     * @return
     *     The time
     */
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(String time) {
        this.time = time;
    }

    public Airs withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 
     * @return
     *     The timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * 
     * @param timezone
     *     The timezone
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Airs withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

}
