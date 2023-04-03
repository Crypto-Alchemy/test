package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellUserMessage extends CellBase implements CellType.Message, CellType.Stateful {
    private final List<StateMessage> erroredMessages;
    private final Rect insets;
    private final boolean lastErrorCellOfBlock;
    private final boolean markAsDelivered;
    private final StateMessage message;
    private final boolean showError;
    private final CharSequence textMessage;

    public CellUserMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, boolean z, boolean z2, CharSequence charSequence, List<StateMessage> list, boolean z3) {
        super(cellBindHelper, g45.zs_request_user_message, stateMessage.getId(), -2147483647L, stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.markAsDelivered = z;
        this.showError = z2;
        this.insets = cellBindHelper.getInsets(0, 0, 0, m25.zs_request_message_inset_user_bottom);
        this.erroredMessages = list;
        this.lastErrorCellOfBlock = z3;
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(o45.zs_request_message_user_text_accessibility, new Object[]{this.textMessage}));
        sb.append(" ");
        if (!this.showError) {
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true);
            sb.append(context.getString(o45.zs_request_message_user_sent_accessibility, new Object[]{relativeTimeSpanString}));
        } else {
            sb.append(context.getString(o45.zs_request_message_user_error_accessibility));
        }
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType.Base base) {
        boolean areMessageContentsTheSame = this.utils.areMessageContentsTheSame(this, base);
        boolean areStatefulCellContentsTheSame = this.utils.areStatefulCellContentsTheSame(this, base);
        if (!areMessageContentsTheSame || !areStatefulCellContentsTheSame) {
            return false;
        }
        return true;
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(l35.request_user_message_text);
        viewRequestText.setText(this.textMessage);
        TextView textView = (TextView) requestViewHolder.findCachedView(l35.request_user_message_status);
        this.utils.bindStatusLabel(textView, this.lastErrorCellOfBlock, this.markAsDelivered);
        View findCachedView = requestViewHolder.findCachedView(l35.request_user_message_bubble);
        View.OnClickListener errorClickListener = this.utils.errorClickListener(this.showError, this.erroredMessages);
        UiUtils.setTint(this.utils.colorForError(isErrorShown()), findCachedView.getBackground(), findCachedView);
        requestViewHolder.itemView.setOnClickListener(errorClickListener);
        findCachedView.setOnClickListener(errorClickListener);
        viewRequestText.setOnClickListener(errorClickListener);
        textView.setOnClickListener(errorClickListener);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
    }

    public List<StateMessage> getErrorGroupMessages() {
        return this.erroredMessages;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public StateMessage getStateMessage() {
        return this.message;
    }

    public boolean isErrorShown() {
        return this.showError;
    }

    public boolean isLastErrorCellOfBlock() {
        return this.lastErrorCellOfBlock;
    }

    public boolean isMarkedAsDelivered() {
        return this.markAsDelivered;
    }

    public CellType.Stateful markAsDelivered() {
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, this.message, true, this.showError, this.textMessage, this.erroredMessages, this.lastErrorCellOfBlock);
        cellUserMessage.setPositionType(getPositionType());
        return cellUserMessage;
    }

    public CellType.Stateful markAsErrored(List<StateMessage> list, boolean z) {
        CellUserMessage cellUserMessage = new CellUserMessage(this.utils, this.message, this.markAsDelivered, true, this.textMessage, list, z);
        cellUserMessage.setPositionType(getPositionType());
        return cellUserMessage;
    }

    public String getMessage() {
        return this.message.getBody();
    }
}
