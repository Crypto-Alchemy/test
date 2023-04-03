package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel;
import net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/AddCustomContractFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel;", "k", "Lef3;", "E", "()Lnet/safemoon/androidwallet/viewmodels/CustomContractTokenViewModel;", "customContractTokenViewModel", "Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "r", "D", "()Lnet/safemoon/androidwallet/viewmodels/AddNewTokensViewModel;", "addNewTokensViewModel", "La92;", "s", "La92;", "binding", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomContractFragment.kt */
public final class AddCustomContractFragment extends BaseMainFragment {

    /* renamed from: k */
    public final ef3 f41860k;

    /* renamed from: r */
    public final ef3 f41861r;

    /* renamed from: s */
    public a92 f41862s;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/AddCustomContractFragment$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AddCustomContractFragment$a */
    /* compiled from: TextView.kt */
    public static final class C8346a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AddCustomContractFragment f41863a;

        /* renamed from: d */
        public final /* synthetic */ a92 f41864d;

        public C8346a(AddCustomContractFragment addCustomContractFragment, a92 a92) {
            this.f41863a = addCustomContractFragment;
            this.f41864d = a92;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r6) {
            /*
                r5 = this;
                java.lang.String r6 = java.lang.String.valueOf(r6)
                net.safemoon.androidwallet.fragments.AddCustomContractFragment r0 = r5.f41863a
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r0 = r0.mo57382E()
                net.safemoon.androidwallet.common.TokenType r0 = r0.mo61165x()
                if (r0 == 0) goto L_0x0061
                boolean r0 = p000.bd0.m55843a(r6, r0)
                a92 r1 = r5.f41864d
                net.safemoon.androidwallet.views.MyTextInputLayout r1 = r1.f20839h
                r2 = 0
                r3 = 1
                if (r0 == 0) goto L_0x002a
                int r4 = r6.length()
                if (r4 != 0) goto L_0x0024
                r4 = r3
                goto L_0x0025
            L_0x0024:
                r4 = r2
            L_0x0025:
                if (r4 == 0) goto L_0x0028
                goto L_0x002a
            L_0x0028:
                r4 = r2
                goto L_0x002b
            L_0x002a:
                r4 = r3
            L_0x002b:
                r1.setErrorEnabled(r4)
                a92 r1 = r5.f41864d
                net.safemoon.androidwallet.views.MyTextInputLayout r1 = r1.f20839h
                if (r0 != 0) goto L_0x0048
                int r4 = r6.length()
                if (r4 != 0) goto L_0x003b
                r2 = r3
            L_0x003b:
                if (r2 == 0) goto L_0x003e
                goto L_0x0048
            L_0x003e:
                net.safemoon.androidwallet.fragments.AddCustomContractFragment r2 = r5.f41863a
                r3 = 2131951997(0x7f13017d, float:1.9540424E38)
                java.lang.String r2 = r2.getString(r3)
                goto L_0x0049
            L_0x0048:
                r2 = 0
            L_0x0049:
                r1.setError(r2)
                if (r0 == 0) goto L_0x0058
                net.safemoon.androidwallet.fragments.AddCustomContractFragment r0 = r5.f41863a
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r0 = r0.mo57382E()
                r0.mo61157p(r6)
                goto L_0x0061
            L_0x0058:
                net.safemoon.androidwallet.fragments.AddCustomContractFragment r6 = r5.f41863a
                net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r6 = r6.mo57382E()
                r6.mo61152k()
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.AddCustomContractFragment.C8346a.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public AddCustomContractFragment() {
        AddCustomContractFragment$customContractTokenViewModel$2 addCustomContractFragment$customContractTokenViewModel$2 = new AddCustomContractFragment$customContractTokenViewModel$2(this);
        AddCustomContractFragment$special$$inlined$viewModels$default$1 addCustomContractFragment$special$$inlined$viewModels$default$1 = new AddCustomContractFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        ef3 b = C6169a.m47233b(lazyThreadSafetyMode, new AddCustomContractFragment$special$$inlined$viewModels$default$2(addCustomContractFragment$special$$inlined$viewModels$default$1));
        this.f41860k = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CustomContractTokenViewModel.class), new AddCustomContractFragment$special$$inlined$viewModels$default$3(b), new AddCustomContractFragment$special$$inlined$viewModels$default$4((pc2) null, b), addCustomContractFragment$customContractTokenViewModel$2);
        AddCustomContractFragment$addNewTokensViewModel$2 addCustomContractFragment$addNewTokensViewModel$2 = new AddCustomContractFragment$addNewTokensViewModel$2(this);
        ef3 b2 = C6169a.m47233b(lazyThreadSafetyMode, new AddCustomContractFragment$special$$inlined$viewModels$default$7(new AddCustomContractFragment$special$$inlined$viewModels$default$6(this)));
        this.f41861r = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(AddNewTokensViewModel.class), new AddCustomContractFragment$special$$inlined$viewModels$default$8(b2), new AddCustomContractFragment$special$$inlined$viewModels$default$9((pc2) null, b2), addCustomContractFragment$addNewTokensViewModel$2);
    }

    /* renamed from: F */
    public static final void m66352F(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: G */
    public static final void m66353G(AddCustomContractFragment addCustomContractFragment, View view) {
        vx2.m53591g(addCustomContractFragment, "this$0");
        addCustomContractFragment.mo50752i();
    }

    /* renamed from: H */
    public static final void m66354H(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0136, code lost:
        if (r10 == true) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m66355I(net.safemoon.androidwallet.fragments.AddCustomContractFragment r8, p000.a92 r9, android.view.View r10) {
        /*
            java.lang.String r10 = "this$0"
            p000.vx2.m53591g(r8, r10)
            java.lang.String r10 = "$this_apply"
            p000.vx2.m53591g(r9, r10)
            net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r10 = r8.mo57382E()
            net.safemoon.androidwallet.common.TokenType r10 = r10.mo61165x()
            if (r10 == 0) goto L_0x01b3
            net.safemoon.androidwallet.views.MyTextInputLayout r0 = r9.f20839h
            android.widget.EditText r0 = r0.getEditText()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            android.text.Editable r0 = r0.getText()
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r10 = p000.bd0.m55843a(r0, r10)
            if (r10 != 0) goto L_0x003b
            net.safemoon.androidwallet.views.MyTextInputLayout r9 = r9.f20839h
            r10 = 2131951997(0x7f13017d, float:1.9540424E38)
            java.lang.String r8 = r8.getString(r10)
            r9.setError(r8)
            goto L_0x01b3
        L_0x003b:
            net.safemoon.androidwallet.viewmodels.AddNewTokensViewModel r10 = r8.mo57381D()
            k04 r10 = r10.mo60964k()
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.lang.String r0 = "text"
            r2 = 1
            if (r10 == 0) goto L_0x00a0
            java.lang.String r3 = "value"
            p000.vx2.m53590f(r10, r3)
            java.util.Iterator r10 = r10.iterator()
        L_0x0057:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r10.next()
            r4 = r3
            vc r4 = (p000.C9449vc) r4
            java.lang.String r4 = r4.mo66468a()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r4, r6)
            net.safemoon.androidwallet.views.MyTextInputLayout r7 = r9.f20839h
            android.widget.EditText r7 = r7.getEditText()
            if (r7 == 0) goto L_0x0089
            android.text.Editable r7 = r7.getText()
            if (r7 == 0) goto L_0x0089
            p000.vx2.m53590f(r7, r0)
            java.lang.CharSequence r7 = kotlin.text.StringsKt__StringsKt.m63090V0(r7)
            goto L_0x008a
        L_0x0089:
            r7 = r1
        L_0x008a:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r5 = r7.toLowerCase(r5)
            p000.vx2.m53590f(r5, r6)
            boolean r4 = p000.yb6.m74344y(r4, r5, r2)
            if (r4 == 0) goto L_0x0057
            goto L_0x009d
        L_0x009c:
            r3 = r1
        L_0x009d:
            vc r3 = (p000.C9449vc) r3
            goto L_0x00a1
        L_0x00a0:
            r3 = r1
        L_0x00a1:
            if (r3 == 0) goto L_0x00b1
            net.safemoon.androidwallet.views.MyTextInputLayout r9 = r9.f20839h
            r10 = 2131951996(0x7f13017c, float:1.9540422E38)
            java.lang.String r8 = r8.getString(r10)
            r9.setError(r8)
            goto L_0x01b3
        L_0x00b1:
            com.google.android.material.textfield.TextInputLayout r10 = r9.f20841j
            android.widget.EditText r10 = r10.getEditText()
            r3 = 0
            if (r10 == 0) goto L_0x00d6
            android.text.Editable r10 = r10.getText()
            if (r10 == 0) goto L_0x00d6
            p000.vx2.m53590f(r10, r0)
            java.lang.CharSequence r10 = kotlin.text.StringsKt__StringsKt.m63090V0(r10)
            if (r10 == 0) goto L_0x00d6
            int r10 = r10.length()
            if (r10 != 0) goto L_0x00d1
            r10 = r2
            goto L_0x00d2
        L_0x00d1:
            r10 = r3
        L_0x00d2:
            if (r10 != r2) goto L_0x00d6
            r10 = r2
            goto L_0x00d7
        L_0x00d6:
            r10 = r3
        L_0x00d7:
            if (r10 == 0) goto L_0x00e7
            com.google.android.material.textfield.TextInputLayout r9 = r9.f20841j
            r10 = 2131951999(0x7f13017f, float:1.9540428E38)
            java.lang.String r8 = r8.getString(r10)
            r9.setError(r8)
            goto L_0x01b3
        L_0x00e7:
            com.google.android.material.textfield.TextInputLayout r10 = r9.f20842k
            android.widget.EditText r10 = r10.getEditText()
            if (r10 == 0) goto L_0x010b
            android.text.Editable r10 = r10.getText()
            if (r10 == 0) goto L_0x010b
            p000.vx2.m53590f(r10, r0)
            java.lang.CharSequence r10 = kotlin.text.StringsKt__StringsKt.m63090V0(r10)
            if (r10 == 0) goto L_0x010b
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0106
            r10 = r2
            goto L_0x0107
        L_0x0106:
            r10 = r3
        L_0x0107:
            if (r10 != r2) goto L_0x010b
            r10 = r2
            goto L_0x010c
        L_0x010b:
            r10 = r3
        L_0x010c:
            if (r10 == 0) goto L_0x011c
            com.google.android.material.textfield.TextInputLayout r9 = r9.f20842k
            r10 = 2131952000(0x7f130180, float:1.954043E38)
            java.lang.String r8 = r8.getString(r10)
            r9.setError(r8)
            goto L_0x01b3
        L_0x011c:
            com.google.android.material.textfield.TextInputLayout r10 = r9.f20840i
            android.widget.EditText r10 = r10.getEditText()
            if (r10 == 0) goto L_0x0139
            android.text.Editable r10 = r10.getText()
            if (r10 == 0) goto L_0x0139
            p000.vx2.m53590f(r10, r0)
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0135
            r10 = r2
            goto L_0x0136
        L_0x0135:
            r10 = r3
        L_0x0136:
            if (r10 != r2) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r2 = r3
        L_0x013a:
            if (r2 == 0) goto L_0x014a
            com.google.android.material.textfield.TextInputLayout r9 = r9.f20840i
            r10 = 2131951998(0x7f13017e, float:1.9540426E38)
            java.lang.String r8 = r8.getString(r10)
            r9.setError(r8)
            goto L_0x01b3
        L_0x014a:
            net.safemoon.androidwallet.viewmodels.CustomContractTokenViewModel r10 = r8.mo57382E()
            net.safemoon.androidwallet.views.MyTextInputLayout r2 = r9.f20839h
            android.widget.EditText r2 = r2.getEditText()
            if (r2 == 0) goto L_0x015b
            android.text.Editable r2 = r2.getText()
            goto L_0x015c
        L_0x015b:
            r2 = r1
        L_0x015c:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.google.android.material.textfield.TextInputLayout r3 = r9.f20841j
            android.widget.EditText r3 = r3.getEditText()
            if (r3 == 0) goto L_0x0176
            android.text.Editable r3 = r3.getText()
            if (r3 == 0) goto L_0x0176
            p000.vx2.m53590f(r3, r0)
            java.lang.CharSequence r3 = kotlin.text.StringsKt__StringsKt.m63090V0(r3)
            goto L_0x0177
        L_0x0176:
            r3 = r1
        L_0x0177:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.google.android.material.textfield.TextInputLayout r4 = r9.f20842k
            android.widget.EditText r4 = r4.getEditText()
            if (r4 == 0) goto L_0x0191
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x0191
            p000.vx2.m53590f(r4, r0)
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.m63090V0(r4)
            goto L_0x0192
        L_0x0191:
            r0 = r1
        L_0x0192:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.google.android.material.textfield.TextInputLayout r9 = r9.f20840i
            android.widget.EditText r9 = r9.getEditText()
            if (r9 == 0) goto L_0x01a2
            android.text.Editable r1 = r9.getText()
        L_0x01a2:
            java.lang.String r9 = java.lang.String.valueOf(r1)
            net.safemoon.androidwallet.fragments.AddCustomContractFragment$onViewCreated$2$9$1$1 r5 = new net.safemoon.androidwallet.fragments.AddCustomContractFragment$onViewCreated$2$9$1$1
            r5.<init>(r8)
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r9
            r0.mo61151C(r1, r2, r3, r4, r5)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.AddCustomContractFragment.m66355I(net.safemoon.androidwallet.fragments.AddCustomContractFragment, a92, android.view.View):void");
    }

    /* renamed from: J */
    public static final void m66356J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K */
    public static final void m66357K(AddCustomContractFragment addCustomContractFragment, View view) {
        vx2.m53591g(addCustomContractFragment, "this$0");
        j44 a = C6815ac.m55434a();
        vx2.m53590f(a, "actionAddCustomContractF…tToChainNetworkFragment()");
        addCustomContractFragment.mo50753j(a);
    }

    /* renamed from: L */
    public static final void m66358L(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M */
    public static final void m66359M(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: N */
    public static final void m66360N(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: D */
    public final AddNewTokensViewModel mo57381D() {
        return (AddNewTokensViewModel) this.f41861r.getValue();
    }

    /* renamed from: E */
    public final CustomContractTokenViewModel mo57382E() {
        return (CustomContractTokenViewModel) this.f41860k.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_add_custom_contract, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        NavBackStackEntry A;
        dl5 i;
        k04 f;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        a92 a = a92.m31752a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41862s = a;
        NavController h = mo50751h();
        if (!(h == null || (A = h.mo8445A()) == null || (i = A.mo8428i()) == null || (f = i.mo18830f("bundle.TOKEN_CHAIN_KEY")) == null)) {
            f.observe(getViewLifecycleOwner(), new C9242rb(new AddCustomContractFragment$onViewCreated$1(this)));
        }
        a92 a92 = this.f41862s;
        if (a92 == null) {
            vx2.m53605u("binding");
            a92 = null;
        }
        a92.f20845n.f21125c.setOnClickListener(new C9306sb(this));
        a92.f20845n.f21127e.setText(R.string.screen_title_cs_contract);
        mo57382E().mo61164w().observe(getViewLifecycleOwner(), new C9339tb(new AddCustomContractFragment$onViewCreated$2$2(a92, this)));
        a92.f20838g.setOnClickListener(new C9394ub(this));
        a92.f20839h.setUpDefaultView();
        EditText editText = a92.f20839h.getEditText();
        vx2.m53588d(editText);
        editText.addTextChangedListener(new C8346a(this, a92));
        mo57382E().mo61166y().observe(getViewLifecycleOwner(), new C9448vb(new AddCustomContractFragment$onViewCreated$2$5(this, a92)));
        mo57382E().mo61163v().observe(getViewLifecycleOwner(), new C9511wb(new AddCustomContractFragment$onViewCreated$2$6(a92)));
        mo57382E().mo61167z().observe(getViewLifecycleOwner(), new C9589xb(new AddCustomContractFragment$onViewCreated$2$7(a92, this)));
        mo57382E().mo61161t().observe(getViewLifecycleOwner(), new C9632yb(new AddCustomContractFragment$onViewCreated$2$8(a92)));
        a92.f20834c.setOnClickListener(new C9671zb(this, a92));
    }
}
