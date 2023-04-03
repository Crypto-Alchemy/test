package net.safemoon.androidwallet.service;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.SimilarTypeGroup;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.request.EvmRequestTransaction;
import net.safemoon.androidwallet.model.request.RequestTransaction;
import net.safemoon.androidwallet.model.transaction.history.Result;
import net.safemoon.androidwallet.utils.Common;
import org.web3j.utils.Convert;
import p000.f94;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 B2\u00020\u0001:\u0002\u001bCB\u0007¢\u0006\u0004\b@\u0010AJ\u0016\u0010\u0005\u001a\u00060\u0004R\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0003J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u001d\u001a\u00020\b8\u0002XD¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002XD¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0018\u0010(\u001a\u00060\u0004R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R#\u00103\u001a\n .*\u0004\u0018\u00010-0-8BX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00107\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006D"}, mo44877d2 = {"Lnet/safemoon/androidwallet/service/TxnListService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Lnet/safemoon/androidwallet/service/TxnListService$b;", "m", "Lr37;", "onCreate", "", "flags", "startId", "onStartCommand", "onDestroy", "Lnet/safemoon/androidwallet/model/request/EvmRequestTransaction;", "requestTransaction", "q", "h", "n", "", "x", "o", "Landroid/app/Notification;", "g", "Landroid/app/NotificationChannel;", "k", "Lf94$e;", "j", "a", "I", "notificationId", "", "d", "Ljava/lang/String;", "notificationChannel", "e", "notificationChannelName", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "notificationManager", "Lnet/safemoon/androidwallet/service/TxnListService$b;", "mBinder", "Lhu0;", "r", "Lhu0;", "scope", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "s", "Lef3;", "l", "()Landroid/content/SharedPreferences;", "preference", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "i", "()Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "listener", "", "y", "Z", "iAmRunning", "Landroid/os/Handler;", "A", "Landroid/os/Handler;", "handler", "<init>", "()V", "B", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TxnListService.kt */
public final class TxnListService extends Service {

    /* renamed from: B */
    public static final C8623a f42549B = new C8623a((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final Handler f42550A = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final int f42551a = 1;

    /* renamed from: d */
    public final String f42552d = "transaction_service";

    /* renamed from: e */
    public final String f42553e = "Transaction Service";

    /* renamed from: g */
    public NotificationManager f42554g;

    /* renamed from: k */
    public final C8624b f42555k = new C8624b();

    /* renamed from: r */
    public final hu0 f42556r = iu0.m59111a(qh1.m71266c());

    /* renamed from: s */
    public final ef3 f42557s = C6169a.m47232a(new TxnListService$preference$2(this));

    /* renamed from: x */
    public final ef3 f42558x = C6169a.m47232a(new TxnListService$listener$2(this));

    /* renamed from: y */
    public boolean f42559y = true;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lnet/safemoon/androidwallet/service/TxnListService$a;", "", "Landroid/app/Application;", "application", "", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "a", "", "TXLIST", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.service.TxnListService$a */
    /* compiled from: TxnListService.kt */
    public static final class C8623a {
        public C8623a() {
        }

        public /* synthetic */ C8623a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<Result> mo60835a(Application application) {
            vx2.m53591g(application, "application");
            ArrayList arrayList = new ArrayList();
            try {
                for (Map.Entry entry : application.getSharedPreferences("TXLIST", 0).getAll().entrySet()) {
                    try {
                        RequestTransaction requestTransaction = (RequestTransaction) new Gson().fromJson(String.valueOf(entry.getValue()), RequestTransaction.class);
                        TokenType c = TokenType.Companion.mo57100c(requestTransaction.getChainName());
                        if (c.getChainId() != TokenType.MULTI_COIN_BITCOIN.getChainId()) {
                            if (c.getChainId() != TokenType.MULTI_COIN_DOGE.getChainId()) {
                                if (c.getChainId() == TokenType.SOLANA.getChainId()) {
                                    Result result = new Result();
                                    Date A = Common.f42577a.mo60891A(requestTransaction.getRequestTime());
                                    if (A == null) {
                                        A = new Date();
                                    }
                                    result.timeStamp = String.valueOf(A.getTime() / ((long) 1000));
                                    result.hash = requestTransaction.getTransactionHash();
                                    result.from = requestTransaction.getFrom();
                                    result.f42485to = requestTransaction.getTo();
                                    result.tokenSymbol = requestTransaction.getSymbol();
                                    result.value = new BigDecimal(String.valueOf(requestTransaction.getAmount())).toPlainString();
                                    result.offlinePending = true;
                                    result.txreceiptStatus = "";
                                    arrayList.add(result);
                                } else if (c.getCoinType().getSimilarTypeGroup() == SimilarTypeGroup.EVM_CAPABILITY) {
                                    EvmRequestTransaction evmRequestTransaction = (EvmRequestTransaction) new Gson().fromJson(String.valueOf(entry.getValue()), EvmRequestTransaction.class);
                                    Result result2 = new Result();
                                    Date A2 = Common.f42577a.mo60891A(evmRequestTransaction.getRequestTime());
                                    if (A2 == null) {
                                        A2 = new Date();
                                    }
                                    result2.timeStamp = String.valueOf(A2.getTime() / ((long) 1000));
                                    result2.hash = evmRequestTransaction.getTransactionHash();
                                    result2.from = evmRequestTransaction.getFrom();
                                    result2.f42485to = evmRequestTransaction.getTo();
                                    result2.tokenSymbol = evmRequestTransaction.getSymbol();
                                    result2.value = new BigDecimal(String.valueOf(evmRequestTransaction.getAmount())).toPlainString();
                                    result2.offlinePending = true;
                                    result2.txreceiptStatus = "";
                                    result2.gasUsed = evmRequestTransaction.getGasUsed();
                                    BigDecimal wei = Convert.toWei(String.valueOf(evmRequestTransaction.getGasPrice()), Convert.Unit.GWEI);
                                    vx2.m53590f(wei, "toWei(eRT.gasPrice.toString(), Convert.Unit.GWEI)");
                                    result2.gasPrice = ol0.m70360g0(wei, 0, 1, (Object) null);
                                    arrayList.add(result2);
                                }
                            }
                        }
                        EvmRequestTransaction evmRequestTransaction2 = (EvmRequestTransaction) new Gson().fromJson(String.valueOf(entry.getValue()), EvmRequestTransaction.class);
                        Result result3 = new Result();
                        Date A3 = Common.f42577a.mo60891A(evmRequestTransaction2.getRequestTime());
                        if (A3 == null) {
                            A3 = new Date();
                        }
                        result3.timeStamp = String.valueOf(A3.getTime() / ((long) 1000));
                        result3.hash = evmRequestTransaction2.getTransactionHash();
                        result3.from = evmRequestTransaction2.getFrom();
                        result3.f42485to = evmRequestTransaction2.getTo();
                        result3.tokenSymbol = evmRequestTransaction2.getSymbol();
                        result3.value = new BigDecimal(String.valueOf(evmRequestTransaction2.getAmount())).toPlainString();
                        result3.offlinePending = true;
                        result3.txreceiptStatus = "";
                        result3.gasUsed = evmRequestTransaction2.getGasUsed();
                        result3.gasPrice = String.valueOf(evmRequestTransaction2.getGasPrice() * ((long) Math.pow(10.0d, 10.0d)));
                        arrayList.add(result3);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
            return arrayList;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/service/TxnListService$b;", "Landroid/os/Binder;", "Lnet/safemoon/androidwallet/service/TxnListService;", "a", "<init>", "(Lnet/safemoon/androidwallet/service/TxnListService;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.service.TxnListService$b */
    /* compiled from: TxnListService.kt */
    public final class C8624b extends Binder {
        public C8624b() {
        }

        /* renamed from: a */
        public final TxnListService mo60836a() {
            return TxnListService.this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, mo44877d2 = {"net/safemoon/androidwallet/service/TxnListService$c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lr37;", "run", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.service.TxnListService$c */
    /* compiled from: TxnListService.kt */
    public static final class C8625c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TxnListService f42561a;

        public C8625c(TxnListService txnListService) {
            this.f42561a = txnListService;
        }

        public void run() {
            if (this.f42561a.f42559y) {
                this.f42561a.mo60822h();
                this.f42561a.f42550A.postDelayed(this, 300000);
            }
        }
    }

    /* renamed from: p */
    public static final void m68264p(TxnListService txnListService) {
        vx2.m53591g(txnListService, "this$0");
        if (txnListService.f42559y) {
            txnListService.mo60822h();
        }
    }

    /* renamed from: g */
    public final Notification mo60821g() {
        f94.C2277e j = mo60824j();
        Object systemService = getSystemService("notification");
        vx2.m53589e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f42554g = (NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel k = mo60825k();
            NotificationManager notificationManager = this.f42554g;
            vx2.m53588d(notificationManager);
            notificationManager.createNotificationChannel(k);
        }
        Notification b = j.mo19790b();
        vx2.m53590f(b, "notificationBuilder.build()");
        return b;
    }

    /* renamed from: h */
    public final void mo60822h() {
        y23 unused = d50.m56748b(this.f42556r, (CoroutineContext) null, (CoroutineStart) null, new TxnListService$checkAndSubmit$1(this, (ns0<? super TxnListService$checkAndSubmit$1>) null), 3, (Object) null);
    }

    /* renamed from: i */
    public final SharedPreferences.OnSharedPreferenceChangeListener mo60823i() {
        return (SharedPreferences.OnSharedPreferenceChangeListener) this.f42558x.getValue();
    }

    /* renamed from: j */
    public final f94.C2277e mo60824j() {
        f94.C2277e g = new f94.C2277e(getApplicationContext(), this.f42552d).mo19794g(true);
        vx2.m53590f(g, "Builder(applicationConte…     .setAutoCancel(true)");
        return g;
    }

    /* renamed from: k */
    public final NotificationChannel mo60825k() {
        return new NotificationChannel(this.f42552d, this.f42553e, 1);
    }

    /* renamed from: l */
    public final SharedPreferences mo60826l() {
        return (SharedPreferences) this.f42557s.getValue();
    }

    /* renamed from: m */
    public C8624b onBind(Intent intent) {
        return this.f42555k;
    }

    /* renamed from: n */
    public final void mo60828n() {
        this.f42550A.removeCallbacksAndMessages((Object) null);
        this.f42550A.postDelayed(new C8625c(this), 300000);
    }

    /* renamed from: o */
    public final void mo60829o(long j) {
        this.f42550A.removeCallbacksAndMessages((Object) null);
        this.f42550A.postDelayed(new dz6(this), j * ((long) 1000));
    }

    public void onCreate() {
        super.onCreate();
        this.f42559y = true;
        mo60826l().registerOnSharedPreferenceChangeListener(mo60823i());
        mo60822h();
        mo60828n();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f42559y = false;
        this.f42550A.removeCallbacksAndMessages((Object) null);
        mo60826l().unregisterOnSharedPreferenceChangeListener(mo60823i());
        NotificationManager notificationManager = this.f42554g;
        if (notificationManager != null) {
            notificationManager.cancel(this.f42551a);
        }
        stopForeground(true);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        startForeground(this.f42551a, mo60821g());
        return 2;
    }

    /* renamed from: q */
    public final void mo60834q(EvmRequestTransaction evmRequestTransaction) {
        vx2.m53591g(evmRequestTransaction, "requestTransaction");
        mo60826l().edit().putString(String.valueOf(System.currentTimeMillis()), evmRequestTransaction.toString()).apply();
    }
}
