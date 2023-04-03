package zendesk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private final boolean agent = false;

    /* renamed from: id */
    private final Long f46789id = -1L;
    private final String name = "";
    private final Attachment photo = null;
    private final List<String> tags = new ArrayList();
    private final Map<String, String> userFields = new HashMap();

    public Long getId() {
        return this.f46789id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoto() {
        Attachment attachment = this.photo;
        if (attachment == null) {
            return null;
        }
        return attachment.getContentUrl();
    }

    public List<String> getTags() {
        return kj0.m47112c(this.tags);
    }

    public Map<String, String> getUserFields() {
        return kj0.m47113d(this.userFields);
    }

    public boolean isAgent() {
        return this.agent;
    }
}
