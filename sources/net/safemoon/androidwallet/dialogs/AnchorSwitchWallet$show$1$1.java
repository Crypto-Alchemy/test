package net.safemoon.androidwallet.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTHomeActivity;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "originList", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: AnchorSwitchWallet.kt */
public final class AnchorSwitchWallet$show$1$1 extends Lambda implements rc2<List<? extends Wallet>, r37> {
    public final /* synthetic */ Wallet $activeWallet;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ LayoutInflater $inflater;
    public final /* synthetic */ bf1 $this_run;
    public final /* synthetic */ AnchorSwitchWallet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchorSwitchWallet$show$1$1(Context context, LayoutInflater layoutInflater, bf1 bf1, Wallet wallet2, AnchorSwitchWallet anchorSwitchWallet) {
        super(1);
        this.$context = context;
        this.$inflater = layoutInflater;
        this.$this_run = bf1;
        this.$activeWallet = wallet2;
        this.this$0 = anchorSwitchWallet;
    }

    /* renamed from: b */
    public static final void m65933b(AnchorSwitchWallet anchorSwitchWallet, Wallet wallet2, Context context, View view) {
        vx2.m53591g(anchorSwitchWallet, "this$0");
        vx2.m53591g(wallet2, "$it");
        vx2.m53591g(context, "$context");
        anchorSwitchWallet.f41706a.mo61245D(wallet2);
        anchorSwitchWallet.mo57158f();
        AKTHomeActivity.m64859h1(context, Integer.valueOf(anchorSwitchWallet.f41707b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Wallet>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<Wallet> list) {
        vx2.m53591g(list, "originList");
        if (!g06.f37938a.mo51834c(this.$context) && list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (!((Wallet) next).isPrimaryWallet()) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        try {
            LayoutInflater layoutInflater = this.$inflater;
            bf1 bf1 = this.$this_run;
            Wallet wallet2 = this.$activeWallet;
            Context context = this.$context;
            AnchorSwitchWallet anchorSwitchWallet = this.this$0;
            for (Wallet wallet3 : list) {
                kz2 c = kz2.m47577c(layoutInflater, bf1.f21274b, false);
                c.f31130b.setText(wallet3.displayName());
                if (vx2.m53586b(wallet2 != null ? wallet2.getId() : null, wallet3.getId())) {
                    MaterialButton materialButton = c.f31130b;
                    materialButton.setTypeface(materialButton.getTypeface(), 1);
                    c.f31130b.setTextColor(zr0.m31440c(context, anchorSwitchWallet.f41709d));
                    c.f31130b.setClickable(false);
                } else {
                    c.f31130b.setTextColor(zr0.m31440c(context, R.color.t5));
                    c.mo45315b().setOnClickListener(new C8342a(anchorSwitchWallet, wallet3, context));
                }
                bf1.f21274b.addView(c.mo45315b());
            }
        } catch (Exception unused) {
        }
    }
}
