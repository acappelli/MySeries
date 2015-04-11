
package org.acappelli.myseries.bean.episode;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Images {

    @Expose
    private Screenshot screenshot;

    /**
     * 
     * @return
     *     The screenshot
     */
    public Screenshot getScreenshot() {
        return screenshot;
    }

    /**
     * 
     * @param screenshot
     *     The screenshot
     */
    public void setScreenshot(Screenshot screenshot) {
        this.screenshot = screenshot;
    }

    public Images withScreenshot(Screenshot screenshot) {
        this.screenshot = screenshot;
        return this;
    }

}
