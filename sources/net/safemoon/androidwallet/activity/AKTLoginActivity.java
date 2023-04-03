package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.utils.Common;
import p000.dq6;
import p000.wo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0002R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTLoginActivity;", "Lnet/safemoon/androidwallet/activity/AKTBaseLoginFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "onPostCreate", "Low7;", "safeMoonppp", "", "message", "e0", "onBackPressed", "d1", "O0", "", "isActive", "b1", "N0", "c1", "a1", "username", "password", "S0", "Z0", "Lla;", "C", "Lef3;", "Q0", "()Lla;", "binding", "H", "R0", "()Z", "canGoBack", "Lwo2;", "I", "Lwo2;", "requestBiometricAuthUseCase", "<init>", "()V", "L", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTLoginActivity.kt */
public class AKTLoginActivity extends AKTBaseLoginFunctions {

    /* renamed from: L */
    public static final C8144a f41302L = new C8144a((DefaultConstructorMarker) null);

    /* renamed from: C */
    public final ef3 f41303C = C6169a.m47232a(new AKTLoginActivity$binding$2(this));

    /* renamed from: H */
    public final ef3 f41304H = C6169a.m47232a(new AKTLoginActivity$canGoBack$2(this));

    /* renamed from: I */
    public final wo2 f41305I = new y12();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTLoginActivity$a;", "", "Landroid/content/Context;", "context", "", "canGoBack", "Lr37;", "a", "b", "", "BUNDLE_KEY_NAME", "Ljava/lang/String;", "BUNDLE_KEY_SOURCE_APP", "BUNDLE_KEY_SOURCE_APP_FOR_RESULT", "BUNDLE_KEY_SOURCE_LOGOUT", "CAN_GO_BACK", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTLoginActivity$a */
    /* compiled from: AKTLoginActivity.kt */
    public static final class C8144a {
        public C8144a() {
        }

        public /* synthetic */ C8144a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56678a(Context context, boolean z) {
            vx2.m53591g(context, "context");
            Intent intent = new Intent(context, AKTLoginActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("CAN_GO_BACK", z);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo56679b(Context context, boolean z) {
            vx2.m53591g(context, "context");
            Intent intent = new Intent(context, AKTLoginActivity.class);
            intent.putExtra("bundle.KEY_SOURCE", "bundle.SOURCE_LOGOUT");
            intent.setFlags(268468224);
            intent.putExtra("CAN_GO_BACK", z);
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTLoginActivity$b", "Lwo2$a;", "", "errorCode", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTLoginActivity$b */
    /* compiled from: AKTLoginActivity.kt */
    public static final class C8145b implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ AKTLoginActivity f41306a;

        public C8145b(AKTLoginActivity aKTLoginActivity) {
            this.f41306a = aKTLoginActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
            dq6.C6999b e = dq6.f37375a.mo51267e("Khang");
            e.mo51264a("OnBioAuthenticationCallback onError " + i, new Object[0]);
        }

        /* renamed from: b */
        public void mo56681b() {
            dq6.f37375a.mo51267e("Khang").mo51264a("OnBioAuthenticationCallback: onSucceed", new Object[0]);
            this.f41306a.mo56676c1();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTLoginActivity$c", "Lwo2$a;", "", "errorCode", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTLoginActivity$c */
    /* compiled from: AKTLoginActivity.kt */
    public static final class C8146c implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ AKTLoginActivity f41307a;

        /* renamed from: b */
        public final /* synthetic */ boolean f41308b;

        public C8146c(AKTLoginActivity aKTLoginActivity, boolean z) {
            this.f41307a = aKTLoginActivity;
            this.f41308b = z;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
            this.f41307a.mo56670Q0().f31252f.setChecked(!this.f41308b);
            this.f41307a.mo56675b1(!this.f41308b);
            f06.m57523n(this.f41307a, "TWO_FACTOR", Boolean.valueOf(!this.f41308b));
        }

        /* renamed from: b */
        public void mo56681b() {
            this.f41307a.mo56675b1(this.f41308b);
            f06.m57523n(this.f41307a, "TWO_FACTOR", Boolean.valueOf(this.f41308b));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTLoginActivity$d", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTLoginActivity$d */
    /* compiled from: AKTLoginActivity.kt */
    public static final class C8147d implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6213la f41309a;

        /* renamed from: d */
        public final /* synthetic */ AKTLoginActivity f41310d;

        public C8147d(C6213la laVar, AKTLoginActivity aKTLoginActivity) {
            this.f41309a = laVar;
            this.f41310d = aKTLoginActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41309a.f31254h.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41309a.f31254h.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41310d.mo56677d1();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTLoginActivity$e", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTLoginActivity$e */
    /* compiled from: AKTLoginActivity.kt */
    public static final class C8148e implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C6213la f41311a;

        /* renamed from: d */
        public final /* synthetic */ AKTLoginActivity f41312d;

        public C8148e(C6213la laVar, AKTLoginActivity aKTLoginActivity) {
            this.f41311a = laVar;
            this.f41312d = aKTLoginActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            String c = Common.f42577a.mo60897c(obj);
            if (!vx2.m53586b(obj, c)) {
                EditText editText = this.f41311a.f31253g.getEditText();
                if (editText != null) {
                    editText.setText(c);
                }
                EditText editText2 = this.f41311a.f31253g.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(c.length());
                    return;
                }
                return;
            }
            this.f41312d.mo56677d1();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTLoginActivity$f", "Lwo2$a;", "", "errorCode", "Lr37;", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTLoginActivity$f */
    /* compiled from: AKTLoginActivity.kt */
    public static final class C8149f implements wo2.C9557a {

        /* renamed from: a */
        public final /* synthetic */ AKTLoginActivity f41313a;

        public C8149f(AKTLoginActivity aKTLoginActivity) {
            this.f41313a = aKTLoginActivity;
        }

        /* renamed from: a */
        public void mo56680a(int i) {
            dq6.C6999b e = dq6.f37375a.mo51267e("Khang");
            e.mo51264a("OnBioAuthenticationCallback onError " + i, new Object[0]);
        }

        /* renamed from: b */
        public void mo56681b() {
            dq6.f37375a.mo51267e("Khang").mo51264a("OnBioAuthenticationCallback: onSucceed", new Object[0]);
            this.f41313a.mo56673Z0();
        }
    }

    /* renamed from: P0 */
    public static final void m65017P0(AKTLoginActivity aKTLoginActivity, CompoundButton compoundButton, boolean z) {
        vx2.m53591g(aKTLoginActivity, "this$0");
        aKTLoginActivity.f41305I.mo66750b(aKTLoginActivity, new C8146c(aKTLoginActivity, z));
    }

    /* renamed from: T0 */
    public static final void m65018T0(AKTLoginActivity aKTLoginActivity, View view) {
        vx2.m53591g(aKTLoginActivity, "this$0");
        aKTLoginActivity.onBackPressed();
    }

    /* renamed from: U0 */
    public static final void m65019U0(C6213la laVar, AKTLoginActivity aKTLoginActivity, View view) {
        String str;
        Editable text;
        String obj;
        Editable text2;
        String obj2;
        vx2.m53591g(laVar, "$this_apply");
        vx2.m53591g(aKTLoginActivity, "this$0");
        EditText editText = laVar.f31254h.getEditText();
        String str2 = "";
        if (editText == null || (text2 = editText.getText()) == null || (obj2 = text2.toString()) == null || (str = StringsKt__StringsKt.m63092W0(obj2).toString()) == null) {
            str = str2;
        }
        EditText editText2 = laVar.f31253g.getEditText();
        if (!(editText2 == null || (text = editText2.getText()) == null || (obj = text.toString()) == null)) {
            str2 = obj;
        }
        aKTLoginActivity.mo56672S0(str, str2);
    }

    /* renamed from: V0 */
    public static final void m65020V0(AKTLoginActivity aKTLoginActivity, View view) {
        vx2.m53591g(aKTLoginActivity, "this$0");
        aKTLoginActivity.mo56668N0();
    }

    /* renamed from: W0 */
    public static final void m65021W0(AKTLoginActivity aKTLoginActivity, View view) {
        vx2.m53591g(aKTLoginActivity, "this$0");
        aKTLoginActivity.startActivity(new Intent(aKTLoginActivity, WipeDataActivity.class));
    }

    /* renamed from: X0 */
    public static final void m65022X0(AKTLoginActivity aKTLoginActivity, View view) {
        vx2.m53591g(aKTLoginActivity, "this$0");
        a77.m55427e(aKTLoginActivity);
    }

    /* renamed from: Y0 */
    public static final void m65023Y0(AKTLoginActivity aKTLoginActivity, View view) {
        vx2.m53591g(aKTLoginActivity, "this$0");
        if (f06.m57514e(aKTLoginActivity, "TWO_FACTOR", false)) {
            aKTLoginActivity.mo56674a1();
        }
    }

    /* renamed from: N0 */
    public final void mo56668N0() {
        if (f06.m57514e(this, "TWO_FACTOR", false)) {
            this.f41305I.mo66750b(this, new C8145b(this));
        } else {
            mo56676c1();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: O0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56669O0() {
        /*
            r5 = this;
            boolean r0 = p000.a77.m55426d(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r1
            goto L_0x000b
        L_0x0009:
            r0 = 8
        L_0x000b:
            la r2 = r5.mo56670Q0()
            androidx.appcompat.widget.AppCompatImageView r2 = r2.f31248b
            r2.setVisibility(r0)
            java.lang.String r0 = "TWO_FACTOR"
            boolean r2 = p000.f06.m57514e(r5, r0, r1)
            r3 = 1
            if (r2 == 0) goto L_0x0057
            boolean r2 = r5.mo56559v0()
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = "KA"
            java.lang.String r2 = p000.f06.m57518i(r5, r2)
            java.lang.String r4 = "getString(this@AKTLoginActivity, SharedPrefs.KA)"
            p000.vx2.m53590f(r2, r4)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0036
            r2 = r3
            goto L_0x0037
        L_0x0036:
            r2 = r1
        L_0x0037:
            if (r2 == 0) goto L_0x0057
            net.safemoon.androidwallet.model.wallets.Wallet r2 = p000.ol0.m70351c(r5)
            if (r2 == 0) goto L_0x0052
            java.lang.String r2 = r2.getU5B64()
            if (r2 == 0) goto L_0x0052
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x004d
            r2 = r3
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            if (r2 != r3) goto L_0x0052
            r2 = r3
            goto L_0x0053
        L_0x0052:
            r2 = r1
        L_0x0053:
            if (r2 == 0) goto L_0x0057
            r2 = r3
            goto L_0x0058
        L_0x0057:
            r2 = r1
        L_0x0058:
            boolean r0 = p000.f06.m57514e(r5, r0, r1)
            la r4 = r5.mo56670Q0()
            com.google.android.material.switchmaterial.SwitchMaterial r4 = r4.f31252f
            r4.setChecked(r0)
            r5.mo56675b1(r0)
            la r0 = r5.mo56670Q0()
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r0.f31252f
            p1 r4 = new p1
            r4.<init>(r5)
            r0.setOnCheckedChangeListener(r4)
            java.lang.String r0 = "API_KEY"
            java.lang.String r4 = ""
            java.lang.String r0 = p000.up1.m72959d(r5, r0, r4)
            if (r2 == 0) goto L_0x0097
            boolean r2 = p000.a77.m55426d(r5)
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "apiKey"
            p000.vx2.m53590f(r0, r2)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0092
            r1 = r3
        L_0x0092:
            if (r1 == 0) goto L_0x0097
            r5.mo56674a1()
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTLoginActivity.mo56669O0():void");
    }

    /* renamed from: Q0 */
    public final C6213la mo56670Q0() {
        return (C6213la) this.f41303C.getValue();
    }

    /* renamed from: R0 */
    public final boolean mo56671R0() {
        return ((Boolean) this.f41304H.getValue()).booleanValue();
    }

    /* renamed from: S0 */
    public final void mo56672S0(String str, String str2) {
        String str3;
        boolean z;
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        boolean z2 = false;
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f8528r = a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        mo56670Q0().f31249c.setEnabled(false);
        Common common = Common.f42577a;
        String q = common.mo60910q(str);
        String q2 = common.mo60910q(str2);
        if (C9198q.f44131b) {
            str3 = C2127d2.m14640e(this.f8531y, q, q2);
            vx2.m53590f(str3, "{\n            anonymize(…st if necessary\n        }");
        } else {
            str3 = mo12156T(this.f8531y, q, q2);
            vx2.m53590f(str3, "{\n            anonymizeA…st if necessary\n        }");
        }
        this.f8531y.mo24209c("U", q);
        this.f8531y.mo24209c("P", q2);
        ex7 c = C2935o.m23568c(q, q2);
        String e = c.mo19520e();
        String g = c.mo19522g();
        f06.m57524o(this, "TEMPU5", g);
        f06.m57524o(this, "TEMPK5", e);
        this.f8531y.mo24209c("U5", g);
        this.f8531y.mo24209c("K5", e);
        String d = C3311sx.m27174d(C2540id3.m19564f(C2540id3.m19566h(C2540id3.m19559a(C2127d2.m14653r(q)), C2127d2.m14653r(q2))));
        this.f8531y.mo24209c("UK5", d);
        Wallet c2 = ol0.m70351c(this);
        boolean z3 = true;
        if (c2 == null || c2.getU5B64() == null) {
            z = false;
        } else {
            z = true;
        }
        String d2 = up1.m72959d(this, "API_KEY", "");
        if (z && f06.m57512c(this, "KA")) {
            vx2.m53590f(d2, "apiKey");
            if (d2.length() <= 0) {
                z3 = false;
            }
            if (z3) {
                z2 = C2127d2.m14655t(f06.m57518i(this, "KA"), d);
            }
        }
        if (C9198q.f44132c) {
            mo56554A0(str3);
        } else if (!z2) {
            mo56554A0(str3);
        } else {
            mo56673Z0();
        }
    }

    /* renamed from: Z0 */
    public final void mo56673Z0() {
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
        f06.m57522m(this, "TIMENOW", C2127d2.m14635B());
        if (mo56560w0()) {
            setResult(-1, new Intent());
        } else if (!mo56558u0()) {
            String c = up1.m72958c(this, "UK5");
            String c2 = up1.m72958c(this, "K5");
            String i = f06.m57518i(this, "U5");
            this.f8531y.mo24209c("K5", c2);
            this.f8531y.mo24209c("UK5", c);
            this.f8531y.mo24209c("U5", i);
            MyApplicationClass.m64669c().f41193y = true;
            AKTHomeActivity.m64858g1(this);
        }
        finish();
    }

    /* renamed from: a1 */
    public final void mo56674a1() {
        this.f41305I.mo66750b(this, new C8149f(this));
    }

    /* renamed from: b1 */
    public final void mo56675b1(boolean z) {
        if (z) {
            mo56670Q0().f31248b.setVisibility(0);
        } else {
            mo56670Q0().f31248b.setVisibility(8);
        }
    }

    /* renamed from: c1 */
    public final void mo56676c1() {
        C9001np.m69938W(new WeakReference(this), Integer.valueOf(R.string.acknowledgment_confirm_title), Integer.valueOf(R.string.akt_reset_password_dialog_remind_content), R.string.acknowledgment_confirm_button_text, new AKTLoginActivity$showForgotCredentialWarningDialog$1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56677d1() {
        /*
            r4 = this;
            la r0 = r4.mo56670Q0()
            com.google.android.material.textfield.TextInputLayout r0 = r0.f31254h
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
            la r2 = r4.mo56670Q0()
            com.google.android.material.textfield.TextInputLayout r2 = r2.f31253g
            android.widget.EditText r2 = r2.getEditText()
            if (r2 == 0) goto L_0x0039
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x0039
            java.lang.String r1 = r2.toString()
        L_0x0039:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0045
            r0 = r2
            goto L_0x0046
        L_0x0045:
            r0 = r3
        L_0x0046:
            if (r0 != r2) goto L_0x004a
            r0 = r2
            goto L_0x004b
        L_0x004a:
            r0 = r3
        L_0x004b:
            if (r0 != 0) goto L_0x008a
            if (r1 == 0) goto L_0x005c
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0057
            r0 = r2
            goto L_0x0058
        L_0x0057:
            r0 = r3
        L_0x0058:
            if (r0 != r2) goto L_0x005c
            r0 = r2
            goto L_0x005d
        L_0x005c:
            r0 = r3
        L_0x005d:
            if (r0 == 0) goto L_0x0060
            goto L_0x008a
        L_0x0060:
            la r0 = r4.mo56670Q0()
            com.google.android.material.button.MaterialButton r0 = r0.f31249c
            r1 = 2131099707(0x7f06003b, float:1.7811775E38)
            int r1 = r4.getColor(r1)
            r0.setTextColor(r1)
            la r0 = r4.mo56670Q0()
            com.google.android.material.button.MaterialButton r0 = r0.f31249c
            r0.setEnabled(r2)
            la r0 = r4.mo56670Q0()
            com.google.android.material.button.MaterialButton r0 = r0.f31249c
            r1 = 2131099676(0x7f06001c, float:1.7811712E38)
            android.content.res.ColorStateList r1 = r4.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
            goto L_0x00b3
        L_0x008a:
            la r0 = r4.mo56670Q0()
            com.google.android.material.button.MaterialButton r0 = r0.f31249c
            r1 = 2131100019(0x7f060173, float:1.7812408E38)
            int r1 = r4.getColor(r1)
            r0.setTextColor(r1)
            la r0 = r4.mo56670Q0()
            com.google.android.material.button.MaterialButton r0 = r0.f31249c
            r0.setEnabled(r3)
            la r0 = r4.mo56670Q0()
            com.google.android.material.button.MaterialButton r0 = r0.f31249c
            r1 = 2131099677(0x7f06001d, float:1.7811714E38)
            android.content.res.ColorStateList r1 = r4.getColorStateList(r1)
            r0.setBackgroundTintList(r1)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTLoginActivity.mo56677d1():void");
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        vx2.m53591g(ow7, "safeMoonppp");
        mo56670Q0().f31249c.setEnabled(true);
        super.mo12164e0(ow7, str);
    }

    public void onBackPressed() {
        if (mo56560w0() || mo56671R0()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56670Q0().mo45403b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onPostCreate(r6)
            java.lang.String r6 = "API_KEY"
            java.lang.String r0 = ""
            java.lang.String r6 = p000.up1.m72959d(r5, r6, r0)
            la r0 = r5.mo56670Q0()
            c36 r1 = r0.f31255i
            androidx.appcompat.widget.Toolbar r1 = r1.mo29867b()
            r2 = 8
            r1.setVisibility(r2)
            c36 r1 = r0.f31255i
            android.widget.TextView r1 = r1.f21597e
            r3 = 2131951679(0x7f13003f, float:1.953978E38)
            java.lang.String r3 = r5.getString(r3)
            r1.setText(r3)
            c36 r1 = r0.f31255i
            android.widget.ImageView r1 = r1.f21594b
            r3 = 0
            r1.setVisibility(r3)
            c36 r1 = r0.f31255i
            android.widget.TextView r1 = r1.f21595c
            r1.setVisibility(r2)
            c36 r1 = r0.f31255i
            android.widget.TextView r1 = r1.f21595c
            r4 = 2131951902(0x7f13011e, float:1.9540232E38)
            java.lang.String r4 = r5.getString(r4)
            r1.setText(r4)
            c36 r1 = r0.f31255i
            android.widget.ImageView r1 = r1.f21594b
            j1 r4 = new j1
            r4.<init>(r5)
            r1.setOnClickListener(r4)
            com.google.android.material.button.MaterialButton r1 = r0.f31249c
            k1 r4 = new k1
            r4.<init>(r0, r5)
            r1.setOnClickListener(r4)
            android.widget.TextView r1 = r0.f31256j
            l1 r4 = new l1
            r4.<init>(r5)
            r1.setOnClickListener(r4)
            android.widget.TextView r1 = r0.f31258l
            m1 r4 = new m1
            r4.<init>(r5)
            r1.setOnClickListener(r4)
            net.safemoon.androidwallet.model.wallets.Wallet r1 = p000.ol0.m70351c(r5)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = "KA"
            java.lang.String r1 = p000.f06.m57518i(r5, r1)
            java.lang.String r4 = "getString(this@AKTLoginActivity, SharedPrefs.KA)"
            p000.vx2.m53590f(r1, r4)
            int r1 = r1.length()
            r4 = 1
            if (r1 != 0) goto L_0x0089
            r1 = r4
            goto L_0x008a
        L_0x0089:
            r1 = r3
        L_0x008a:
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = "apiKey"
            p000.vx2.m53590f(r6, r1)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r4 = r3
        L_0x0099:
            if (r4 == 0) goto L_0x009c
            goto L_0x00b3
        L_0x009c:
            boolean r6 = r5.mo56560w0()
            if (r6 == 0) goto L_0x00bf
            android.widget.TextView r6 = r0.f31256j
            r1 = 4
            r6.setVisibility(r1)
            android.widget.TextView r6 = r0.f31259m
            r6.setVisibility(r2)
            android.widget.TextView r6 = r0.f31258l
            r6.setVisibility(r2)
            goto L_0x00bf
        L_0x00b3:
            androidx.appcompat.widget.AppCompatImageView r6 = r0.f31248b
            r6.setEnabled(r3)
            androidx.appcompat.widget.AppCompatImageView r6 = r0.f31248b
            r1 = 1056964608(0x3f000000, float:0.5)
            r6.setAlpha(r1)
        L_0x00bf:
            android.widget.LinearLayout r6 = r0.f31250d
            n1 r1 = new n1
            r1.<init>(r5)
            r6.setOnClickListener(r1)
            androidx.appcompat.widget.AppCompatImageView r6 = r0.f31248b
            o1 r1 = new o1
            r1.<init>(r5)
            r6.setOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r6 = r0.f31254h
            android.widget.EditText r6 = r6.getEditText()
            if (r6 == 0) goto L_0x00e3
            net.safemoon.androidwallet.activity.AKTLoginActivity$d r1 = new net.safemoon.androidwallet.activity.AKTLoginActivity$d
            r1.<init>(r0, r5)
            r6.addTextChangedListener(r1)
        L_0x00e3:
            com.google.android.material.textfield.TextInputLayout r6 = r0.f31253g
            android.widget.EditText r6 = r6.getEditText()
            if (r6 == 0) goto L_0x00f3
            net.safemoon.androidwallet.activity.AKTLoginActivity$e r1 = new net.safemoon.androidwallet.activity.AKTLoginActivity$e
            r1.<init>(r0, r5)
            r6.addTextChangedListener(r1)
        L_0x00f3:
            r5.mo56677d1()
            r5.mo56669O0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTLoginActivity.onPostCreate(android.os.Bundle):void");
    }
}
