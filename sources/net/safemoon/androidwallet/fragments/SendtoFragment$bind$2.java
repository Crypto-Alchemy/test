package net.safemoon.androidwallet.fragments;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "isChecked", "Lr37;", "invoke", "(Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SendtoFragment.kt */
public final class SendtoFragment$bind$2 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ SendtoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendtoFragment$bind$2(SendtoFragment sendtoFragment) {
        super(1);
        this.this$0 = sendtoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(boolean z) {
        if (z) {
            C9001np.m69943a0(new WeakReference(this.this$0.requireActivity()), (Integer) null, Integer.valueOf(R.string.send_full_amount_recipient_warning), R.string.dialog_alert_slip_button, (pc2) null, 16, (Object) null);
        }
        this.this$0.mo57684y0();
    }
}
