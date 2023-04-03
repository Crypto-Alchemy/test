package net.safemoon.androidwallet.model.cmcTokenInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class TokenDetail implements Serializable {
    private static final long serialVersionUID = -3211774919578487863L;
    @SerializedName("category")
    @Expose
    public String category;
    @SerializedName("date_added")
    @Expose
    public String dateAdded;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    public Integer f42452id;
    @SerializedName("is_hidden")
    @Expose
    public Integer isHidden;
    @SerializedName("logo")
    @Expose
    public String logo;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("notice")
    @Expose
    public String notice;
    @SerializedName("platform")
    @Expose
    public Platform platform;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("subreddit")
    @Expose
    public String subreddit;
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("tag-groups")
    @Expose
    public List<String> tagGroups = null;
    @SerializedName("tag-names")
    @Expose
    public List<String> tagNames = null;
    @SerializedName("tags")
    @Expose
    public List<String> tags = null;
    @SerializedName("twitter_username")
    @Expose
    public String twitterUsername;
    @SerializedName("urls")
    @Expose
    public Urls urls;
}
