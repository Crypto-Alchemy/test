package zendesk.messaging.p026ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zendesk.logger.Logger;
import java.util.HashSet;
import java.util.Set;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;
import zendesk.messaging.R$string;
import zendesk.messaging.p026ui.MessagePopUpHelper;

/* renamed from: zendesk.messaging.ui.UtilsEndUserCellView */
class UtilsEndUserCellView {
    private static final int ATTACHMENTS_NOT_SUPPORTED = R$string.zui_message_log_message_attachments_not_supported;
    private static final int ATTACHMENT_COULD_NOT_BE_SENT = R$string.zui_message_log_attachment_sending_failed;
    private static final int ATTACHMENT_TYPE_NOT_SUPPORTED = R$string.zui_message_log_message_attachment_type_not_supported;
    private static final int ERROR_BACKGROUND = R$drawable.zui_background_cell_errored;
    private static final int ERROR_BACKGROUND_COLOR = R$color.zui_error_background_color;
    private static final int EXCEEDING_MAX_FILE_SIZE = R$string.zui_message_log_message_file_exceeds_max_size;
    private static final int FILE_BACKGROUND = R$drawable.zui_background_cell_file;
    private static final int PENDING_COLOR = R$color.zui_color_white_60;
    private static final int TAP_TO_RETRY = R$string.zui_label_tap_retry;
    private static final int USER_MESSAGE_BACKGROUND = R$drawable.zui_background_end_user_cell;

    /* renamed from: zendesk.messaging.ui.UtilsEndUserCellView$5 */
    public static /* synthetic */ class C99505 {

        /* renamed from: $SwitchMap$zendesk$messaging$MessagingItem$FileQuery$FailureReason */
        public static final /* synthetic */ int[] f46816xccb8eb41;
        public static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$MessagingItem$Query$Status;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                zendesk.messaging.MessagingItem$Query$Status[] r0 = zendesk.messaging.MessagingItem.Query.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$messaging$MessagingItem$Query$Status = r0
                r1 = 1
                zendesk.messaging.MessagingItem$Query$Status r2 = zendesk.messaging.MessagingItem.Query.Status.PENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$zendesk$messaging$MessagingItem$Query$Status     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.messaging.MessagingItem$Query$Status r3 = zendesk.messaging.MessagingItem.Query.Status.FAILED_NO_RETRY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$zendesk$messaging$MessagingItem$Query$Status     // Catch:{ NoSuchFieldError -> 0x0028 }
                zendesk.messaging.MessagingItem$Query$Status r4 = zendesk.messaging.MessagingItem.Query.Status.FAILED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$zendesk$messaging$MessagingItem$Query$Status     // Catch:{ NoSuchFieldError -> 0x0033 }
                zendesk.messaging.MessagingItem$Query$Status r4 = zendesk.messaging.MessagingItem.Query.Status.DELIVERED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                zendesk.messaging.MessagingItem$FileQuery$FailureReason[] r3 = zendesk.messaging.MessagingItem.FileQuery.FailureReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f46816xccb8eb41 = r3
                zendesk.messaging.MessagingItem$FileQuery$FailureReason r4 = zendesk.messaging.MessagingItem.FileQuery.FailureReason.FILE_SIZE_TOO_LARGE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f46816xccb8eb41     // Catch:{ NoSuchFieldError -> 0x004e }
                zendesk.messaging.MessagingItem$FileQuery$FailureReason r3 = zendesk.messaging.MessagingItem.FileQuery.FailureReason.FILE_SENDING_DISABLED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f46816xccb8eb41     // Catch:{ NoSuchFieldError -> 0x0058 }
                zendesk.messaging.MessagingItem$FileQuery$FailureReason r1 = zendesk.messaging.MessagingItem.FileQuery.FailureReason.UNSUPPORTED_FILE_TYPE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.p026ui.UtilsEndUserCellView.C99505.<clinit>():void");
        }
    }

    private static String getAttachmentLabelErrorMessage(EndUserCellFileState endUserCellFileState, Context context) {
        if (endUserCellFileState.getStatus() == MessagingItem.Query.Status.FAILED) {
            return context.getString(TAP_TO_RETRY);
        }
        return getAttachmentNonRetryableErrorMessage(endUserCellFileState, context);
    }

    private static String getAttachmentNonRetryableErrorMessage(EndUserCellFileState endUserCellFileState, Context context) {
        String string = context.getString(ATTACHMENT_COULD_NOT_BE_SENT);
        if (endUserCellFileState.getFailureReason() == null) {
            return string;
        }
        int i = C99505.f46816xccb8eb41[endUserCellFileState.getFailureReason().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return context.getString(ATTACHMENTS_NOT_SUPPORTED);
            }
            if (i != 3) {
                return string;
            }
            return context.getString(ATTACHMENT_TYPE_NOT_SUPPORTED);
        } else if (endUserCellFileState.getAttachmentSettings() == null) {
            return string;
        } else {
            return context.getString(EXCEEDING_MAX_FILE_SIZE, new Object[]{UtilsAttachment.formatFileSize(context, endUserCellFileState.getAttachmentSettings().getMaxFileSize())});
        }
    }

    public static Drawable getImageLoadingPlaceholder(Context context) {
        int e = k37.m75281e(R$attr.colorPrimary, context, R$color.zui_color_primary);
        int e2 = k37.m75281e(R$attr.colorPrimaryDark, context, R$color.zui_color_primary_dark);
        float dimension = context.getResources().getDimension(R$dimen.zui_cell_bubble_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{e2, e, e2});
        gradientDrawable.setCornerRadius(dimension);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public static Set<MessagePopUpHelper.Option> getMenuOptions(MessagingItem.Query.Status status) {
        HashSet hashSet = new HashSet(2);
        if (status == MessagingItem.Query.Status.FAILED) {
            hashSet.add(MessagePopUpHelper.Option.DELETE);
            hashSet.add(MessagePopUpHelper.Option.RETRY);
        } else if (status == MessagingItem.Query.Status.FAILED_NO_RETRY) {
            hashSet.add(MessagePopUpHelper.Option.DELETE);
        }
        return hashSet;
    }

    public static boolean isFailedCell(EndUserCellBaseState endUserCellBaseState) {
        MessagingItem.Query.Status status = endUserCellBaseState.getStatus();
        if (status == MessagingItem.Query.Status.FAILED || status == MessagingItem.Query.Status.FAILED_NO_RETRY) {
            return true;
        }
        return false;
    }

    private static void setAttachmentClickListener(final EndUserCellFileState endUserCellFileState, View view) {
        int i = C99505.$SwitchMap$zendesk$messaging$MessagingItem$Query$Status[endUserCellFileState.getStatus().ordinal()];
        if (i == 1 || i == 2) {
            view.setOnClickListener((View.OnClickListener) null);
        } else if (i == 3) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (EndUserCellFileState.this.getMessageActionListener() != null) {
                        EndUserCellFileState.this.getMessageActionListener().retry(EndUserCellFileState.this.getId());
                    }
                }
            });
        } else if (i == 4) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EndUserCellFileState.this.getAttachment();
                    throw null;
                }
            });
        }
    }

    public static void setCellBackground(EndUserCellBaseState endUserCellBaseState, View view) {
        if (isFailedCell(endUserCellBaseState)) {
            view.setBackgroundResource(ERROR_BACKGROUND);
        } else if (endUserCellBaseState instanceof EndUserCellFileState) {
            view.setBackgroundResource(FILE_BACKGROUND);
        } else {
            Drawable e = zr0.m31442e(view.getContext(), USER_MESSAGE_BACKGROUND);
            if (e != null) {
                e.setColorFilter(new PorterDuffColorFilter(k37.m75281e(R$attr.colorPrimary, view.getContext(), R$color.zui_color_primary), PorterDuff.Mode.SRC_ATOP));
                view.setBackground(e);
                return;
            }
            Logger.m43087k("UtilsEndUserCellView", "Failed to set background, resource R.drawable.zui_background_end_user_cell could not be found", new Object[0]);
        }
    }

    public static void setClickListener(EndUserCellBaseState endUserCellBaseState, View view) {
        if (endUserCellBaseState instanceof EndUserCellMessageState) {
            setMessageClickListener((EndUserCellMessageState) endUserCellBaseState, view);
        } else if (endUserCellBaseState instanceof EndUserCellFileState) {
            setAttachmentClickListener((EndUserCellFileState) endUserCellBaseState, view);
        }
    }

    public static void setImageViewColorFilter(EndUserCellBaseState endUserCellBaseState, ImageView imageView, Context context) {
        if (isFailedCell(endUserCellBaseState)) {
            imageView.setColorFilter(k37.m75278b(ERROR_BACKGROUND_COLOR, context), PorterDuff.Mode.MULTIPLY);
        } else if (endUserCellBaseState.getStatus() == MessagingItem.Query.Status.PENDING) {
            imageView.setColorFilter(k37.m75278b(PENDING_COLOR, context), PorterDuff.Mode.MULTIPLY);
        } else {
            imageView.clearColorFilter();
        }
    }

    public static void setLabelErrorMessage(EndUserCellBaseState endUserCellBaseState, TextView textView, Context context) {
        if (!isFailedCell(endUserCellBaseState)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (endUserCellBaseState instanceof EndUserCellFileState) {
            textView.setText(getAttachmentLabelErrorMessage((EndUserCellFileState) endUserCellBaseState, context));
        } else {
            textView.setText(context.getString(TAP_TO_RETRY));
        }
    }

    public static void setLongClickListener(final EndUserCellBaseState endUserCellBaseState, final View view) {
        view.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                MessagePopUpHelper.showPopUpMenu(view, UtilsEndUserCellView.getMenuOptions(endUserCellBaseState.getStatus()), endUserCellBaseState.getMessageActionListener(), endUserCellBaseState.getId());
                return true;
            }
        });
    }

    private static void setMessageClickListener(final EndUserCellMessageState endUserCellMessageState, View view) {
        if (endUserCellMessageState.getStatus() == MessagingItem.Query.Status.FAILED || endUserCellMessageState.getStatus() == MessagingItem.Query.Status.FAILED_NO_RETRY) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (EndUserCellMessageState.this.getMessageActionListener() != null) {
                        EndUserCellMessageState.this.getMessageActionListener().retry(EndUserCellMessageState.this.getId());
                    }
                }
            });
        }
    }
}
