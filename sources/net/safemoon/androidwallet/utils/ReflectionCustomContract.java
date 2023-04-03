package net.safemoon.androidwallet.utils;

import android.app.Application;
import kotlin.C6169a;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.repository.ReflectionDataSource;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b3\u00104J\u0006\u0010\u0003\u001a\u00020\u0002J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J%\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0012\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001d\u00102\u001a\u0004\u0018\u00010/8FX\u0002¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b,\u00101\u0002\u0004\n\u0002\b\u0019¨\u00065"}, mo44877d2 = {"Lnet/safemoon/androidwallet/utils/ReflectionCustomContract;", "", "Landroid/app/Application;", "d", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "token", "", "k", "(Lnet/safemoon/androidwallet/model/token/abstraction/IToken;Lns0;)Ljava/lang/Object;", "", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsToken;", "reflectionTokens", "Lr37;", "j", "(Ljava/util/List;Lns0;)Ljava/lang/Object;", "i", "", "contractAddress", "symbolWithType", "h", "(Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/common/TokenType;", "chain", "blockno", "Ljava/math/BigInteger;", "e", "(Lnet/safemoon/androidwallet/common/TokenType;Ljava/lang/String;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Lnet/safemoon/androidwallet/model/transaction/history/Result;", "g", "(Lnet/safemoon/androidwallet/common/TokenType;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "", "startBlock", "endBlock", "f", "(Lnet/safemoon/androidwallet/common/TokenType;Ljava/lang/String;IILns0;)Ljava/lang/Object;", "tdId", "l", "(Ljava/lang/Integer;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "a", "Landroid/app/Application;", "c", "()Landroid/app/Application;", "appContext", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "b", "Lnet/safemoon/androidwallet/repository/ReflectionDataSource;", "reflectionDataSource", "Lnet/safemoon/androidwallet/model/wallets/Wallet;", "Lef3;", "()Lnet/safemoon/androidwallet/model/wallets/Wallet;", "activeWallet", "<init>", "(Landroid/app/Application;Lnet/safemoon/androidwallet/repository/ReflectionDataSource;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionCustomContract.kt */
public final class ReflectionCustomContract {

    /* renamed from: a */
    public final Application f42596a;

    /* renamed from: b */
    public final ReflectionDataSource f42597b;

    /* renamed from: c */
    public final ef3 f42598c = C6169a.m47232a(new ReflectionCustomContract$activeWallet$2(this));

    public ReflectionCustomContract(Application application, ReflectionDataSource reflectionDataSource) {
        vx2.m53591g(application, "appContext");
        vx2.m53591g(reflectionDataSource, "reflectionDataSource");
        this.f42596a = application;
        this.f42597b = reflectionDataSource;
    }

    /* renamed from: b */
    public final Wallet mo60937b() {
        return (Wallet) this.f42598c.getValue();
    }

    /* renamed from: c */
    public final Application mo60938c() {
        return this.f42596a;
    }

    /* renamed from: d */
    public final Application mo60939d() {
        return this.f42596a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A[Catch:{ Exception -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092 A[Catch:{ Exception -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9 A[Catch:{ Exception -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60940e(net.safemoon.androidwallet.common.TokenType r7, java.lang.String r8, java.lang.String r9, p000.ns0<? super java.math.BigInteger> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$getBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.utils.ReflectionCustomContract$getBalance$1 r0 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$getBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$getBalance$1 r0 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$getBalance$1
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p000.hg5.m45199b(r10)     // Catch:{ Exception -> 0x002a }
            goto L_0x0079
        L_0x002a:
            r7 = move-exception
            goto L_0x00bf
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p000.hg5.m45199b(r10)
            net.safemoon.androidwallet.model.wallets.Wallet r10 = r6.mo60937b()
            if (r10 == 0) goto L_0x00c9
            net.safemoon.androidwallet.common.MyCoinType r2 = r7.getCoinType()
            int r2 = r2.getValue()
            java.lang.String r10 = r10.getAddress(r2)
            if (r10 != 0) goto L_0x004e
            goto L_0x00c9
        L_0x004e:
            i30 r2 = p000.ol0.m70377s(r7)
            int r5 = r9.length()
            if (r5 != 0) goto L_0x005a
            r5 = r3
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0066
            java.lang.String r7 = p000.ol0.m70382x(r7)     // Catch:{ Exception -> 0x002a }
            k90 r7 = r2.mo52392n(r10, r8, r7)     // Catch:{ Exception -> 0x002a }
            goto L_0x006e
        L_0x0066:
            java.lang.String r7 = p000.ol0.m70382x(r7)     // Catch:{ Exception -> 0x002a }
            k90 r7 = r2.mo52381d(r9, r10, r8, r7)     // Catch:{ Exception -> 0x002a }
        L_0x006e:
            if (r7 == 0) goto L_0x007c
            r0.label = r3     // Catch:{ Exception -> 0x002a }
            java.lang.Object r10 = retrofit2.KotlinExtensions.m71521c(r7, r0)     // Catch:{ Exception -> 0x002a }
            if (r10 != r1) goto L_0x0079
            return r1
        L_0x0079:
            bg5 r10 = (p000.bg5) r10     // Catch:{ Exception -> 0x002a }
            goto L_0x007d
        L_0x007c:
            r10 = r4
        L_0x007d:
            if (r10 == 0) goto L_0x0092
            java.lang.Object r7 = r10.mo50578a()     // Catch:{ Exception -> 0x002a }
            net.safemoon.androidwallet.model.BalanceByBlock r7 = (net.safemoon.androidwallet.model.BalanceByBlock) r7     // Catch:{ Exception -> 0x002a }
            if (r7 == 0) goto L_0x0092
            java.lang.String r7 = r7.getResult()     // Catch:{ Exception -> 0x002a }
            if (r7 == 0) goto L_0x0092
            java.math.BigInteger r7 = p000.wb6.m73528j(r7)     // Catch:{ Exception -> 0x002a }
            goto L_0x0093
        L_0x0092:
            r7 = r4
        L_0x0093:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r8.<init>()     // Catch:{ Exception -> 0x002a }
            java.lang.String r9 = "getBalance_response: "
            r8.append(r9)     // Catch:{ Exception -> 0x002a }
            r8.append(r7)     // Catch:{ Exception -> 0x002a }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x002a }
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ Exception -> 0x002a }
            r8.println(r7)     // Catch:{ Exception -> 0x002a }
            if (r10 == 0) goto L_0x00c9
            java.lang.Object r7 = r10.mo50578a()     // Catch:{ Exception -> 0x002a }
            net.safemoon.androidwallet.model.BalanceByBlock r7 = (net.safemoon.androidwallet.model.BalanceByBlock) r7     // Catch:{ Exception -> 0x002a }
            if (r7 == 0) goto L_0x00c9
            java.lang.String r7 = r7.getResult()     // Catch:{ Exception -> 0x002a }
            if (r7 == 0) goto L_0x00c9
            java.math.BigInteger r7 = p000.wb6.m73528j(r7)     // Catch:{ Exception -> 0x002a }
            r4 = r7
            goto L_0x00c9
        L_0x00bf:
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.String r9 = "getBalance_ERROR"
            r8.print(r9)
            r7.printStackTrace()
        L_0x00c9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60940e(net.safemoon.androidwallet.common.TokenType, java.lang.String, java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa A[Catch:{ Exception -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60941f(net.safemoon.androidwallet.common.TokenType r19, java.lang.String r20, int r21, int r22, p000.ns0<? super java.util.List<? extends net.safemoon.androidwallet.model.transaction.history.Result>> r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$2
            if (r1 == 0) goto L_0x0017
            r1 = r0
            net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$2 r1 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$2 r1 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$2
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r1.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00cb }
            goto L_0x009e
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            p000.hg5.m45199b(r0)
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r18.mo60937b()
            if (r0 == 0) goto L_0x00cb
            net.safemoon.androidwallet.common.MyCoinType r4 = r19.getCoinType()
            int r4 = r4.getValue()
            java.lang.String r8 = r0.getAddress(r4)
            if (r8 != 0) goto L_0x0052
            goto L_0x00cb
        L_0x0052:
            i30 r7 = p000.ol0.m70377s(r19)
            int r0 = r20.length()
            if (r0 != 0) goto L_0x005e
            r0 = r5
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L_0x007a
            r9 = 0
            java.lang.Integer r10 = p000.a40.m31673d(r4)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r11 = p000.ol0.m70382x(r19)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r12 = "asc"
            r15 = 2
            r16 = 0
            r13 = r21
            r14 = r22
            k90 r0 = p000.i30.C7204a.m58793b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00cb }
            goto L_0x0093
        L_0x007a:
            java.lang.String r11 = p000.ol0.m70382x(r19)     // Catch:{ Exception -> 0x00cb }
            r9 = 0
            java.lang.Integer r10 = p000.a40.m31673d(r4)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r13 = "asc"
            r16 = 2
            r17 = 0
            r12 = r20
            r14 = r21
            r15 = r22
            k90 r0 = p000.i30.C7204a.m58798g(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00cb }
        L_0x0093:
            if (r0 == 0) goto L_0x00a1
            r1.label = r5     // Catch:{ Exception -> 0x00cb }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r1)     // Catch:{ Exception -> 0x00cb }
            if (r0 != r3) goto L_0x009e
            return r3
        L_0x009e:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00cb }
            goto L_0x00a2
        L_0x00a1:
            r0 = r6
        L_0x00a2:
            if (r0 == 0) goto L_0x00cb
            boolean r1 = r0.mo50581e()     // Catch:{ Exception -> 0x00cb }
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r1 = r0.mo50578a()     // Catch:{ Exception -> 0x00cb }
            net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel r1 = (net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel) r1     // Catch:{ Exception -> 0x00cb }
            if (r1 == 0) goto L_0x00b5
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.Result> r1 = r1.result     // Catch:{ Exception -> 0x00cb }
            goto L_0x00b6
        L_0x00b5:
            r1 = r6
        L_0x00b6:
            if (r1 == 0) goto L_0x00cb
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00cb }
            net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel r0 = (net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel) r0     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x00cb
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.Result> r0 = r0.result     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x00cb
            int r1 = r0.size()     // Catch:{ Exception -> 0x00cb }
            if (r1 <= 0) goto L_0x00cb
            r6 = r0
        L_0x00cb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60941f(net.safemoon.androidwallet.common.TokenType, java.lang.String, int, int, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[Catch:{ Exception -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60942g(net.safemoon.androidwallet.common.TokenType r19, java.lang.String r20, p000.ns0<? super java.util.List<? extends net.safemoon.androidwallet.model.transaction.history.Result>> r21) {
        /*
            r18 = this;
            r0 = r21
            boolean r1 = r0 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$1 r1 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r18
            goto L_0x001e
        L_0x0017:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$1 r1 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$getTxData$1
            r2 = r18
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r1.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x009a
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            p000.hg5.m45199b(r0)
            net.safemoon.androidwallet.model.wallets.Wallet r0 = r18.mo60937b()
            if (r0 == 0) goto L_0x00c7
            net.safemoon.androidwallet.common.MyCoinType r4 = r19.getCoinType()
            int r4 = r4.getValue()
            java.lang.String r8 = r0.getAddress(r4)
            if (r8 != 0) goto L_0x0051
            goto L_0x00c7
        L_0x0051:
            i30 r7 = p000.ol0.m70377s(r19)
            int r0 = r20.length()
            if (r0 != 0) goto L_0x005d
            r0 = r5
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L_0x0078
            r9 = 0
            java.lang.Integer r10 = p000.a40.m31673d(r4)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r11 = p000.ol0.m70382x(r19)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r12 = "asc"
            r13 = 0
            r14 = 0
            r15 = 98
            r16 = 0
            k90 r0 = p000.i30.C7204a.m58793b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x008f
        L_0x0078:
            java.lang.String r11 = p000.ol0.m70382x(r19)     // Catch:{ Exception -> 0x00c7 }
            r9 = 0
            java.lang.Integer r10 = p000.a40.m31673d(r4)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r13 = "asc"
            r14 = 0
            r15 = 0
            r16 = 194(0xc2, float:2.72E-43)
            r17 = 0
            r12 = r20
            k90 r0 = p000.i30.C7204a.m58798g(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00c7 }
        L_0x008f:
            if (r0 == 0) goto L_0x009d
            r1.label = r5     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r0 = retrofit2.KotlinExtensions.m71521c(r0, r1)     // Catch:{ Exception -> 0x00c7 }
            if (r0 != r3) goto L_0x009a
            return r3
        L_0x009a:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x00c7 }
            goto L_0x009e
        L_0x009d:
            r0 = r6
        L_0x009e:
            if (r0 == 0) goto L_0x00c7
            boolean r1 = r0.mo50581e()     // Catch:{ Exception -> 0x00c7 }
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r1 = r0.mo50578a()     // Catch:{ Exception -> 0x00c7 }
            net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel r1 = (net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel) r1     // Catch:{ Exception -> 0x00c7 }
            if (r1 == 0) goto L_0x00b1
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.Result> r1 = r1.result     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00b2
        L_0x00b1:
            r1 = r6
        L_0x00b2:
            if (r1 == 0) goto L_0x00c7
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x00c7 }
            net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel r0 = (net.safemoon.androidwallet.model.transaction.history.TransactionHistoryModel) r0     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00c7
            java.util.ArrayList<net.safemoon.androidwallet.model.transaction.history.Result> r0 = r0.result     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00c7
            int r1 = r0.size()     // Catch:{ Exception -> 0x00c7 }
            if (r1 <= 0) goto L_0x00c7
            r6 = r0
        L_0x00c7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60942g(net.safemoon.androidwallet.common.TokenType, java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096 A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0 A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c2 A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2 A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00eb A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0115 A[Catch:{ Exception -> 0x0128 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0116 A[Catch:{ Exception -> 0x0128 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0127 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60943h(java.lang.String r17, java.lang.String r18, p000.ns0<? super p000.r37> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$5
            if (r3 == 0) goto L_0x0019
            r3 = r2
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$5 r3 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$5) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$5 r3 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$5
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p000.wx2.m54101d()
            int r5 = r3.label
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r10) goto L_0x0063
            if (r5 == r9) goto L_0x0038
            if (r5 == r8) goto L_0x0056
            if (r5 == r7) goto L_0x0045
            if (r5 != r6) goto L_0x003d
        L_0x0038:
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x0128 }
            goto L_0x0128
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            java.lang.Object r1 = r3.L$2
            net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r1 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r1
            java.lang.Object r5 = r3.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r7 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r7
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x0128 }
            goto L_0x0117
        L_0x0056:
            java.lang.Object r1 = r3.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r5 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r5
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x0128 }
            goto L_0x00de
        L_0x0063:
            java.lang.Object r1 = r3.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r10 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r10
            p000.hg5.m45199b(r2)     // Catch:{ Exception -> 0x0128 }
            goto L_0x008a
        L_0x0073:
            p000.hg5.m45199b(r2)
            net.safemoon.androidwallet.repository.ReflectionDataSource r2 = r0.f42597b     // Catch:{ Exception -> 0x0128 }
            r3.L$0 = r0     // Catch:{ Exception -> 0x0128 }
            r5 = r17
            r3.L$1 = r5     // Catch:{ Exception -> 0x0128 }
            r3.L$2 = r1     // Catch:{ Exception -> 0x0128 }
            r3.label = r10     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r2 = r2.mo60742c(r1, r3)     // Catch:{ Exception -> 0x0128 }
            if (r2 != r4) goto L_0x0089
            return r4
        L_0x0089:
            r10 = r0
        L_0x008a:
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r2 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r2     // Catch:{ Exception -> 0x0128 }
            r12 = 0
            if (r2 == 0) goto L_0x009b
            java.lang.Long r14 = r2.getCmcId()     // Catch:{ Exception -> 0x0128 }
            if (r14 == 0) goto L_0x009b
            long r14 = r14.longValue()     // Catch:{ Exception -> 0x0128 }
            goto L_0x009c
        L_0x009b:
            r14 = r12
        L_0x009c:
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c2
            if (r2 == 0) goto L_0x00b2
            java.lang.Long r2 = r2.getCmcId()     // Catch:{ Exception -> 0x0128 }
            if (r2 == 0) goto L_0x00b2
            long r5 = r2.longValue()     // Catch:{ Exception -> 0x0128 }
            int r2 = (int) r5     // Catch:{ Exception -> 0x0128 }
            java.lang.Integer r2 = p000.a40.m31673d(r2)     // Catch:{ Exception -> 0x0128 }
            goto L_0x00b3
        L_0x00b2:
            r2 = r11
        L_0x00b3:
            r3.L$0 = r11     // Catch:{ Exception -> 0x0128 }
            r3.L$1 = r11     // Catch:{ Exception -> 0x0128 }
            r3.L$2 = r11     // Catch:{ Exception -> 0x0128 }
            r3.label = r9     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r1 = r10.mo60947l(r2, r1, r3)     // Catch:{ Exception -> 0x0128 }
            if (r1 != r4) goto L_0x0128
            return r4
        L_0x00c2:
            p70 r2 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x0128 }
            if (r2 == 0) goto L_0x00ec
            k90 r2 = r2.mo65252d(r5)     // Catch:{ Exception -> 0x0128 }
            if (r2 == 0) goto L_0x00ec
            r3.L$0 = r10     // Catch:{ Exception -> 0x0128 }
            r3.L$1 = r1     // Catch:{ Exception -> 0x0128 }
            r3.L$2 = r11     // Catch:{ Exception -> 0x0128 }
            r3.label = r8     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r2, r3)     // Catch:{ Exception -> 0x0128 }
            if (r2 != r4) goto L_0x00dd
            return r4
        L_0x00dd:
            r5 = r10
        L_0x00de:
            bg5 r2 = (p000.bg5) r2     // Catch:{ Exception -> 0x0128 }
            if (r2 == 0) goto L_0x00eb
            java.lang.Object r2 = r2.mo50578a()     // Catch:{ Exception -> 0x0128 }
            net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo r2 = (net.safemoon.androidwallet.model.cmcTokenInfo.CmcTokenInfo) r2     // Catch:{ Exception -> 0x0128 }
            r10 = r5
            r5 = r1
            goto L_0x00ee
        L_0x00eb:
            r10 = r5
        L_0x00ec:
            r5 = r1
            r2 = r11
        L_0x00ee:
            if (r2 == 0) goto L_0x0128
            java.util.List r1 = r2.getTokenDetails()     // Catch:{ Exception -> 0x0128 }
            if (r1 == 0) goto L_0x0128
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0128 }
            net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail r1 = (net.safemoon.androidwallet.model.cmcTokenInfo.TokenDetail) r1     // Catch:{ Exception -> 0x0128 }
            if (r1 == 0) goto L_0x0128
            net.safemoon.androidwallet.repository.ReflectionDataSource r2 = r10.f42597b     // Catch:{ Exception -> 0x0128 }
            java.lang.Integer r8 = r1.f42452id     // Catch:{ Exception -> 0x0128 }
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x0128 }
            r3.L$0 = r10     // Catch:{ Exception -> 0x0128 }
            r3.L$1 = r5     // Catch:{ Exception -> 0x0128 }
            r3.L$2 = r1     // Catch:{ Exception -> 0x0128 }
            r3.label = r7     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r2 = r2.mo60754o(r8, r5, r3)     // Catch:{ Exception -> 0x0128 }
            if (r2 != r4) goto L_0x0116
            return r4
        L_0x0116:
            r7 = r10
        L_0x0117:
            java.lang.Integer r1 = r1.f42452id     // Catch:{ Exception -> 0x0128 }
            r3.L$0 = r11     // Catch:{ Exception -> 0x0128 }
            r3.L$1 = r11     // Catch:{ Exception -> 0x0128 }
            r3.L$2 = r11     // Catch:{ Exception -> 0x0128 }
            r3.label = r6     // Catch:{ Exception -> 0x0128 }
            java.lang.Object r1 = r7.mo60947l(r1, r5, r3)     // Catch:{ Exception -> 0x0128 }
            if (r1 != r4) goto L_0x0128
            return r4
        L_0x0128:
            r37 r1 = p000.r37.f33317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60943h(java.lang.String, java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013a A[SYNTHETIC, Splitter:B:60:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0177 A[Catch:{ Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0192 A[Catch:{ Exception -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60944i(java.util.List<net.safemoon.androidwallet.model.reflections.RoomReflectionsToken> r26, p000.ns0<? super p000.r37> r27) {
        /*
            r25 = this;
            r0 = r27
            boolean r1 = r0 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$1 r1 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r25
            goto L_0x001e
        L_0x0017:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$1 r1 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$saveCMCDetail$1
            r2 = r25
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r1.label
            r5 = 0
            r6 = 0
            r7 = 3
            r8 = 2
            r9 = 0
            r11 = 1
            if (r4 == 0) goto L_0x0071
            if (r4 == r11) goto L_0x005f
            if (r4 == r8) goto L_0x0052
            if (r4 != r7) goto L_0x004a
            java.lang.Object r4 = r1.L$3
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r1.L$2
            com.google.gson.JsonObject r5 = (com.google.gson.JsonObject) r5
            java.lang.Object r6 = r1.L$1
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r8 = r1.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r8 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r8
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x01d8 }
            goto L_0x018c
        L_0x004a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0052:
            java.lang.Object r4 = r1.L$1
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r6 = r1.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r6 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r6
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x01d8 }
            goto L_0x016d
        L_0x005f:
            java.lang.Object r4 = r1.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r12 = r1.L$1
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r1.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r13 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r13
            p000.hg5.m45199b(r0)
            r0 = r12
            r12 = r13
            goto L_0x00ab
        L_0x0071:
            p000.hg5.m45199b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r26.iterator()
        L_0x007d:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00a3
            java.lang.Object r12 = r4.next()
            r13 = r12
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r13 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r13
            java.lang.Long r13 = r13.getCmcId()
            if (r13 == 0) goto L_0x0095
            long r13 = r13.longValue()
            goto L_0x0096
        L_0x0095:
            r13 = r9
        L_0x0096:
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x009c
            r13 = r11
            goto L_0x009d
        L_0x009c:
            r13 = r6
        L_0x009d:
            if (r13 == 0) goto L_0x007d
            r0.add(r12)
            goto L_0x007d
        L_0x00a3:
            java.util.Iterator r0 = r0.iterator()
            r4 = r0
            r12 = r2
            r0 = r26
        L_0x00ab:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x00ce
            java.lang.Object r13 = r4.next()
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r13 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r13
            java.lang.String r14 = r13.getContractAddress()
            java.lang.String r13 = r13.getSymbolWithType()
            r1.L$0 = r12
            r1.L$1 = r0
            r1.L$2 = r4
            r1.label = r11
            java.lang.Object r13 = r12.mo60943h(r14, r13, r1)
            if (r13 != r3) goto L_0x00ab
            return r3
        L_0x00ce:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00d7:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x00fd
            java.lang.Object r13 = r0.next()
            r14 = r13
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r14 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r14
            java.lang.Long r14 = r14.getCmcId()
            if (r14 == 0) goto L_0x00ef
            long r14 = r14.longValue()
            goto L_0x00f0
        L_0x00ef:
            r14 = r9
        L_0x00f0:
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x00f6
            r14 = r11
            goto L_0x00f7
        L_0x00f6:
            r14 = r6
        L_0x00f7:
            if (r14 == 0) goto L_0x00d7
            r4.add(r13)
            goto L_0x00d7
        L_0x00fd:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0134
            java.lang.Object r6 = r4.next()
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r6 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r6
            java.lang.Long r9 = r6.getCmcId()
            if (r9 == 0) goto L_0x010b
            long r9 = r9.longValue()
            java.lang.Long r11 = p000.a40.m31674e(r9)
            r15.add(r11)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r6 = r6.getSymbolWithType()
            r0.put(r9, r6)
            goto L_0x010b
        L_0x0134:
            int r4 = r15.size()
            if (r4 <= 0) goto L_0x01d8
            p70 r4 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x01d8 }
            java.lang.String r16 = ","
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 62
            r23 = 0
            java.lang.String r6 = kotlin.collections.CollectionsKt___CollectionsKt.m47338i0(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x01d8 }
            java.lang.String r9 = "USD"
            k90 r4 = r4.mo65249a(r6, r9)     // Catch:{ Exception -> 0x01d8 }
            r1.L$0 = r12     // Catch:{ Exception -> 0x01d8 }
            r1.L$1 = r0     // Catch:{ Exception -> 0x01d8 }
            r1.L$2 = r5     // Catch:{ Exception -> 0x01d8 }
            r1.label = r8     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r4 = retrofit2.KotlinExtensions.m71521c(r4, r1)     // Catch:{ Exception -> 0x01d8 }
            if (r4 != r3) goto L_0x0167
            return r3
        L_0x0167:
            r6 = r12
            r24 = r4
            r4 = r0
            r0 = r24
        L_0x016d:
            bg5 r0 = (p000.bg5) r0     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r0.mo50578a()     // Catch:{ Exception -> 0x01d8 }
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x017d
            java.lang.String r5 = "data"
            com.google.gson.JsonObject r5 = r0.getAsJsonObject(r5)     // Catch:{ Exception -> 0x01d8 }
        L_0x017d:
            if (r5 == 0) goto L_0x01d8
            java.util.Set r0 = r5.keySet()     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x01d8
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01d8 }
            r8 = r6
            r6 = r4
            r4 = r0
        L_0x018c:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x01d8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x018c
            com.google.gson.Gson r9 = new com.google.gson.Gson     // Catch:{ Exception -> 0x01d8 }
            r9.<init>()     // Catch:{ Exception -> 0x01d8 }
            com.google.gson.JsonObject r10 = r5.getAsJsonObject(r0)     // Catch:{ Exception -> 0x01d8 }
            java.lang.Class<net.safemoon.androidwallet.model.Coin> r11 = net.safemoon.androidwallet.model.Coin.class
            java.lang.Object r9 = r9.fromJson((com.google.gson.JsonElement) r10, r11)     // Catch:{ Exception -> 0x01d8 }
            net.safemoon.androidwallet.model.Coin r9 = (net.safemoon.androidwallet.model.Coin) r9     // Catch:{ Exception -> 0x01d8 }
            net.safemoon.androidwallet.model.Quote r9 = r9.getQuote()     // Catch:{ Exception -> 0x01d8 }
            net.safemoon.androidwallet.model.USDT r9 = r9.getUSD()     // Catch:{ Exception -> 0x01d8 }
            java.lang.Double r9 = r9.getPrice()     // Catch:{ Exception -> 0x01d8 }
            if (r9 == 0) goto L_0x018c
            double r9 = r9.doubleValue()     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r6.get(r0)     // Catch:{ Exception -> 0x01d8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01d8 }
            if (r0 == 0) goto L_0x018c
            net.safemoon.androidwallet.repository.ReflectionDataSource r11 = r8.f42597b     // Catch:{ Exception -> 0x01d8 }
            r1.L$0 = r8     // Catch:{ Exception -> 0x01d8 }
            r1.L$1 = r6     // Catch:{ Exception -> 0x01d8 }
            r1.L$2 = r5     // Catch:{ Exception -> 0x01d8 }
            r1.L$3 = r4     // Catch:{ Exception -> 0x01d8 }
            r1.label = r7     // Catch:{ Exception -> 0x01d8 }
            java.lang.Object r0 = r11.mo60755p(r9, r0, r1)     // Catch:{ Exception -> 0x01d8 }
            if (r0 != r3) goto L_0x018c
            return r3
        L_0x01d8:
            r37 r0 = p000.r37.f33317a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60944i(java.util.List, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60945j(java.util.List<net.safemoon.androidwallet.model.reflections.RoomReflectionsToken> r14, p000.ns0<? super p000.r37> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$saveLatestBalance$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveLatestBalance$1 r0 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$saveLatestBalance$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveLatestBalance$1 r0 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$saveLatestBalance$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r14 = r0.L$1
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r2 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r2
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0058
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003c:
            java.lang.Object r14 = r0.L$2
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r14 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r14
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r5 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r5
            p000.hg5.m45199b(r15)     // Catch:{ Exception -> 0x004d }
            r12 = r5
            goto L_0x0086
        L_0x004d:
            r14 = r2
            r2 = r5
            goto L_0x0058
        L_0x0050:
            p000.hg5.m45199b(r15)
            java.util.Iterator r14 = r14.iterator()
            r2 = r13
        L_0x0058:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00b4
            java.lang.Object r15 = r14.next()
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken r15 = (net.safemoon.androidwallet.model.reflections.RoomReflectionsToken) r15
            net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3 r5 = new net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3     // Catch:{ Exception -> 0x0058 }
            android.app.Application r6 = r2.mo60939d()     // Catch:{ Exception -> 0x0058 }
            net.safemoon.androidwallet.model.reflections.RoomReflectionsToken$Companion r7 = net.safemoon.androidwallet.model.reflections.RoomReflectionsToken.Companion     // Catch:{ Exception -> 0x0058 }
            net.safemoon.androidwallet.model.token.abstraction.IToken r7 = r7.toIToken(r15)     // Catch:{ Exception -> 0x0058 }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x0058 }
            r0.L$0 = r2     // Catch:{ Exception -> 0x0058 }
            r0.L$1 = r14     // Catch:{ Exception -> 0x0058 }
            r0.L$2 = r15     // Catch:{ Exception -> 0x0058 }
            r0.label = r4     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r5 = r5.mo61835b(r0)     // Catch:{ Exception -> 0x0058 }
            if (r5 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r12 = r2
            r2 = r14
            r14 = r15
            r15 = r5
        L_0x0086:
            java.math.BigInteger r15 = (java.math.BigInteger) r15     // Catch:{ Exception -> 0x00b1 }
            net.safemoon.androidwallet.repository.ReflectionDataSource r5 = r12.f42597b     // Catch:{ Exception -> 0x00b1 }
            p000.vx2.m53588d(r15)     // Catch:{ Exception -> 0x00b1 }
            long r6 = r15.longValue()     // Catch:{ Exception -> 0x00b1 }
            net.safemoon.androidwallet.utils.Common r15 = net.safemoon.androidwallet.utils.Common.f42577a     // Catch:{ Exception -> 0x00b1 }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x00b1 }
            r8.<init>()     // Catch:{ Exception -> 0x00b1 }
            long r8 = r15.mo60893C(r8)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r10 = r14.getSymbolWithType()     // Catch:{ Exception -> 0x00b1 }
            r0.L$0 = r12     // Catch:{ Exception -> 0x00b1 }
            r0.L$1 = r2     // Catch:{ Exception -> 0x00b1 }
            r14 = 0
            r0.L$2 = r14     // Catch:{ Exception -> 0x00b1 }
            r0.label = r3     // Catch:{ Exception -> 0x00b1 }
            r11 = r0
            java.lang.Object r14 = r5.mo60756q(r6, r8, r10, r11)     // Catch:{ Exception -> 0x00b1 }
            if (r14 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r14 = r2
            r2 = r12
            goto L_0x0058
        L_0x00b4:
            r37 r14 = p000.r37.f33317a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60945j(java.util.List, ns0):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e3 A[SYNTHETIC] */
    /* renamed from: k */
    public final java.lang.Object mo60946k(net.safemoon.androidwallet.model.token.abstraction.IToken r35, p000.ns0<? super java.lang.Long> r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r3 = r2 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$saveToken$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveToken$1 r3 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$saveToken$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$saveToken$1 r3 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$saveToken$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r14 = p000.wx2.m54101d()
            int r4 = r3.label
            java.lang.String r15 = "it.timeStamp"
            r16 = 0
            r13 = 5
            r11 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x00a7
            if (r4 == r7) goto L_0x009b
            if (r4 == r6) goto L_0x0083
            if (r4 == r5) goto L_0x0071
            if (r4 == r11) goto L_0x005c
            if (r4 != r13) goto L_0x0054
            int r1 = r3.I$0
            java.lang.Object r4 = r3.L$3
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r5 = r3.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r3.L$1
            net.safemoon.androidwallet.model.token.abstraction.IToken r6 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r6
            java.lang.Object r7 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r7 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r7
            p000.hg5.m45199b(r2)
            r8 = r13
            goto L_0x01de
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005c:
            java.lang.Object r1 = r3.L$3
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r4 = r3.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r3.L$1
            net.safemoon.androidwallet.model.token.abstraction.IToken r5 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r5
            java.lang.Object r6 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r6 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r6
            p000.hg5.m45199b(r2)
            goto L_0x017a
        L_0x0071:
            java.lang.Object r1 = r3.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r3.L$1
            net.safemoon.androidwallet.model.token.abstraction.IToken r4 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r4
            java.lang.Object r5 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r5 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r5
            p000.hg5.m45199b(r2)
            r0 = r11
            goto L_0x013a
        L_0x0083:
            java.lang.Object r1 = r3.L$3
            net.safemoon.androidwallet.model.transaction.history.Result r1 = (net.safemoon.androidwallet.model.transaction.history.Result) r1
            java.lang.Object r4 = r3.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r3.L$1
            net.safemoon.androidwallet.model.token.abstraction.IToken r6 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r6
            java.lang.Object r7 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r7 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r7
            p000.hg5.m45199b(r2)
            r12 = r6
            r9 = r7
            r6 = r2
            r2 = r4
            goto L_0x00f2
        L_0x009b:
            java.lang.Object r1 = r3.L$1
            net.safemoon.androidwallet.model.token.abstraction.IToken r1 = (net.safemoon.androidwallet.model.token.abstraction.IToken) r1
            java.lang.Object r4 = r3.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r4 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r4
            p000.hg5.m45199b(r2)
            goto L_0x00c9
        L_0x00a7:
            p000.hg5.m45199b(r2)
            if (r1 != 0) goto L_0x00ad
            return r8
        L_0x00ad:
            net.safemoon.androidwallet.common.TokenType$a r2 = net.safemoon.androidwallet.common.TokenType.Companion
            int r4 = r35.getChainId()
            net.safemoon.androidwallet.common.TokenType r2 = r2.mo57099b(r4)
            java.lang.String r4 = r35.getContractAddress()
            r3.L$0 = r0
            r3.L$1 = r1
            r3.label = r7
            java.lang.Object r2 = r0.mo60942g(r2, r4, r3)
            if (r2 != r14) goto L_0x00c8
            return r14
        L_0x00c8:
            r4 = r0
        L_0x00c9:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x01e4
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m47331b0(r2)
            net.safemoon.androidwallet.model.transaction.history.Result r7 = (net.safemoon.androidwallet.model.transaction.history.Result) r7
            if (r7 == 0) goto L_0x0152
            net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3 r9 = new net.safemoon.androidwallet.viewmodels.blockChainClass.MyWeb3
            android.app.Application r10 = r4.mo60939d()
            r9.<init>(r10, r1)
            r3.L$0 = r4
            r3.L$1 = r1
            r3.L$2 = r2
            r3.L$3 = r7
            r3.label = r6
            java.lang.Object r6 = r9.mo61835b(r3)
            if (r6 != r14) goto L_0x00ef
            return r14
        L_0x00ef:
            r12 = r1
            r9 = r4
            r1 = r7
        L_0x00f2:
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            if (r6 == 0) goto L_0x0144
            net.safemoon.androidwallet.repository.ReflectionDataSource r4 = r9.f42597b
            java.lang.String r7 = r1.value
            java.lang.String r10 = "it.value"
            p000.vx2.m53590f(r7, r10)
            java.lang.String r1 = r1.timeStamp
            p000.vx2.m53590f(r1, r15)
            long r18 = java.lang.Long.parseLong(r1)
            long r20 = r6.longValue()
            net.safemoon.androidwallet.utils.Common r1 = net.safemoon.androidwallet.utils.Common.f42577a
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            long r22 = r1.mo60893C(r6)
            r3.L$0 = r9
            r3.L$1 = r12
            r3.L$2 = r2
            r3.L$3 = r8
            r3.label = r5
            r5 = r12
            r6 = r7
            r7 = r18
            r1 = r9
            r9 = r20
            r0 = r11
            r18 = r12
            r11 = r22
            r13 = r3
            java.lang.Object r4 = r4.mo60753n(r5, r6, r7, r9, r11, r13)
            if (r4 != r14) goto L_0x0135
            return r14
        L_0x0135:
            r5 = r1
            r1 = r2
            r2 = r4
            r4 = r18
        L_0x013a:
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            r2 = r1
            r12 = r4
            r9 = r5
            goto L_0x014a
        L_0x0144:
            r1 = r9
            r0 = r11
            r18 = r12
            r6 = r16
        L_0x014a:
            java.lang.Long r8 = p000.a40.m31674e(r6)
            r4 = r2
            r6 = r9
            r5 = r12
            goto L_0x0156
        L_0x0152:
            r0 = r11
            r5 = r1
            r6 = r4
            r4 = r2
        L_0x0156:
            if (r8 == 0) goto L_0x01e4
            long r1 = r8.longValue()
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x01e4
            java.lang.String r1 = r5.getContractAddress()
            java.lang.String r2 = r5.getSymbolWithType()
            r3.L$0 = r6
            r3.L$1 = r5
            r3.L$2 = r4
            r3.L$3 = r8
            r3.label = r0
            java.lang.Object r0 = r6.mo60943h(r1, r2, r3)
            if (r0 != r14) goto L_0x0179
            return r14
        L_0x0179:
            r1 = r8
        L_0x017a:
            r0 = 0
            java.util.Iterator r2 = r4.iterator()
            r4 = r1
            r7 = r6
            r6 = r5
            r5 = r2
        L_0x0183:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r5.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x0194
            p000.ck0.m33072t()
        L_0x0194:
            net.safemoon.androidwallet.model.transaction.history.Result r1 = (net.safemoon.androidwallet.model.transaction.history.Result) r1
            if (r0 != 0) goto L_0x01e0
            net.safemoon.androidwallet.repository.ReflectionDataSource r0 = r7.f42597b
            java.lang.String r26 = r6.getSymbolWithType()
            java.lang.String r8 = r1.value
            java.lang.String r9 = r1.blockNumber
            java.lang.String r29 = r9.toString()
            java.lang.String r9 = r1.timeStamp
            p000.vx2.m53590f(r9, r15)
            long r30 = java.lang.Long.parseLong(r9)
            java.lang.String r1 = r1.value
            java.lang.String r28 = r1.toString()
            net.safemoon.androidwallet.model.reflections.RoomReflectionsData r1 = new net.safemoon.androidwallet.model.reflections.RoomReflectionsData
            r25 = 0
            java.lang.String r9 = "value"
            p000.vx2.m53590f(r8, r9)
            r32 = 1
            r33 = 0
            r24 = r1
            r27 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30, r32, r33)
            r3.L$0 = r7
            r3.L$1 = r6
            r3.L$2 = r5
            r3.L$3 = r4
            r3.I$0 = r2
            r8 = 5
            r3.label = r8
            java.lang.Object r0 = r0.mo60751l(r1, r3)
            if (r0 != r14) goto L_0x01dd
            return r14
        L_0x01dd:
            r1 = r2
        L_0x01de:
            r0 = r1
            goto L_0x0183
        L_0x01e0:
            r8 = 5
            r0 = r2
            goto L_0x0183
        L_0x01e3:
            r8 = r4
        L_0x01e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60946k(net.safemoon.androidwallet.model.token.abstraction.IToken, ns0):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A[Catch:{ Exception -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo60947l(java.lang.Integer r8, java.lang.String r9, p000.ns0<? super p000.r37> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.utils.ReflectionCustomContract$setCMCPrice$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.utils.ReflectionCustomContract$setCMCPrice$1 r0 = (net.safemoon.androidwallet.utils.ReflectionCustomContract$setCMCPrice$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.utils.ReflectionCustomContract$setCMCPrice$1 r0 = new net.safemoon.androidwallet.utils.ReflectionCustomContract$setCMCPrice$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r8 = r0.L$3
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$2
            com.google.gson.JsonObject r9 = (com.google.gson.JsonObject) r9
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r4 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r4
            p000.hg5.m45199b(r10)     // Catch:{ Exception -> 0x00db }
            goto L_0x0097
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            java.lang.Object r8 = r0.L$1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.L$0
            net.safemoon.androidwallet.utils.ReflectionCustomContract r8 = (net.safemoon.androidwallet.utils.ReflectionCustomContract) r8
            p000.hg5.m45199b(r10)     // Catch:{ Exception -> 0x00db }
            goto L_0x0072
        L_0x0051:
            p000.hg5.m45199b(r10)
            p70 r10 = p000.C9384u3.m72566g()     // Catch:{ Exception -> 0x00db }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00db }
            java.lang.String r2 = "USD"
            k90 r8 = r10.mo65249a(r8, r2)     // Catch:{ Exception -> 0x00db }
            if (r8 == 0) goto L_0x0085
            r0.L$0 = r7     // Catch:{ Exception -> 0x00db }
            r0.L$1 = r9     // Catch:{ Exception -> 0x00db }
            r0.label = r4     // Catch:{ Exception -> 0x00db }
            java.lang.Object r10 = retrofit2.KotlinExtensions.m71521c(r8, r0)     // Catch:{ Exception -> 0x00db }
            if (r10 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r8 = r7
        L_0x0072:
            bg5 r10 = (p000.bg5) r10     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x0086
            java.lang.Object r10 = r10.mo50578a()     // Catch:{ Exception -> 0x00db }
            com.google.gson.JsonObject r10 = (com.google.gson.JsonObject) r10     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x0086
            java.lang.String r2 = "data"
            com.google.gson.JsonObject r10 = r10.getAsJsonObject(r2)     // Catch:{ Exception -> 0x00db }
            goto L_0x0087
        L_0x0085:
            r8 = r7
        L_0x0086:
            r10 = 0
        L_0x0087:
            if (r10 == 0) goto L_0x00db
            java.util.Set r2 = r10.keySet()     // Catch:{ Exception -> 0x00db }
            if (r2 == 0) goto L_0x00db
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00db }
            r4 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x0097:
            boolean r10 = r8.hasNext()     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x00db
            java.lang.Object r10 = r8.next()     // Catch:{ Exception -> 0x00db }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x0097
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00db }
            r5.<init>()     // Catch:{ Exception -> 0x00db }
            com.google.gson.JsonObject r10 = r9.getAsJsonObject(r10)     // Catch:{ Exception -> 0x00db }
            java.lang.Class<net.safemoon.androidwallet.model.Coin> r6 = net.safemoon.androidwallet.model.Coin.class
            java.lang.Object r10 = r5.fromJson((com.google.gson.JsonElement) r10, r6)     // Catch:{ Exception -> 0x00db }
            net.safemoon.androidwallet.model.Coin r10 = (net.safemoon.androidwallet.model.Coin) r10     // Catch:{ Exception -> 0x00db }
            net.safemoon.androidwallet.model.Quote r10 = r10.getQuote()     // Catch:{ Exception -> 0x00db }
            net.safemoon.androidwallet.model.USDT r10 = r10.getUSD()     // Catch:{ Exception -> 0x00db }
            java.lang.Double r10 = r10.getPrice()     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x0097
            double r5 = r10.doubleValue()     // Catch:{ Exception -> 0x00db }
            net.safemoon.androidwallet.repository.ReflectionDataSource r10 = r4.f42597b     // Catch:{ Exception -> 0x00db }
            r0.L$0 = r4     // Catch:{ Exception -> 0x00db }
            r0.L$1 = r2     // Catch:{ Exception -> 0x00db }
            r0.L$2 = r9     // Catch:{ Exception -> 0x00db }
            r0.L$3 = r8     // Catch:{ Exception -> 0x00db }
            r0.label = r3     // Catch:{ Exception -> 0x00db }
            java.lang.Object r10 = r10.mo60755p(r5, r2, r0)     // Catch:{ Exception -> 0x00db }
            if (r10 != r1) goto L_0x0097
            return r1
        L_0x00db:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.utils.ReflectionCustomContract.mo60947l(java.lang.Integer, java.lang.String, ns0):java.lang.Object");
    }
}
