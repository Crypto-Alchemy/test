package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.gson.JsonElement;
import com.zendesk.logger.Logger;
import java.util.List;
import java.util.Map;
import zendesk.configurations.Configuration;
import zendesk.core.ActionDescription;
import zendesk.core.ActionHandler;
import zendesk.core.Zendesk;
import zendesk.support.request.RequestActivity;

public final class CreateRequestActionHandler implements ActionHandler {
    private static final String LOG_TAG = "CreateRequestActionHandler";
    private final Context context;

    public CreateRequestActionHandler(Context context2) {
        this.context = context2;
    }

    private static boolean isInitialized() {
        if (Support.INSTANCE.isInitialized() && Zendesk.INSTANCE.isInitialized()) {
            return true;
        }
        Logger.m43087k(LOG_TAG, "Support SDK contact handler returning false because Support.init(..) or Zendesk.init(..) has not been called!", new Object[0]);
        return false;
    }

    public boolean canHandle(String str) {
        if (!isInitialized() || !"action_contact_option".equals(str)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public List<Configuration> extractConfigs(Map<String, Object> map) {
        Configuration f = so0.m75308f(map, Configuration.class);
        if (f != null) {
            return f.getConfigurations();
        }
        return null;
    }

    public ActionDescription getActionDescription() {
        String string = this.context.getString(o45.zs_request_contact_option_leave_a_message);
        return new ActionDescription(string, string, u25.zs_contact_leave_message);
    }

    public int getPriority() {
        return 0;
    }

    @SuppressLint({"RestrictedApi"})
    public void handle(Map<String, Object> map, Context context2) {
        if (isInitialized()) {
            List<Configuration> extractConfigs = extractConfigs(map);
            if (extractConfigs != null) {
                RequestActivity.builder().show(context2, extractConfigs);
            } else {
                RequestActivity.builder().show(context2, new Configuration[0]);
            }
        }
    }

    public void updateSettings(Map<String, JsonElement> map) {
    }
}
