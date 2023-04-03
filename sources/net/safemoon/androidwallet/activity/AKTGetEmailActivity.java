package net.safemoon.androidwallet.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
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

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J%\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J+\u0010$\u001a\u00020\u00042\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u001b\u00101\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001b\u00106\u001a\u0002028BX\u0002¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006C"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTGetEmailActivity;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "", "email", "Lr37;", "O0", "N0", "M0", "Low7;", "ppp", "", "parts", "H0", "(Low7;[Ljava/lang/String;)V", "I0", "([Ljava/lang/String;)V", "", "titleResId", "contentResId", "confirmBtnTextResId", "Lkotlin/Function0;", "onActionClickListener", "K0", "(Ljava/lang/Integer;IILpc2;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "toSend", "J0", "y0", "safeMoonppp", "message", "e0", "X", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "", "A", "Lef3;", "B0", "()Z", "isForgotPassword", "B", "C0", "isRegister", "C", "A0", "isChangeEmail", "Lda;", "H", "w0", "()Lda;", "binding", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "I", "x0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "L", "Ljava/lang/String;", "verifyCode", "<init>", "()V", "M", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTGetEmailActivity.kt */
public final class AKTGetEmailActivity extends AKTServerFunctions {

    /* renamed from: M */
    public static final C8128a f41252M = new C8128a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final ef3 f41253A = C6169a.m47232a(new AKTGetEmailActivity$isForgotPassword$2(this));

    /* renamed from: B */
    public final ef3 f41254B = C6169a.m47232a(new AKTGetEmailActivity$isRegister$2(this));

    /* renamed from: C */
    public final ef3 f41255C = C6169a.m47232a(new AKTGetEmailActivity$isChangeEmail$2(this));

    /* renamed from: H */
    public final ef3 f41256H = C6169a.m47232a(new AKTGetEmailActivity$binding$2(this));

    /* renamed from: I */
    public final ef3 f41257I = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new AKTGetEmailActivity$special$$inlined$viewModels$default$2(this), new AKTGetEmailActivity$special$$inlined$viewModels$default$1(this), new AKTGetEmailActivity$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: L */
    public String f41258L = "";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTGetEmailActivity$a;", "", "Landroid/content/Context;", "context", "", "isForgotPassword", "isRegister", "isChangeEmail", "Lr37;", "a", "", "IS_CHANGE_MASTER_EMAIL", "Ljava/lang/String;", "IS_FORGOT_PASSWORD", "IS_REGISTER_MASTER", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTGetEmailActivity$a */
    /* compiled from: AKTGetEmailActivity.kt */
    public static final class C8128a {
        public C8128a() {
        }

        public /* synthetic */ C8128a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m64833b(C8128a aVar, Context context, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            aVar.mo56605a(context, z, z2, z3);
        }

        /* renamed from: a */
        public final void mo56605a(Context context, boolean z, boolean z2, boolean z3) {
            vx2.m53591g(context, "context");
            Intent intent = new Intent(context, AKTGetEmailActivity.class);
            intent.putExtra("IS_FORGOT_PASSWORD", z);
            intent.putExtra("IS_REGISTER_MASTER", z2);
            intent.putExtra("IS_CHANGE_MASTER_EMAIL", z3);
            context.startActivity(intent);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, mo44877d2 = {"net/safemoon/androidwallet/activity/AKTGetEmailActivity$b", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.activity.AKTGetEmailActivity$b */
    /* compiled from: AKTGetEmailActivity.kt */
    public static final class C8129b implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ AKTGetEmailActivity f41259a;

        public C8129b(AKTGetEmailActivity aKTGetEmailActivity) {
            this.f41259a = aKTGetEmailActivity;
        }

        public void afterTextChanged(Editable editable) {
            vx2.m53591g(editable, "s");
            this.f41259a.mo56601O0(editable.toString());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            vx2.m53591g(charSequence, "s");
        }
    }

    /* renamed from: D0 */
    public static final void m64802D0(AKTGetEmailActivity aKTGetEmailActivity, View view) {
        vx2.m53591g(aKTGetEmailActivity, "this$0");
        aKTGetEmailActivity.onBackPressed();
    }

    /* renamed from: E0 */
    public static final void m64803E0(AKTGetEmailActivity aKTGetEmailActivity, View view) {
        vx2.m53591g(aKTGetEmailActivity, "this$0");
        aKTGetEmailActivity.onBackPressed();
    }

    /* renamed from: F0 */
    public static final void m64804F0(AKTGetEmailActivity aKTGetEmailActivity, View view) {
        vx2.m53591g(aKTGetEmailActivity, "this$0");
        a77.m55427e(aKTGetEmailActivity);
    }

    /* renamed from: G0 */
    public static final void m64805G0(C5728da daVar, AKTGetEmailActivity aKTGetEmailActivity, View view) {
        Editable editable;
        boolean z;
        String str;
        vx2.m53591g(daVar, "$this_apply");
        vx2.m53591g(aKTGetEmailActivity, "this$0");
        EditText editText = daVar.f28069e.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String obj = StringsKt__StringsKt.m63092W0(String.valueOf(editable)).toString();
        if (obj.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aKTGetEmailActivity.mo56599M0();
        } else if (!ko6.m59871d(obj)) {
            aKTGetEmailActivity.mo56600N0();
        } else {
            ProgressLoading.C8308a aVar = ProgressLoading.f41785Y;
            String string = aKTGetEmailActivity.getString(R.string.loading);
            vx2.m53590f(string, "getString(R.string.loading)");
            ProgressLoading a = aVar.mo57297a(false, string, "");
            aKTGetEmailActivity.f8528r = a;
            FragmentManager supportFragmentManager = aKTGetEmailActivity.getSupportFragmentManager();
            vx2.m53590f(supportFragmentManager, "supportFragmentManager");
            a.mo57295D(supportFragmentManager);
            aKTGetEmailActivity.mo12168k0("EMAILRAW", obj);
            aKTGetEmailActivity.f8531y.mo24209c("EMAILRAW", obj);
            String S = AKTServerFunctions.m12035S(obj);
            aKTGetEmailActivity.mo12168k0("EMAIL", S);
            aKTGetEmailActivity.f8531y.mo24209c("EMAIL", S);
            if (C9198q.f44131b) {
                str = aKTGetEmailActivity.mo12155R(aKTGetEmailActivity.f8531y, obj, aKTGetEmailActivity.mo56593B0());
                vx2.m53590f(str, "{\n                    SF…      )\n                }");
            } else {
                str = C2127d2.m14637b(aKTGetEmailActivity.f8531y, "AKTPPP03");
                vx2.m53590f(str, "{\n                    AK…PPP03\")\n                }");
            }
            aKTGetEmailActivity.mo56597J0(str);
        }
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m64806L0(AKTGetEmailActivity aKTGetEmailActivity, Integer num, int i, int i2, pc2 pc2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = null;
        }
        if ((i3 & 4) != 0) {
            i2 = R.string.action_ok;
        }
        if ((i3 & 8) != 0) {
            pc2 = null;
        }
        aKTGetEmailActivity.mo56598K0(num, i, i2, pc2);
    }

    /* renamed from: z0 */
    public static final void m64816z0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: A0 */
    public final boolean mo56592A0() {
        return ((Boolean) this.f41255C.getValue()).booleanValue();
    }

    /* renamed from: B0 */
    public final boolean mo56593B0() {
        return ((Boolean) this.f41253A.getValue()).booleanValue();
    }

    /* renamed from: C0 */
    public final boolean mo56594C0() {
        return ((Boolean) this.f41254B.getValue()).booleanValue();
    }

    /* renamed from: H0 */
    public final void mo56595H0(ow7 ow7, String[] strArr) {
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
                    this.f41258L = (String) B02.get(1);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56596I0(java.lang.String[] r18) {
        /*
            r17 = this;
            r0 = r18
            int r1 = r0.length
            java.lang.String r2 = ""
            r3 = 0
            r5 = r2
            r4 = r3
        L_0x0008:
            java.lang.String r6 = "="
            r7 = 1
            if (r4 >= r1) goto L_0x0043
            r8 = r0[r4]
            java.lang.String[] r9 = new java.lang.String[]{r6}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r6 = kotlin.text.StringsKt__StringsKt.m63061B0(r8, r9, r10, r11, r12, r13)
            int r8 = r6.size()
            if (r8 <= r7) goto L_0x0040
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.m47329Z(r6)
            java.lang.String r8 = (java.lang.String) r8
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toUpperCase(r9)
            java.lang.String r9 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            p000.vx2.m53590f(r8, r9)
            java.lang.String r9 = "QUESTIONS"
            boolean r8 = p000.vx2.m53586b(r8, r9)
            if (r8 == 0) goto L_0x0040
            java.lang.Object r5 = r6.get(r7)
            java.lang.String r5 = (java.lang.String) r5
        L_0x0040:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0043:
            r4 = r17
            java.lang.String r8 = r4.mo12162c0(r5)
            java.lang.String r0 = "lson"
            p000.vx2.m53590f(r8, r0)
            java.lang.String r0 = "|"
            java.lang.String[] r9 = new java.lang.String[]{r0}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r0 = kotlin.text.StringsKt__StringsKt.m63061B0(r8, r9, r10, r11, r12, r13)
            java.util.Iterator r0 = r0.iterator()
            r8 = r2
            r9 = r8
            r10 = r9
        L_0x0063:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r0.next()
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String[] r12 = new java.lang.String[]{r6}
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r1 = kotlin.text.StringsKt__StringsKt.m63061B0(r11, r12, r13, r14, r15, r16)
            int r2 = r1.size()
            if (r2 <= r7) goto L_0x0063
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            int r5 = r2.hashCode()
            r11 = 2408(0x968, float:3.374E-42)
            if (r5 == r11) goto L_0x00bc
            r11 = 2560(0xa00, float:3.587E-42)
            if (r5 == r11) goto L_0x00ab
            r11 = 2561(0xa01, float:3.589E-42)
            if (r5 == r11) goto L_0x009a
            goto L_0x0063
        L_0x009a:
            java.lang.String r5 = "Q2"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00a3
            goto L_0x0063
        L_0x00a3:
            java.lang.Object r1 = r1.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            goto L_0x0063
        L_0x00ab:
            java.lang.String r5 = "Q1"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x00b4
            goto L_0x0063
        L_0x00b4:
            java.lang.Object r1 = r1.get(r7)
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0063
        L_0x00bc:
            java.lang.String r5 = "KS"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0063
            java.lang.Object r1 = r1.get(r7)
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0063
        L_0x00cc:
            int r0 = r10.length()
            if (r0 != 0) goto L_0x00d4
            r0 = r7
            goto L_0x00d5
        L_0x00d4:
            r0 = r3
        L_0x00d5:
            if (r0 != 0) goto L_0x00f9
            int r0 = r8.length()
            if (r0 != 0) goto L_0x00df
            r0 = r7
            goto L_0x00e0
        L_0x00df:
            r0 = r3
        L_0x00e0:
            if (r0 != 0) goto L_0x00f9
            int r0 = r9.length()
            if (r0 != 0) goto L_0x00e9
            r3 = r7
        L_0x00e9:
            if (r3 == 0) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$a r6 = net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity.f41229Q
            r11 = 1
            r12 = 0
            r13 = 32
            r14 = 0
            r7 = r17
            net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity.C8120a.m64748b(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0109
        L_0x00f9:
            r7 = 0
            r8 = 2131951688(0x7f130048, float:1.9539798E38)
            r9 = 2131951665(0x7f130031, float:1.953975E38)
            r10 = 0
            r11 = 9
            r12 = 0
            r6 = r17
            m64806L0(r6, r7, r8, r9, r10, r11, r12)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTGetEmailActivity.mo56596I0(java.lang.String[]):void");
    }

    /* renamed from: J0 */
    public void mo56597J0(String str) {
        if (str != null) {
            mo56602w0().f28066b.setEnabled(false);
            mo56603x0().mo60956l(str);
        }
    }

    /* renamed from: K0 */
    public final void mo56598K0(Integer num, int i, int i2, pc2<r37> pc2) {
        if (mo56592A0()) {
            C9001np.m69941Z(new WeakReference(this), num, Integer.valueOf(i), i2, pc2);
        } else {
            C9001np.m69938W(new WeakReference(this), num, Integer.valueOf(i), i2, pc2);
        }
    }

    /* renamed from: M0 */
    public final void mo56599M0() {
        m64806L0(this, (Integer) null, R.string.akt_error_email_empty_message, 0, new AKTGetEmailActivity$showEmailEmptyDialog$1(this), 5, (Object) null);
    }

    /* renamed from: N0 */
    public final void mo56600N0() {
        m64806L0(this, (Integer) null, R.string.akt_error_invalid_email_format_message, 0, new AKTGetEmailActivity$showInvalidEmailFormatDialog$1(this), 5, (Object) null);
    }

    /* renamed from: O0 */
    public final void mo56601O0(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !ko6.m59871d(str)) {
            mo56602w0().f28066b.setTextColor(getColor(R.color.white));
            mo56602w0().f28066b.setEnabled(false);
            mo56602w0().f28066b.setBackgroundTintList(getColorStateList(R.color.akt_button_inactive));
            return;
        }
        mo56602w0().f28066b.setTextColor(getColor(R.color.black));
        mo56602w0().f28066b.setEnabled(true);
        mo56602w0().f28066b.setBackgroundTintList(getColorStateList(R.color.akt_button_active));
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56603x0().mo60951g();
    }

    /* renamed from: e0 */
    public void mo12164e0(ow7 ow7, String str) {
        boolean z;
        ow7 ow72 = ow7;
        String str2 = str;
        vx2.m53591g(ow72, "safeMoonppp");
        mo56602w0().f28066b.setEnabled(true);
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
                        if (hashCode != 325952731) {
                            if (hashCode == 1251582055 && upperCase.equals("FORGOT04")) {
                                mo56596I0(w);
                                return;
                            }
                        } else if (upperCase.equals("AKTSERVERERROR")) {
                            mo12165f0(w, (String) null);
                            return;
                        }
                    } else if (upperCase.equals("AKTSFMICE04")) {
                        mo56595H0(ow72, w);
                        AKTVerifyEmailActivity.f41384Y.mo56818a(this, this.f41258L, mo56592A0());
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
        if (mo56593B0()) {
            m64806L0(this, (Integer) null, R.string.akt_error_email_not_found_message, 0, (pc2) null, 13, (Object) null);
        } else {
            m64806L0(this, (Integer) null, R.string.akt_error_email_already_exist_message, 0, (pc2) null, 13, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) mo56602w0().mo41868b());
        mo56603x0().mo60957m();
        mo56604y0();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        if (!mo56592A0()) {
            getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        } else {
            getWindow().setBackgroundDrawableResource(R.drawable.bottom_curve);
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C5728da w0 = mo56602w0();
        if (mo56592A0()) {
            w0.f28071g.setText(getString(R.string.akt_get_email_change_email_address_label_title));
            int c = zr0.m31440c(this, R.color.t1);
            w0.f28072h.f21595c.setVisibility(8);
            w0.f28072h.f21594b.setVisibility(0);
            w0.f28071g.setTextColor(c);
            w0.f28073i.setTextColor(c);
            EditText editText = w0.f28069e.getEditText();
            if (editText != null) {
                editText.setTextColor(c);
            }
            w0.f28069e.setEndIconTintList(ColorStateList.valueOf(c));
            w0.f28070f.setBackgroundColor(c);
            w0.f28068d.setImageResource(R.drawable.ic_logo_dark);
            w0.f28072h.mo29867b().setBackgroundColor(zr0.m31440c(this, R.color.toolbar_bg_color));
            w0.f28072h.f21597e.setVisibility(0);
            w0.f28072h.f21597e.setText(getString(R.string.screen_change_email_address_title));
            w0.f28067c.setBackgroundColor(zr0.m31440c(this, R.color.p0));
        } else {
            w0.f28072h.f21597e.setVisibility(8);
            w0.f28072h.f21594b.setVisibility(0);
            w0.f28072h.f21595c.setVisibility(8);
            w0.f28072h.f21595c.setText(getString(R.string.cancel));
            if (mo56594C0()) {
                w0.f28072h.f21597e.setVisibility(0);
                w0.f28072h.f21597e.setText(getString(R.string.akt_activity_register_txt));
            } else {
                w0.f28072h.f21597e.setVisibility(0);
                w0.f28072h.f21597e.setText(getString(R.string.akt_reset_password_header_title));
            }
        }
        w0.f28072h.f21595c.setOnClickListener(new C9474w(this));
        w0.f28072h.f21594b.setOnClickListener(new C9576x(this));
        w0.f28067c.setOnClickListener(new C9616y(this));
        EditText editText2 = w0.f28069e.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8129b(this));
        }
        mo56601O0("");
        w0.f28066b.setOnClickListener(new C9658z(w0, this));
        if (mo56593B0()) {
            w0.f28073i.setVisibility(8);
        }
    }

    /* renamed from: w0 */
    public final C5728da mo56602w0() {
        return (C5728da) this.f41256H.getValue();
    }

    /* renamed from: x0 */
    public final AKTWebSocketHandlingViewModel mo56603x0() {
        return (AKTWebSocketHandlingViewModel) this.f41257I.getValue();
    }

    /* renamed from: y0 */
    public void mo56604y0() {
        mo56603x0().mo60953i().observe(this, new C9426v(new AKTGetEmailActivity$initReceiveResponse$1(this)));
    }
}
