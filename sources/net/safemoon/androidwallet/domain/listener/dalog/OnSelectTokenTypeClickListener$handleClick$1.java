package net.safemoon.androidwallet.domain.listener.dalog;

import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: OnSelectTokenTypeClickListener.kt */
public final class OnSelectTokenTypeClickListener$handleClick$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ MaterialButton $btn;
    public final /* synthetic */ OnSelectTokenTypeClickListener this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnSelectTokenTypeClickListener$handleClick$1(OnSelectTokenTypeClickListener onSelectTokenTypeClickListener, MaterialButton materialButton) {
        super(0);
        this.this$0 = onSelectTokenTypeClickListener;
        this.$btn = materialButton;
    }

    public final void invoke() {
        this.this$0.mo57368e(this.$btn, R.drawable.ic_baseline_keyboard_arrow_down_24);
    }
}
