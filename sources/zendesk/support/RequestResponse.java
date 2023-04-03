package zendesk.support;

import java.util.List;

class RequestResponse {
    private List<User> lastCommentingAgents;
    private Request request;

    public List<User> getLastCommentingAgents() {
        return kj0.m47112c(this.lastCommentingAgents);
    }

    public Request getRequest() {
        return this.request;
    }
}
