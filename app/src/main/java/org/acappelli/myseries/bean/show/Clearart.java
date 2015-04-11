
package org.acappelli.myseries.bean.show;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Clearart {

    @Expose
    private String full;

    /**
     * 
     * @return
     *     The full
     */
    public String getFull() {
        return full;
    }

    /**
     * 
     * @param full
     *     The full
     */
    public void setFull(String full) {
        this.full = full;
    }

    public Clearart withFull(String full) {
        this.full = full;
        return this;
    }

}
