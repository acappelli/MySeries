
package org.acappelli.myseries.bean.search;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class Search {

    @Expose
    @Valid
    private List<Content> content = new ArrayList<Content>();

    /**
     * 
     * @return
     *     The content
     */
    public List<Content> getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Search withContent(List<Content> content) {
        this.content = content;
        return this;
    }

}
