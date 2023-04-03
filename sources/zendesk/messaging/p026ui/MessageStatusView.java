package zendesk.messaging.p026ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$drawable;

/* renamed from: zendesk.messaging.ui.MessageStatusView */
public class MessageStatusView extends AppCompatImageView {
    private int deliveredIconColor;
    private int failedIconColor;
    private int pendingIconColor;

    /* renamed from: zendesk.messaging.ui.MessageStatusView$1 */
    public static /* synthetic */ class C99221 {
        public static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$MessagingItem$Query$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                zendesk.messaging.MessagingItem$Query$Status[] r0 = zendesk.messaging.MessagingItem.Query.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status = r0
                zendesk.messaging.MessagingItem$Query$Status r1 = zendesk.messaging.MessagingItem.Query.Status.FAILED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$zendesk$messaging$MessagingItem$Query$Status     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.messaging.MessagingItem$Query$Status r1 = zendesk.messaging.MessagingItem.Query.Status.FAILED_NO_RETRY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$zendesk$messaging$MessagingItem$Query$Status     // Catch:{ NoSuchFieldError -> 0x0028 }
                zendesk.messaging.MessagingItem$Query$Status r1 = zendesk.messaging.MessagingItem.Query.Status.DELIVERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$zendesk$messaging$MessagingItem$Query$Status     // Catch:{ NoSuchFieldError -> 0x0033 }
                zendesk.messaging.MessagingItem$Query$Status r1 = zendesk.messaging.MessagingItem.Query.Status.PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.p026ui.MessageStatusView.C99221.<clinit>():void");
        }
    }

    public MessageStatusView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.deliveredIconColor = k37.m75281e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary);
        this.failedIconColor = k37.m75278b(R$color.zui_error_text_color, getContext());
        this.pendingIconColor = k37.m75278b(R$color.zui_cell_pending_indicator_color, getContext());
    }

    public void setStatus(MessagingItem.Query.Status status) {
        int i = C99221.$SwitchMap$zendesk$messaging$MessagingItem$Query$Status[status.ordinal()];
        if (i == 1 || i == 2) {
            cs2.m14480c(this, ColorStateList.valueOf(this.failedIconColor));
            setImageResource(R$drawable.zui_ic_status_fail);
        } else if (i == 3) {
            cs2.m14480c(this, ColorStateList.valueOf(this.deliveredIconColor));
            setImageResource(R$drawable.zui_ic_status_sent);
        } else if (i != 4) {
            setImageResource(0);
        } else {
            cs2.m14480c(this, ColorStateList.valueOf(this.pendingIconColor));
            setImageResource(R$drawable.zui_ic_status_pending);
        }
    }

    public MessageStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MessageStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
