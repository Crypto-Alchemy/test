package net.safemoon.androidwallet.views;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0716f;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.common.BasicActivity;
import net.safemoon.androidwallet.dialogs.G2FAVerfication;
import net.safemoon.androidwallet.model.wallets.Wallet;
import p000.wo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DB\u001b\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bC\u0010GB#\b\u0016\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u0012\u0006\u0010H\u001a\u00020\u0014¢\u0006\u0004\bC\u0010IJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002R\u0014\u0010 \u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0016\u0010<\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010:R\u001d\u0010@\u001a\u0004\u0018\u00010=8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b>\u0010?¨\u0006J"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CustomRecoveryWalletLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lug3;", "Landroidx/lifecycle/f;", "getLifecycle", "Lr37;", "onAttachedToWindow", "onDetachedFromWindow", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "wallet", "setupRecoveryWallet", "n", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "activity", "s", "t", "Lwo2$a;", "getPrivateKeyAuthCallback", "getPassphraseAuthCallback", "Landroid/app/Activity;", "", "checkType", "w", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "u", "B", "A", "z", "y", "x", "a", "Landroidx/lifecycle/f;", "lifecycleRegistry", "Lom2;", "d", "Lef3;", "getBinding", "()Lom2;", "binding", "", "e", "v", "()Z", "isBioAuth", "Ly12;", "g", "Ly12;", "requestBiometricAuthUseCase", "k", "Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "getAttachedActivity", "()Lnet/safemoon/androidwallet/activity/common/BasicActivity;", "setAttachedActivity", "(Lnet/safemoon/androidwallet/activity/common/BasicActivity;)V", "attachedActivity", "r", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "recoveryWallet", "Z", "isShowRecoveryPhraseExtend", "isShowPrivateKeyExtend", "Landroid/content/ClipboardManager;", "getManager", "()Landroid/content/ClipboardManager;", "manager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CustomRecoveryWalletLayout.kt */
public final class CustomRecoveryWalletLayout extends LinearLayoutCompat implements ug3 {

    /* renamed from: A */
    public static final C8938a f43230A = new C8938a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C0716f f43231a;

    /* renamed from: d */
    public final ef3 f43232d;

    /* renamed from: e */
    public final ef3 f43233e;

    /* renamed from: g */
    public final y12 f43234g;

    /* renamed from: k */
    public BasicActivity f43235k;

    /* renamed from: r */
    public Wallet f43236r;

    /* renamed from: s */
    public boolean f43237s;

    /* renamed from: x */
    public boolean f43238x;

    /* renamed from: y */
    public final ef3 f43239y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/CustomRecoveryWalletLayout$a;", "", "", "CHECK_TYPE_PASS", "I", "CHECK_TYPE_PRIVATE", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CustomRecoveryWalletLayout$a */
    /* compiled from: CustomRecoveryWalletLayout.kt */
    public static final class C8938a {
        public C8938a() {
        }

        public /* synthetic */ C8938a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/views/CustomRecoveryWalletLayout$b", "Lnet/safemoon/androidwallet/dialogs/G2FAVerfication$b;", "Lr37;", "onSuccess", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CustomRecoveryWalletLayout$b */
    /* compiled from: CustomRecoveryWalletLayout.kt */
    public static final class C8939b implements G2FAVerfication.C8290b {

        /* renamed from: a */
        public final /* synthetic */ CustomRecoveryWalletLayout f43240a;

        /* renamed from: b */
        public final /* synthetic */ int f43241b;

        public C8939b(CustomRecoveryWalletLayout customRecoveryWalletLayout, int i) {
            this.f43240a = customRecoveryWalletLayout;
            this.f43241b = i;
        }

        /* renamed from: a */
        public void mo56967a() {
            dq6.f37375a.mo51267e("Khang").mo51264a("G2FAVerificationCallback onError() called", new Object[0]);
        }

        public void onSuccess() {
            if (this.f43240a.mo62110v()) {
                this.f43240a.mo62100B(this.f43241b);
                return;
            }
            CustomRecoveryWalletLayout customRecoveryWalletLayout = this.f43240a;
            BasicActivity attachedActivity = customRecoveryWalletLayout.getAttachedActivity();
            vx2.m53588d(attachedActivity);
            customRecoveryWalletLayout.mo62111w(attachedActivity, this.f43241b);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/views/CustomRecoveryWalletLayout$c", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CustomRecoveryWalletLayout$c */
    /* compiled from: CustomRecoveryWalletLayout.kt */
    public static final class C8940c implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ CustomRecoveryWalletLayout f43242a;

        public C8940c(CustomRecoveryWalletLayout customRecoveryWalletLayout) {
            this.f43242a = customRecoveryWalletLayout;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            CustomRecoveryWalletLayout customRecoveryWalletLayout = this.f43242a;
            BasicActivity attachedActivity = customRecoveryWalletLayout.getAttachedActivity();
            vx2.m53588d(attachedActivity);
            customRecoveryWalletLayout.mo62111w(attachedActivity, 1);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/views/CustomRecoveryWalletLayout$d", "Lwo2$a;", "Lr37;", "b", "", "errorCode", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.CustomRecoveryWalletLayout$d */
    /* compiled from: CustomRecoveryWalletLayout.kt */
    public static final class C8941d implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ CustomRecoveryWalletLayout f43243a;

        public C8941d(CustomRecoveryWalletLayout customRecoveryWalletLayout) {
            this.f43243a = customRecoveryWalletLayout;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
        }

        /* renamed from: b */
        public void mo56681b() {
            CustomRecoveryWalletLayout customRecoveryWalletLayout = this.f43243a;
            BasicActivity attachedActivity = customRecoveryWalletLayout.getAttachedActivity();
            vx2.m53588d(attachedActivity);
            customRecoveryWalletLayout.mo62111w(attachedActivity, 2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomRecoveryWalletLayout(Context context) {
        this(context, (AttributeSet) null);
        vx2.m53591g(context, "context");
    }

    private final om2 getBinding() {
        return (om2) this.f43232d.getValue();
    }

    private final ClipboardManager getManager() {
        return (ClipboardManager) this.f43239y.getValue();
    }

    private final wo2.C9557a getPassphraseAuthCallback() {
        return new C8940c(this);
    }

    private final wo2.C9557a getPrivateKeyAuthCallback() {
        return new C8941d(this);
    }

    /* renamed from: o */
    public static final void m69501o(CustomRecoveryWalletLayout customRecoveryWalletLayout, View view) {
        vx2.m53591g(customRecoveryWalletLayout, "this$0");
        customRecoveryWalletLayout.mo62099A();
    }

    /* renamed from: p */
    public static final void m69502p(CustomRecoveryWalletLayout customRecoveryWalletLayout, View view) {
        vx2.m53591g(customRecoveryWalletLayout, "this$0");
        customRecoveryWalletLayout.mo62114z();
    }

    /* renamed from: q */
    public static final void m69503q(CustomRecoveryWalletLayout customRecoveryWalletLayout, View view) {
        vx2.m53591g(customRecoveryWalletLayout, "this$0");
        BasicActivity basicActivity = customRecoveryWalletLayout.f43235k;
        if (basicActivity != null) {
            customRecoveryWalletLayout.mo62105s(basicActivity);
        }
    }

    /* renamed from: r */
    public static final void m69504r(CustomRecoveryWalletLayout customRecoveryWalletLayout, View view) {
        vx2.m53591g(customRecoveryWalletLayout, "this$0");
        BasicActivity basicActivity = customRecoveryWalletLayout.f43235k;
        if (basicActivity != null) {
            customRecoveryWalletLayout.mo62108t(basicActivity);
        }
    }

    /* renamed from: A */
    public final void mo62099A() {
        this.f43237s = !this.f43237s;
        om2 binding = getBinding();
        if (this.f43237s) {
            binding.f32402c.setImageResource(R.drawable.ic_akt_up_arrow);
            binding.f32411l.setVisibility(0);
            binding.f32413n.setVisibility(0);
            if (this.f43238x) {
                mo62114z();
                return;
            }
            return;
        }
        binding.f32402c.setImageResource(R.drawable.ic_akt_dropdown);
        binding.f32411l.setVisibility(8);
        binding.f32413n.setVisibility(8);
        binding.f32409j.setVisibility(8);
        binding.f32409j.setText("");
    }

    /* renamed from: B */
    public final void mo62100B(int i) {
        if (i == 1) {
            y12 y12 = this.f43234g;
            BasicActivity basicActivity = this.f43235k;
            vx2.m53588d(basicActivity);
            y12.mo66750b(basicActivity, getPassphraseAuthCallback());
            return;
        }
        y12 y122 = this.f43234g;
        BasicActivity basicActivity2 = this.f43235k;
        vx2.m53588d(basicActivity2);
        y122.mo66750b(basicActivity2, getPrivateKeyAuthCallback());
    }

    public final BasicActivity getAttachedActivity() {
        return this.f43235k;
    }

    /* renamed from: n */
    public final void mo62102n() {
        om2 binding = getBinding();
        binding.f32402c.setOnClickListener(new gy0(this));
        binding.f32401b.setOnClickListener(new hy0(this));
        binding.f32413n.setOnClickListener(new iy0(this));
        binding.f32412m.setOnClickListener(new jy0(this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43231a.mo6395o(Lifecycle.State.RESUMED);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43231a.mo6395o(Lifecycle.State.DESTROYED);
    }

    /* renamed from: s */
    public final void mo62105s(BasicActivity basicActivity) {
        if (f06.m57513d(basicActivity, "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(mo62109u(1), mo62110v());
            FragmentManager supportFragmentManager = basicActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
            a.mo57214K(supportFragmentManager);
        } else if (mo62110v()) {
            this.f43234g.mo66750b(basicActivity, getPassphraseAuthCallback());
        } else {
            mo62111w(basicActivity, 1);
        }
    }

    public final void setAttachedActivity(BasicActivity basicActivity) {
        this.f43235k = basicActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r14 == true) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupRecoveryWallet(net.safemoon.androidwallet.model.wallets.Wallet r14) {
        /*
            r13 = this;
            java.lang.String r0 = "wallet"
            p000.vx2.m53591g(r14, r0)
            r13.f43236r = r14
            if (r14 == 0) goto L_0x004e
            om2 r0 = r13.getBinding()
            android.widget.TextView r0 = r0.f32405f
            java.lang.String r1 = r14.getName()
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r2 = "|"
            java.lang.String r3 = ""
            java.lang.String r7 = p000.yb6.m74332I(r1, r2, r3, r4, r5, r6)
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r8 = ","
            java.lang.String r9 = ""
            java.lang.String r1 = p000.yb6.m74332I(r7, r8, r9, r10, r11, r12)
            r0.setText(r1)
            java.lang.String r14 = r14.getPassPhrase()
            r0 = 1
            r1 = 0
            if (r14 == 0) goto L_0x0040
            int r14 = r14.length()
            if (r14 != 0) goto L_0x003c
            r14 = r0
            goto L_0x003d
        L_0x003c:
            r14 = r1
        L_0x003d:
            if (r14 != r0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r0 == 0) goto L_0x004e
            om2 r14 = r13.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r14 = r14.f32404e
            r0 = 8
            r14.setVisibility(r0)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.views.CustomRecoveryWalletLayout.setupRecoveryWallet(net.safemoon.androidwallet.model.wallets.Wallet):void");
    }

    /* renamed from: t */
    public final void mo62108t(BasicActivity basicActivity) {
        if (f06.m57513d(basicActivity, "AUTH_2FA_IS_ENABLE")) {
            G2FAVerfication a = G2FAVerfication.f41732v0.mo57216a(mo62109u(2), mo62110v());
            FragmentManager supportFragmentManager = basicActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "activity.supportFragmentManager");
            a.mo57214K(supportFragmentManager);
        } else if (mo62110v()) {
            this.f43234g.mo66750b(basicActivity, getPrivateKeyAuthCallback());
        } else {
            mo62111w(basicActivity, 2);
        }
    }

    /* renamed from: u */
    public final G2FAVerfication.C8290b mo62109u(int i) {
        return new C8939b(this, i);
    }

    /* renamed from: v */
    public final boolean mo62110v() {
        return ((Boolean) this.f43233e.getValue()).booleanValue();
    }

    /* renamed from: w */
    public final void mo62111w(Activity activity, int i) {
        C9001np.m69938W(new WeakReference(activity), Integer.valueOf(R.string.acknowledgment_confirm_title), Integer.valueOf(R.string.akt_existing_wallets_mnemonic_dialog_content), R.string.acknowledgment_confirm_button_text, new CustomRecoveryWalletLayout$showAcknowledgmentWarningDialog$1(i, this));
    }

    /* renamed from: x */
    public final void mo62112x() {
        Wallet wallet2 = this.f43236r;
        if (wallet2 != null) {
            getBinding().f32408i.setVisibility(8);
            getBinding().f32412m.setVisibility(8);
            getBinding().f32406g.setText(wallet2.getPrivateKey());
            getBinding().f32406g.setVisibility(0);
        }
    }

    /* renamed from: y */
    public final void mo62113y() {
        Wallet wallet2 = this.f43236r;
        if (wallet2 != null) {
            getBinding().f32409j.setText(wallet2.getPassPhrase());
            getBinding().f32411l.setVisibility(8);
            getBinding().f32413n.setVisibility(8);
            getBinding().f32409j.setVisibility(0);
        }
    }

    /* renamed from: z */
    public final void mo62114z() {
        this.f43238x = !this.f43238x;
        om2 binding = getBinding();
        if (this.f43238x) {
            binding.f32401b.setImageResource(R.drawable.ic_akt_up_arrow);
            binding.f32408i.setVisibility(0);
            binding.f32412m.setVisibility(0);
            if (this.f43237s) {
                mo62099A();
                return;
            }
            return;
        }
        binding.f32401b.setImageResource(R.drawable.ic_akt_dropdown);
        binding.f32408i.setVisibility(8);
        binding.f32412m.setVisibility(8);
        binding.f32406g.setVisibility(8);
        binding.f32406g.setText("");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomRecoveryWalletLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        vx2.m53591g(context, "context");
    }

    public C0716f getLifecycle() {
        return this.f43231a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomRecoveryWalletLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
        this.f43231a = new C0716f(this);
        this.f43232d = C6169a.m47232a(new CustomRecoveryWalletLayout$binding$2(this));
        this.f43233e = C6169a.m47232a(new CustomRecoveryWalletLayout$isBioAuth$2(this));
        this.f43234g = new y12();
        this.f43239y = C6169a.m47232a(new CustomRecoveryWalletLayout$manager$2(this));
        context.obtainStyledAttributes(attributeSet, y55.CustomRecoveryWalletLayout, i, 0).recycle();
        View.inflate(context, R.layout.holder_recovery_wallet, this);
        mo62102n();
    }
}
