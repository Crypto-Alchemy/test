package zendesk.support.requestlist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;
import zendesk.support.requestlist.RequestListView;

class RequestListViewHolder extends RecyclerView.C1231a0 {
    private final int avatarRadius;
    private final ZendeskAvatarView avatarView;
    private final TextView commentText;
    private final Context context;
    /* access modifiers changed from: private */
    public final RequestListView.OnItemClick listener;
    private final Picasso picasso;
    private final TextView subjectText;
    private final TextView timeText;
    private final TextView userText;

    private RequestListViewHolder(View view, RequestListView.OnItemClick onItemClick, Picasso picasso2) {
        super(view);
        this.listener = onItemClick;
        this.picasso = picasso2;
        Context context2 = view.getContext();
        this.context = context2;
        this.avatarView = (ZendeskAvatarView) view.findViewById(l35.request_list_item_avatar);
        this.timeText = (TextView) view.findViewById(l35.request_list_item_time);
        this.userText = (TextView) view.findViewById(l35.request_list_item_user);
        this.subjectText = (TextView) view.findViewById(l35.request_list_item_subject);
        this.commentText = (TextView) view.findViewById(l35.request_list_item_body);
        this.avatarRadius = context2.getResources().getDimensionPixelOffset(m25.zs_request_list_avatar_radius);
    }

    private void bindAvatar(boolean z, List<String> list, String str) {
        if (!z) {
            this.avatarView.showUserWithIdentifier(Integer.valueOf(o45.request_list_me));
        } else if (kb6.m46949b(str)) {
            this.avatarView.showUserWithAvatarImage(this.picasso, str, list.get(0), this.avatarRadius);
        } else {
            this.avatarView.showUserWithName(list.get(0));
        }
    }

    public static RequestListViewHolder create(Context context2, ViewGroup viewGroup, RequestListView.OnItemClick onItemClick, Picasso picasso2) {
        return new RequestListViewHolder(LayoutInflater.from(context2).inflate(g45.zs_request_list_ticket_item, viewGroup, false), onItemClick, picasso2);
    }

    private String generateUserText(String str, List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        return TextUtils.join(", ", arrayList);
    }

    private CharSequence getDateTimeString(Date date) {
        return DateUtils.getRelativeTimeSpanString(this.context, date.getTime(), false);
    }

    private void style(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(1));
            this.userText.setTypeface(Typeface.defaultFromStyle(1));
            this.commentText.setTextColor(zr0.m31440c(this.context, y15.zs_request_list_dark_text_color));
            this.timeText.setTextColor(UiUtils.themeAttributeToColor(l15.colorPrimary, this.context, y15.zs_request_list_light_text_color));
        } else {
            this.subjectText.setTypeface(Typeface.defaultFromStyle(0));
            this.userText.setTypeface(Typeface.defaultFromStyle(0));
            TextView textView = this.commentText;
            Context context2 = this.context;
            int i = y15.zs_request_list_light_text_color;
            textView.setTextColor(zr0.m31440c(context2, i));
            this.timeText.setTextColor(zr0.m31440c(this.context, i));
        }
        if (z2) {
            this.commentText.setTextColor(zr0.m31440c(this.context, y15.zs_request_cell_label_color_error));
        }
        this.itemView.setBackgroundColor(zr0.m31440c(this.context, y15.zs_request_list_white));
    }

    public void bind(final RequestListItem requestListItem) {
        String str;
        CharSequence charSequence;
        this.userText.setText(generateUserText(this.context.getString(o45.request_list_me), requestListItem.getLastCommentingAgentNames()));
        TextView textView = this.subjectText;
        if (requestListItem.hasAgentReplied()) {
            str = this.context.getString(o45.request_list_re, new Object[]{requestListItem.getFirstMessage()});
        } else {
            str = requestListItem.getFirstMessage();
        }
        textView.setText(str);
        if (requestListItem.isClosed()) {
            this.commentText.setText(o45.request_list_ticket_closed);
        } else if (requestListItem.isFailed()) {
            this.commentText.setText(o45.ask_request_list_failed_request_message);
        } else {
            this.commentText.setText(requestListItem.getLastMessage());
        }
        Date lastUpdated = requestListItem.getLastUpdated();
        TextView textView2 = this.timeText;
        if (lastUpdated != null) {
            charSequence = getDateTimeString(lastUpdated);
        } else {
            charSequence = "";
        }
        textView2.setText(charSequence);
        bindAvatar(requestListItem.hasAgentReplied(), requestListItem.getLastCommentingAgentNames(), requestListItem.getAvatar());
        style(requestListItem.isUnread(), requestListItem.isFailed(), requestListItem.isClosed());
        this.itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                RequestListViewHolder.this.listener.onClick(requestListItem);
            }
        });
    }
}
