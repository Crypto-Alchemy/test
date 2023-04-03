package zendesk.messaging.p026ui;

import zendesk.messaging.Attachment;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.MessagingItem;

/* renamed from: zendesk.messaging.ui.EndUserCellFileState */
class EndUserCellFileState extends EndUserCellBaseState {
    private final AttachmentSettings attachmentSettings;
    private final MessagingItem.FileQuery.FailureReason failureReason;

    public EndUserCellFileState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, Attachment attachment, MessagingItem.FileQuery.FailureReason failureReason2, AttachmentSettings attachmentSettings2) {
        super(str, messagingCellProps, status, messageActionListener);
        this.failureReason = failureReason2;
        this.attachmentSettings = attachmentSettings2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        EndUserCellFileState endUserCellFileState = (EndUserCellFileState) obj;
        if (this.failureReason != endUserCellFileState.failureReason) {
            return false;
        }
        AttachmentSettings attachmentSettings2 = this.attachmentSettings;
        if (attachmentSettings2 != null) {
            return attachmentSettings2.equals(endUserCellFileState.attachmentSettings);
        }
        if (endUserCellFileState.attachmentSettings == null) {
            return true;
        }
        return false;
    }

    public Attachment getAttachment() {
        return null;
    }

    public AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public MessagingItem.FileQuery.FailureReason getFailureReason() {
        return this.failureReason;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((super.hashCode() * 31) + 0) * 31;
        MessagingItem.FileQuery.FailureReason failureReason2 = this.failureReason;
        if (failureReason2 != null) {
            i = failureReason2.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        AttachmentSettings attachmentSettings2 = this.attachmentSettings;
        if (attachmentSettings2 != null) {
            i2 = attachmentSettings2.hashCode();
        }
        return i3 + i2;
    }
}
