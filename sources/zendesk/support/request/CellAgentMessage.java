package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellAgentMessage extends CellBase implements CellType.Message, CellType.Agent {
    private final Rect insets;
    private final StateMessage message;
    private boolean showAgentName = false;
    private final CharSequence textMessage;
    private final StateRequestUser user;

    public CellAgentMessage(CellBindHelper cellBindHelper, StateMessage stateMessage, CharSequence charSequence, StateRequestUser stateRequestUser) {
        super(cellBindHelper, g45.zs_request_agent_message, stateMessage.getId(), stateMessage.getUserId(), stateMessage.getDate());
        this.textMessage = charSequence;
        this.message = stateMessage;
        this.user = stateRequestUser;
        this.insets = cellBindHelper.getInsets(0, m25.zs_request_message_inset_agent_top, 0, m25.zs_request_message_inset_agent_bottom);
    }

    private String buildTalkBackString(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(o45.zs_request_message_agent_text_accessibility, new Object[]{this.textMessage}));
        sb.append(" ");
        CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(context, this.message.getDate().getTime(), true);
        sb.append(context.getString(o45.zs_request_message_agent_sent_accessibility, new Object[]{relativeTimeSpanString, this.user.getName()}));
        return sb.toString();
    }

    public boolean areContentsTheSame(CellType.Base base) {
        boolean areMessageContentsTheSame = this.utils.areMessageContentsTheSame(this, base);
        boolean areAgentCellContentsTheSame = this.utils.areAgentCellContentsTheSame(this, base);
        if (!areMessageContentsTheSame || !areAgentCellContentsTheSame) {
            return false;
        }
        return true;
    }

    public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
        ViewRequestText viewRequestText = (ViewRequestText) requestViewHolder.findCachedView(l35.request_agent_message_text);
        viewRequestText.setText(this.textMessage);
        this.utils.bindAgentName((TextView) requestViewHolder.findCachedView(l35.request_agent_name), this.showAgentName, this.user);
        View findCachedView = requestViewHolder.findCachedView(l35.request_agent_message_bubble);
        findCachedView.setContentDescription(buildTalkBackString(findCachedView.getContext()));
        viewRequestText.requestLayout();
    }

    public StateRequestUser getAgent() {
        return this.user;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public CharSequence getMessage() {
        return this.message.getBody();
    }

    public boolean isAgentNameVisible() {
        return this.showAgentName;
    }

    public void showAgentName(boolean z) {
        this.showAgentName = z;
    }
}
