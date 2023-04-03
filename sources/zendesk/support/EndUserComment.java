package zendesk.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class EndUserComment {
    @SerializedName("uploads")
    private List<String> attachments;
    private String value;

    public List<String> getAttachments() {
        return kj0.m47112c(this.attachments);
    }

    public void setAttachments(List<String> list) {
        this.attachments = list;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
