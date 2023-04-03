package net.safemoon.androidwallet.activity;

import android.content.Intent;
import android.widget.EditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/Intent;", "intent", "Lr37;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ImportWordActivity.kt */
public final class ImportWordActivity$startScanQRCode$1 extends Lambda implements rc2<Intent, r37> {
    public final /* synthetic */ EditText[] $editTextView;
    public final /* synthetic */ ImportWordActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImportWordActivity$startScanQRCode$1(ImportWordActivity importWordActivity, EditText[] editTextArr) {
        super(1);
        this.this$0 = importWordActivity;
        this.$editTextView = editTextArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return r37.f33317a;
    }

    public final void invoke(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("result");
            if (stringExtra != null) {
                List B0 = StringsKt__StringsKt.m63061B0(StringsKt__StringsKt.m63090V0(yb6.m74332I(stringExtra, "|", " ", false, 4, (Object) null)).toString(), new String[]{" "}, false, 0, 6, (Object) null);
                if (B0.size() == this.this$0.mo56858x0()) {
                    EditText[] editTextArr = this.$editTextView;
                    int length = editTextArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        EditText editText = editTextArr[i];
                        int i3 = i2 + 1;
                        if (editText != null && i2 < B0.size()) {
                            editText.setText((CharSequence) B0.get(i2));
                        }
                        i++;
                        i2 = i3;
                    }
                    return;
                }
                this.this$0.mo56854D0();
                return;
            }
            this.this$0.mo56854D0();
        }
    }
}
