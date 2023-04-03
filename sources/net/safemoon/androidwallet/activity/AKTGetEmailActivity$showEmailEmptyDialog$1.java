package net.safemoon.androidwallet.activity;

import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTGetEmailActivity.kt */
public final class AKTGetEmailActivity$showEmailEmptyDialog$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ AKTGetEmailActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTGetEmailActivity$showEmailEmptyDialog$1(AKTGetEmailActivity aKTGetEmailActivity) {
        super(0);
        this.this$0 = aKTGetEmailActivity;
    }

    /* renamed from: b */
    public static final void m64836b(EditText editText) {
        vx2.m53591g(editText, "$it");
        a77.m55429g(editText);
    }

    public final void invoke() {
        EditText editText = this.this$0.mo56602w0().f28069e.getEditText();
        if (editText != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new C8216a(editText), 200);
        }
    }
}
