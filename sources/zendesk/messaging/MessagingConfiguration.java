package zendesk.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import zendesk.configurations.Configuration;

public class MessagingConfiguration implements Configuration {
    private AgentDetails botAgentDetails;
    private final int botAvatarDrawable;
    private final String botLabelString;
    private final int botLabelStringRes;
    private final List<Configuration> configurations;
    private final String engineRegistryKey;
    private final boolean multilineResponseOptionsEnabled;
    private final String toolbarTitle;
    private final int toolbarTitleRes;

    public static class Builder {
        /* access modifiers changed from: private */
        public int botAvatarDrawable = R$drawable.zui_avatar_bot_default;
        /* access modifiers changed from: private */
        public String botLabelString;
        /* access modifiers changed from: private */
        public int botLabelStringRes = R$string.zui_default_bot_name;
        /* access modifiers changed from: private */
        public List<Configuration> configurations = new ArrayList();
        private List<Engine> engines = new ArrayList();
        /* access modifiers changed from: private */
        public boolean multilineResponseOptionsEnabled = false;
        /* access modifiers changed from: private */
        public String toolbarTitle;
        /* access modifiers changed from: private */
        public int toolbarTitleRes = R$string.zui_toolbar_title;

        public Configuration config(Context context) {
            return new MessagingConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines));
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<Configuration> list) {
            this.configurations = list;
            Configuration config = config(context);
            Intent intent = new Intent(context, MessagingActivity.class);
            ro0.m75294h().mo67437c(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }
    }

    private String getBotLabelString(Resources resources) {
        if (kb6.m46949b(this.botLabelString)) {
            return this.botLabelString;
        }
        return resources.getString(this.botLabelStringRes);
    }

    public AgentDetails getBotAgentDetails(Resources resources) {
        if (this.botAgentDetails == null) {
            this.botAgentDetails = new AgentDetails(getBotLabelString(resources), "ANSWER_BOT", true, Integer.valueOf(this.botAvatarDrawable));
        }
        return this.botAgentDetails;
    }

    public int getBotAvatarDrawable() {
        return this.botAvatarDrawable;
    }

    public List<Configuration> getConfigurations() {
        return ro0.m75294h().mo67435a(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryKey);
    }

    public String getToolbarTitle(Resources resources) {
        if (kb6.m46949b(this.toolbarTitle)) {
            return this.toolbarTitle;
        }
        return resources.getString(this.toolbarTitleRes);
    }

    public boolean isMultilineResponseOptionsEnabled() {
        return this.multilineResponseOptionsEnabled;
    }

    private MessagingConfiguration(Builder builder, String str) {
        this.configurations = builder.configurations;
        this.engineRegistryKey = str;
        this.toolbarTitle = builder.toolbarTitle;
        this.toolbarTitleRes = builder.toolbarTitleRes;
        this.botLabelString = builder.botLabelString;
        this.botLabelStringRes = builder.botLabelStringRes;
        this.botAvatarDrawable = builder.botAvatarDrawable;
        this.multilineResponseOptionsEnabled = builder.multilineResponseOptionsEnabled;
    }
}
