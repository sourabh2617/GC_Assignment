
package com.sourabh.githubissuelist.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.annotations.SerializedName;
public class GitIssue {

    @SerializedName("url")
    private String url;
    @SerializedName("repository_url")
    private String repositoryUrl;
    @SerializedName("labels_url")
    private String labelsUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("id")
    private Integer id;
    @SerializedName("node_id")
    private String nodeId;
    @SerializedName("number")
    private Integer number;
    @SerializedName("title")
    private String title;
    @SerializedName("user")
    private User user;
    @SerializedName("labels")
    private List<Label> labels = null;
    @SerializedName("state")
    private String state;
    @SerializedName("locked")
    private Boolean locked;
    @SerializedName("assignee")
    private Object assignee;
    @SerializedName("assignees")
    private List<Object> assignees = null;
    @SerializedName("milestone")
    private Object milestone;
    @SerializedName("comments")
    private Integer comments;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("closed_at")
    private Object closedAt;
    @SerializedName("author_association")
    private String authorAssociation;
    @SerializedName("body")
    private String body;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("url")
    public String getUrl() {
        return url;
    }

    @SerializedName("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @SerializedName("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    @SerializedName("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @SerializedName("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    @SerializedName("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @SerializedName("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @SerializedName("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @SerializedName("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @SerializedName("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @SerializedName("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @SerializedName("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

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

    @SerializedName("number")
    public Integer getNumber() {
        return number;
    }

    @SerializedName("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @SerializedName("title")
    public String getTitle() {
        return title;
    }

    @SerializedName("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("user")
    public User getUser() {
        return user;
    }

    @SerializedName("user")
    public void setUser(User user) {
        this.user = user;
    }

    @SerializedName("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @SerializedName("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @SerializedName("state")
    public String getState() {
        return state;
    }

    @SerializedName("state")
    public void setState(String state) {
        this.state = state;
    }

    @SerializedName("locked")
    public Boolean getLocked() {
        return locked;
    }

    @SerializedName("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @SerializedName("assignee")
    public Object getAssignee() {
        return assignee;
    }

    @SerializedName("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    @SerializedName("assignees")
    public List<Object> getAssignees() {
        return assignees;
    }

    @SerializedName("assignees")
    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    @SerializedName("milestone")
    public Object getMilestone() {
        return milestone;
    }

    @SerializedName("milestone")
    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    @SerializedName("comments")
    public Integer getComments() {
        return comments;
    }

    @SerializedName("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @SerializedName("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @SerializedName("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @SerializedName("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @SerializedName("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @SerializedName("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @SerializedName("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    @SerializedName("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    @SerializedName("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @SerializedName("body")
    public String getBody() {
        return body;
    }

    @SerializedName("body")
    public void setBody(String body) {
        this.body = body;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
