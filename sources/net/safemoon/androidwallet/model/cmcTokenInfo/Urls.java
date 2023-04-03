package net.safemoon.androidwallet.model.cmcTokenInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class Urls implements Serializable {
    private static final long serialVersionUID = 2292957266235252096L;
    @SerializedName("announcement")
    @Expose
    public List<Object> announcement = null;
    @SerializedName("chat")
    @Expose
    public List<String> chat = null;
    @SerializedName("explorer")
    @Expose
    public List<String> explorer = null;
    @SerializedName("message_board")
    @Expose
    public List<String> messageBoard = null;
    @SerializedName("reddit")
    @Expose
    public List<String> reddit = null;
    @SerializedName("source_code")
    @Expose
    public List<String> sourceCode = null;
    @SerializedName("technical_doc")
    @Expose
    public List<String> technicalDoc = null;
    @SerializedName("twitter")
    @Expose
    public List<String> twitter = null;
    @SerializedName("website")
    @Expose
    public List<String> website = null;
}
