package net.safemoon.androidwallet.activity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import com.AKT.anonymouskey.p008ui.login.AKTServerFunctions;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import net.safemoon.androidwallet.MyApplicationClass;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.activity.AKTImportExistingWalletsActivity;
import net.safemoon.androidwallet.activity.StartWalletActivity;
import net.safemoon.androidwallet.dialogs.ProgressLoading;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.AKTWebSocketHandlingViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0004J+\u0010\u0015\u001a\u00020\u00042\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0004J\b\u0010\u0018\u001a\u00020\u000fH\u0004J\b\u0010\u0019\u001a\u00020\u000fH\u0004J%\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002R\u001b\u0010&\u001a\u00020!8DX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, mo44877d2 = {"Lnet/safemoon/androidwallet/activity/AKTBaseLoginFunctions;", "Lcom/AKT/anonymouskey/ui/login/AKTServerFunctions;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "", "toSend", "A0", "s0", "X", "Low7;", "safeMoonppp", "message", "e0", "", "isSwitchAccount", "q0", "", "parts", "aktapiid", "f0", "([Ljava/lang/String;Ljava/lang/String;)V", "u0", "v0", "w0", "ppp", "z0", "(Low7;[Ljava/lang/String;)Z", "mnemonic", "x0", "KAEnc", "y0", "Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "A", "Lef3;", "r0", "()Lnet/safemoon/androidwallet/viewmodels/AKTWebSocketHandlingViewModel;", "webSocketModel", "B", "Z", "isExistingWallets", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AKTBaseLoginFunctions.kt */
public abstract class AKTBaseLoginFunctions extends AKTServerFunctions {

    /* renamed from: A */
    public final ef3 f41238A = new dd7(ua5.m52727b(AKTWebSocketHandlingViewModel.class), new AKTBaseLoginFunctions$special$$inlined$viewModels$default$2(this), new AKTBaseLoginFunctions$special$$inlined$viewModels$default$1(this), new AKTBaseLoginFunctions$special$$inlined$viewModels$default$3((pc2) null, this));

    /* renamed from: B */
    public boolean f41239B;

    /* renamed from: t0 */
    public static final void m64753t0(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: A0 */
    public void mo56554A0(String str) {
        if (str != null) {
            mo56556r0().mo60956l(str);
        }
    }

    /* renamed from: X */
    public void mo12159X() {
        mo56556r0().mo60951g();
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
                    int hashCode = upperCase.hashCode();
                    if (hashCode != -1977771811) {
                        if (hashCode != 325952731) {
                            if (hashCode == 789732987 && upperCase.equals("AKTSFMUSER")) {
                                if (mo56563z0(ow72, w)) {
                                    mo56555q0(ow72, false);
                                }
                            }
                        } else if (upperCase.equals("AKTSERVERERROR")) {
                            mo12165f0(w, (String) null);
                        }
                    } else if (upperCase.equals("AKTAUTHUSER")) {
                        String x = C2127d2.m14659x(ow72, w);
                        f06.m57524o(this, "EMAIL", C2127d2.m14652q(ow72, "EMAIL"));
                        f06.m57524o(this, "U5", C2127d2.m14652q(ow72, "U5"));
                        mo56554A0(x);
                    }
                    super.mo12164e0(ow7, str);
                }
            }
            mo12159X();
        }
    }

    /* renamed from: f0 */
    public void mo12165f0(String[] strArr, String str) {
        ProgressLoading progressLoading = this.f8528r;
        if (progressLoading != null) {
            progressLoading.mo22266k();
        }
        C9001np.m69939X(new WeakReference(this), (Integer) null, Integer.valueOf(R.string.akt_error_invalid_credentials_message), 0, (pc2) null, 26, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo56556r0().mo60957m();
        mo56557s0();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo959l();
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(zr0.m31440c(this, 17170445));
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.akt_night_background)));
        this.f8530x.mo61256r(new AKTBaseLoginFunctions$onCreate$1(this));
    }

    /* renamed from: q0 */
    public final void mo56555q0(ow7 ow7, boolean z) {
        ow7 ow72 = ow7;
        vx2.m53591g(ow72, "safeMoonppp");
        f06.m57522m(this, "TIMENOW", C2127d2.m14635B());
        String g = ow72.mo24213g("EMAIL");
        String g2 = ow72.mo24213g("KA");
        String g3 = ow72.mo24213g("PBU5");
        String g4 = ow72.mo24213g("PB5K");
        String g5 = ow72.mo24213g("U5");
        String g6 = ow72.mo24213g("K5");
        String g7 = ow72.mo24213g("UK5");
        String str = "UK5";
        String g8 = ow72.mo24213g("PBHEX");
        f06.m57524o(this, "EMAIL", g);
        f06.m57524o(this, "KA", g2);
        f06.m57524o(this, "PBU5", g3);
        f06.m57524o(this, "U5", g5);
        f06.m57524o(this, "PB5K", g4);
        if (f06.m57512c(this, "TEMPU5")) {
            f06.m57520k(this, "TEMPU5");
        }
        if (f06.m57512c(this, "TEMPK5")) {
            f06.m57520k(this, "TEMPK5");
        }
        mo12167j0("K5", g6);
        mo12167j0(str, g7);
        if (g8.length() == 64) {
            String m = C2127d2.m14648m(g8);
            vx2.m53590f(m, "mnemonic");
            mo56561x0(m, z);
            return;
        }
        mo12165f0((String[]) null, (String) null);
    }

    /* renamed from: r0 */
    public final AKTWebSocketHandlingViewModel mo56556r0() {
        return (AKTWebSocketHandlingViewModel) this.f41238A.getValue();
    }

    /* renamed from: s0 */
    public void mo56557s0() {
        mo56556r0().mo60953i().observe(this, new C7230j(new AKTBaseLoginFunctions$initReceiveResponse$1(this)));
    }

    /* renamed from: u0 */
    public final boolean mo56558u0() {
        String str;
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            str = extras.getString("bundle.KEY_SOURCE");
        }
        return vx2.m53586b(str, "bundle.SOURCE_APP");
    }

    /* renamed from: v0 */
    public final boolean mo56559v0() {
        String str;
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            str = extras.getString("bundle.KEY_SOURCE");
        }
        return vx2.m53586b(str, "bundle.SOURCE_LOGOUT");
    }

    /* renamed from: w0 */
    public final boolean mo56560w0() {
        String str;
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            str = extras.getString("bundle.KEY_SOURCE");
        }
        return vx2.m53586b(str, "bundle.SOURCE_APP_FOR_RESULT");
    }

    /* renamed from: x0 */
    public final void mo56561x0(String str, boolean z) {
        if (mo56560w0()) {
            setResult(-1, new Intent());
            finish();
        } else if (!mo56558u0() || z) {
            if (this.f41239B) {
                AKTImportExistingWalletsActivity.C8133a.m64946b(AKTImportExistingWalletsActivity.f41282Y, this, (String) null, true, str, (String) null, (String) null, 50, (Object) null);
            } else if (z) {
                StartWalletActivity.C8198a.m65518b(StartWalletActivity.f41482b1, this, false, str, false, 10, (Object) null);
            } else {
                MyApplicationClass.m64669c().f41193y = true;
                AKTHomeActivity.m64858g1(this);
            }
            finish();
        } else {
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56562y0(p000.ow7 r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "U"
            java.lang.String r0 = r6.mo24213g(r0)
            java.lang.String r1 = "P"
            java.lang.String r1 = r6.mo24213g(r1)
            java.lang.String r2 = "KA"
            r6.mo24209c(r2, r7)
            java.lang.String r2 = "username"
            p000.vx2.m53590f(r0, r2)
            int r2 = r0.length()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r4
        L_0x0021:
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "password"
            p000.vx2.m53590f(r1, r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0030
            r2 = r3
            goto L_0x0031
        L_0x0030:
            r2 = r4
        L_0x0031:
            if (r2 == 0) goto L_0x0038
            byte[] r7 = p000.C2127d2.m14638c(r7, r0, r1)
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            java.lang.String r0 = "PBHEX"
            java.lang.String r1 = "ffff"
            r6.mo24209c(r0, r1)
            if (r7 == 0) goto L_0x0048
            int r1 = r7.length
            r2 = 32
            if (r1 != r2) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            if (r3 == 0) goto L_0x0083
            byte[] r1 = p000.fx7.m17479c(r7)
            byte[] r1 = p000.C3311sx.m27175e(r1)
            java.lang.String r1 = p000.C2540id3.m19564f(r1)
            byte[] r2 = p000.C2127d2.m14634A(r7)
            java.lang.String r3 = p000.C2540id3.m19564f(r2)
            p000.C2540id3.m19565g(r3)
            java.lang.String r7 = p000.C2540id3.m19564f(r7)
            java.lang.String r7 = p000.C2540id3.m19565g(r7)
            byte[] r2 = p000.cj5.m11892a(r2)
            java.lang.String r2 = p000.C2540id3.m19564f(r2)
            java.lang.String r2 = p000.C3311sx.m27174d(r2)
            java.lang.String r3 = "PBU5"
            r6.mo24209c(r3, r1)
            java.lang.String r1 = "PB5K"
            r6.mo24209c(r1, r2)
            r6.mo24209c(r0, r7)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTBaseLoginFunctions.mo56562y0(ow7, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo56563z0(p000.ow7 r24, java.lang.String[] r25) {
        /*
            r23 = this;
            r7 = r23
            r0 = r24
            r1 = r25
            int r2 = r1.length
            java.lang.String r5 = ""
            r6 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0010:
            java.lang.String r14 = "EMAIL"
            java.lang.String r15 = "UID"
            java.lang.String r3 = "KA"
            r4 = 0
            if (r6 >= r2) goto L_0x00c6
            r16 = r1[r6]
            java.lang.String r17 = "="
            java.lang.String[] r17 = new java.lang.String[]{r17}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r22 = r2
            java.util.List r2 = kotlin.text.StringsKt__StringsKt.m63061B0(r16, r17, r18, r19, r20, r21)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r2 = r1.length
            r16 = r13
            r13 = 2
            if (r2 < r13) goto L_0x00bc
            r2 = r1[r4]
            int r4 = r2.hashCode()
            r13 = 2390(0x956, float:3.349E-42)
            if (r4 == r13) goto L_0x00b1
            r3 = 2408(0x968, float:3.374E-42)
            if (r4 == r3) goto L_0x00a2
            r3 = 84016(0x14830, float:1.17731E-40)
            if (r4 == r3) goto L_0x0097
            r3 = 66081660(0x3f0537c, float:1.4125099E-36)
            if (r4 == r3) goto L_0x008b
            r3 = 1937025541(0x7374aa05, float:1.938429E31)
            if (r4 == r3) goto L_0x007e
            r3 = 2560(0xa00, float:3.587E-42)
            if (r4 == r3) goto L_0x0071
            r3 = 2561(0xa01, float:3.589E-42)
            if (r4 == r3) goto L_0x0064
            goto L_0x00bc
        L_0x0064:
            java.lang.String r3 = "Q2"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x006d
            goto L_0x00bc
        L_0x006d:
            r4 = 1
            r12 = r1[r4]
            goto L_0x00bc
        L_0x0071:
            r4 = 1
            java.lang.String r3 = "Q1"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x007b
            goto L_0x00bc
        L_0x007b:
            r11 = r1[r4]
            goto L_0x00af
        L_0x007e:
            r4 = 1
            java.lang.String r3 = "APIKEY"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0088
            goto L_0x00bc
        L_0x0088:
            r13 = r1[r4]
            goto L_0x00be
        L_0x008b:
            r4 = 1
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x0093
            goto L_0x00bc
        L_0x0093:
            r8 = r1[r4]
            r10 = r8
            goto L_0x00ae
        L_0x0097:
            r4 = 1
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x009f
            goto L_0x00bc
        L_0x009f:
            r9 = r1[r4]
            goto L_0x00bc
        L_0x00a2:
            r4 = 1
            java.lang.String r3 = "KS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00ac
            goto L_0x00bc
        L_0x00ac:
            r10 = r1[r4]
        L_0x00ae:
            r11 = r10
        L_0x00af:
            r12 = r11
            goto L_0x00bc
        L_0x00b1:
            r4 = 1
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            r1 = r1[r4]
            r5 = r1
        L_0x00bc:
            r13 = r16
        L_0x00be:
            int r6 = r6 + 1
            r1 = r25
            r2 = r22
            goto L_0x0010
        L_0x00c6:
            r16 = r13
            r7.mo56562y0(r0, r5)
            java.lang.String r1 = "PB5K"
            java.lang.String r1 = p000.C2127d2.m14652q(r0, r1)
            ex7 r2 = new ex7
            r2.<init>()
            java.lang.String r1 = p000.C3311sx.m27171a(r1)
            r2.mo19535t(r1)
            java.lang.String r1 = r2.mo19517b(r8)
            java.lang.String r5 = r2.mo19517b(r9)
            java.lang.String r6 = r2.mo19517b(r10)
            java.lang.String r8 = r2.mo19517b(r11)
            java.lang.String r9 = r2.mo19517b(r12)
            java.lang.String r2 = r2.mo19517b(r13)
            if (r2 == 0) goto L_0x0105
            int r10 = r2.length()
            if (r10 <= 0) goto L_0x00ff
            r10 = 1
            goto L_0x0100
        L_0x00ff:
            r10 = r4
        L_0x0100:
            r11 = 1
            if (r10 != r11) goto L_0x0105
            r10 = 1
            goto L_0x0106
        L_0x0105:
            r10 = r4
        L_0x0106:
            if (r10 == 0) goto L_0x010d
            java.lang.String r10 = "API_KEY"
            p000.up1.m72960e(r7, r10, r2)
        L_0x010d:
            net.safemoon.androidwallet.utils.Common r2 = net.safemoon.androidwallet.utils.Common.f42577a
            r2.mo60898d(r7)
            r0.mo24209c(r15, r5)
            r0.mo24209c(r14, r1)
            java.lang.String r0 = p000.f06.m57518i(r7, r3)
            ow7 r1 = r7.f8531y
            java.lang.String r1 = r1.mo24213g(r3)
            if (r0 == 0) goto L_0x0132
            int r2 = r0.length()
            if (r2 <= 0) goto L_0x012c
            r2 = 1
            goto L_0x012d
        L_0x012c:
            r2 = r4
        L_0x012d:
            r3 = 1
            if (r2 != r3) goto L_0x0133
            r2 = r3
            goto L_0x0134
        L_0x0132:
            r3 = 1
        L_0x0133:
            r2 = r4
        L_0x0134:
            if (r2 == 0) goto L_0x013d
            boolean r0 = p000.vx2.m53586b(r0, r1)
            if (r0 == 0) goto L_0x013d
            return r3
        L_0x013d:
            net.safemoon.androidwallet.dialogs.ProgressLoading r0 = r7.f8528r
            if (r0 == 0) goto L_0x0144
            r0.mo22266k()
        L_0x0144:
            boolean r0 = r23.mo56560w0()
            if (r0 == 0) goto L_0x0152
            r0 = r25
            r2 = 0
            r7.mo12165f0(r0, r2)
            r8 = r4
            goto L_0x0190
        L_0x0152:
            net.safemoon.androidwallet.model.wallets.Wallet r0 = p000.ol0.m70351c(r23)
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = r0.getPrivateKey()
            if (r0 == 0) goto L_0x0173
            ow7 r2 = r7.f8531y
            java.lang.String r5 = "UK5"
            java.lang.String r2 = r2.mo24213g(r5)
            java.lang.String r0 = p000.C2127d2.m14645j(r2, r1, r0)
            int r0 = r0.length()
            r1 = 64
            if (r0 != r1) goto L_0x0173
            r3 = r4
        L_0x0173:
            r10 = r3
            net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity$a r0 = net.safemoon.androidwallet.activity.AKTAnswerQuestionsActivity.f41229Q
            java.lang.String r1 = "q1"
            p000.vx2.m53590f(r8, r1)
            java.lang.String r1 = "q2"
            p000.vx2.m53590f(r9, r1)
            java.lang.String r1 = "ks"
            p000.vx2.m53590f(r6, r1)
            r5 = 0
            r1 = r23
            r2 = r8
            r3 = r9
            r8 = r4
            r4 = r6
            r6 = r10
            r0.mo56547a(r1, r2, r3, r4, r5, r6)
        L_0x0190:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.activity.AKTBaseLoginFunctions.mo56563z0(ow7, java.lang.String[]):boolean");
    }
}
