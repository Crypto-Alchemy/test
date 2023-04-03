package net.safemoon.androidwallet.activity;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lnet/safemoon/androidwallet/adapter/touchHelper/RecyclerTouchListener;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SwitchWalletActivity.kt */
public final class SwitchWalletActivity$touchListener$2 extends Lambda implements pc2<RecyclerTouchListener> {
    public final /* synthetic */ SwitchWalletActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchWalletActivity$touchListener$2(SwitchWalletActivity switchWalletActivity) {
        super(0);
        this.this$0 = switchWalletActivity;
    }

    /* renamed from: b */
    public static final void m65535b(SwitchWalletActivity switchWalletActivity, int i, int i2) {
        List value;
        vx2.m53591g(switchWalletActivity, "this$0");
        if (i == R.id.btnDelete && (value = switchWalletActivity.mo56920Z().mo61261w().getValue()) != null) {
            C9001np.m69934S(new WeakReference(switchWalletActivity), Integer.valueOf(R.string.delete_wallet_title), (String) null, Integer.valueOf(R.string.delete_wallet_msg), (String) null, Integer.valueOf(R.string.confirm), (Integer) null, (Integer) null, (Integer) null, new SwitchWalletActivity$touchListener$2$1$1$1(switchWalletActivity, value, i2), SwitchWalletActivity$touchListener$2$1$1$2.INSTANCE, 468, (Object) null);
        }
    }

    public final RecyclerTouchListener invoke() {
        SwitchWalletActivity switchWalletActivity = this.this$0;
        RecyclerTouchListener recyclerTouchListener = new RecyclerTouchListener(switchWalletActivity, switchWalletActivity.mo56919Y().f21216b);
        recyclerTouchListener.mo57036x(Integer.valueOf(R.id.btnDelete)).mo57037y(R.id.rowFG, R.id.rowBG, new C8230m(this.this$0));
        this.this$0.mo56919Y().f21216b.mo9079k(recyclerTouchListener);
        return recyclerTouchListener;
    }
}
