package net.safemoon.androidwallet.fragments;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.C0684j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.fragments.common.BaseMainFragment;
import net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/AddCustomReflectionContractFragment;", "Lnet/safemoon/androidwallet/fragments/common/BaseMainFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroidx/fragment/app/Fragment;", "newFragment", "M", "Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel;", "k", "Lef3;", "C", "()Lnet/safemoon/androidwallet/viewmodels/CustomReflectionContractTokenViewModel;", "customReflectionContractTokenViewModel", "La92;", "r", "La92;", "binding", "<init>", "()V", "s", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AddCustomReflectionContractFragment.kt */
public final class AddCustomReflectionContractFragment extends BaseMainFragment {

    /* renamed from: s */
    public static final C8347a f41865s = new C8347a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public final ef3 f41866k;

    /* renamed from: r */
    public a92 f41867r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/fragments/AddCustomReflectionContractFragment$a;", "", "", "BUNDLE_KEY_TOKEN_TYPE", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment$a */
    /* compiled from: AddCustomReflectionContractFragment.kt */
    public static final class C8347a {
        public C8347a() {
        }

        public /* synthetic */ C8347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"net/safemoon/androidwallet/fragments/AddCustomReflectionContractFragment$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment$b */
    /* compiled from: TextView.kt */
    public static final class C8348b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AddCustomReflectionContractFragment f41868a;

        /* renamed from: d */
        public final /* synthetic */ a92 f41869d;

        public C8348b(AddCustomReflectionContractFragment addCustomReflectionContractFragment, a92 a92) {
            this.f41868a = addCustomReflectionContractFragment;
            this.f41869d = a92;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r6) {
            /*
                r5 = this;
                java.lang.String r6 = java.lang.String.valueOf(r6)
                net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment r0 = r5.f41868a
                net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel r0 = r0.mo57393C()
                net.safemoon.androidwallet.common.TokenType r0 = r0.mo61190t()
                if (r0 == 0) goto L_0x0061
                boolean r0 = p000.bd0.m55843a(r6, r0)
                a92 r1 = r5.f41869d
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
                a92 r1 = r5.f41869d
                net.safemoon.androidwallet.views.MyTextInputLayout r1 = r1.f20839h
                if (r0 != 0) goto L_0x0048
                int r4 = r6.length()
                if (r4 != 0) goto L_0x003b
                r2 = r3
            L_0x003b:
                if (r2 == 0) goto L_0x003e
                goto L_0x0048
            L_0x003e:
                net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment r2 = r5.f41868a
                r3 = 2131951997(0x7f13017d, float:1.9540424E38)
                java.lang.String r2 = r2.getString(r3)
                goto L_0x0049
            L_0x0048:
                r2 = 0
            L_0x0049:
                r1.setError(r2)
                if (r0 == 0) goto L_0x0058
                net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment r0 = r5.f41868a
                net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel r0 = r0.mo57393C()
                r0.mo61182l(r6)
                goto L_0x0061
            L_0x0058:
                net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment r6 = r5.f41868a
                net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel r6 = r6.mo57393C()
                r6.mo61177g()
            L_0x0061:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment.C8348b.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public AddCustomReflectionContractFragment() {
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.NONE, new C8350x7d28c707(new C8349x7d28c706(this)));
        this.f41866k = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(CustomReflectionContractTokenViewModel.class), new C8351x7d28c708(b), new C8352x7d28c709((pc2) null, b), new C8353x7d28c70a(this, b));
    }

    /* renamed from: D */
    public static final void m66376D(AddCustomReflectionContractFragment addCustomReflectionContractFragment, View view) {
        vx2.m53591g(addCustomReflectionContractFragment, "this$0");
        addCustomReflectionContractFragment.mo50752i();
    }

    /* renamed from: E */
    public static final void m66377E(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: F */
    public static final void m66378F(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0136, code lost:
        if (r12 == true) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m66379G(net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment r10, p000.a92 r11, android.view.View r12) {
        /*
            java.lang.String r12 = "this$0"
            p000.vx2.m53591g(r10, r12)
            java.lang.String r12 = "$this_apply"
            p000.vx2.m53591g(r11, r12)
            net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel r12 = r10.mo57393C()
            net.safemoon.androidwallet.common.TokenType r12 = r12.mo61190t()
            if (r12 == 0) goto L_0x01b2
            net.safemoon.androidwallet.views.MyTextInputLayout r0 = r11.f20839h
            android.widget.EditText r0 = r0.getEditText()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            android.text.Editable r0 = r0.getText()
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r12 = p000.bd0.m55843a(r0, r12)
            if (r12 != 0) goto L_0x003b
            net.safemoon.androidwallet.views.MyTextInputLayout r11 = r11.f20839h
            r12 = 2131951997(0x7f13017d, float:1.9540424E38)
            java.lang.String r10 = r10.getString(r12)
            r11.setError(r10)
            goto L_0x01b2
        L_0x003b:
            net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel r12 = r10.mo57393C()
            androidx.lifecycle.LiveData r12 = r12.mo61181k()
            java.lang.Object r12 = r12.getValue()
            java.util.List r12 = (java.util.List) r12
            java.lang.String r0 = "text"
            r2 = 1
            if (r12 == 0) goto L_0x00a0
            java.lang.String r3 = "value"
            p000.vx2.m53590f(r12, r3)
            java.util.Iterator r12 = r12.iterator()
        L_0x0057:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r12.next()
            r4 = r3
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r4 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r4
            java.lang.String r4 = r4.getContractAddress()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r4, r6)
            net.safemoon.androidwallet.views.MyTextInputLayout r7 = r11.f20839h
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
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r3 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r3
            goto L_0x00a1
        L_0x00a0:
            r3 = r1
        L_0x00a1:
            if (r3 == 0) goto L_0x00b1
            net.safemoon.androidwallet.views.MyTextInputLayout r11 = r11.f20839h
            r12 = 2131951996(0x7f13017c, float:1.9540422E38)
            java.lang.String r10 = r10.getString(r12)
            r11.setError(r10)
            goto L_0x01b2
        L_0x00b1:
            com.google.android.material.textfield.TextInputLayout r12 = r11.f20841j
            android.widget.EditText r12 = r12.getEditText()
            r3 = 0
            if (r12 == 0) goto L_0x00d6
            android.text.Editable r12 = r12.getText()
            if (r12 == 0) goto L_0x00d6
            p000.vx2.m53590f(r12, r0)
            java.lang.CharSequence r12 = kotlin.text.StringsKt__StringsKt.m63090V0(r12)
            if (r12 == 0) goto L_0x00d6
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00d1
            r12 = r2
            goto L_0x00d2
        L_0x00d1:
            r12 = r3
        L_0x00d2:
            if (r12 != r2) goto L_0x00d6
            r12 = r2
            goto L_0x00d7
        L_0x00d6:
            r12 = r3
        L_0x00d7:
            if (r12 == 0) goto L_0x00e7
            com.google.android.material.textfield.TextInputLayout r11 = r11.f20841j
            r12 = 2131951999(0x7f13017f, float:1.9540428E38)
            java.lang.String r10 = r10.getString(r12)
            r11.setError(r10)
            goto L_0x01b2
        L_0x00e7:
            com.google.android.material.textfield.TextInputLayout r12 = r11.f20842k
            android.widget.EditText r12 = r12.getEditText()
            if (r12 == 0) goto L_0x010b
            android.text.Editable r12 = r12.getText()
            if (r12 == 0) goto L_0x010b
            p000.vx2.m53590f(r12, r0)
            java.lang.CharSequence r12 = kotlin.text.StringsKt__StringsKt.m63090V0(r12)
            if (r12 == 0) goto L_0x010b
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0106
            r12 = r2
            goto L_0x0107
        L_0x0106:
            r12 = r3
        L_0x0107:
            if (r12 != r2) goto L_0x010b
            r12 = r2
            goto L_0x010c
        L_0x010b:
            r12 = r3
        L_0x010c:
            if (r12 == 0) goto L_0x011c
            com.google.android.material.textfield.TextInputLayout r11 = r11.f20842k
            r12 = 2131952000(0x7f130180, float:1.954043E38)
            java.lang.String r10 = r10.getString(r12)
            r11.setError(r10)
            goto L_0x01b2
        L_0x011c:
            com.google.android.material.textfield.TextInputLayout r12 = r11.f20840i
            android.widget.EditText r12 = r12.getEditText()
            if (r12 == 0) goto L_0x0139
            android.text.Editable r12 = r12.getText()
            if (r12 == 0) goto L_0x0139
            p000.vx2.m53590f(r12, r0)
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0135
            r12 = r2
            goto L_0x0136
        L_0x0135:
            r12 = r3
        L_0x0136:
            if (r12 != r2) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r2 = r3
        L_0x013a:
            if (r2 == 0) goto L_0x0149
            com.google.android.material.textfield.TextInputLayout r11 = r11.f20840i
            r12 = 2131951998(0x7f13017e, float:1.9540426E38)
            java.lang.String r10 = r10.getString(r12)
            r11.setError(r10)
            goto L_0x01b2
        L_0x0149:
            com.google.android.material.button.MaterialButton r12 = r11.f20834c
            r12.setEnabled(r3)
            net.safemoon.androidwallet.viewmodels.CustomReflectionContractTokenViewModel r4 = r10.mo57393C()
            net.safemoon.androidwallet.views.MyTextInputLayout r12 = r11.f20839h
            android.widget.EditText r12 = r12.getEditText()
            if (r12 == 0) goto L_0x015f
            android.text.Editable r12 = r12.getText()
            goto L_0x0160
        L_0x015f:
            r12 = r1
        L_0x0160:
            java.lang.String r5 = java.lang.String.valueOf(r12)
            com.google.android.material.textfield.TextInputLayout r12 = r11.f20841j
            android.widget.EditText r12 = r12.getEditText()
            if (r12 == 0) goto L_0x017a
            android.text.Editable r12 = r12.getText()
            if (r12 == 0) goto L_0x017a
            p000.vx2.m53590f(r12, r0)
            java.lang.CharSequence r12 = kotlin.text.StringsKt__StringsKt.m63090V0(r12)
            goto L_0x017b
        L_0x017a:
            r12 = r1
        L_0x017b:
            java.lang.String r6 = java.lang.String.valueOf(r12)
            com.google.android.material.textfield.TextInputLayout r12 = r11.f20842k
            android.widget.EditText r12 = r12.getEditText()
            if (r12 == 0) goto L_0x0195
            android.text.Editable r12 = r12.getText()
            if (r12 == 0) goto L_0x0195
            p000.vx2.m53590f(r12, r0)
            java.lang.CharSequence r12 = kotlin.text.StringsKt__StringsKt.m63090V0(r12)
            goto L_0x0196
        L_0x0195:
            r12 = r1
        L_0x0196:
            java.lang.String r7 = java.lang.String.valueOf(r12)
            com.google.android.material.textfield.TextInputLayout r12 = r11.f20840i
            android.widget.EditText r12 = r12.getEditText()
            if (r12 == 0) goto L_0x01a6
            android.text.Editable r1 = r12.getText()
        L_0x01a6:
            java.lang.String r8 = java.lang.String.valueOf(r1)
            net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment$onViewCreated$1$10$1$1 r9 = new net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment$onViewCreated$1$10$1$1
            r9.<init>(r11, r10)
            r4.mo61194x(r5, r6, r7, r8, r9)
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment.m66379G(net.safemoon.androidwallet.fragments.AddCustomReflectionContractFragment, a92, android.view.View):void");
    }

    /* renamed from: H */
    public static final void m66380H(AddCustomReflectionContractFragment addCustomReflectionContractFragment, View view) {
        vx2.m53591g(addCustomReflectionContractFragment, "this$0");
        addCustomReflectionContractFragment.mo57394M(new ChainNetworkReflectionFragment());
    }

    /* renamed from: I */
    public static final void m66381I(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: J */
    public static final void m66382J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K */
    public static final void m66383K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public static final void m66384L(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: C */
    public final CustomReflectionContractTokenViewModel mo57393C() {
        return (CustomReflectionContractTokenViewModel) this.f41866k.getValue();
    }

    /* renamed from: M */
    public final void mo57394M(Fragment fragment) {
        a77.m55427e(requireActivity());
        C0684j q = getChildFragmentManager().mo5996q();
        vx2.m53590f(q, "childFragmentManager.beginTransaction()");
        vx2.m53588d(fragment);
        q.mo6261b(R.id.content_main, fragment);
        q.mo6267h((String) null);
        q.mo6139j();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_add_custom_contract, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Object obj;
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        a92 a = a92.m31752a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41867r = a;
        Bundle arguments = getArguments();
        a92 a92 = null;
        if (arguments != null) {
            obj = arguments.get("tokenChainId");
        } else {
            obj = null;
        }
        if (obj != null) {
            mo57393C().mo61193w(TokenType.Companion.mo57099b(requireArguments().getInt("tokenChainId")));
        }
        a92 a922 = this.f41867r;
        if (a922 == null) {
            vx2.m53605u("binding");
        } else {
            a92 = a922;
        }
        a92.f20845n.f21125c.setOnClickListener(new C6858bc(this));
        a92.f20845n.f21127e.setText(R.string.screen_title_add_reflections_token);
        mo57393C().mo61189s().observe(getViewLifecycleOwner(), new C6930cc(new AddCustomReflectionContractFragment$onViewCreated$1$2(a92)));
        a92.f20838g.setOnClickListener(new C6967dc(this));
        a92.f20839h.setUpDefaultView();
        EditText editText = a92.f20839h.getEditText();
        vx2.m53588d(editText);
        editText.addTextChangedListener(new C8348b(this, a92));
        mo57393C().mo61191u().observe(getViewLifecycleOwner(), new C7029ec(new AddCustomReflectionContractFragment$onViewCreated$1$5(this, a92)));
        mo57393C().mo61186p().observe(getViewLifecycleOwner(), new C7073fc(new AddCustomReflectionContractFragment$onViewCreated$1$6(a92)));
        mo57393C().mo61192v().observe(getViewLifecycleOwner(), new C7123gc(new AddCustomReflectionContractFragment$onViewCreated$1$7(a92, this)));
        mo57393C().mo61185o().observe(getViewLifecycleOwner(), new C7171hc(new AddCustomReflectionContractFragment$onViewCreated$1$8(a92)));
        mo57393C().mo61181k().observe(getViewLifecycleOwner(), new C7212ic(AddCustomReflectionContractFragment$onViewCreated$1$9.INSTANCE));
        a92.f20834c.setOnClickListener(new C7259jc(this, a92));
    }
}
