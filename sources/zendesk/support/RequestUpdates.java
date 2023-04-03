package zendesk.support;

import java.util.Collections;
import java.util.Map;

public final class RequestUpdates {
    private final Map<String, Integer> requestIds;

    public RequestUpdates(Map<String, Integer> map) {
        if (map == null) {
            this.requestIds = Collections.emptyMap();
        } else {
            this.requestIds = map;
        }
    }

    public Map<String, Integer> getRequestUpdates() {
        return kj0.m47113d(this.requestIds);
    }

    public boolean hasUpdatedRequests() {
        return !this.requestIds.isEmpty();
    }

    public boolean isRequestUnread(String str) {
        if (!this.requestIds.containsKey(str) || this.requestIds.get(str).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public int totalUpdates() {
        int i = 0;
        for (Integer intValue : this.requestIds.values()) {
            i += intValue.intValue();
        }
        return i;
    }
}
