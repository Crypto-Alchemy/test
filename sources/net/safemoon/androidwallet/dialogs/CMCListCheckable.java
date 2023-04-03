package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.common.BaseBottomSheetDialogFragment;
import net.safemoon.androidwallet.viewmodels.CMCListViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b4\u00105J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00020\r\"\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010*\u001a\u0004\u0018\u00010&8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u0004\u0018\u00010+8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00068"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/CMCListCheckable;", "Lnet/safemoon/androidwallet/dialogs/common/BaseBottomSheetDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "", "", "list", "S", "Landroidx/fragment/app/FragmentManager;", "manager", "T", "Lpn2;", "iCallBack", "R", "Landroid/content/Context;", "context", "onAttach", "Lnet/safemoon/androidwallet/viewmodels/CMCListViewModel;", "U", "Lef3;", "M", "()Lnet/safemoon/androidwallet/viewmodels/CMCListViewModel;", "cmcListViewModel", "Lwh0;", "X", "Lwh0;", "cmcListAdapter", "Y", "Lpn2;", "", "Z", "O", "()Ljava/lang/String;", "screenTitle", "", "e0", "N", "()Ljava/lang/Boolean;", "excludeAppTokens", "Lp26;", "k0", "Lp26;", "binding", "<init>", "()V", "v0", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CMCListCheckable.kt */
public final class CMCListCheckable extends BaseBottomSheetDialogFragment {

    /* renamed from: v0 */
    public static final C8279a f41713v0 = new C8279a((DefaultConstructorMarker) null);

    /* renamed from: U */
    public final ef3 f41714U;

    /* renamed from: X */
    public wh0 f41715X;

    /* renamed from: Y */
    public pn2 f41716Y;

    /* renamed from: Z */
    public final ef3 f41717Z = C6169a.m47232a(new CMCListCheckable$screenTitle$2(this));

    /* renamed from: e0 */
    public final ef3 f41718e0 = C6169a.m47232a(new CMCListCheckable$excludeAppTokens$2(this));

    /* renamed from: k0 */
    public p26 f41719k0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/CMCListCheckable$a;", "", "", "screenTitle", "", "excludeAppTokens", "Lnet/safemoon/androidwallet/dialogs/CMCListCheckable;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.CMCListCheckable$a */
    /* compiled from: CMCListCheckable.kt */
    public static final class C8279a {
        public C8279a() {
        }

        public /* synthetic */ C8279a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CMCListCheckable mo57173a(String str, boolean z) {
            vx2.m53591g(str, "screenTitle");
            CMCListCheckable cMCListCheckable = new CMCListCheckable();
            cMCListCheckable.setArguments(x50.m29897a(new Pair("ARG_SCREEN_TITLE", str), new Pair("ARG_EXCLUDE_APP_TOKENS", Boolean.valueOf(z))));
            return cMCListCheckable;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.CMCListCheckable$b */
    /* compiled from: TextView.kt */
    public static final class C8280b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ CMCListCheckable f41720a;

        public C8280b(CMCListCheckable cMCListCheckable) {
            this.f41720a = cMCListCheckable;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            k04<String> r = this.f41720a.mo57167M().mo60983r();
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            r.postValue(str);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public CMCListCheckable() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new CMCListCheckable$special$$inlined$viewModels$default$2(new CMCListCheckable$special$$inlined$viewModels$default$1(this)));
        this.f41714U = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CMCListViewModel.class), new CMCListCheckable$special$$inlined$viewModels$default$3(b), new CMCListCheckable$special$$inlined$viewModels$default$4((pc2) null, b), new CMCListCheckable$special$$inlined$viewModels$default$5(this, b));
    }

    /* renamed from: P */
    public static final void m65951P(CMCListCheckable cMCListCheckable, View view) {
        vx2.m53591g(cMCListCheckable, "this$0");
        cMCListCheckable.mo22266k();
    }

    /* renamed from: Q */
    public static final void m65952Q(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M */
    public final CMCListViewModel mo57167M() {
        return (CMCListViewModel) this.f41714U.getValue();
    }

    /* renamed from: N */
    public final Boolean mo57168N() {
        return (Boolean) this.f41718e0.getValue();
    }

    /* renamed from: O */
    public final String mo57169O() {
        return (String) this.f41717Z.getValue();
    }

    /* renamed from: R */
    public final void mo57170R(pn2 pn2) {
        vx2.m53591g(pn2, "iCallBack");
        this.f41716Y = pn2;
    }

    /* renamed from: S */
    public final void mo57171S(int... iArr) {
        vx2.m53591g(iArr, "list");
        mo57167M().mo60984s().postValue(ArraysKt___ArraysKt.m47289o0(iArr));
    }

    /* renamed from: T */
    public final void mo57172T(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, CMCListCheckable.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        vx2.m53591g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.simple_list_view, viewGroup, false);
        Dialog n = mo22269n();
        if (!(n == null || (window = n.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        this.f41719k0 = p26.m49675a(view);
        this.f41715X = new wh0(this.f41716Y);
        pn2 pn2 = this.f41716Y;
        if (pn2 != null) {
            pn2.mo57528c();
        }
        p26 p26 = this.f41719k0;
        vx2.m53588d(p26);
        p26.f32541b.f21125c.setOnClickListener(new r70(this));
        p26.f32541b.f21127e.setText(mo57169O());
        TextInputEditText textInputEditText = p26.f32543d.f34980b;
        vx2.m53590f(textInputEditText, "searchBar.etSearch");
        textInputEditText.addTextChangedListener(new C8280b(this));
        p26.f32542c.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        p26.f32542c.setAdapter(this.f41715X);
        mo57167M().mo60981p().postValue(Boolean.valueOf(vx2.m53586b(mo57168N(), Boolean.TRUE)));
        mo57167M().mo60978m();
        mo57167M().mo60980o().observe(this, new s70(new CMCListCheckable$onViewCreated$2(this)));
    }
}
