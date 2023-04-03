package zendesk.messaging.p026ui;

import zendesk.messaging.MessagingItem;

/* renamed from: zendesk.messaging.ui.EndUserCellMessageState */
class EndUserCellMessageState extends EndUserCellBaseState {
    private final String message;

    public EndUserCellMessageState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, String str2) {
        super(str, messagingCellProps, status, messageActionListener);
        this.message = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.message;
        String str2 = ((EndUserCellMessageState) obj).message;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
