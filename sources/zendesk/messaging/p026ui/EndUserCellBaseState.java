package zendesk.messaging.p026ui;

import zendesk.messaging.MessagingItem;

/* renamed from: zendesk.messaging.ui.EndUserCellBaseState */
abstract class EndUserCellBaseState {

    /* renamed from: id */
    private final String f46814id;
    private final MessageActionListener messageActionListener;
    private final MessagingCellProps props;
    private final MessagingItem.Query.Status status;

    public EndUserCellBaseState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status2, MessageActionListener messageActionListener2) {
        this.f46814id = str;
        this.props = messagingCellProps;
        this.status = status2;
        this.messageActionListener = messageActionListener2;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndUserCellBaseState endUserCellBaseState = (EndUserCellBaseState) obj;
        String str = this.f46814id;
        if (str == null ? endUserCellBaseState.f46814id != null : !str.equals(endUserCellBaseState.f46814id)) {
            return false;
        }
        MessagingCellProps messagingCellProps = this.props;
        if (messagingCellProps == null ? endUserCellBaseState.props != null : !messagingCellProps.equals(endUserCellBaseState.props)) {
            return false;
        }
        if (this.status != endUserCellBaseState.status) {
            return false;
        }
        if (this.messageActionListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (endUserCellBaseState.messageActionListener == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f46814id;
    }

    public MessageActionListener getMessageActionListener() {
        return this.messageActionListener;
    }

    public MessagingCellProps getProps() {
        return this.props;
    }

    public MessagingItem.Query.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f46814id;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        MessagingCellProps messagingCellProps = this.props;
        if (messagingCellProps != null) {
            i2 = messagingCellProps.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        MessagingItem.Query.Status status2 = this.status;
        if (status2 != null) {
            i3 = status2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        MessageActionListener messageActionListener2 = this.messageActionListener;
        if (messageActionListener2 != null) {
            i4 = messageActionListener2.hashCode();
        }
        return i7 + i4;
    }
}
