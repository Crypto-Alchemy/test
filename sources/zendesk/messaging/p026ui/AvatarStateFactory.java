package zendesk.messaging.p026ui;

import zendesk.messaging.AgentDetails;

/* renamed from: zendesk.messaging.ui.AvatarStateFactory */
class AvatarStateFactory {
    public AvatarState createAvatarState(AgentDetails agentDetails) {
        String str;
        if (kb6.m46949b(agentDetails.getAgentName())) {
            str = agentDetails.getAgentName().substring(0, 1);
        } else {
            str = "";
        }
        return new AvatarState(agentDetails.getAgentId(), str, agentDetails.getAvatarPath(), agentDetails.getAvatarDrawableRes());
    }
}
