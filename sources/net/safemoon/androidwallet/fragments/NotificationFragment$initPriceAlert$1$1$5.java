package net.safemoon.androidwallet.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.model.priceAlert.PAToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "kotlin.jvm.PlatformType", "it", "Lr37;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: NotificationFragment.kt */
public final class NotificationFragment$initPriceAlert$1$1$5 extends Lambda implements rc2<List<? extends PAToken>, r37> {
    public final /* synthetic */ ga2 $this_with;
    public final /* synthetic */ NotificationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationFragment$initPriceAlert$1$1$5(ga2 ga2, NotificationFragment notificationFragment) {
        super(1);
        this.$this_with = ga2;
        this.this$0 = notificationFragment;
    }

    /* renamed from: b */
    public static final void m66699b(NotificationFragment notificationFragment, PAToken pAToken, ga2 ga2, View view) {
        vx2.m53591g(notificationFragment, "this$0");
        vx2.m53591g(pAToken, "$pt");
        vx2.m53591g(ga2, "$this_with");
        notificationFragment.mo57525e0(true);
        notificationFragment.mo57518M().mo61408Q(Integer.valueOf(pAToken.getChainId()));
        notificationFragment.mo57518M().mo61414r(pAToken.getChainId());
        if (pAToken.getChainId() == -1) {
            notificationFragment.mo57518M().mo61401E().postValue("");
            TextInputEditText textInputEditText = ga2.f29156k.f34980b;
            vx2.m53590f(textInputEditText, "stickySearchBar.etSearch");
            tc7.m72270w(textInputEditText, "");
            TextInputEditText textInputEditText2 = ga2.f29155j.f34980b;
            vx2.m53590f(textInputEditText2, "searchBar.etSearch");
            tc7.m72270w(textInputEditText2, "");
            ga2.f29156k.f34980b.setOnTouchListener(notificationFragment.mo57519N());
            ga2.f29155j.f34980b.setOnTouchListener(notificationFragment.mo57519N());
            return;
        }
        notificationFragment.mo57518M().mo61401E().postValue(notificationFragment.mo57518M().mo61402F());
        TextInputEditText textInputEditText3 = ga2.f29156k.f34980b;
        vx2.m53590f(textInputEditText3, "stickySearchBar.etSearch");
        tc7.m72270w(textInputEditText3, notificationFragment.mo57518M().mo61402F());
        TextInputEditText textInputEditText4 = ga2.f29155j.f34980b;
        vx2.m53590f(textInputEditText4, "searchBar.etSearch");
        tc7.m72270w(textInputEditText4, notificationFragment.mo57518M().mo61402F());
        ga2.f29156k.f34980b.setOnTouchListener((View.OnTouchListener) null);
        ga2.f29155j.f34980b.setOnTouchListener((View.OnTouchListener) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PAToken>) (List) obj);
        return r37.f33317a;
    }

    public final void invoke(List<PAToken> list) {
        if (list != null) {
            ga2 ga2 = this.$this_with;
            NotificationFragment notificationFragment = this.this$0;
            ga2.f29147b.removeAllViews();
            for (PAToken pAToken : list) {
                View inflate = LayoutInflater.from(notificationFragment.requireContext()).inflate(R.layout.item_arrow_down_button, (ViewGroup) null);
                if (inflate instanceof Button) {
                    ((Button) inflate).setText(pAToken.getName());
                    ga2.f29147b.addView(inflate);
                    inflate.setOnClickListener(new C8517c(notificationFragment, pAToken, ga2));
                }
            }
        }
    }
}
