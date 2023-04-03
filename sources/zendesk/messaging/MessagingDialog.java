package zendesk.messaging;

import android.app.Dialog;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import zendesk.messaging.Event;
import zendesk.messaging.components.DateProvider;

class MessagingDialog implements pf4<DialogContent> {
    /* access modifiers changed from: private */
    public final AppCompatActivity appCompatActivity;
    /* access modifiers changed from: private */
    public final DateProvider dateProvider;
    /* access modifiers changed from: private */
    public final MessagingViewModel messagingViewModel;

    /* renamed from: zendesk.messaging.MessagingDialog$4 */
    public static /* synthetic */ class C98944 {
        public static final /* synthetic */ int[] $SwitchMap$zendesk$messaging$DialogContent$Config;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                zendesk.messaging.DialogContent$Config[] r0 = zendesk.messaging.DialogContent.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$zendesk$messaging$DialogContent$Config = r0
                zendesk.messaging.DialogContent$Config r1 = zendesk.messaging.DialogContent.Config.TRANSCRIPT_PROMPT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$zendesk$messaging$DialogContent$Config     // Catch:{ NoSuchFieldError -> 0x001d }
                zendesk.messaging.DialogContent$Config r1 = zendesk.messaging.DialogContent.Config.TRANSCRIPT_EMAIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.MessagingDialog.C98944.<clinit>():void");
        }
    }

    public MessagingDialog(AppCompatActivity appCompatActivity2, MessagingViewModel messagingViewModel2, DateProvider dateProvider2) {
        this.appCompatActivity = appCompatActivity2;
        this.messagingViewModel = messagingViewModel2;
        this.dateProvider = dateProvider2;
    }

    public void onChanged(final DialogContent dialogContent) {
        if (dialogContent != null) {
            final Dialog dialog = new Dialog(this.appCompatActivity);
            dialog.setContentView(R$layout.zui_messaging_dialog);
            Button button = (Button) dialog.findViewById(R$id.zui_dialog_positive_button);
            Button button2 = (Button) dialog.findViewById(R$id.zui_dialog_negative_button);
            TextInputEditText textInputEditText = (TextInputEditText) dialog.findViewById(R$id.zui_dialog_input);
            final TextInputLayout textInputLayout = (TextInputLayout) dialog.findViewById(R$id.zui_dialog_input_layout);
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    dialog.dismiss();
                    MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), false).build());
                }
            });
            dialog.setTitle(dialogContent.getTitle());
            ((TextView) dialog.findViewById(R$id.zui_dialog_message)).setText(dialogContent.getMessage());
            ((TextView) dialog.findViewById(R$id.zui_dialog_title)).setText(dialogContent.getTitle());
            button2.setText(R$string.zui_button_label_no);
            button.setText(R$string.zui_button_label_yes);
            int i = C98944.$SwitchMap$zendesk$messaging$DialogContent$Config[dialogContent.getConfig().ordinal()];
            if (i == 1) {
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent.getConfig(), true).build());
                        dialog.dismiss();
                    }
                });
            } else if (i == 2) {
                textInputLayout.setVisibility(0);
                button2.setText(17039360);
                button.setText(R$string.zui_label_send);
                textInputLayout.setHint((CharSequence) this.appCompatActivity.getString(R$string.zui_dialog_email_hint));
                final TextInputEditText textInputEditText2 = textInputEditText;
                final DialogContent dialogContent2 = dialogContent;
                final Dialog dialog2 = dialog;
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Editable text = textInputEditText2.getText();
                        if (text == null || !Patterns.EMAIL_ADDRESS.matcher(text.toString()).matches()) {
                            textInputLayout.setError(MessagingDialog.this.appCompatActivity.getString(R$string.zui_dialog_email_error));
                            return;
                        }
                        MessagingDialog.this.messagingViewModel.onEvent(new Event.DialogItemClicked.Builder(MessagingDialog.this.dateProvider.now(), dialogContent2.getConfig(), true).setPayload(textInputEditText2.getText().toString()).setPreviousConfig(dialogContent2.previousConfig()).build());
                        dialog2.dismiss();
                    }
                });
            }
            dialog.show();
        }
    }
}
