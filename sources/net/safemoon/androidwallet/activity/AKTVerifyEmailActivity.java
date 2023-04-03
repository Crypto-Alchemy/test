package net.safemoon.androidwallet.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;
import p000.dq6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 O2\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u001a\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J+\u0010#\u001a\u00020\u00042\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00109\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\bB\u00104R\"\u0010H\u001a\u0010\u0012\f\u0012\n E*\u0004\u0018\u00010\n0\n0D8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\bI\u00104R\u0016\u0010L\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010K¨\u0006Q"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTVerifyEmailActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "", "enterCode", "Lr37;", "b1", "Y0", "V0", "S0", "a1", "", "countTime", "c1", "E0", "d1", "U0", "Low7;", "ppp", "", "parts", "R0", "(Low7;[Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "onPostCreate", "toSend", "T0", "H0", "safeMoonppp", "message", "e0", "X", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "Lcb;", "A", "Lef3;", "F0", "()Lcb;", "binding", "", "B", "J0", "()Z", "isChangeEmail", "C", "Ljava/lang/String;", "verifyCode", "H", "I", "remainingCount", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "G0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "Landroid/os/CountDownTimer;", "L", "Landroid/os/CountDownTimer;", "timer", "", "M", "J", "receiveCodeTimestamp", "P", "maximumActiveCode", "Lk04;", "kotlin.jvm.PlatformType", "Q", "Lk04;", "countTimeForResend", "U", "maximumCountTime", "Z", "isUpdatingEmail", "<init>", "()V", "Y", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTVerifyEmailActivity.kt */
public final class AKTVerifyEmailActivity extends AKTServerFunctions {

    /* renamed from: Y */
    public static final C8177a f41384Y = new C8177a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41385A = C6169a.m47232a(new AKTVerifyEmailActivity$binding$2(this));

    /* renamed from: B */
    public final ef3 f41386B = C6169a.m47232a(new AKTVerifyEmailActivity$isChangeEmail$2(this));

    /* renamed from: C */
    public String f41387C = "";

    /* renamed from: H */
    public int f41388H = 3;

    /* renamed from: I */
    public final ef3 f41389I = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new AKTVerifyEmailActivity$special$$inlined$viewModels$default$2(this), new AKTVerifyEmailActivity$special$$inlined$viewModels$default$1(this), new AKTVerifyEmailActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: L */
    public CountDownTimer f41390L;

    /* renamed from: M */
    public long f41391M;

    /* renamed from: P */
    public final int f41392P = 900;

    /* renamed from: Q */
    public final k04<Integer> f41393Q = new k04<>(0);

    /* renamed from: U */
    public final int f41394U = 60;

    /* renamed from: X */
    public boolean f41395X;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTVerifyEmailActivity$a;", "", "Landroid/content/Context;", "context", "", "verifyCode", "", "isChangeEmail", "Lr37;", "a", "IS_BACK_FROM_CHANGE_EMAIL", "Ljava/lang/String;", "IS_CHANGE_EMAIL", "VERIFY_CODE", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTVerifyEmailActivity$a */
    /* compiled from: AKTVerifyEmailActivity.kt */
    public static final class C8177a {
        public C8177a() {
        }

        public /* synthetic */ C8177a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo56818a(Context context, String str, boolean z) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "verifyCode");
            Intent intent = new Intent(context, AKTVerifyEmailActivity.class);
            intent.putExtra("IS_CHANGE_EMAIL", z);
            intent.putExtra("VERIFY_CODE", str);
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTVerifyEmailActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTVerifyEmailActivity$b */
    /* compiled from: AKTVerifyEmailActivity.kt */
    public static final class C8178b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTVerifyEmailActivity f41396a;

        /* renamed from: d */
        public final /* synthetic */ C3925cb f41397d;

        public C8178b(AKTVerifyEmailActivity aKTVerifyEmailActivity, C3925cb cbVar) {
            this.f41396a = aKTVerifyEmailActivity;
            this.f41397d = cbVar;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            String obj = editable.toString();
            this.f41396a.mo56815b1(obj);
            Locale locale = Locale.ROOT;
            String upperCase = obj.toUpperCase(locale);
            vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!vx2.m53586b(obj, upperCase)) {
                EditText editText = this.f41397d.f21647f.getEditText();
                if (editText != null) {
                    String upperCase2 = obj.toUpperCase(locale);
                    vx2.m53590f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    editText.setText(upperCase2);
                }
                EditText editText2 = this.f41397d.f21647f.getEditText();
                if (editText2 != null) {
                    editText2.setSelection(obj.length());
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTVerifyEmailActivity$c", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lr37;", "onTick", "onFinish", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTVerifyEmailActivity$c */
    /* compiled from: AKTVerifyEmailActivity.kt */
    public static final class C8179c extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ AKTVerifyEmailActivity f41398a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8179c(AKTVerifyEmailActivity aKTVerifyEmailActivity, long j) {
            super(j, 1000);
            this.f41398a = aKTVerifyEmailActivity;
        }

        /* renamed from: b */
        public static final void m65287b(AKTVerifyEmailActivity aKTVerifyEmailActivity) {
            vx2.m53591g(aKTVerifyEmailActivity, "this$0");
            Integer num = (Integer) aKTVerifyEmailActivity.f41393Q.getValue();
            if (num == null) {
                num = 0;
            }
            aKTVerifyEmailActivity.mo56816c1(num.intValue());
            aKTVerifyEmailActivity.mo56804F0().f21646e.setEnabled(true);
            aKTVerifyEmailActivity.mo56804F0().f21646e.setTextColor(aKTVerifyEmailActivity.getColor(R.color.akt_sign_in_wipe));
        }

        public void onFinish() {
            new Handler(Looper.getMainLooper()).post(new C7818l3(this.f41398a));
        }

        public void onTick(long j) {
            int i;
            k04 z0 = this.f41398a.f41393Q;
            Integer num = (Integer) this.f41398a.f41393Q.getValue();
            if (num != null) {
                i = num.intValue() - 1;
            } else {
                i = 0;
            }
            z0.postValue(Integer.valueOf(i));
        }
    }

    /* renamed from: I0 */
    public static final void m65243I0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K0 */
    public static final void m65244K0(AKTVerifyEmailActivity aKTVerifyEmailActivity, View view) {
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        aKTVerifyEmailActivity.onBackPressed();
    }

    /* renamed from: L0 */
    public static final void m65245L0(AKTVerifyEmailActivity aKTVerifyEmailActivity, View view) {
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        aKTVerifyEmailActivity.onBackPressed();
    }

    /* renamed from: M0 */
    public static final void m65246M0(AKTVerifyEmailActivity aKTVerifyEmailActivity, View view) {
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        a77.m55427e(aKTVerifyEmailActivity);
    }

    /* renamed from: N0 */
    public static final void m65247N0(AKTVerifyEmailActivity aKTVerifyEmailActivity, C3925cb cbVar, View view) {
        Editable editable;
        boolean z;
        boolean z2;
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        vx2.m53591g(cbVar, "$this_apply");
        String str = "";
        if (new Date().getTime() - aKTVerifyEmailActivity.f41391M > ((long) aKTVerifyEmailActivity.f41392P) * 1000) {
            aKTVerifyEmailActivity.f41387C = str;
        }
        EditText editText = cbVar.f21647f.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String obj = StringsKt__StringsKt.m63090V0(String.valueOf(editable)).toString();
        if (obj.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aKTVerifyEmailActivity.mo56811U0();
            return;
        }
        if (aKTVerifyEmailActivity.f41387C.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !vx2.m53586b(obj, aKTVerifyEmailActivity.f41387C)) {
            int i = aKTVerifyEmailActivity.f41388H - 1;
            aKTVerifyEmailActivity.f41388H = i;
            if (i > 0) {
                if (i > 1) {
                    str = "s";
                }
                cb6 cb6 = cb6.f21669a;
                String string = aKTVerifyEmailActivity.getString(R.string.akt_verify_email_invalid_code_text);
                vx2.m53590f(string, "getString(R.string.akt_v…_email_invalid_code_text)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(aKTVerifyEmailActivity.f41388H), str}, 2));
                vx2.m53590f(format, "format(format, *args)");
                ol0.m70346Z(aKTVerifyEmailActivity, format);
                return;
            }
            aKTVerifyEmailActivity.mo56803E0();
            return;
        }
        aKTVerifyEmailActivity.mo56817d1();
    }

    /* renamed from: O0 */
    public static final void m65248O0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: P0 */
    public static final void m65249P0(AKTVerifyEmailActivity aKTVerifyEmailActivity, View view) {
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        aKTVerifyEmailActivity.mo56809S0();
    }

    /* renamed from: Q0 */
    public static final void m65250Q0(AKTVerifyEmailActivity aKTVerifyEmailActivity) {
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        aKTVerifyEmailActivity.mo56812V0();
    }

    /* renamed from: W0 */
    public static final void m65251W0(Dialog dialog, AKTVerifyEmailActivity aKTVerifyEmailActivity) {
        vx2.m53591g(dialog, "$dialog");
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        dialog.dismiss();
        new Handler(Looper.getMainLooper()).postDelayed(new C6842b3(aKTVerifyEmailActivity), 200);
    }

    /* renamed from: X0 */
    public static final void m65252X0(AKTVerifyEmailActivity aKTVerifyEmailActivity) {
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        EditText editText = aKTVerifyEmailActivity.mo56804F0().f21647f.getEditText();
        a77.m55429g(editText);
        if (editText != null) {
            editText.setSelection(editText.getText().length());
        }
    }

    /* renamed from: Z0 */
    public static final void m65253Z0(Dialog dialog, AKTVerifyEmailActivity aKTVerifyEmailActivity) {
        vx2.m53591g(dialog, "$dialog");
        vx2.m53591g(aKTVerifyEmailActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(aKTVerifyEmailActivity, AKTHomeActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("IS_BACK_FROM_CHANGE_EMAIL", true);
        aKTVerifyEmailActivity.startActivity(intent);
        aKTVerifyEmailActivity.finish();
    }

    /* renamed from: E0 */
    public final void mo56803E0() {
        Intent intent = new Intent(this, AKTActivity.class);
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* renamed from: F0 */
    public final C3925cb mo56804F0() {
        return (C3925cb) this.f41385A.getValue();
    }

    /* renamed from: G0 */
    public final AKTWebSocketHandlingViewModel mo56805G0() {
        return (AKTWebSocketHandlingViewModel) this.f41389I.getValue();
    }

    /* renamed from: H0 */
    public void mo56806H0() {
        mo56805G0().mo60953i().observe(this, new C6792a3(new AKTVerifyEmailActivity$initReceiveResponse$1(this)));
    }

    /* renamed from: J0 */
    public final boolean mo56807J0() {
        return ((Boolean) this.f41386B.getValue()).booleanValue();
    }

    /* renamed from: R0 */
    public final void mo56808R0(ow7 ow7, String[] strArr) {
        for (String B0 : strArr) {
            List B02 = StringsKt__StringsKt.m63061B0(B0, new String[]{"="}, false, 0, 6, (Object) null);
            boolean z = true;
            if (B02.size() > 1) {
                String str = (String) CollectionsKt___CollectionsKt.m47329Z(B02);
                int hashCode = str.hashCode();
                if (hashCode != -547471898) {
                    if (hashCode != 2313765) {
                        if (hashCode == 1004359981 && str.equals("QUESTIONS")) {
                            String j = C2935o.m23575j(f06.m57518i(this, "ICEPRIVKEY"), C9198q.f44136g, (String) B02.get(1));
                            if (j == null) {
                                j = "";
                            }
                            int i0 = StringsKt__StringsKt.m63104i0(j, '|', 0, false, 6, (Object) null);
                            if (i0 + 5 > j.length()) {
                                if (j.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    j = j.substring(0, i0);
                                    vx2.m53590f(j, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                            }
                            ow7.mo24209c("questions", j);
                        }
                    } else if (str.equals("KPPP")) {
                        ow7.mo24209c("KPP", (String) B02.get(1));
                    }
                } else if (str.equals("VERIFYCODE")) {
                    this.f41387C = (String) B02.get(1);
                }
            }
        }
    }

    /* renamed from: S0 */
    public final void mo56809S0() {
        String str;
        ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
        String string = getString(R.string.loading);
        vx2.m53590f(string, "getString(R.string.loading)");
        ProgressLoading a = aVar.mo57297a(false, string, "");
        this.f8528r = a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        vx2.m53590f(supportFragmentManager, "supportFragmentManager");
        a.mo57295D(supportFragmentManager);
        String i = f06.m57518i(this, "EMAILRAW");
        if (C9198q.f44131b) {
            str = mo12155R(this.f8531y, i, false);
            vx2.m53590f(str, "{\n            SFMICE03(\n…e\n            )\n        }");
        } else {
            str = C2127d2.m14637b(this.f8531y, "AKTPPP03");
            vx2.m53590f(str, "{\n            AKTSecpUti…pp, \"AKTPPP03\")\n        }");
        }
        mo56810T0(str);
    }

    /* renamed from: T0 */
    public void mo56810T0(String str) {
        if (str != null) {
            mo56805G0().mo60956l(str);
        }
    }

    /* renamed from: U0 */
    public final void mo56811U0() {
        C9001np.m69939X(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_verify_code_empty_message), 0, new AKTVerifyEmailActivity$showCodeEmptyDialog$1(this), 10, (Object) null);
    }

    /* renamed from: V0 */
    public final void mo56812V0() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_email_sent);
        Window window = dialog.getWindow();
        vx2.m53588d(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        new Handler(Looper.getMainLooper()).postDelayed(new C7332k3(dialog, this), 1500);
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56805G0().mo60951g();
    }

    /* renamed from: Y0 */
    public final void mo56813Y0() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_success);
        Window window = dialog.getWindow();
        vx2.m53588d(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        new Handler(Looper.getMainLooper()).postDelayed(new C7240j3(dialog, this), 1500);
    }

    /* renamed from: a1 */
    public final void mo56814a1() {
        mo56804F0().f21646e.setEnabled(false);
        mo56804F0().f21646e.setTextColor(getColor(R.color.akt_button_inactive));
        this.f41393Q.postValue(Integer.valueOf(this.f41394U));
        CountDownTimer countDownTimer = this.f41390L;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C8179c cVar = new C8179c(this, ((long) this.f41394U) * 1000);
        this.f41390L = cVar;
        cVar.start();
    }

    /* renamed from: b1 */
    public final void mo56815b1(String str) {
        boolean z;
        if (StringsKt__StringsKt.m63090V0(str).toString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo56804F0().f21643b.setTextColor(getColor(R.color.white));
            mo56804F0().f21643b.setEnabled(false);
            mo56804F0().f21643b.setBackgroundTintList(getColorStateList(R.color.akt_button_inactive));
            return;
        }
        mo56804F0().f21643b.setTextColor(getColor(R.color.black));
        mo56804F0().f21643b.setEnabled(true);
        mo56804F0().f21643b.setBackgroundTintList(getColorStateList(R.color.akt_button_active));
    }

    /* renamed from: c1 */
    public final void mo56816c1(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.akt_verify_email_resend_code_text));
        if (i > 0) {
            sb.append(" ");
            sb.append("(" + i + ")");
        }
        mo56804F0().f21646e.setText(sb.toString());
    }

    /* renamed from: d1 */
    public final void mo56817d1() {
        if (mo56807J0()) {
            String U = AKTServerFunctions.m12036U(this, f06.m57518i(this, "EMAILRAW"));
            this.f41395X = true;
            mo56810T0(U);
            ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
            String string = getString(R.string.loading);
            vx2.m53590f(string, "getString(R.string.loading)");
            ProgressLoading a = aVar.mo57297a(false, string, "");
            this.f8528r = a;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57295D(supportFragmentManager);
            return;
        }
        AKTRegisterActivity.f41315I.mo56700a(this);
        finish();
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        ow7 ow72 = ow7;
        String str2 = str;
        vx2.m53591g(ow72, "safeMoonppp");
        if (!mo12163d0(str2)) {
            String[] w = C2127d2.m14658w(Common.f42577a.mo60918y(this, str2), "|");
            vx2.m53590f(w, "parts");
            if (w.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str3 = w[0];
                vx2.m53590f(str3, "parts[0]");
                if (StringsKt__StringsKt.m63061B0(str3, new String[]{"="}, false, 0, 6, (Object) null).size() >= 2) {
                    String str4 = w[0];
                    vx2.m53590f(str4, "parts[0]");
                    String upperCase = ((String) StringsKt__StringsKt.m63061B0(str4, new String[]{"="}, false, 0, 6, (Object) null).get(1)).toUpperCase(Locale.ROOT);
                    vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    mo12159X();
                    int hashCode = upperCase.hashCode();
                    if (hashCode != -1299641089) {
                        if (hashCode != -1165468466) {
                            if (hashCode == 325952731 && upperCase.equals("AKTSERVERERROR")) {
                                mo12165f0(w, (String) null);
                                return;
                            }
                        } else if (upperCase.equals("CHANGEEMAIL02")) {
                            ProgressLoading progressLoading = this.f8528r;
                            if (progressLoading != null) {
                                progressLoading.mo22266k();
                            }
                            this.f41395X = false;
                            mo56813Y0();
                            return;
                        }
                    } else if (upperCase.equals("AKTSFMICE04")) {
                        mo56808R0(ow72, w);
                        ProgressLoading progressLoading2 = this.f8528r;
                        if (progressLoading2 != null) {
                            progressLoading2.mo22266k();
                        }
                        mo56814a1();
                        this.f41391M = new Date().getTime();
                        mo56812V0();
                        return;
                    }
                    super.mo12164e0(ow7, str);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        this.f8528r.mo22266k();
        if (this.f41395X) {
            C9001np.m69939X(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_change_email_message), 0, (pc2) null, 26, (Object) null);
            this.f41395X = false;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56804F0().mo29908b());
        mo56805G0().mo60957m();
        mo56806H0();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        if (!mo56807J0()) {
            getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        } else {
            getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("VERIFY_CODE");
            if (stringExtra == null) {
                stringExtra = "";
            } else {
                vx2.m53590f(stringExtra, "it.getStringExtra(VERIFY_CODE)?: \"\"");
            }
            this.f41387C = stringExtra;
            dq6.C6999b e = dq6.f37375a.mo51267e("Khang");
            String upperCase = this.f41387C.toUpperCase(Locale.ROOT);
            vx2.m53590f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            e.mo51264a(upperCase, new Object[0]);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f41390L;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C3925cb F0 = mo56804F0();
        if (mo56807J0()) {
            int c = zr0.m31440c(this, R.color.t1);
            F0.f21648g.f21595c.setVisibility(8);
            F0.f21648g.f21594b.setVisibility(0);
            EditText editText = F0.f21647f.getEditText();
            if (editText != null) {
                editText.setTextColor(c);
            }
            F0.f21647f.setEndIconTintList(ColorStateList.valueOf(c));
            F0.f21649h.setBackgroundColor(c);
            F0.f21646e.setTextColor(c);
            mo56804F0().f21645d.setImageResource(R.drawable.ic_logo_dark);
            F0.f21648g.mo29867b().setBackgroundColor(zr0.m31440c(this, R.color.toolbar_bg_color));
            F0.f21648g.f21597e.setVisibility(0);
            F0.f21648g.f21597e.setText(getString(R.string.akt_verify_email_header_title));
            F0.f21644c.setBackgroundColor(zr0.m31440c(this, R.color.p0));
        } else {
            F0.f21648g.f21597e.setVisibility(0);
            F0.f21648g.f21594b.setVisibility(0);
            F0.f21648g.f21595c.setVisibility(8);
            F0.f21648g.f21597e.setText(getString(R.string.akt_activity_register_txt));
            F0.f21648g.f21595c.setText(getString(R.string.cancel));
        }
        F0.f21648g.f21595c.setOnClickListener(new C6922c3(this));
        F0.f21648g.f21594b.setOnClickListener(new C6960d3(this));
        F0.f21644c.setOnClickListener(new C7012e3(this));
        F0.f21643b.setOnClickListener(new C7064f3(this, F0));
        this.f41393Q.observe(this, new C7116g3(new AKTVerifyEmailActivity$onPostCreate$1$5(this)));
        mo56814a1();
        this.f41391M = new Date().getTime();
        F0.f21646e.setOnClickListener(new C7158h3(this));
        mo56815b1("");
        EditText editText2 = F0.f21647f.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8178b(this, F0));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new C7203i3(this), 300);
    }
}
