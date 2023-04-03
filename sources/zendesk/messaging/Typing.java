package zendesk.messaging;

public class Typing {
    private final AgentDetails agentDetails;
    private final boolean isTyping;

    public Typing(boolean z) {
        this(z, (AgentDetails) null);
    }

    public AgentDetails getAgentDetails() {
        return this.agentDetails;
    }

    public boolean isTyping() {
        return this.isTyping;
    }

    public Typing(boolean z, AgentDetails agentDetails2) {
        this.isTyping = z;
        this.agentDetails = agentDetails2;
    }
}
