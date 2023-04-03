package zendesk.support;

import java.util.Collections;
import java.util.List;

class ContactUsSettings {
    private static ContactUsSettings DEFAULT = new ContactUsSettings(Collections.emptyList());
    private List<String> tags;

    public ContactUsSettings(List<String> list) {
        this.tags = list;
    }

    public static ContactUsSettings defaultSettings() {
        return DEFAULT;
    }

    public List<String> getTags() {
        return kj0.m47112c(this.tags);
    }

    public ContactUsSettings() {
    }
}
