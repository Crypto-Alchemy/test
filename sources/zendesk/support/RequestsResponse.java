package zendesk.support;

import java.util.List;

class RequestsResponse extends ResponseWrapper {
    private List<User> lastCommentingAgents;
    private List<Request> requests;

    public List<User> getLastCommentingAgents() {
        return kj0.m47112c(this.lastCommentingAgents);
    }

    public List<Request> getRequests() {
        return kj0.m47112c(this.requests);
    }
}
