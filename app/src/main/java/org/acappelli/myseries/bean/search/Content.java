
package org.acappelli.myseries.bean.search;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Content {

    @Expose
    private String type;
    @Expose
    private float score;
    @Expose
    @Valid
    private Show show;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Content withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The score
     */
    public float getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(float score) {
        this.score = score;
    }

    public Content withScore(float score) {
        this.score = score;
        return this;
    }

    /**
     * 
     * @return
     *     The show
     */
    public Show getShow() {
        return show;
    }

    /**
     * 
     * @param show
     *     The show
     */
    public void setShow(Show show) {
        this.show = show;
    }

    public Content withShow(Show show) {
        this.show = show;
        return this;
    }

}
