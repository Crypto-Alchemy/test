package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.Coin;
import net.safemoon.androidwallet.model.RoomCoinPriceAlert;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.FcmDataSource;
import net.safemoon.androidwallet.repository.TokenListDataSource;
import net.safemoon.androidwallet.utils.Common;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010d\u001a\u000207¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R#\u0010/\u001a\n +*\u0004\u0018\u00010*0*8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078FX\u0002¢\u0006\f\n\u0004\b8\u0010\u0017\u001a\u0004\b9\u0010:R%\u0010B\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010=0=0<8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR1\u0010E\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 +*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00040\u00040<8\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010AR.\u0010G\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 +*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040<8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010?R1\u0010J\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 +*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00040\u00040<8\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR%\u0010N\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010K0K0<8\u0006¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bM\u0010AR$\u0010U\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR#\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u00040V8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R#\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040V8\u0006¢\u0006\f\n\u0004\b\u0011\u0010Y\u001a\u0004\b]\u0010[R#\u0010`\u001a\n +*\u0004\u0018\u00010*0*8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b_\u0010.R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020a0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010b\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SettingNotificationViewModel;", "Lwj;", "Lr37;", "P", "", "Lnet/safemoon/androidwallet/model/priceAlert/PriceAlertToken;", "u", "(Lns0;)Ljava/lang/Object;", "I", "O", "S", "", "chainId", "r", "T", "Lnet/safemoon/androidwallet/model/Coin;", "coin", "p", "Lnet/safemoon/androidwallet/model/priceAlert/PAToken;", "paToken", "q", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "b", "Lef3;", "s", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "c", "z", "()Lnet/safemoon/androidwallet/repository/FcmDataSource;", "fcmDataSource", "Lei0;", "d", "v", "()Lei0;", "coinPriceAlertDataSource", "Lnet/safemoon/androidwallet/repository/TokenListDataSource;", "e", "G", "()Lnet/safemoon/androidwallet/repository/TokenListDataSource;", "tokenListDataSource", "Ltk5;", "kotlin.jvm.PlatformType", "f", "A", "()Ltk5;", "mainNetApiInterface", "g", "Ljava/lang/Integer;", "y", "()Ljava/lang/Integer;", "Q", "(Ljava/lang/Integer;)V", "currencyChainId", "Landroid/app/Application;", "h", "w", "()Landroid/app/Application;", "context", "Lk04;", "", "i", "Lk04;", "H", "()Lk04;", "isDeviceRegistered", "j", "x", "cpaChainList", "k", "priceAlertTokenList", "l", "B", "paTokenList", "", "m", "E", "searchToken", "n", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "R", "(Ljava/lang/String;)V", "tmpSearchToken", "Landroidx/lifecycle/LiveData;", "Lnet/safemoon/androidwallet/model/RoomCoinPriceAlert;", "o", "Landroidx/lifecycle/LiveData;", "t", "()Landroidx/lifecycle/LiveData;", "addedCoin", "C", "paTokenListMap", "D", "safeMoonClient", "Lnet/safemoon/androidwallet/common/TokenType;", "Ljava/util/List;", "supportedChains", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SettingNotificationViewModel.kt */
public final class SettingNotificationViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42821b;

    /* renamed from: c */
    public final ef3 f42822c;

    /* renamed from: d */
    public final ef3 f42823d = C6169a.m47232a(new SettingNotificationViewModel$coinPriceAlertDataSource$2(this));

    /* renamed from: e */
    public final ef3 f42824e;

    /* renamed from: f */
    public final ef3 f42825f;

    /* renamed from: g */
    public Integer f42826g;

    /* renamed from: h */
    public final ef3 f42827h;

    /* renamed from: i */
    public final k04<Boolean> f42828i;

    /* renamed from: j */
    public final k04<List<PAToken>> f42829j;

    /* renamed from: k */
    public final k04<List<PriceAlertToken>> f42830k;

    /* renamed from: l */
    public final k04<List<PAToken>> f42831l;

    /* renamed from: m */
    public final k04<String> f42832m;

    /* renamed from: n */
    public String f42833n;

    /* renamed from: o */
    public final LiveData<List<RoomCoinPriceAlert>> f42834o;

    /* renamed from: p */
    public final LiveData<List<PAToken>> f42835p;

    /* renamed from: q */
    public final ef3 f42836q;

    /* renamed from: r */
    public final List<TokenType> f42837r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$a */
    /* compiled from: Comparisons.kt */
    public static final class C8737a<T> implements Comparator {
        public final int compare(T t, T t2) {
            String name = ((PAToken) t).getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String lowerCase2 = ((PAToken) t2).getName().toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return xl0.m54426a(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingNotificationViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42821b = C6169a.m47232a(new SettingNotificationViewModel$activeWallet$2(application));
        this.f42822c = C6169a.m47232a(new SettingNotificationViewModel$fcmDataSource$2(application));
        this.f42824e = C6169a.m47232a(new SettingNotificationViewModel$tokenListDataSource$2(application));
        this.f42825f = C6169a.m47232a(SettingNotificationViewModel$mainNetApiInterface$2.INSTANCE);
        this.f42827h = C6169a.m47232a(new SettingNotificationViewModel$context$2(this));
        this.f42828i = new k04<>(Boolean.valueOf(f06.m57514e(mo27549b(), "FCM_TOKEN", true)));
        this.f42829j = new k04<>(ck0.m33062j());
        k04<List<PriceAlertToken>> k04 = new k04<>(ck0.m33062j());
        this.f42830k = k04;
        k04<List<PAToken>> k042 = new k04<>(ck0.m33062j());
        this.f42831l = k042;
        k04<String> k043 = new k04<>("");
        this.f42832m = k043;
        this.f42833n = "";
        LiveData<List<RoomCoinPriceAlert>> d = mo61418v().mo51479d();
        this.f42834o = d;
        ls3 ls3 = new ls3();
        ls3.mo22951a(k042, new ty5(new SettingNotificationViewModel$paTokenListMap$1$1(this, ls3)));
        ls3.mo22951a(k04, new uy5(new SettingNotificationViewModel$paTokenListMap$1$2(this, ls3)));
        ls3.mo22951a(k043, new vy5(new SettingNotificationViewModel$paTokenListMap$1$3(this, ls3)));
        ls3.mo22951a(d, new wy5(new SettingNotificationViewModel$paTokenListMap$1$4(this)));
        m68822N(this, ls3);
        this.f42835p = ls3;
        this.f42836q = C6169a.m47232a(SettingNotificationViewModel$safeMoonClient$2.INSTANCE);
        this.f42837r = Common.f42577a.mo60896a(false);
    }

    /* renamed from: J */
    public static final void m68818J(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: K */
    public static final void m68819K(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: L */
    public static final void m68820L(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: M */
    public static final void m68821M(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r14 != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r15 != false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0053 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0100 A[SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m68822N(net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel r16, p000.ls3<java.util.List<net.safemoon.androidwallet.model.priceAlert.PAToken>> r17) {
        /*
            r0 = r16
            k04<java.util.List<net.safemoon.androidwallet.model.priceAlert.PAToken>> r1 = r0.f42831l
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0010
            java.util.List r1 = p000.ck0.m33062j()
        L_0x0010:
            k04<java.util.List<net.safemoon.androidwallet.model.priceAlert.PriceAlertToken>> r2 = r0.f42830k
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x001e
            java.util.List r2 = p000.ck0.m33062j()
        L_0x001e:
            k04<java.lang.String> r0 = r0.f42832m
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = ""
        L_0x002a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.dk0.m43495u(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r4 = r1.hasNext()
            java.lang.String r5 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r4 = r1.next()
            net.safemoon.androidwallet.model.priceAlert.PAToken r4 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x0053:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00d1
            java.lang.Object r11 = r10.next()
            r12 = r11
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r12 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r12
            java.lang.String r13 = r4.getContractAddress()
            if (r13 == 0) goto L_0x007c
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r14)
            p000.vx2.m53590f(r13, r5)
            if (r13 == 0) goto L_0x007c
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0079
            r14 = r6
            goto L_0x007a
        L_0x0079:
            r14 = r8
        L_0x007a:
            if (r14 == 0) goto L_0x007d
        L_0x007c:
            r13 = r7
        L_0x007d:
            java.lang.String r14 = r12.getTokenAddress()
            if (r14 == 0) goto L_0x0099
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            p000.vx2.m53590f(r14, r5)
            if (r14 == 0) goto L_0x0099
            int r15 = r14.length()
            if (r15 != 0) goto L_0x0096
            r15 = r6
            goto L_0x0097
        L_0x0096:
            r15 = r8
        L_0x0097:
            if (r15 == 0) goto L_0x009a
        L_0x0099:
            r14 = r7
        L_0x009a:
            boolean r13 = p000.vx2.m53586b(r13, r14)
            if (r13 == 0) goto L_0x00ca
            java.lang.String r13 = r4.getSymbol()
            if (r13 == 0) goto L_0x00b0
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r14)
            p000.vx2.m53590f(r13, r5)
            goto L_0x00b1
        L_0x00b0:
            r13 = r7
        L_0x00b1:
            java.lang.String r12 = r12.getTokenSymbol()
            if (r12 == 0) goto L_0x00c1
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r14)
            p000.vx2.m53590f(r12, r5)
            goto L_0x00c2
        L_0x00c1:
            r12 = r7
        L_0x00c2:
            boolean r12 = p000.vx2.m53586b(r13, r12)
            if (r12 == 0) goto L_0x00ca
            r12 = r6
            goto L_0x00cb
        L_0x00ca:
            r12 = r8
        L_0x00cb:
            if (r12 == 0) goto L_0x0053
            r9.add(r11)
            goto L_0x0053
        L_0x00d1:
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L_0x00d9
        L_0x00d7:
            r6 = r8
            goto L_0x00ef
        L_0x00d9:
            java.util.Iterator r5 = r9.iterator()
        L_0x00dd:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00d7
            java.lang.Object r7 = r5.next()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertToken r7 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertToken) r7
            boolean r7 = r7.isStatus()
            if (r7 == 0) goto L_0x00dd
        L_0x00ef:
            r4.setHasPriceAlert(r6)
            r3.add(r4)
            goto L_0x0039
        L_0x00f7:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0100:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0147
            java.lang.Object r3 = r2.next()
            r4 = r3
            net.safemoon.androidwallet.model.priceAlert.PAToken r4 = (net.safemoon.androidwallet.model.priceAlert.PAToken) r4
            java.lang.String r9 = r4.getSymbol()
            r10 = 2
            if (r9 == 0) goto L_0x0127
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r11)
            p000.vx2.m53590f(r9, r5)
            if (r9 == 0) goto L_0x0127
            boolean r9 = kotlin.text.StringsKt__StringsKt.m63081R(r9, r0, r8, r10, r7)
            if (r9 != r6) goto L_0x0127
            r9 = r6
            goto L_0x0128
        L_0x0127:
            r9 = r8
        L_0x0128:
            if (r9 != 0) goto L_0x0140
            java.lang.String r4 = r4.getName()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r9)
            p000.vx2.m53590f(r4, r5)
            boolean r4 = kotlin.text.StringsKt__StringsKt.m63081R(r4, r0, r8, r10, r7)
            if (r4 == 0) goto L_0x013e
            goto L_0x0140
        L_0x013e:
            r4 = r8
            goto L_0x0141
        L_0x0140:
            r4 = r6
        L_0x0141:
            if (r4 == 0) goto L_0x0100
            r1.add(r3)
            goto L_0x0100
        L_0x0147:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$a r0 = new net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$a
            r0.<init>()
            java.util.List r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47304D0(r1, r0)
            r1 = r17
            r1.postValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel.m68822N(net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel, ls3):void");
    }

    /* renamed from: A */
    public final tk5 mo61397A() {
        return (tk5) this.f42825f.getValue();
    }

    /* renamed from: B */
    public final k04<List<PAToken>> mo61398B() {
        return this.f42831l;
    }

    /* renamed from: C */
    public final LiveData<List<PAToken>> mo61399C() {
        return this.f42835p;
    }

    /* renamed from: D */
    public final tk5 mo61400D() {
        return (tk5) this.f42836q.getValue();
    }

    /* renamed from: E */
    public final k04<String> mo61401E() {
        return this.f42832m;
    }

    /* renamed from: F */
    public final String mo61402F() {
        return this.f42833n;
    }

    /* renamed from: G */
    public final TokenListDataSource mo61403G() {
        return (TokenListDataSource) this.f42824e.getValue();
    }

    /* renamed from: H */
    public final k04<Boolean> mo61404H() {
        return this.f42828i;
    }

    /* renamed from: I */
    public final void mo61405I() {
        this.f42826g = null;
        mo61407P();
    }

    /* renamed from: O */
    public final void mo61406O() {
        FcmDataSource.m68151g(mo61422z(), (String) null, (String) null, true, new SettingNotificationViewModel$registerDevice$1(this), 3, (Object) null);
    }

    /* renamed from: P */
    public final void mo61407P() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<TokenType> list = this.f42837r;
        ArrayList<TokenType> arrayList2 = new ArrayList<>();
        for (T next : list) {
            if (((TokenType) next) == TokenType.MULTI_COIN) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList2.add(next);
            }
        }
        for (TokenType tokenType : arrayList2) {
            arrayList.add(new PAToken(tokenType.getChainId(), tokenType.getTitle(), tokenType.getNativeToken(), (String) null, (Integer) null, (Object) null, false, 88, (DefaultConstructorMarker) null));
        }
        String string = mo61419w().getString(R.string.cpa_cmc_token_type_title);
        vx2.m53590f(string, "context.getString(R.stri…cpa_cmc_token_type_title)");
        arrayList.add(new PAToken(-1, string, (String) null, (String) null, (Integer) null, (Object) null, false, 120, (DefaultConstructorMarker) null));
        this.f42829j.postValue(arrayList);
    }

    /* renamed from: Q */
    public final void mo61408Q(Integer num) {
        this.f42826g = num;
    }

    /* renamed from: R */
    public final void mo61409R(String str) {
        this.f42833n = str;
    }

    /* renamed from: S */
    public final void mo61410S() {
        FcmDataSource.m68151g(mo61422z(), (String) null, (String) null, false, new SettingNotificationViewModel$unRegisterDevice$1(this), 3, (Object) null);
    }

    /* renamed from: T */
    public final void mo61411T() {
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new SettingNotificationViewModel$updateAllPriceAlert$1(this, (ns0<? super SettingNotificationViewModel$updateAllPriceAlert$1>) null), 2, (Object) null);
    }

    /* renamed from: p */
    public final void mo61412p(Coin coin) {
        vx2.m53591g(coin, "coin");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new SettingNotificationViewModel$addPriceAlertCoin$1(this, coin, (ns0<? super SettingNotificationViewModel$addPriceAlertCoin$1>) null), 2, (Object) null);
    }

    /* renamed from: q */
    public final void mo61413q(PAToken pAToken) {
        vx2.m53591g(pAToken, "paToken");
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new SettingNotificationViewModel$deletePriceAlertCoin$1(this, pAToken, (ns0<? super SettingNotificationViewModel$deletePriceAlertCoin$1>) null), 2, (Object) null);
    }

    /* renamed from: r */
    public final void mo61414r(int i) {
        y23 unused = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new SettingNotificationViewModel$fetchTokenList$1(this, (ns0<? super SettingNotificationViewModel$fetchTokenList$1>) null), 2, (Object) null);
        y23 unused2 = d50.m56748b(cd7.m11843a(this), qh1.m71265b(), (CoroutineStart) null, new SettingNotificationViewModel$fetchTokenList$2(this, i, (ns0<? super SettingNotificationViewModel$fetchTokenList$2>) null), 2, (Object) null);
    }

    /* renamed from: s */
    public final Wallet mo61415s() {
        return (Wallet) this.f42821b.getValue();
    }

    /* renamed from: t */
    public final LiveData<List<RoomCoinPriceAlert>> mo61416t() {
        return this.f42834o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[Catch:{ Exception -> 0x0093 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61417u(p000.ns0<? super java.util.List<net.safemoon.androidwallet.model.priceAlert.PriceAlertToken>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$getAllPriceAlert$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$getAllPriceAlert$1 r0 = (net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$getAllPriceAlert$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$getAllPriceAlert$1 r0 = new net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel$getAllPriceAlert$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p000.hg5.m45199b(r9)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0090
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            tk5 r4 = (p000.tk5) r4
            p000.hg5.m45199b(r9)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0078
        L_0x0041:
            p000.hg5.m45199b(r9)
            net.safemoon.androidwallet.model.wallets.Wallet r9 = r8.mo61415s()
            if (r9 != 0) goto L_0x004f
            java.util.List r9 = p000.ck0.m33062j()
            return r9
        L_0x004f:
            tk5 r9 = r8.mo61400D()     // Catch:{ Exception -> 0x0093 }
            net.safemoon.androidwallet.model.wallets.Wallet r2 = r8.mo61415s()     // Catch:{ Exception -> 0x0093 }
            p000.vx2.m53588d(r2)     // Catch:{ Exception -> 0x0093 }
            net.safemoon.androidwallet.common.MyCoinType r6 = net.safemoon.androidwallet.common.MyCoinType.ETHEREUM     // Catch:{ Exception -> 0x0093 }
            int r6 = r6.getValue()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r2 = r2.getAddress(r6)     // Catch:{ Exception -> 0x0093 }
            net.safemoon.androidwallet.repository.FcmDataSource r6 = r8.mo61422z()     // Catch:{ Exception -> 0x0093 }
            r0.L$0 = r9     // Catch:{ Exception -> 0x0093 }
            r0.L$1 = r2     // Catch:{ Exception -> 0x0093 }
            r0.label = r4     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r4 = r6.mo60724c(r0)     // Catch:{ Exception -> 0x0093 }
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x0078:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0093 }
            k90 r9 = r4.mo66084c(r2, r5, r5, r9)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r2 = "safeMoonClient.getPriceA…DataSource.getFCMToken())"
            p000.vx2.m53590f(r9, r2)     // Catch:{ Exception -> 0x0093 }
            r0.L$0 = r5     // Catch:{ Exception -> 0x0093 }
            r0.L$1 = r5     // Catch:{ Exception -> 0x0093 }
            r0.label = r3     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r9 = retrofit2.KotlinExtensions.m71521c(r9, r0)     // Catch:{ Exception -> 0x0093 }
            if (r9 != r1) goto L_0x0090
            return r1
        L_0x0090:
            bg5 r9 = (p000.bg5) r9     // Catch:{ Exception -> 0x0093 }
            r5 = r9
        L_0x0093:
            if (r5 == 0) goto L_0x00b0
            boolean r9 = r5.mo50581e()
            if (r9 == 0) goto L_0x00b0
            java.lang.Object r9 = r5.mo50578a()
            if (r9 == 0) goto L_0x00b0
            java.lang.Object r9 = r5.mo50578a()
            net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData r9 = (net.safemoon.androidwallet.model.priceAlert.PriceAlertTokenListData) r9
            if (r9 == 0) goto L_0x00b0
            java.util.ArrayList r9 = r9.getResult()
            if (r9 == 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            java.util.List r9 = p000.ck0.m33062j()
        L_0x00b4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SettingNotificationViewModel.mo61417u(ns0):java.lang.Object");
    }

    /* renamed from: v */
    public final ei0 mo61418v() {
        return (ei0) this.f42823d.getValue();
    }

    /* renamed from: w */
    public final Application mo61419w() {
        return (Application) this.f42827h.getValue();
    }

    /* renamed from: x */
    public final k04<List<PAToken>> mo61420x() {
        return this.f42829j;
    }

    /* renamed from: y */
    public final Integer mo61421y() {
        return this.f42826g;
    }

    /* renamed from: z */
    public final FcmDataSource mo61422z() {
        return (FcmDataSource) this.f42822c.getValue();
    }
}
