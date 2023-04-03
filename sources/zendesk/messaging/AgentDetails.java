package zendesk.messaging;

import java.io.Serializable;

public class AgentDetails implements Serializable {
    private final String agentId;
    private final String agentName;
    private final Integer avatarDrawableRes;
    private final String avatarPath;
    private final boolean isBot;

    public AgentDetails(String str, String str2, boolean z) {
        this(str, str2, z, (Integer) null, (String) null);
    }

    public String getAgentId() {
        return this.agentId;
    }

    public String getAgentName() {
        return this.agentName;
    }

    public Integer getAvatarDrawableRes() {
        return this.avatarDrawableRes;
    }

    public String getAvatarPath() {
        return this.avatarPath;
    }

    public boolean isBot() {
        return this.isBot;
    }

    public AgentDetails(String str, String str2, boolean z, Integer num) {
        this(str, str2, z, num, (String) null);
    }

    public AgentDetails(String str, String str2, boolean z, String str3) {
        this(str, str2, z, (Integer) null, str3);
    }

    private AgentDetails(String str, String str2, boolean z, Integer num, String str3) {
        this.agentName = str;
        this.agentId = str2;
        this.isBot = z;
        this.avatarDrawableRes = num;
        this.avatarPath = str3;
    }
}
