package zendesk.support.request;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.github.mikephil.charting.utils.Utils;
import com.squareup.picasso.Picasso;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import zendesk.belvedere.C9800a;
import zendesk.support.request.CellType;
import zendesk.support.suas.Dispatcher;

class CellBindHelper {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());
    /* access modifiers changed from: private */

    /* renamed from: af */
    public final ActionFactory f46853af;
    private final CellAttachmentLoadingUtil attachmentUtil;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final Dispatcher dispatcher;
    private final String today;
    private final String yesterday;

    public CellBindHelper(Context context2, Picasso picasso, ActionFactory actionFactory, Dispatcher dispatcher2) {
        this.context = context2;
        this.f46853af = actionFactory;
        this.dispatcher = dispatcher2;
        this.attachmentUtil = new CellAttachmentLoadingUtil(picasso, context2);
        this.today = context2.getString(o45.request_message_date_today);
        this.yesterday = context2.getString(o45.request_message_date_yesterday);
    }

    private boolean basicCellChecks(CellType.Base base, CellType.Base base2) {
        if (base == base2) {
            return true;
        }
        if (base.getPositionType() == base2.getPositionType() && base.getClass().isInstance(base2)) {
            return true;
        }
        return false;
    }

    private int getPixelForDp(int i) {
        if (i != 0) {
            return this.context.getResources().getDimensionPixelOffset(i);
        }
        return 0;
    }

    private boolean nullSafeEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* access modifiers changed from: private */
    public void openAttachment(Context context2, StateRequestAttachment stateRequestAttachment) {
        Intent f = C9800a.m75438c(context2).mo73727f(stateRequestAttachment.getParsedLocalUri(), stateRequestAttachment.getMimeType());
        if (context2.getPackageManager().queryIntentActivities(f, 0).size() > 0) {
            context2.startActivity(f);
        }
    }

    public void addOnClickListenerForFileAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setAlpha(1.0f);
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.openAttachment(view.getContext(), stateRequestAttachment);
                }
            });
            return;
        }
        view.setAlpha(((float) this.context.getResources().getInteger(x35.zs_request_file_attachment_downloading_cell_alpha)) / 100.0f);
        view.setOnClickListener(new View.OnClickListener() {
            private final String toastMessage;

            {
                this.toastMessage = CellBindHelper.this.context.getString(o45.request_file_attachment_download_in_progress);
            }

            public void onClick(View view) {
                Toast.makeText(view.getContext(), this.toastMessage, 0).show();
            }
        });
    }

    public void addOnClickListenerForImageAttachment(View view, final StateRequestAttachment stateRequestAttachment) {
        if (stateRequestAttachment.isAvailableLocally()) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.openAttachment(view.getContext(), stateRequestAttachment);
                }
            });
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean areAgentCellContentsTheSame(CellType.Agent agent, CellType.Base base) {
        boolean z;
        boolean z2;
        if (!basicCellChecks(agent, base) || !(base instanceof CellType.Agent)) {
            return false;
        }
        CellType.Agent agent2 = (CellType.Agent) base;
        if (agent.getAgent().getId() == agent2.getAgent().getId()) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = agent.getAgent().getName().equals(agent2.getAgent().getName());
        if (agent.isAgentNameVisible() == agent2.isAgentNameVisible()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !equals || !z2) {
            return false;
        }
        return true;
    }

    public boolean areAttachmentCellContentsTheSame(CellType.Attachment attachment, CellType.Base base) {
        if (!basicCellChecks(attachment, base) || !(base instanceof CellType.Attachment)) {
            return false;
        }
        StateRequestAttachment attachment2 = attachment.getAttachment();
        StateRequestAttachment attachment3 = ((CellType.Attachment) base).getAttachment();
        boolean nullSafeEquals = nullSafeEquals(attachment2.getLocalFile(), attachment3.getLocalFile());
        boolean nullSafeEquals2 = nullSafeEquals(attachment2.getLocalUri(), attachment3.getLocalUri());
        boolean nullSafeEquals3 = nullSafeEquals(attachment2.getUrl(), attachment3.getUrl());
        if (!nullSafeEquals || !nullSafeEquals2 || !nullSafeEquals3) {
            return false;
        }
        return true;
    }

    public boolean areMessageContentsTheSame(CellType.Message message, CellType.Base base) {
        if (basicCellChecks(message, base) && (base instanceof CellType.Message)) {
            return message.getMessage().equals(((CellType.Message) base).getMessage());
        }
        return false;
    }

    public boolean areStatefulCellContentsTheSame(CellType.Stateful stateful, CellType.Base base) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!basicCellChecks(stateful, base) || !(base instanceof CellType.Stateful)) {
            return false;
        }
        CellType.Stateful stateful2 = (CellType.Stateful) base;
        if (stateful.isErrorShown() == stateful2.isErrorShown()) {
            z = true;
        } else {
            z = false;
        }
        if (stateful.isMarkedAsDelivered() == stateful2.isMarkedAsDelivered()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (stateful.getErrorGroupMessages().size() == stateful2.getErrorGroupMessages().size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (stateful.isLastErrorCellOfBlock() == stateful2.isLastErrorCellOfBlock()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    public void bindAgentName(TextView textView, boolean z, StateRequestUser stateRequestUser) {
        if (z) {
            textView.setVisibility(0);
            textView.setText(stateRequestUser.getName());
            return;
        }
        textView.setVisibility(4);
    }

    public void bindAppInfo(ResolveInfo resolveInfo, TextView textView, ImageView imageView) {
        textView.setText(UtilsAttachment.getAppName(this.context, resolveInfo));
        imageView.setImageDrawable(UtilsAttachment.getAppIcon(this.context, resolveInfo));
    }

    public void bindDate(TextView textView, Date date) {
        String str;
        if (UtilsDate.isToday(date)) {
            str = this.today;
        } else if (UtilsDate.isYesterday(date)) {
            str = this.yesterday;
        } else {
            str = DATE_FORMAT.format(date);
        }
        textView.setText(str.toUpperCase(Locale.getDefault()));
    }

    public void bindImage(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
        this.attachmentUtil.bindImage(imageView, stateRequestAttachment);
    }

    public void bindStatusLabel(TextView textView, boolean z, boolean z2) {
        int i;
        int i2 = -1;
        int i3 = 0;
        if (z) {
            i2 = y15.zs_request_cell_label_color_error;
            i = o45.request_messages_status_error;
        } else if (z2) {
            i2 = y15.zs_request_cell_label_color;
            i = o45.request_message_status_delivered;
        } else {
            i3 = 4;
            i = -1;
        }
        if (i2 > 0) {
            textView.setTextColor(zr0.m31440c(this.context, i2));
        }
        if (i > 0) {
            textView.setText(i);
        }
        textView.clearAnimation();
        if (i3 == 0 && i3 != textView.getVisibility()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(Utils.FLOAT_EPSILON, 1.0f);
            alphaAnimation.setDuration(250);
            alphaAnimation.setInterpolator(vm4.m28892a(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.2f, 1.0f));
            textView.startAnimation(alphaAnimation);
        }
        textView.setVisibility(i3);
    }

    public int colorForError(boolean z) {
        int i;
        if (z) {
            i = y15.zs_request_user_background_color_error;
        } else {
            i = y15.zs_request_user_background_color;
        }
        return zr0.m31440c(this.context, i);
    }

    public int colorForErrorImage(boolean z) {
        if (z) {
            return zr0.m31440c(this.context, y15.zs_request_user_background_image_color_error);
        }
        return 0;
    }

    public View.OnClickListener errorClickListener(boolean z, final List<StateMessage> list) {
        if (z) {
            return new View.OnClickListener() {
                public void onClick(View view) {
                    CellBindHelper.this.dispatcher.dispatch(CellBindHelper.this.f46853af.showRetryDialog(list));
                }
            };
        }
        return null;
    }

    public ResolveInfo getAppInfo(String str) {
        return UtilsAttachment.getAppInfoForFile(this.context, str);
    }

    public Rect getInsets(int i, int i2, int i3, int i4) {
        return new Rect(getPixelForDp(i), getPixelForDp(i2), getPixelForDp(i3), getPixelForDp(i4));
    }
}
