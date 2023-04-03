package zendesk.support;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.util.Map;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.support.requestlist.RequestListActivity;
import zendesk.support.requestlist.RequestListConfiguration;

class RequestListActionHandler implements ActionHandler {
    private boolean conversationsEnabled;
    private final Gson gson = new GsonBuilder().create();

    public boolean canHandle(String str) {
        if (!str.equals("action_conversation_list") || !this.conversationsEnabled) {
            return false;
        }
        return true;
    }

    public ActionDescription getActionDescription() {
        return null;
    }

    public int getPriority() {
        return 0;
    }

    public void handle(Map<String, Object> map, Context context) {
        RequestListActivity.builder().show(context, (RequestListConfiguration) so0.m75308f(map, RequestListConfiguration.class));
    }

    public void updateSettings(Map<String, JsonElement> map) {
        JsonElement jsonElement;
        if (map == null) {
            jsonElement = null;
        } else {
            jsonElement = map.get(ZendeskSupportSettingsProvider.SUPPORT_KEY);
        }
        SupportSettings supportSettings = (SupportSettings) this.gson.fromJson(jsonElement, SupportSettings.class);
        if (supportSettings != null) {
            this.conversationsEnabled = supportSettings.getConversations().isEnabled();
        }
    }
}
