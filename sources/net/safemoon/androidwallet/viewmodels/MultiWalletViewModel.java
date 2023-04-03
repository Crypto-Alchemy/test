package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.database.mainRoom.MainRoomDatabase;
import net.safemoon.androidwallet.database.room.ApplicationRoomDatabase;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.WalletDataSource;
import net.safemoon.androidwallet.utils.PreFetchData;
import org.web3j.abi.datatypes.Address;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000bJ \u0010\u0010\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000bJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rJ0\u0010\u001a\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018J(\u0010\u001b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018J(\u0010\u001d\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018J\u0014\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ*\u0010!\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018JV\u0010)\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\u0016\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bJ!\u0010,\u001a\u00020\u00042\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140*\"\u00020\u0014¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rR\u001b\u00104\u001a\u00020/8BX\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00160?8\u0006¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010CR\u001b\u0010L\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u0010KR4\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00160N0M8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/MultiWalletViewModel;", "Lwj;", "", "isAddUserTokens", "Lr37;", "l", "(ZLns0;)Ljava/lang/Object;", "A", "m", "Lnet/safemoon/androidwallet/common/TokenType;", "tokenType", "Lkotlin/Function1;", "", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "list", "s", "r", "wallet", "E", "D", "", "newName", "", "linkedState", "Lkotlin/Function0;", "callBack", "G", "H", "isLinked", "F", "orders", "I", "order", "J", "privateKey", "address", "passPhrase", "walletName", "isSetActiveWallet", "isPrimaryWallet", "", "o", "", "xAddress", "x", "([Ljava/lang/String;)V", "q", "Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "b", "Lef3;", "t", "()Lnet/safemoon/androidwallet/database/mainRoom/MainRoomDatabase;", "mainRoomDatabase", "Lnet/safemoon/androidwallet/repository/WalletDataSource;", "c", "v", "()Lnet/safemoon/androidwallet/repository/WalletDataSource;", "walletDataSource", "Lac5;", "d", "u", "()Lac5;", "registerDeviceTokenUseCase", "Landroidx/lifecycle/LiveData;", "e", "Landroidx/lifecycle/LiveData;", "w", "()Landroidx/lifecycle/LiveData;", "walletsLiveData", "f", "getAllWalletSize", "allWalletSize", "Lnet/safemoon/androidwallet/repository/FcmDataSource;", "g", "getFcmDataSource", "()Lnet/safemoon/androidwallet/repository/FcmDataSource;", "fcmDataSource", "", "Lkotlin/Pair;", "h", "Ljava/util/List;", "getBackUpOldPair", "()Ljava/util/List;", "C", "(Ljava/util/List;)V", "backUpOldPair", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel extends C3552wj {

    /* renamed from: b */
    public final ef3 f42763b;

    /* renamed from: c */
    public final ef3 f42764c = C6169a.m47232a(new MultiWalletViewModel$walletDataSource$2(this));

    /* renamed from: d */
    public final ef3 f42765d = C6169a.m47232a(new MultiWalletViewModel$registerDeviceTokenUseCase$2(this));

    /* renamed from: e */
    public final LiveData<List<Wallet>> f42766e = mo61260v().mo60774f();

    /* renamed from: f */
    public final LiveData<Integer> f42767f = mo61260v().mo60777i();

    /* renamed from: g */
    public final ef3 f42768g;

    /* renamed from: h */
    public List<Pair<Long, Integer>> f42769h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42763b = C6169a.m47232a(new MultiWalletViewModel$mainRoomDatabase$2(application));
        this.f42768g = C6169a.m47232a(new MultiWalletViewModel$fcmDataSource$2(application));
        this.f42769h = new ArrayList();
    }

    /* renamed from: B */
    public static final void m68662B(MultiWalletViewModel multiWalletViewModel, tl6 tl6) {
        vx2.m53591g(multiWalletViewModel, "this$0");
        vx2.m53591g(tl6, "task");
        boolean p = tl6.mo48145p();
        StringBuilder sb = new StringBuilder();
        sb.append("238 MWVM removeToken: ");
        sb.append(p);
        if (tl6.mo48145p()) {
            multiWalletViewModel.mo61253m();
        }
    }

    /* renamed from: n */
    public static final void m68672n(MultiWalletViewModel multiWalletViewModel, tl6 tl6) {
        vx2.m53591g(multiWalletViewModel, "this$0");
        vx2.m53591g(tl6, "task");
        tl6.mo48145p();
    }

    /* renamed from: p */
    public static /* synthetic */ void m68673p(MultiWalletViewModel multiWalletViewModel, String str, String str2, String str3, String str4, boolean z, boolean z2, rc2 rc2, int i, Object obj) {
        String str5;
        boolean z3;
        boolean z4;
        if ((i & 8) != 0) {
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i & 16) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 32) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        multiWalletViewModel.mo61254o(str, str2, str3, str5, z3, z4, rc2);
    }

    /* renamed from: y */
    public static final void m68674y(rc2 rc2, Object obj) {
        vx2.m53591g(rc2, "$tmp0");
        rc2.invoke(obj);
    }

    /* renamed from: z */
    public static final void m68675z(Exception exc) {
        vx2.m53591g(exc, "it");
        String message = exc.getMessage();
        System.out.print("Firecase-addOnFailureListener " + message);
    }

    /* renamed from: A */
    public final void mo61243A() {
        FirebaseMessaging.m38582g().mo36210d().mo48131b(new xz3(this));
    }

    /* renamed from: C */
    public final void mo61244C(List<Pair<Long, Integer>> list) {
        vx2.m53591g(list, "<set-?>");
        this.f42769h = list;
    }

    /* renamed from: D */
    public final void mo61245D(Wallet wallet2) {
        vx2.m53591g(wallet2, "wallet");
        f06.m57524o(mo27549b(), "SAFEMOON_PRIVATE_KEY", wallet2.getPrivateKey());
        Application b = mo27549b();
        String passPhrase = wallet2.getPassPhrase();
        if (passPhrase == null) {
            passPhrase = "";
        }
        f06.m57524o(b, "SAFEMOON_RECOVERY_PHRASE", passPhrase);
        f06.m57524o(mo27549b(), "SAFEMOON_ACTIVE_WALLET", wallet2.toString());
        ApplicationRoomDatabase.f41664p.mo57124g();
        PreFetchData preFetchData = PreFetchData.f42593a;
        Application b2 = mo27549b();
        vx2.m53590f(b2, "getApplication()");
        preFetchData.mo60933b(b2);
    }

    /* renamed from: E */
    public final void mo61246E(Wallet wallet2) {
        Long l;
        vx2.m53591g(wallet2, "wallet");
        Application b = mo27549b();
        vx2.m53590f(b, "getApplication<Application>()");
        Wallet c = ol0.m70351c(b);
        if (c != null) {
            l = c.getId();
        } else {
            l = null;
        }
        if (vx2.m53586b(l, wallet2.getId())) {
            f06.m57524o(mo27549b(), "SAFEMOON_ACTIVE_WALLET", wallet2.toString());
        }
    }

    /* renamed from: F */
    public final void mo61247F(Wallet wallet2, int i, pc2<r37> pc2) {
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$updateWallet$3(wallet2, this, i, pc2, (ns0<? super MultiWalletViewModel$updateWallet$3>) null), 3, (Object) null);
    }

    /* renamed from: G */
    public final void mo61248G(Wallet wallet2, String str, int i, pc2<r37> pc2) {
        vx2.m53591g(str, "newName");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$updateWallet$1(wallet2, this, str, i, pc2, (ns0<? super MultiWalletViewModel$updateWallet$1>) null), 3, (Object) null);
    }

    /* renamed from: H */
    public final void mo61249H(Wallet wallet2, String str, pc2<r37> pc2) {
        vx2.m53591g(str, "newName");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$updateWallet$2(wallet2, this, str, pc2, (ns0<? super MultiWalletViewModel$updateWallet$2>) null), 3, (Object) null);
    }

    /* renamed from: I */
    public final void mo61250I(List<Wallet> list) {
        vx2.m53591g(list, "orders");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            Long id = ((Wallet) next).getId();
            if (id != null) {
                arrayList.add(new Pair(Long.valueOf(id.longValue()), Integer.valueOf(i)));
            }
            i = i2;
        }
        if (!vx2.m53586b(this.f42769h, arrayList)) {
            y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$updateWalletOrders$2(this, arrayList, (ns0<? super MultiWalletViewModel$updateWalletOrders$2>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3 == true) goto L_0x0020;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61251J(net.safemoon.androidwallet.model.wallets.Wallet r14, int r15, p000.pc2<p000.r37> r16) {
        /*
            r13 = this;
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            java.lang.String r0 = ""
            r4.element = r0
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L_0x001f
            java.lang.String r3 = r14.getPassPhrase()
            if (r3 == 0) goto L_0x001f
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x001b
            r3 = r1
            goto L_0x001c
        L_0x001b:
            r3 = r2
        L_0x001c:
            if (r3 != r1) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = r2
        L_0x0020:
            if (r1 == 0) goto L_0x0035
            android.app.Application r1 = r13.mo27549b()
            java.lang.String r2 = r14.getPassPhrase()
            java.lang.String r1 = p000.C9377u.m72502g(r1, r2)
            java.lang.String r2 = "getEncryptedRecoveryPhra….passPhrase\n            )"
            p000.vx2.m53590f(r1, r2)
            r4.element = r1
        L_0x0035:
            android.app.Application r1 = r13.mo27549b()
            if (r14 == 0) goto L_0x0043
            java.lang.String r2 = r14.getPrivateKey()
            if (r2 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            java.lang.String r3 = p000.C9377u.m72501f(r1, r0)
            android.app.Application r0 = r13.mo27549b()
            java.lang.String r1 = "U5"
            java.lang.String r5 = p000.f06.m57518i(r0, r1)
            hu0 r9 = p000.cd7.m11843a(r13)
            r10 = 0
            r11 = 0
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletSecure$1 r12 = new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$updateWalletSecure$1
            r8 = 0
            r0 = r12
            r1 = r14
            r2 = r13
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 3
            r1 = 0
            r6 = r9
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r0
            r11 = r1
            p000.y23 unused = p000.d50.m56748b(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel.mo61251J(net.safemoon.androidwallet.model.wallets.Wallet, int, pc2):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61252l(boolean r7, p000.ns0<? super p000.r37> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$1 r0 = (net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$1 r0 = new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            java.lang.String r3 = "getApplication()"
            r4 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            boolean r7 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$iToken$1 r1 = (net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$iToken$1) r1
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r0 = (net.safemoon.androidwallet.viewmodels.MultiWalletViewModel) r0
            p000.hg5.m45199b(r8)
            goto L_0x006b
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            p000.hg5.m45199b(r8)
            net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$iToken$1 r8 = new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addDeleteAbleDefaultToken$iToken$1
            r8.<init>()
            yy0 r2 = p000.yy0.f46294a
            r2.mo67190b()
            c67 r5 = p000.c67.f37071a
            r5.mo50768a()
            android.app.Application r5 = r6.mo27549b()
            p000.vx2.m53590f(r5, r3)
            xy0 r2 = r2.mo67189a(r5)
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r0 = r2.mo66979e(r8, r0)
            if (r0 != r1) goto L_0x0069
            return r1
        L_0x0069:
            r0 = r6
            r1 = r8
        L_0x006b:
            if (r7 == 0) goto L_0x007d
            c67 r7 = p000.c67.f37071a
            android.app.Application r8 = r0.mo27549b()
            p000.vx2.m53590f(r8, r3)
            ip2 r7 = r7.mo50813b(r8)
            r7.mo50495g(r1)
        L_0x007d:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel.mo61252l(boolean, ns0):java.lang.Object");
    }

    /* renamed from: m */
    public final void mo61253m() {
        FirebaseMessaging.m38582g().mo36214i().mo48131b(new a04(this));
    }

    /* renamed from: o */
    public final void mo61254o(String str, String str2, String str3, String str4, boolean z, boolean z2, rc2<? super Long, r37> rc2) {
        boolean z3;
        String str5 = str;
        String str6 = str3;
        vx2.m53591g(str5, "privateKey");
        vx2.m53591g(str2, Address.TYPE_NAME);
        vx2.m53591g(str6, "passPhrase");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        if (str3.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            T g = C9377u.m72502g(mo27549b(), str6);
            vx2.m53590f(g, "getEncryptedRecoveryPhra…pplication(), passPhrase)");
            ref$ObjectRef.element = g;
        }
        String f = C9377u.m72501f(mo27549b(), str5);
        String i = f06.m57518i(mo27549b(), "U5");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$addWallet$1(this, str2, str4, f, ref$ObjectRef, i, z2, z, str, rc2, (ns0<? super MultiWalletViewModel$addWallet$1>) null), 3, (Object) null);
    }

    /* renamed from: q */
    public final void mo61255q(Wallet wallet2) {
        vx2.m53591g(wallet2, "wallet");
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$deleteWallet$1(this, wallet2, (ns0<? super MultiWalletViewModel$deleteWallet$1>) null), 3, (Object) null);
    }

    /* renamed from: r */
    public final void mo61256r(rc2<? super List<Wallet>, r37> rc2) {
        vx2.m53591g(rc2, "list");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$getAllWallets$2(this, rc2, (ns0<? super MultiWalletViewModel$getAllWallets$2>) null), 3, (Object) null);
    }

    /* renamed from: s */
    public final void mo61257s(TokenType tokenType, rc2<? super List<Wallet>, r37> rc2) {
        vx2.m53591g(tokenType, "tokenType");
        vx2.m53591g(rc2, "list");
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new MultiWalletViewModel$getAllWallets$1(this, rc2, tokenType, (ns0<? super MultiWalletViewModel$getAllWallets$1>) null), 3, (Object) null);
    }

    /* renamed from: t */
    public final MainRoomDatabase mo61258t() {
        return (MainRoomDatabase) this.f42763b.getValue();
    }

    /* renamed from: u */
    public final ac5 mo61259u() {
        return (ac5) this.f42765d.getValue();
    }

    /* renamed from: v */
    public final WalletDataSource mo61260v() {
        return (WalletDataSource) this.f42764c.getValue();
    }

    /* renamed from: w */
    public final LiveData<List<Wallet>> mo61261w() {
        return this.f42766e;
    }

    /* renamed from: x */
    public final void mo61262x(String... strArr) {
        vx2.m53591g(strArr, "xAddress");
        if (f06.m57514e(mo27549b(), "FCM_TOKEN", true)) {
            try {
                tl6<String> i = FirebaseMessaging.m38582g().mo36214i();
                vx2.m53590f(i, "getInstance().token");
                i.mo48135f(new yz3(new MultiWalletViewModel$registerDevice$1(this, strArr)));
                i.mo48133d(new zz3());
            } catch (Exception e) {
                String message = e.getMessage();
                System.out.print("Firecase-Exception " + message);
                String localizedMessage = e.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = e.getMessage();
                }
                if (localizedMessage != null) {
                    ol0.m70350b0(localizedMessage, "RegisterDevice3");
                }
            }
        }
    }
}
