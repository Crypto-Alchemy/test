package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.R;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\u001d¨\u0006&"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTAnswerQuestionsActivity;", "Lnet/safemoon/androidwallet/activity/AKTBaseLoginFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "S0", "L0", "Lk9;", "C", "Lef3;", "I0", "()Lk9;", "binding", "", "H", "J0", "()Ljava/lang/String;", "firstQuestion", "I", "K0", "secondQuestion", "L", "H0", "aktKs", "", "M", "N0", "()Z", "isForgotPassword", "P", "O0", "isSwitchAccount", "<init>", "()V", "Q", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTAnswerQuestionsActivity.kt */
public final class AKTAnswerQuestionsActivity extends AKTBaseLoginFunctions {

    /* renamed from: Q */
    public static final C8120a f41229Q = new C8120a((DefaultConstructorMarker) null);

    /* renamed from: C */
    public final ef3 f41230C = C6169a.m47232a(new AKTAnswerQuestionsActivity$binding$2(this));

    /* renamed from: H */
    public final ef3 f41231H = C6169a.m47232a(new AKTAnswerQuestionsActivity$firstQuestion$2(this));

    /* renamed from: I */
    public final ef3 f41232I = C6169a.m47232a(new AKTAnswerQuestionsActivity$secondQuestion$2(this));

    /* renamed from: L */
    public final ef3 f41233L = C6169a.m47232a(new AKTAnswerQuestionsActivity$aktKs$2(this));

    /* renamed from: M */
    public final ef3 f41234M = C6169a.m47232a(new AKTAnswerQuestionsActivity$isForgotPassword$2(this));

    /* renamed from: P */
    public final ef3 f41235P = C6169a.m47232a(new AKTAnswerQuestionsActivity$isSwitchAccount$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bR\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTAnswerQuestionsActivity$a;", "", "Landroid/content/Context;", "context", "", "firstQuestion", "secondQuestion", "aktKs", "", "isForgotPassword", "isSwitchAccount", "Lr37;", "a", "AKT_KS", "Ljava/lang/String;", "FIRST_QUESTION", "IS_FORGOT_PASSWORD", "IS_SWITCH_ACCOUNT", "SECOND_QUESTION", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$a */
    /* compiled from: AKTAnswerQuestionsActivity.kt */
    public static final class C8120a {
        public C8120a() {
        }

        public /* synthetic */ C8120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m64748b(C8120a aVar, Context context, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i & 32) != 0) {
                z2 = true;
            }
            aVar.mo56547a(context, str, str2, str3, z3, z2);
        }

        /* renamed from: a */
        public final void mo56547a(Context context, String str, String str2, String str3, boolean z, boolean z2) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "firstQuestion");
            vx2.m53591g(str2, "secondQuestion");
            vx2.m53591g(str3, "aktKs");
            Intent intent = new Intent(context, AKTAnswerQuestionsActivity.class);
            intent.putExtra("FIRST_QUESTION", str);
            intent.putExtra("SECOND_QUESTION", str2);
            intent.putExtra("AKT_KS", str3);
            intent.putExtra("IS_FORGOT_PASSWORD", z);
            intent.putExtra("IS_SWITCH_ACCOUNT", z2);
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTAnswerQuestionsActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$b */
    /* compiled from: AKTAnswerQuestionsActivity.kt */
    public static final class C8121b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTAnswerQuestionsActivity f41236a;

        public C8121b(AKTAnswerQuestionsActivity aKTAnswerQuestionsActivity) {
            this.f41236a = aKTAnswerQuestionsActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            this.f41236a.mo56546S0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTAnswerQuestionsActivity$c", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$c */
    /* compiled from: AKTAnswerQuestionsActivity.kt */
    public static final class C8122c implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTAnswerQuestionsActivity f41237a;

        public C8122c(AKTAnswerQuestionsActivity aKTAnswerQuestionsActivity) {
            this.f41237a = aKTAnswerQuestionsActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            this.f41237a.mo56546S0();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    /* renamed from: M0 */
    public static final void m64736M0(AKTAnswerQuestionsActivity aKTAnswerQuestionsActivity, boolean z) {
        vx2.m53591g(aKTAnswerQuestionsActivity, "this$0");
        ow7 ow7 = aKTAnswerQuestionsActivity.f8531y;
        vx2.m53590f(ow7, "safeMoonppp");
        aKTAnswerQuestionsActivity.mo56555q0(ow7, true);
        f06.m57523n(aKTAnswerQuestionsActivity, "TWO_FACTOR", Boolean.valueOf(z));
    }

    /* renamed from: P0 */
    public static final void m64737P0(AKTAnswerQuestionsActivity aKTAnswerQuestionsActivity, View view) {
        vx2.m53591g(aKTAnswerQuestionsActivity, "this$0");
        aKTAnswerQuestionsActivity.mo56543L0();
    }

    /* renamed from: Q0 */
    public static final void m64738Q0(AKTAnswerQuestionsActivity aKTAnswerQuestionsActivity, View view) {
        vx2.m53591g(aKTAnswerQuestionsActivity, "this$0");
        aKTAnswerQuestionsActivity.onBackPressed();
    }

    /* renamed from: R0 */
    public static final void m64739R0(AKTAnswerQuestionsActivity aKTAnswerQuestionsActivity, View view) {
        vx2.m53591g(aKTAnswerQuestionsActivity, "this$0");
        a77.m55427e(aKTAnswerQuestionsActivity);
    }

    /* renamed from: H0 */
    public final String mo56539H0() {
        return (String) this.f41233L.getValue();
    }

    /* renamed from: I0 */
    public final C6137k9 mo56540I0() {
        return (C6137k9) this.f41230C.getValue();
    }

    /* renamed from: J0 */
    public final String mo56541J0() {
        return (String) this.f41231H.getValue();
    }

    /* renamed from: K0 */
    public final String mo56542K0() {
        return (String) this.f41232I.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc A[SYNTHETIC, Splitter:B:31:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010a A[Catch:{ Exception -> 0x0112 }] */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56543L0() {
        /*
            r11 = this;
            k9 r0 = r11.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r1 = 0
            r0.setEnabled(r1)
            k9 r0 = r11.mo56540I0()
            com.google.android.material.textfield.TextInputLayout r0 = r0.f30745e
            android.widget.EditText r0 = r0.getEditText()
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.text.Editable r0 = r0.getText()
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            k9 r3 = r11.mo56540I0()
            com.google.android.material.textfield.TextInputLayout r3 = r3.f30746f
            android.widget.EditText r3 = r3.getEditText()
            if (r3 == 0) goto L_0x0031
            android.text.Editable r2 = r3.getText()
        L_0x0031:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r0.length()
            r4 = 2
            if (r3 < r4) goto L_0x0113
            int r3 = r2.length()
            if (r3 >= r4) goto L_0x0044
            goto L_0x0113
        L_0x0044:
            net.safemoon.androidwallet.utils.Common r3 = net.safemoon.androidwallet.utils.Common.f42577a
            java.lang.String r0 = r3.mo60910q(r0)
            java.lang.String r2 = r3.mo60910q(r2)
            java.lang.String r3 = r11.mo56539H0()
            java.lang.String r0 = r11.mo12161b0(r3, r0, r2)
            int r2 = r0.length()
            r3 = 64
            if (r2 == r3) goto L_0x0079
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r11)
            r5 = 0
            r0 = 2131951687(0x7f130047, float:1.9539796E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$handleContinue$1 r8 = new net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$handleContinue$1
            r8.<init>(r11)
            r9 = 10
            r10 = 0
            p000.C9001np.m69939X(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0112
        L_0x0079:
            boolean r2 = r11.mo56544N0()     // Catch:{ Exception -> 0x0112 }
            r3 = 1
            if (r2 == 0) goto L_0x009e
            net.safemoon.androidwallet.activity.AKTResetPasswordActivity$a r1 = net.safemoon.androidwallet.activity.AKTResetPasswordActivity.f41327I     // Catch:{ Exception -> 0x0112 }
            java.lang.String r2 = r11.mo56539H0()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "aktKs"
            p000.vx2.m53590f(r2, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "pbHex"
            p000.vx2.m53590f(r0, r4)     // Catch:{ Exception -> 0x0112 }
            r1.mo56721a(r11, r2, r0)     // Catch:{ Exception -> 0x0112 }
            k9 r0 = r11.mo56540I0()     // Catch:{ Exception -> 0x0112 }
            com.google.android.material.button.MaterialButton r0 = r0.f30742b     // Catch:{ Exception -> 0x0112 }
            r0.setEnabled(r3)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0112
        L_0x009e:
            net.safemoon.androidwallet.model.wallets.Wallet r0 = p000.ol0.m70351c(r11)     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = r0.getU5B64()     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00b7
            int r0 = r0.length()     // Catch:{ Exception -> 0x0112 }
            if (r0 <= 0) goto L_0x00b2
            r0 = r3
            goto L_0x00b3
        L_0x00b2:
            r0 = r1
        L_0x00b3:
            if (r0 != r3) goto L_0x00b7
            r0 = r3
            goto L_0x00b8
        L_0x00b7:
            r0 = r1
        L_0x00b8:
            java.lang.String r2 = "safeMoonppp"
            if (r0 == 0) goto L_0x010a
            net.safemoon.androidwallet.dialogs.ProgressLoading$a r0 = net.safemoon.androidwallet.dialogs.ProgressLoading.f41785Y     // Catch:{ Exception -> 0x0112 }
            r3 = 2131952253(0x7f13027d, float:1.9540944E38)
            java.lang.String r3 = r11.getString(r3)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "getString(R.string.loading)"
            p000.vx2.m53590f(r3, r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = ""
            net.safemoon.androidwallet.dialogs.ProgressLoading r0 = r0.mo57297a(r1, r3, r4)     // Catch:{ Exception -> 0x0112 }
            r11.f8528r = r0     // Catch:{ Exception -> 0x0112 }
            androidx.fragment.app.FragmentManager r3 = r11.getSupportFragmentManager()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "supportFragmentManager"
            p000.vx2.m53590f(r3, r4)     // Catch:{ Exception -> 0x0112 }
            r0.mo57295D(r3)     // Catch:{ Exception -> 0x0112 }
            boolean r0 = r11.mo56545O0()     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "TWO_FACTOR"
            boolean r0 = p000.f06.m57513d(r11, r0)     // Catch:{ Exception -> 0x0112 }
            r11.mo12158W()     // Catch:{ Exception -> 0x0112 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ Exception -> 0x0112 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0112 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0112 }
            i r2 = new i     // Catch:{ Exception -> 0x0112 }
            r2.<init>(r11, r0)     // Catch:{ Exception -> 0x0112 }
            r3 = 500(0x1f4, double:2.47E-321)
            r1.postDelayed(r2, r3)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0112
        L_0x0101:
            ow7 r0 = r11.f8531y     // Catch:{ Exception -> 0x0112 }
            p000.vx2.m53590f(r0, r2)     // Catch:{ Exception -> 0x0112 }
            r11.mo56555q0(r0, r1)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0112
        L_0x010a:
            ow7 r0 = r11.f8531y     // Catch:{ Exception -> 0x0112 }
            p000.vx2.m53590f(r0, r2)     // Catch:{ Exception -> 0x0112 }
            r11.mo56555q0(r0, r3)     // Catch:{ Exception -> 0x0112 }
        L_0x0112:
            return
        L_0x0113:
            r0 = 2131951771(0x7f13009b, float:1.9539966E38)
            p000.ol0.m70345Y(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity.mo56543L0():void");
    }

    /* renamed from: N0 */
    public final boolean mo56544N0() {
        return ((Boolean) this.f41234M.getValue()).booleanValue();
    }

    /* renamed from: O0 */
    public final boolean mo56545O0() {
        return ((Boolean) this.f41235P.getValue()).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56546S0() {
        /*
            r4 = this;
            k9 r0 = r4.mo56540I0()
            com.google.android.material.textfield.TextInputLayout r0 = r0.f30745e
            android.widget.EditText r0 = r0.getEditText()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0022
            java.lang.CharSequence r0 = kotlin.text.StringsKt__StringsKt.m63090V0(r0)
            java.lang.String r0 = r0.toString()
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            k9 r2 = r4.mo56540I0()
            com.google.android.material.textfield.TextInputLayout r2 = r2.f30746f
            android.widget.EditText r2 = r2.getEditText()
            if (r2 == 0) goto L_0x0043
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x0043
            java.lang.CharSequence r1 = kotlin.text.StringsKt__StringsKt.m63090V0(r2)
            java.lang.String r1 = r1.toString()
        L_0x0043:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0054
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004f
            r0 = r2
            goto L_0x0050
        L_0x004f:
            r0 = r3
        L_0x0050:
            if (r0 != r2) goto L_0x0054
            r0 = r2
            goto L_0x0055
        L_0x0054:
            r0 = r3
        L_0x0055:
            if (r0 != 0) goto L_0x0094
            if (r1 == 0) goto L_0x0066
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0061
            r0 = r2
            goto L_0x0062
        L_0x0061:
            r0 = r3
        L_0x0062:
            if (r0 != r2) goto L_0x0066
            r0 = r2
            goto L_0x0067
        L_0x0066:
            r0 = r3
        L_0x0067:
            if (r0 == 0) goto L_0x006a
            goto L_0x0094
        L_0x006a:
            k9 r0 = r4.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r1 = 2131099707(0x7f06003b, float:1.7811775E38)
            int r1 = r4.getColor(r1)
            r0.setTextColor(r1)
            k9 r0 = r4.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r0.setEnabled(r2)
            k9 r0 = r4.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r1 = 2131099676(0x7f06001c, float:1.7811712E38)
            android.content.res.ColorStateList r1 = r4.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
            goto L_0x00bd
        L_0x0094:
            k9 r0 = r4.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r1 = 2131100019(0x7f060173, float:1.7812408E38)
            int r1 = r4.getColor(r1)
            r0.setTextColor(r1)
            k9 r0 = r4.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r0.setEnabled(r3)
            k9 r0 = r4.mo56540I0()
            com.google.android.material.button.MaterialButton r0 = r0.f30742b
            r1 = 2131099677(0x7f06001d, float:1.7811714E38)
            android.content.res.ColorStateList r1 = r4.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity.mo56546S0():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56540I0().mo44705b());
        EditText editText = mo56540I0().f30745e.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new C8121b(this));
        }
        EditText editText2 = mo56540I0().f30746f.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8122c(this));
        }
        mo56546S0();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C6137k9 I0 = mo56540I0();
        I0.f30749i.setText(mo56541J0());
        I0.f30750j.setText(mo56542K0());
        I0.f30742b.setOnClickListener(new C7059f(this));
        I0.f30748h.f21597e.setText(R.string.akt_security_questions_screen_header_txt);
        I0.f30748h.f21594b.setVisibility(0);
        I0.f30748h.f21595c.setVisibility(8);
        I0.f30748h.f21595c.setText(getString(R.string.cancel));
        I0.f30748h.f21594b.setOnClickListener(new C7109g(this));
        I0.f30743c.setOnClickListener(new C7152h(this));
    }
}
