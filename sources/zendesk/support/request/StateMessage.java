package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

class StateMessage implements Serializable {
    private final List<StateRequestAttachment> attachments;
    private final Date date;
    private final String htmlBody;

    /* renamed from: id */
    private final long f46879id;
    private final String plainBody;
    private final StateMessageStatus state;
    private final long userId;

    public StateMessage(String str, List<StateRequestAttachment> list) {
        this.htmlBody = null;
        this.plainBody = str;
        this.date = new Date();
        this.f46879id = IdUtil.newLongId();
        this.userId = -1;
        this.state = StateMessageStatus.pending();
        this.attachments = list;
    }

    public static jl4<List<StateMessage>, StateIdMapper> convert(List<CommentResponse> list, StateIdMapper stateIdMapper, Map<Long, StateRequestAttachment> map) {
        long j;
        Map<Long, StateRequestAttachment> map2 = map;
        ArrayList arrayList = new ArrayList(list.size());
        StateIdMapper stateIdMapper2 = stateIdMapper;
        for (CommentResponse next : list) {
            Long id = next.getId();
            Long authorId = next.getAuthorId();
            if (!(id == null || authorId == null)) {
                ArrayList arrayList2 = new ArrayList();
                for (Attachment next2 : next.getAttachments()) {
                    if (map2.containsKey(next2.getId())) {
                        arrayList2.add(map2.get(next2.getId()));
                    }
                }
                if (stateIdMapper2.hasLocalId(id)) {
                    j = stateIdMapper2.getLocalId(id).longValue();
                } else {
                    j = IdUtil.newLongId();
                    stateIdMapper2 = stateIdMapper2.addIdMapping(id, Long.valueOf(j));
                }
                arrayList.add(new StateMessage(next.getHtmlBody(), next.getBody(), next.getCreatedAt(), j, authorId.longValue(), StateMessageStatus.delivered(), arrayList2));
            }
        }
        return jl4.m20216a(arrayList, stateIdMapper2.copy());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StateMessage stateMessage = (StateMessage) obj;
        if (this.f46879id != stateMessage.f46879id || this.userId != stateMessage.userId) {
            return false;
        }
        String str = this.htmlBody;
        if (str == null ? stateMessage.htmlBody != null : !str.equals(stateMessage.htmlBody)) {
            return false;
        }
        String str2 = this.plainBody;
        if (str2 == null ? stateMessage.plainBody != null : !str2.equals(stateMessage.plainBody)) {
            return false;
        }
        Date date2 = this.date;
        if (date2 == null ? stateMessage.date != null : !date2.equals(stateMessage.date)) {
            return false;
        }
        StateMessageStatus stateMessageStatus = this.state;
        if (stateMessageStatus == null ? stateMessage.state != null : !stateMessageStatus.equals(stateMessage.state)) {
            return false;
        }
        List<StateRequestAttachment> list = this.attachments;
        List<StateRequestAttachment> list2 = stateMessage.attachments;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public List<StateRequestAttachment> getAttachments() {
        return this.attachments;
    }

    public String getBody() {
        if (kb6.m46949b(this.plainBody)) {
            return this.plainBody;
        }
        return UtilsAttachment.getMessageBodyForAttachments(getAttachments());
    }

    public Date getDate() {
        return this.date;
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public long getId() {
        return this.f46879id;
    }

    public String getPlainBody() {
        return this.plainBody;
    }

    public StateMessageStatus getState() {
        return this.state;
    }

    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.htmlBody, this.plainBody, this.date, Long.valueOf(this.f46879id), Long.valueOf(this.userId), this.state, this.attachments});
    }

    public String toString() {
        return "Message{htmlBody='" + this.htmlBody + '\'' + ", plainBody='" + this.plainBody + '\'' + ", date=" + this.date + ", id=" + this.f46879id + ", userId=" + this.userId + ", state=" + this.state + '}';
    }

    public StateMessage withAttachments(List<StateRequestAttachment> list) {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f46879id, this.userId, this.state, list);
    }

    public StateMessage withDelivered() {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f46879id, this.userId, StateMessageStatus.delivered(), this.attachments);
    }

    public StateMessage withError(hr1 hr1) {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f46879id, this.userId, StateMessageStatus.error(hr1.mo43366h()), this.attachments);
    }

    public StateMessage withPending() {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f46879id, this.userId, StateMessageStatus.pending(), this.attachments);
    }

    public StateMessage withUpdatedAttachment(StateRequestAttachment stateRequestAttachment) {
        ArrayList arrayList = new ArrayList(this.attachments.size());
        for (StateRequestAttachment next : this.attachments) {
            if (next.getId() == stateRequestAttachment.getId()) {
                next = stateRequestAttachment;
            }
            arrayList.add(next);
        }
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f46879id, this.userId, this.state, arrayList);
    }

    public StateMessage(String str, String str2, Date date2, long j, long j2, StateMessageStatus stateMessageStatus, List<StateRequestAttachment> list) {
        this.htmlBody = str;
        this.plainBody = str2;
        this.date = date2;
        this.f46879id = j;
        this.userId = j2;
        this.state = stateMessageStatus;
        this.attachments = list;
    }
}
