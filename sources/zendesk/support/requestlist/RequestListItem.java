package zendesk.support.requestlist;

import java.util.Date;
import java.util.List;
import zendesk.support.request.RequestConfiguration;
import zendesk.support.requestlist.RequestInfo;

class RequestListItem {
    private final RequestInfo requestInfo;

    public RequestListItem(RequestInfo requestInfo2) {
        this.requestInfo = requestInfo2;
    }

    public RequestConfiguration.Builder configure(RequestConfiguration.Builder builder) {
        return builder.withRequestInfo(this.requestInfo);
    }

    public String getAvatar() {
        if (hasAgentReplied()) {
            return this.requestInfo.getAgentInfos().get(0).getAvatar();
        }
        return "";
    }

    public String getFirstMessage() {
        return this.requestInfo.getFirstMessageInfo().getBody();
    }

    public long getItemId() {
        int i;
        String localId = this.requestInfo.getLocalId();
        String remoteId = this.requestInfo.getRemoteId();
        if (kb6.m46949b(localId)) {
            i = localId.hashCode();
        } else {
            i = remoteId.hashCode();
        }
        return (long) i;
    }

    public List<String> getLastCommentingAgentNames() {
        return kj0.m47120k(this.requestInfo.getAgentInfos(), new lp7<RequestInfo.AgentInfo, String>() {
            public String apply(RequestInfo.AgentInfo agentInfo) {
                return agentInfo.getName();
            }
        });
    }

    public String getLastMessage() {
        return this.requestInfo.getLastMessageInfo().getBody();
    }

    public Date getLastUpdated() {
        return this.requestInfo.getLastUpdated();
    }

    public boolean hasAgentReplied() {
        return kj0.m47118i(this.requestInfo.getAgentInfos());
    }

    public boolean isClosed() {
        return this.requestInfo.isClosed();
    }

    public boolean isFailed() {
        return kj0.m47118i(this.requestInfo.getFailedMessageIds());
    }

    public boolean isUnread() {
        return this.requestInfo.isUnread();
    }
}
