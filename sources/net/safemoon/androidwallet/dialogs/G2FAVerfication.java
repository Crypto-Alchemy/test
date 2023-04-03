package net.safemoon.androidwallet.dialogs;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 >2\u00020\u0001:\u0002?@B\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b<\u0010=J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u000e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001cR\u0016\u00101\u001a\u00020/8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u00100R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010303028\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X.¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006A"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/G2FAVerfication;", "Lkf1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "Lr37;", "onViewCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "K", "Landroid/content/DialogInterface;", "dialog", "onCancel", "onDestroy", "onStart", "Landroid/content/Context;", "context", "onAttach", "onDetach", "L", "", "P", "Z", "isBioAuthenNext", "()Z", "Landroid/content/ClipboardManager;", "Q", "Lef3;", "G", "()Landroid/content/ClipboardManager;", "Lib2;", "U", "Lib2;", "binding", "Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "X", "F", "()Lnet/safemoon/androidwallet/viewmodels/GoogleAuthViewModel;", "authModel", "Y", "isGASuccess", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "verificationCallback", "Lk04;", "", "kotlin.jvm.PlatformType", "e0", "Lk04;", "remainSecond", "Landroid/os/CountDownTimer;", "k0", "Landroid/os/CountDownTimer;", "countDownTimer", "<init>", "(Z)V", "v0", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: G2FAVerfication.kt */
public final class G2FAVerfication extends kf1 {

    /* renamed from: v0 */
    public static final C8289a f41732v0 = new C8289a((DefaultConstructorMarker) null);

    /* renamed from: P */
    public final boolean f41733P;

    /* renamed from: Q */
    public final ef3 f41734Q;

    /* renamed from: U */
    public ib2 f41735U;

    /* renamed from: X */
    public final ef3 f41736X;

    /* renamed from: Y */
    public boolean f41737Y;

    /* renamed from: Z */
    public C8290b f41738Z;

    /* renamed from: e0 */
    public final k04<Long> f41739e0;

    /* renamed from: k0 */
    public CountDownTimer f41740k0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$a;", "", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "verificationCallback", "", "isBioAuthenNext", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.G2FAVerfication$a */
    /* compiled from: G2FAVerfication.kt */
    public static final class C8289a {
        public C8289a() {
        }

        public /* synthetic */ C8289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ G2FAVerfication m66039b(C8289a aVar, C8290b bVar, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo57216a(bVar, z);
        }

        /* renamed from: a */
        public final G2FAVerfication mo57216a(C8290b bVar, boolean z) {
            vx2.m53591g(bVar, "verificationCallback");
            G2FAVerfication g2FAVerfication = new G2FAVerfication(z);
            g2FAVerfication.f41738Z = bVar;
            return g2FAVerfication;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo44877d2 = {"Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.G2FAVerfication$b */
    /* compiled from: G2FAVerfication.kt */
    public interface C8290b {
        /* renamed from: a */
        void mo56967a();

        void onSuccess();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/G2FAVerfication$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.G2FAVerfication$c */
    /* compiled from: G2FAVerfication.kt */
    public static final class C8291c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ G2FAVerfication f41741a;

        public C8291c(G2FAVerfication g2FAVerfication) {
            this.f41741a = g2FAVerfication;
        }

        public void afterTextChanged(Editable editable) {
            boolean z = false;
            if (editable != null && editable.length() == 6) {
                z = true;
            }
            if (z) {
                this.f41741a.mo57215L();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ib2 B = this.f41741a.f41735U;
            if (B == null) {
                vx2.m53605u("binding");
                B = null;
            }
            B.f29874d.setError((CharSequence) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/dialogs/G2FAVerfication$d", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lr37;", "onTick", "onFinish", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.dialogs.G2FAVerfication$d */
    /* compiled from: G2FAVerfication.kt */
    public static final class C8292d extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ G2FAVerfication f41742a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8292d(G2FAVerfication g2FAVerfication) {
            super(30000, 1000);
            this.f41742a = g2FAVerfication;
        }

        public void onFinish() {
            if (!this.f41742a.isVisible()) {
                return;
            }
            if (this.f41742a.isStateSaved()) {
                this.f41742a.mo22267l();
            } else {
                this.f41742a.mo22266k();
            }
        }

        public void onTick(long j) {
            this.f41742a.f41739e0.setValue(Long.valueOf(j / ((long) 1000)));
        }
    }

    public G2FAVerfication() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public G2FAVerfication(boolean z) {
        this.f41733P = z;
        this.f41734Q = C6169a.m47232a(new G2FAVerfication$manager$2(this));
        this.f41736X = FragmentViewModelLazyKt.m4812c(this, ua5.m52727b(GoogleAuthViewModel.class), new G2FAVerfication$special$$inlined$activityViewModels$default$1(this), new G2FAVerfication$special$$inlined$activityViewModels$default$2((pc2) null, this), new G2FAVerfication$special$$inlined$activityViewModels$default$3(this));
        this.f41739e0 = new k04<>(30L);
    }

    /* renamed from: H */
    public static final void m66030H(G2FAVerfication g2FAVerfication, View view) {
        vx2.m53591g(g2FAVerfication, "this$0");
        Dialog n = g2FAVerfication.mo22269n();
        if (n != null) {
            n.dismiss();
        }
    }

    /* renamed from: I */
    public static final void m66031I(G2FAVerfication g2FAVerfication, View view) {
        vx2.m53591g(g2FAVerfication, "this$0");
        ClipData primaryClip = g2FAVerfication.mo57213G().getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getText() != null) {
            String obj = primaryClip.getItemAt(0).getText().toString();
            if (obj.length() == 6) {
                ib2 ib2 = g2FAVerfication.f41735U;
                if (ib2 == null) {
                    vx2.m53605u("binding");
                    ib2 = null;
                }
                ib2.f29874d.setText(obj);
            }
        }
    }

    /* renamed from: J */
    public static final void m66032J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: F */
    public final GoogleAuthViewModel mo57212F() {
        return (GoogleAuthViewModel) this.f41736X.getValue();
    }

    /* renamed from: G */
    public final ClipboardManager mo57213G() {
        return (ClipboardManager) this.f41734Q.getValue();
    }

    /* renamed from: K */
    public final void mo57214K(FragmentManager fragmentManager) {
        vx2.m53591g(fragmentManager, "manager");
        super.mo22281x(fragmentManager, G2FAVerfication.class.getCanonicalName());
    }

    /* renamed from: L */
    public final void mo57215L() {
        ib2 ib2 = this.f41735U;
        C8290b bVar = null;
        if (ib2 == null) {
            vx2.m53605u("binding");
            ib2 = null;
        }
        if (vx2.m53586b(ib2.f29874d.getEditableText().toString(), mo57212F().mo61206i(f06.m57518i(requireContext(), "AUTH_2FA_KEY")))) {
            this.f41737Y = true;
            Dialog n = mo22269n();
            if (n != null) {
                n.dismiss();
            }
            C8290b bVar2 = this.f41738Z;
            if (bVar2 == null) {
                vx2.m53605u("verificationCallback");
            } else {
                bVar = bVar2;
            }
            bVar.onSuccess();
            return;
        }
        this.f41737Y = false;
        ib2 ib22 = this.f41735U;
        if (ib22 == null) {
            vx2.m53605u("binding");
            ib22 = null;
        }
        ib22.f29874d.setError(getString(R.string.auth_2fa_error));
        C8290b bVar3 = this.f41738Z;
        if (bVar3 == null) {
            vx2.m53605u("verificationCallback");
        } else {
            bVar = bVar3;
        }
        bVar.mo56967a();
    }

    public void onAttach(Context context) {
        vx2.m53591g(context, "context");
        super.onAttach(context);
        a77.m55424b(requireActivity(), Boolean.TRUE);
    }

    public void onCancel(DialogInterface dialogInterface) {
        vx2.m53591g(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        if (this.f41740k0 == null) {
            vx2.m53605u("countDownTimer");
        }
        CountDownTimer countDownTimer = this.f41740k0;
        if (countDownTimer == null) {
            vx2.m53605u("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vx2.m53591g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_verficationg2fa, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f41740k0 == null) {
            vx2.m53605u("countDownTimer");
        }
        CountDownTimer countDownTimer = this.f41740k0;
        if (countDownTimer == null) {
            vx2.m53605u("countDownTimer");
            countDownTimer = null;
        }
        countDownTimer.cancel();
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f41733P || !this.f41737Y) {
            a77.m55424b(requireActivity(), Boolean.FALSE);
        }
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
        ib2 a = ib2.m45595a(view);
        vx2.m53590f(a, "bind(view)");
        this.f41735U = a;
        ib2 ib2 = null;
        if (a == null) {
            vx2.m53605u("binding");
            a = null;
        }
        a.f29873c.setOnClickListener(new ie2(this));
        ib2 ib22 = this.f41735U;
        if (ib22 == null) {
            vx2.m53605u("binding");
            ib22 = null;
        }
        ib22.f29872b.setOnClickListener(new je2(this));
        ib2 ib23 = this.f41735U;
        if (ib23 == null) {
            vx2.m53605u("binding");
        } else {
            ib2 = ib23;
        }
        ib2.f29874d.addTextChangedListener(new C8291c(this));
        this.f41739e0.observe(getViewLifecycleOwner(), new ke2(new G2FAVerfication$onViewCreated$4(this)));
        C8292d dVar = new C8292d(this);
        this.f41740k0 = dVar;
        dVar.start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G2FAVerfication(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
