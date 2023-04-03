package net.safemoon.androidwallet.fragments;

import android.text.Editable;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/text/Editable;", "it", "Lr37;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment$initPriceAlert$1$1$2 extends Lambda implements rc2<Editable, r37> {
    public final /* synthetic */ ga2 $this_with;
    public final /* synthetic */ NotificationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationFragment$initPriceAlert$1$1$2(ga2 ga2, NotificationFragment notificationFragment) {
        super(1);
        this.$this_with = ga2;
        this.this$0 = notificationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Editable) obj);
        return r37.f33317a;
    }

    public final void invoke(Editable editable) {
        TextInputEditText textInputEditText = this.$this_with.f29155j.f34980b;
        vx2.m53590f(textInputEditText, "searchBar.etSearch");
        tc7.m72270w(textInputEditText, editable);
        this.this$0.mo57518M().mo61401E().setValue(editable != null ? editable.toString() : null);
    }
}
