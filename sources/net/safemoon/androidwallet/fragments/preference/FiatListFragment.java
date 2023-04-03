package net.safemoon.androidwallet.fragments.preference;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.fragments.preference.FiatListFragment$defaultCurrencyAdapter$2;
import net.safemoon.androidwallet.model.common.HistoryListItem;
import net.safemoon.androidwallet.viewmodels.SelectFiatViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u001d\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/preference/FiatListFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "C", "Lq92;", "k", "Lq92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "r", "Lef3;", "B", "()Lnet/safemoon/androidwallet/viewmodels/SelectFiatViewModel;", "selectFiatViewModel", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "s", "z", "()Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loader", "net/safemoon/androidwallet/fragments/preference/FiatListFragment$defaultCurrencyAdapter$2$a", "x", "y", "()Lnet/safemoon/androidwallet/fragments/preference/FiatListFragment$defaultCurrencyAdapter$2$a;", "defaultCurrencyAdapter", "", "Ljava/lang/String;", "A", "()Ljava/lang/String;", "F", "(Ljava/lang/String;)V", "searchField", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: FiatListFragment.kt */
public final class FiatListFragment extends BaseMainFragment {

    /* renamed from: k */
    public q92 f42409k;

    /* renamed from: r */
    public final ef3 f42410r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(SelectFiatViewModel.class), new FiatListFragment$special$$inlined$activityViewModels$default$1(this), new FiatListFragment$special$$inlined$activityViewModels$default$2((pc2) null, this), new FiatListFragment$selectFiatViewModel$2(this));

    /* renamed from: s */
    public final ef3 f42411s = C6169a.m47232a(new FiatListFragment$loader$2(this));

    /* renamed from: x */
    public final ef3 f42412x = C6169a.m47232a(new FiatListFragment$defaultCurrencyAdapter$2(this));

    /* renamed from: y */
    public String f42413y = "";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/preference/FiatListFragment$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.preference.FiatListFragment$a */
    /* compiled from: FiatListFragment.kt */
    public static final class C8577a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ FiatListFragment f42414a;

        public C8577a(FiatListFragment fiatListFragment) {
            this.f42414a = fiatListFragment;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            FiatListFragment fiatListFragment = this.f42414a;
            CharSequence charSequence = editable;
            if (editable == null) {
                charSequence = "";
            }
            fiatListFragment.mo58141F(charSequence.toString());
            List<HistoryListItem> l = this.f42414a.mo58139B().mo61377l(this.f42414a.mo58138A());
            q92 t = this.f42414a.f42409k;
            if (t == null) {
                vx2.m53605u("binding");
                t = null;
            }
            TextView textView = t.f32998f;
            if (l.size() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f42414a.mo58142y().mo66152d(l);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: D */
    public static final void m68060D(FiatListFragment fiatListFragment, View view) {
        vx2.m53591g(fiatListFragment, "this$0");
        fiatListFragment.mo50752i();
    }

    /* renamed from: E */
    public static final void m68061E(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: A */
    public final String mo58138A() {
        return this.f42413y;
    }

    /* renamed from: B */
    public final SelectFiatViewModel mo58139B() {
        return (SelectFiatViewModel) this.f42410r.getValue();
    }

    /* renamed from: C */
    public final void mo58140C() {
        mo58142y().mo66151b();
    }

    /* renamed from: F */
    public final void mo58141F(String str) {
        vx2.m53591g(str, "<set-?>");
        this.f42413y = str;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        q92 a = q92.m50460a(layoutInflater.inflate(R.layout.fragment_fiat_list, viewGroup, false));
        vx2.m53590f(a, "bind(inflater.inflate(R.…_list, container, false))");
        this.f42409k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        ConstraintLayout b = a.mo47025b();
        vx2.m53590f(b, "binding.root");
        return b;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        q92 q92 = this.f42409k;
        if (q92 == null) {
            vx2.m53605u("binding");
            q92 = null;
        }
        q92.f32997e.f21127e.setText(R.string.default_currency);
        q92.f32997e.f21125c.setOnClickListener(new zz1(this));
        q92.f32996d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        q92.f32996d.setAdapter(mo58142y());
        q92.f32994b.addTextChangedListener(new C8577a(this));
        mo58139B().mo61374i().observe(getViewLifecycleOwner(), new a02(new FiatListFragment$onViewCreated$2(this)));
    }

    /* renamed from: y */
    public final FiatListFragment$defaultCurrencyAdapter$2.C8579a mo58142y() {
        return (FiatListFragment$defaultCurrencyAdapter$2.C8579a) this.f42412x.getValue();
    }

    /* renamed from: z */
    public final ProgressLoading mo58143z() {
        return (ProgressLoading) this.f42411s.getValue();
    }
}
