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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.fragments.preference.DefaultLanguageFragment$defaultLanguageAdapter$2;
import net.safemoon.androidwallet.model.common.LanguageItem;
import net.safemoon.androidwallet.repository.FcmDataSource;
import net.safemoon.androidwallet.viewmodels.MultiWalletViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000b*\u0001&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\"\u0010'R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "", "searchField", "", "Lnet/safemoon/androidwallet/model/common/LanguageItem;", "z", "Lo92;", "k", "Lo92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "r", "Lef3;", "getMultiWalletVM", "()Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "multiWalletVM", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "s", "y", "()Lnet/safemoon/androidwallet/repository/FcmDataSource;", "fcmDataSource", "Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "x", "A", "()Lnet/safemoon/androidwallet/dialogs/ProgressLoading;", "loader", "net/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment$defaultLanguageAdapter$2$a", "()Lnet/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment$defaultLanguageAdapter$2$a;", "defaultLanguageAdapter", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "D", "(Ljava/lang/String;)V", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: DefaultLanguageFragment.kt */
public final class DefaultLanguageFragment extends BaseMainFragment {

    /* renamed from: A */
    public String f42399A = "";

    /* renamed from: k */
    public o92 f42400k;

    /* renamed from: r */
    public final ef3 f42401r;

    /* renamed from: s */
    public final ef3 f42402s = C6169a.m47232a(new DefaultLanguageFragment$fcmDataSource$2(this));

    /* renamed from: x */
    public final ef3 f42403x = C6169a.m47232a(new DefaultLanguageFragment$loader$2(this));

    /* renamed from: y */
    public final ef3 f42404y = C6169a.m47232a(new DefaultLanguageFragment$defaultLanguageAdapter$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/preference/DefaultLanguageFragment$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.preference.DefaultLanguageFragment$a */
    /* compiled from: DefaultLanguageFragment.kt */
    public static final class C8574a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ DefaultLanguageFragment f42405a;

        public C8574a(DefaultLanguageFragment defaultLanguageFragment) {
            this.f42405a = defaultLanguageFragment;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            DefaultLanguageFragment defaultLanguageFragment = this.f42405a;
            CharSequence charSequence = editable;
            if (editable == null) {
                charSequence = "";
            }
            defaultLanguageFragment.mo58127D(charSequence.toString());
            DefaultLanguageFragment defaultLanguageFragment2 = this.f42405a;
            List v = defaultLanguageFragment2.mo58130z(defaultLanguageFragment2.mo58126B());
            o92 s = this.f42405a.f42400k;
            if (s == null) {
                vx2.m53605u("binding");
                s = null;
            }
            TextView textView = s.f32322e;
            if (v.size() == 0) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            this.f42405a.mo58128x().mo66857f(v);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public DefaultLanguageFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new DefaultLanguageFragment$special$$inlined$viewModels$default$2(new DefaultLanguageFragment$special$$inlined$viewModels$default$1(this)));
        this.f42401r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(MultiWalletViewModel.class), new DefaultLanguageFragment$special$$inlined$viewModels$default$3(b), new DefaultLanguageFragment$special$$inlined$viewModels$default$4((pc2) null, b), new DefaultLanguageFragment$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: C */
    public static final void m68040C(DefaultLanguageFragment defaultLanguageFragment, View view) {
        vx2.m53591g(defaultLanguageFragment, "this$0");
        defaultLanguageFragment.mo50752i();
    }

    /* renamed from: A */
    public final ProgressLoading mo58125A() {
        return (ProgressLoading) this.f42403x.getValue();
    }

    /* renamed from: B */
    public final String mo58126B() {
        return this.f42399A;
    }

    /* renamed from: D */
    public final void mo58127D(String str) {
        vx2.m53591g(str, "<set-?>");
        this.f42399A = str;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        o92 a = o92.m49220a(layoutInflater.inflate(R.layout.fragment_default_language, viewGroup, false));
        vx2.m53590f(a, "bind(inflater.inflate(R.…guage, container, false))");
        this.f42400k = a;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        ConstraintLayout b = a.mo46358b();
        vx2.m53590f(b, "binding.root");
        return b;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        o92 o92 = this.f42400k;
        if (o92 == null) {
            vx2.m53605u("binding");
            o92 = null;
        }
        o92.f32321d.f21127e.setText(R.string.default_language);
        o92.f32321d.f21125c.setOnClickListener(new t81(this));
        o92.f32320c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        o92.f32320c.setAdapter(mo58128x());
        o92.f32319b.addTextChangedListener(new C8574a(this));
        mo58128x().mo66857f(mo58130z(this.f42399A));
    }

    /* renamed from: x */
    public final DefaultLanguageFragment$defaultLanguageAdapter$2.C8576a mo58128x() {
        return (DefaultLanguageFragment$defaultLanguageAdapter$2.C8576a) this.f42404y.getValue();
    }

    /* renamed from: y */
    public final FcmDataSource mo58129y() {
        return (FcmDataSource) this.f42402s.getValue();
    }

    /* renamed from: z */
    public final List<LanguageItem> mo58130z(String str) {
        boolean z;
        List<LanguageItem> b = ee3.f37527a.mo51453b();
        ArrayList arrayList = new ArrayList();
        for (T next : b) {
            LanguageItem languageItem = (LanguageItem) next;
            String string = requireActivity().getString(languageItem.getTitleResId());
            vx2.m53590f(string, "requireActivity().getString(it.titleResId)");
            String string2 = requireActivity().getString(languageItem.getRegionResId());
            vx2.m53590f(string2, "requireActivity().getString(it.regionResId)");
            boolean z2 = true;
            if (StringsKt__StringsKt.m63090V0(str).toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Locale locale = Locale.ROOT;
                String lowerCase = string.toLowerCase(locale);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = str.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (!StringsKt__StringsKt.m63081R(lowerCase, StringsKt__StringsKt.m63090V0(lowerCase2).toString(), false, 2, (Object) null)) {
                    String lowerCase3 = languageItem.getLanguageCode().toLowerCase(locale);
                    vx2.m53590f(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase4 = str.toLowerCase(locale);
                    vx2.m53590f(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (!StringsKt__StringsKt.m63081R(lowerCase3, StringsKt__StringsKt.m63090V0(lowerCase4).toString(), false, 2, (Object) null)) {
                        String lowerCase5 = string2.toLowerCase(locale);
                        vx2.m53590f(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase6 = str.toLowerCase(locale);
                        vx2.m53590f(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!StringsKt__StringsKt.m63081R(lowerCase5, StringsKt__StringsKt.m63090V0(lowerCase6).toString(), false, 2, (Object) null)) {
                            z2 = false;
                        }
                    }
                }
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.m47313M0(arrayList);
    }
}
