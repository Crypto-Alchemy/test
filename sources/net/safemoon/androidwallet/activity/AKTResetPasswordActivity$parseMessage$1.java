package net.safemoon.androidwallet.activity;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AKTResetPasswordActivity.kt */
public final class AKTResetPasswordActivity$parseMessage$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ ow7 $safeMoonppp;
    public final /* synthetic */ AKTResetPasswordActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKTResetPasswordActivity$parseMessage$1(ow7 ow7, AKTResetPasswordActivity aKTResetPasswordActivity) {
        super(0);
        this.$safeMoonppp = ow7;
        this.this$0 = aKTResetPasswordActivity;
    }

    public final void invoke() {
        ow7 ow7 = this.$safeMoonppp;
        String g = ow7 != null ? ow7.mo24213g("tempKA") : null;
        if (g != null) {
            f06.m57524o(this.this$0, "TEMPKA", g);
        }
        AKTLoginActivity.f41302L.mo56679b(this.this$0, false);
        this.this$0.finish();
    }
}
