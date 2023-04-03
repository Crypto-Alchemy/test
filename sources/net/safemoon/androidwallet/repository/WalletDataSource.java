package net.safemoon.androidwallet.repository;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.wallets.Wallet;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010<\u001a\u000209¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011Ja\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*JK\u0010/\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b/\u00100J?\u00104\u001a\u00020#2*\u00103\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060201\"\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000602H@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u00020#2\u0006\u00106\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, mo44877d2 = {"Lnet/safemoon/androidwallet/repository/WalletDataSource;", "", "Landroidx/lifecycle/LiveData;", "", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "f", "", "i", "c", "(Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/common/TokenType;", "chain", "d", "(Lnet/safemoon/androidwallet/common/TokenType;Lns0;)Ljava/lang/Object;", "", "id", "h", "(JLns0;)Ljava/lang/Object;", "", "name", "privateKey", "address", "passPhrase", "prefix", "KA", "U5B64", "order", "", "isPrimaryWallet", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLns0;)Ljava/lang/Object;", "g", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "newName", "linkedState", "Lr37;", "j", "(JLjava/lang/String;ILns0;)Ljava/lang/Object;", "l", "(JLjava/lang/String;Lns0;)Ljava/lang/Object;", "isLinked", "k", "(JILns0;)Ljava/lang/Object;", "encryptedPrivateKey", "encryptedRecoveryPhrase", "ka", "u5", "n", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lns0;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "orders", "m", "([Lkotlin/Pair;Lns0;)Ljava/lang/Object;", "wallet", "e", "(Lnet/safemoon/androidwallet/model/wallets/Wallet;Lns0;)Ljava/lang/Object;", "Lih7;", "a", "Lih7;", "walletDao", "<init>", "(Lih7;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WalletDataSource.kt */
public final class WalletDataSource {

    /* renamed from: a */
    public final ih7 f42536a;

    public WalletDataSource(ih7 ih7) {
        vx2.m53591g(ih7, "walletDao");
        this.f42536a = ih7;
    }

    /* renamed from: b */
    public final Object mo60770b(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, ns0<? super Long> ns0) {
        ih7 ih7 = this.f42536a;
        Wallet wallet2 = r2;
        Wallet wallet3 = new Wallet((Long) null, str, str5, str2, str3, str4, str6, str7, z ? 1 : 0, i, z, (Integer) null, 2049, (DefaultConstructorMarker) null);
        return ih7.mo52480g(wallet2, ns0);
    }

    /* renamed from: c */
    public final Object mo60771c(ns0<? super List<Wallet>> ns0) {
        return this.f42536a.mo52485l(ns0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0050 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60772d(net.safemoon.androidwallet.common.TokenType r7, p000.ns0<? super java.util.List<net.safemoon.androidwallet.model.wallets.Wallet>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof net.safemoon.androidwallet.repository.WalletDataSource$allWallets$2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            net.safemoon.androidwallet.repository.WalletDataSource$allWallets$2 r0 = (net.safemoon.androidwallet.repository.WalletDataSource$allWallets$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.repository.WalletDataSource$allWallets$2 r0 = new net.safemoon.androidwallet.repository.WalletDataSource$allWallets$2
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            net.safemoon.androidwallet.common.TokenType r7 = (net.safemoon.androidwallet.common.TokenType) r7
            p000.hg5.m45199b(r8)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p000.hg5.m45199b(r8)
            ih7 r8 = r6.f42536a
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.mo52485l(r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0050:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r1 = r8.next()
            r2 = r1
            net.safemoon.androidwallet.model.wallets.Wallet r2 = (net.safemoon.androidwallet.model.wallets.Wallet) r2
            boolean r4 = r2.hasPassphrase()
            if (r4 != 0) goto L_0x008d
            java.lang.Integer r4 = r2.getMyCoinType()
            if (r4 != 0) goto L_0x0075
            net.safemoon.androidwallet.common.MyCoinType r4 = r7.getCoinType()
            net.safemoon.androidwallet.common.SimilarTypeGroup r4 = r4.getSimilarTypeGroup()
            net.safemoon.androidwallet.common.SimilarTypeGroup r5 = net.safemoon.androidwallet.common.SimilarTypeGroup.EVM_CAPABILITY
            if (r4 == r5) goto L_0x008d
        L_0x0075:
            java.lang.Integer r2 = r2.getMyCoinType()
            net.safemoon.androidwallet.common.MyCoinType r4 = r7.getCoinType()
            int r4 = r4.getValue()
            if (r2 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r2 = 0
            goto L_0x008e
        L_0x008d:
            r2 = r3
        L_0x008e:
            if (r2 == 0) goto L_0x0050
            r0.add(r1)
            goto L_0x0050
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.repository.WalletDataSource.mo60772d(net.safemoon.androidwallet.common.TokenType, ns0):java.lang.Object");
    }

    /* renamed from: e */
    public final Object mo60773e(Wallet wallet2, ns0<? super r37> ns0) {
        Object d = this.f42536a.mo52477d(wallet2, ns0);
        if (d == wx2.m54101d()) {
            return d;
        }
        return r37.f33317a;
    }

    /* renamed from: f */
    public final LiveData<List<Wallet>> mo60774f() {
        return this.f42536a.mo52476c();
    }

    /* renamed from: g */
    public final Object mo60775g(String str, ns0<? super Boolean> ns0) {
        return this.f42536a.mo52475b(str, ns0);
    }

    /* renamed from: h */
    public final Object mo60776h(long j, ns0<? super Wallet> ns0) {
        return this.f42536a.mo52479f(j, ns0);
    }

    /* renamed from: i */
    public final LiveData<Integer> mo60777i() {
        return this.f42536a.mo52484k();
    }

    /* renamed from: j */
    public final Object mo60778j(long j, String str, int i, ns0<? super r37> ns0) {
        Object e = this.f42536a.mo52478e(j, str, i, ns0);
        if (e == wx2.m54101d()) {
            return e;
        }
        return r37.f33317a;
    }

    /* renamed from: k */
    public final Object mo60779k(long j, int i, ns0<? super r37> ns0) {
        Object j2 = this.f42536a.mo52483j(j, i, ns0);
        if (j2 == wx2.m54101d()) {
            return j2;
        }
        return r37.f33317a;
    }

    /* renamed from: l */
    public final Object mo60780l(long j, String str, ns0<? super r37> ns0) {
        Object h = this.f42536a.mo52481h(j, str, ns0);
        if (h == wx2.m54101d()) {
            return h;
        }
        return r37.f33317a;
    }

    /* renamed from: m */
    public final Object mo60781m(Pair<Long, Integer>[] pairArr, ns0<? super r37> ns0) {
        y23 unused = d50.m56748b(ih2.f38385a, (CoroutineContext) null, (CoroutineStart) null, new WalletDataSource$updateWalletOrders$2(pairArr, this, (ns0<? super WalletDataSource$updateWalletOrders$2>) null), 3, (Object) null);
        return r37.f33317a;
    }

    /* renamed from: n */
    public final Object mo60782n(long j, String str, String str2, String str3, String str4, int i, String str5, ns0<? super r37> ns0) {
        Object i2 = this.f42536a.mo52482i(j, str, str2, str3, str4, i, str5, ns0);
        if (i2 == wx2.m54101d()) {
            return i2;
        }
        return r37.f33317a;
    }
}
