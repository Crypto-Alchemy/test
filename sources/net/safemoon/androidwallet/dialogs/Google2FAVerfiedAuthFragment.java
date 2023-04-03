package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.viewmodels.GoogleAuthViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001b\u0010\u000f\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'¨\u0006-"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/Google2FAVerfiedAuthFragment;", "Lkf1;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "K", "onStart", "Landroid/content/Context;", "context", "onAttach", "onDetach", "Landroid/content/ClipboardManager;", "P", "Lef3;", "F", "()Landroid/content/ClipboardManager;", "Ljp2;", "Q", "E", "()Ljp2;", "iVerfied", "Ls92;", "U", "Ls92;", "binding", "Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "X", "D", "()Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "authModel", "<init>", "()V", "Y", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Google2FAVerfiedAuthFragment.kt */
public final class Google2FAVerfiedAuthFragment extends kf1 {

    /* renamed from: Y */
    public static final C8294a f41746Y = new C8294a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public final ef3 f41747P = C6169a.m47232a(new Google2FAVerfiedAuthFragment$manager$2(this));

    /* renamed from: Q */
    public final ef3 f41748Q = C6169a.m47232a(new Google2FAVerfiedAuthFragment$iVerfied$2(this));

    /* renamed from: U */
    public s92 f41749U;

    /* renamed from: X */
    public final ef3 f41750X = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(GoogleAuthViewModel.class), new C8296x82ee2cdf(this), new C8297x82ee2ce0((pc2) null, this), new C8298x82ee2ce1(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/Google2FAVerfiedAuthFragment$a;", "", "Lnet/safemoon/androidwallet/dialogs/Google2FAVerfiedAuthFragment;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.Google2FAVerfiedAuthFragment$a */
    /* compiled from: Google2FAVerfiedAuthFragment.kt */
    public static final class C8294a {
        public C8294a() {
        }

        public /* synthetic */ C8294a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Google2FAVerfiedAuthFragment mo57232a() {
            return new Google2FAVerfiedAuthFragment();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/Google2FAVerfiedAuthFragment$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.Google2FAVerfiedAuthFragment$b */
    /* compiled from: Google2FAVerfiedAuthFragment.kt */
    public static final class C8295b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ Google2FAVerfiedAuthFragment f41751a;

        public C8295b(Google2FAVerfiedAuthFragment google2FAVerfiedAuthFragment) {
            this.f41751a = google2FAVerfiedAuthFragment;
        }

        public void afterTextChanged(Editable editable) {
            s92 C = this.f41751a.f41749U;
            if (C == null) {
                vx2.m53605u("binding");
                C = null;
            }
            C.f33799f.setText("");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: G */
    public static final void m66059G(Google2FAVerfiedAuthFragment google2FAVerfiedAuthFragment, View view) {
        vx2.m53591g(google2FAVerfiedAuthFragment, "this$0");
        Dialog n = google2FAVerfiedAuthFragment.mo22269n();
        if (n != null) {
            n.dismiss();
        }
    }

    /* renamed from: H */
    public static final void m66060H(Google2FAVerfiedAuthFragment google2FAVerfiedAuthFragment, View view) {
        vx2.m53591g(google2FAVerfiedAuthFragment, "this$0");
        ClipData primaryClip = google2FAVerfiedAuthFragment.mo57230F().getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getText() != null) {
            String obj = primaryClip.getItemAt(0).getText().toString();
            if (obj.length() == 6) {
                s92 s92 = google2FAVerfiedAuthFragment.f41749U;
                if (s92 == null) {
                    vx2.m53605u("binding");
                    s92 = null;
                }
                s92.f33798e.setText(obj);
            }
        }
    }

    /* renamed from: I */
    public static final void m66061I(Google2FAVerfiedAuthFragment google2FAVerfiedAuthFragment, View view) {
        vx2.m53591g(google2FAVerfiedAuthFragment, "this$0");
        s92 s92 = google2FAVerfiedAuthFragment.f41749U;
        s92 s922 = null;
        if (s92 == null) {
            vx2.m53605u("binding");
            s92 = null;
        }
        if (s92.f33798e.getEditableText().length() != 6) {
            s92 s923 = google2FAVerfiedAuthFragment.f41749U;
            if (s923 == null) {
                vx2.m53605u("binding");
            } else {
                s922 = s923;
            }
            s922.f33799f.setText(google2FAVerfiedAuthFragment.getString(R.string.invalid_input));
            return;
        }
        s92 s924 = google2FAVerfiedAuthFragment.f41749U;
        if (s924 == null) {
            vx2.m53605u("binding");
            s924 = null;
        }
        if (vx2.m53586b(s924.f33798e.getEditableText().toString(), google2FAVerfiedAuthFragment.mo57228D().mo61206i(google2FAVerfiedAuthFragment.mo57228D().mo61205h().getValue()))) {
            f06.m57524o(google2FAVerfiedAuthFragment.requireContext(), "AUTH_2FA_KEY", google2FAVerfiedAuthFragment.mo57228D().mo61205h().getValue());
            Context requireContext = google2FAVerfiedAuthFragment.requireContext();
            Boolean bool = Boolean.TRUE;
            f06.m57523n(requireContext, "AUTH_2FA_IS_ENABLE", bool);
            google2FAVerfiedAuthFragment.mo57228D().mo61203f().setValue(bool);
            jp2 E = google2FAVerfiedAuthFragment.mo57229E();
            if (E != null) {
                E.mo52764f();
            }
            google2FAVerfiedAuthFragment.mo22266k();
            return;
        }
        s92 s925 = google2FAVerfiedAuthFragment.f41749U;
        if (s925 == null) {
            vx2.m53605u("binding");
        } else {
            s922 = s925;
        }
        s922.f33799f.setText(google2FAVerfiedAuthFragment.getString(R.string.auth_2fa_error));
    }

    /* renamed from: J */
    public static final void m66062J(Google2FAVerfiedAuthFragment google2FAVerfiedAuthFragment, View view) {
        vx2.m53591g(google2FAVerfiedAuthFragment, "this$0");
        Google2FABackup a = Google2FABackup.f41743U.mo57225a();
        FragmentManager childFragmentManager = google2FAVerfiedAuthFragment.getChildFragmentManager();
        vx2.m53590f(childFragmentManager, "childFragmentManager");
        a.mo57224K(childFragmentManager);
    }

    /* renamed from: D */
    public final GoogleAuthViewModel mo57228D() {
        return (GoogleAuthViewModel) this.f41750X.getValue();
    }

    /* renamed from: E */
    public final jp2 mo57229E() {
        return (jp2) this.f41748Q.getValue();
    }

    /* renamed from: F */
    public final ClipboardManager mo57230F() {
        return (ClipboardManager) this.f41747P.getValue();
    }

    /* renamed from: K */
    public final void mo57231K(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, Google2FAVerfiedAuthFragment.class.getCanonicalName());
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_google2fa_verfied_auth, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog n = mo22269n();
        if (n != null && (window = n.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        vx2.m53591g(view, "view");
        super.onViewCreated(view, bundle);
        s92 a = s92.m51632a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41749U = a;
        s92 s92 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f33797d.setOnClickListener(new uh2(this));
        s92 s922 = this.f41749U;
        if (s922 == null) {
            vx2.m53605u("binding");
            s922 = null;
        }
        s922.f33796c.setOnClickListener(new vh2(this));
        s92 s923 = this.f41749U;
        if (s923 == null) {
            vx2.m53605u("binding");
            s923 = null;
        }
        s923.f33795b.setOnClickListener(new wh2(this));
        s92 s924 = this.f41749U;
        if (s924 == null) {
            vx2.m53605u("binding");
            s924 = null;
        }
        s924.f33802i.setOnClickListener(new xh2(this));
        s92 s925 = this.f41749U;
        if (s925 == null) {
            vx2.m53605u("binding");
        } else {
            s92 = s925;
        }
        s92.f33798e.addTextChangedListener(new C8295b(this));
    }
}
