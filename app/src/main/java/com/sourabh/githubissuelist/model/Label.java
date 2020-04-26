
package com.sourabh.githubissuelist.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;



public class Label {

    @SerializedName("id")
    private Integer id;
    @SerializedName("node_id")
    private String nodeId;
    @SerializedName("url")
    private String url;
    @SerializedName("name")
    private String name;
    @SerializedName("color")
    private String color;
    @SerializedName("default")
    private Boolean _default;
    @SerializedName("description")
    private String description;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("id")
    public Integer getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @SerializedName("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @SerializedName("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @SerializedName("url")
    public String getUrl() {
        return url;
    }

    @SerializedName("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("color")
    public String getColor() {
        return color;
    }

    @SerializedName("color")
    public void setColor(String color) {
        this.color = color;
    }

    @SerializedName("default")
    public Boolean getDefault() {
        return _default;
    }

    @SerializedName("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @SerializedName("description")
    public String getDescription() {
        return description;
    }

    @SerializedName("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
