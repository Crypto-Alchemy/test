package zendesk.support.requestlist;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import zendesk.support.RequestStatus;

public class RequestInfo {
    private final List<AgentInfo> agentInfos;
    private final Set<String> failedMessageIds;
    private final MessageInfo firstMessageInfo;
    private final MessageInfo lastMessageInfo;
    private final Date lastUpdated;
    private final String localId;
    private final String remoteId;
    private final RequestStatus requestStatus;
    private final boolean unread;

    public static class AgentInfo {
        private final String avatar;

        /* renamed from: id */
        private final String f46884id;
        private final String name;

        public AgentInfo(String str, String str2, String str3) {
            this.f46884id = str;
            this.name = str2;
            this.avatar = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AgentInfo agentInfo = (AgentInfo) obj;
            String str = this.f46884id;
            if (str == null ? agentInfo.f46884id != null : !str.equals(agentInfo.f46884id)) {
                return false;
            }
            String str2 = this.name;
            if (str2 == null ? agentInfo.name != null : !str2.equals(agentInfo.name)) {
                return false;
            }
            String str3 = this.avatar;
            String str4 = agentInfo.avatar;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
            return false;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getId() {
            return this.f46884id;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.f46884id;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.name;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str3 = this.avatar;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            return i5 + i3;
        }
    }

    public static class LastUpdatedComparator implements Comparator<RequestInfo> {
        public int compare(RequestInfo requestInfo, RequestInfo requestInfo2) {
            if (requestInfo2 == null) {
                return 1;
            }
            if (requestInfo.getLastUpdated() == null) {
                return requestInfo2.getLastUpdated() == null ? 0 : -1;
            }
            if (requestInfo2.getLastUpdated() == null) {
                return 1;
            }
            return requestInfo2.getLastUpdated().compareTo(requestInfo.getLastUpdated());
        }
    }

    public static class MessageInfo {
        private final String body;
        private final Date date;

        /* renamed from: id */
        private final String f46885id;

        public MessageInfo(String str, Date date2, String str2) {
            this.f46885id = str;
            this.date = date2;
            this.body = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MessageInfo messageInfo = (MessageInfo) obj;
            String str = this.f46885id;
            if (str == null ? messageInfo.f46885id != null : !str.equals(messageInfo.f46885id)) {
                return false;
            }
            Date date2 = this.date;
            if (date2 == null ? messageInfo.date != null : !date2.equals(messageInfo.date)) {
                return false;
            }
            String str2 = this.body;
            String str3 = messageInfo.body;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public String getBody() {
            return this.body;
        }

        public Date getDate() {
            return this.date;
        }

        public String getId() {
            return this.f46885id;
        }

        public int hashCode() {
            int i;
            int i2;
            String str = this.f46885id;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            Date date2 = this.date;
            if (date2 != null) {
                i2 = date2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str2 = this.body;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return i5 + i3;
        }
    }

    public RequestInfo(String str, String str2, RequestStatus requestStatus2, boolean z, Date date, List<AgentInfo> list, MessageInfo messageInfo, MessageInfo messageInfo2, Set<String> set) {
        this.localId = str;
        this.remoteId = str2;
        this.requestStatus = requestStatus2;
        this.unread = z;
        this.lastUpdated = date;
        this.agentInfos = list;
        this.firstMessageInfo = messageInfo;
        this.lastMessageInfo = messageInfo2;
        this.failedMessageIds = set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) obj;
        if (this.unread != requestInfo.unread) {
            return false;
        }
        String str = this.localId;
        if (str == null ? requestInfo.localId != null : !str.equals(requestInfo.localId)) {
            return false;
        }
        String str2 = this.remoteId;
        if (str2 == null ? requestInfo.remoteId != null : !str2.equals(requestInfo.remoteId)) {
            return false;
        }
        if (this.requestStatus != requestInfo.requestStatus) {
            return false;
        }
        Date date = this.lastUpdated;
        if (date == null ? requestInfo.lastUpdated != null : !date.equals(requestInfo.lastUpdated)) {
            return false;
        }
        List<AgentInfo> list = this.agentInfos;
        if (list == null ? requestInfo.agentInfos != null : !list.equals(requestInfo.agentInfos)) {
            return false;
        }
        MessageInfo messageInfo = this.firstMessageInfo;
        if (messageInfo == null ? requestInfo.firstMessageInfo != null : !messageInfo.equals(requestInfo.firstMessageInfo)) {
            return false;
        }
        MessageInfo messageInfo2 = this.lastMessageInfo;
        if (messageInfo2 == null ? requestInfo.lastMessageInfo != null : !messageInfo2.equals(requestInfo.lastMessageInfo)) {
            return false;
        }
        Set<String> set = this.failedMessageIds;
        if (set != null) {
            return set.equals(requestInfo.failedMessageIds);
        }
        if (requestInfo.failedMessageIds == null) {
            return true;
        }
        return false;
    }

    public List<AgentInfo> getAgentInfos() {
        return this.agentInfos;
    }

    public Set<String> getFailedMessageIds() {
        return this.failedMessageIds;
    }

    public MessageInfo getFirstMessageInfo() {
        return this.firstMessageInfo;
    }

    public MessageInfo getLastMessageInfo() {
        return this.lastMessageInfo;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getRemoteId() {
        return this.remoteId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.localId;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        String str2 = this.remoteId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        RequestStatus requestStatus2 = this.requestStatus;
        if (requestStatus2 != null) {
            i3 = requestStatus2.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (((i10 + i3) * 31) + (this.unread ? 1 : 0)) * 31;
        Date date = this.lastUpdated;
        if (date != null) {
            i4 = date.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        List<AgentInfo> list = this.agentInfos;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        MessageInfo messageInfo = this.firstMessageInfo;
        if (messageInfo != null) {
            i6 = messageInfo.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        MessageInfo messageInfo2 = this.lastMessageInfo;
        if (messageInfo2 != null) {
            i7 = messageInfo2.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        Set<String> set = this.failedMessageIds;
        if (set != null) {
            i8 = set.hashCode();
        }
        return i15 + i8;
    }

    public boolean isClosed() {
        return RequestStatus.Closed.equals(this.requestStatus);
    }

    public boolean isUnread() {
        return this.unread;
    }
}
