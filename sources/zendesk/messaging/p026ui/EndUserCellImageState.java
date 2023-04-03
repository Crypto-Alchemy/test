package zendesk.messaging.p026ui;

import com.squareup.picasso.Picasso;
import zendesk.messaging.Attachment;
import zendesk.messaging.AttachmentSettings;
import zendesk.messaging.MessagingItem;

/* renamed from: zendesk.messaging.ui.EndUserCellImageState */
class EndUserCellImageState extends EndUserCellFileState {
    private final Picasso picasso;

    public EndUserCellImageState(String str, MessagingCellProps messagingCellProps, MessagingItem.Query.Status status, MessageActionListener messageActionListener, Attachment attachment, MessagingItem.FileQuery.FailureReason failureReason, AttachmentSettings attachmentSettings, Picasso picasso2) {
        super(str, messagingCellProps, status, messageActionListener, attachment, failureReason, attachmentSettings);
        this.picasso = picasso2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Picasso picasso2 = this.picasso;
        Picasso picasso3 = ((EndUserCellImageState) obj).picasso;
        if (picasso2 != null) {
            return picasso2.equals(picasso3);
        }
        if (picasso3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        Picasso picasso2 = this.picasso;
        if (picasso2 != null) {
            i = picasso2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
