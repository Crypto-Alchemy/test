package net.safemoon.androidwallet.viewmodels.blockChainClass;

import android.app.Application;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import net.safemoon.androidwallet.model.token.abstraction.IToken;
import org.web3j.protocol.core.DefaultBlockParameterName;
import p000.rr1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010(\u001a\u00020$\u0012\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b<\u0010=J\u0013\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\nJ\f\u0010 \u001a\u00020\u000b*\u00020\u001aH\u0002J\u0014\u0010!\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\"\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010#\u001a\u00020\u0014*\u00020\u000bH\u0002R\u001a\u0010(\u001a\u00020$8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020)8\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R<\u00102\u001a*\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0/0.j\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0/`08\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R0\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120.j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012`08\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u00101R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010:\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/blockChainClass/BlockTime;", "Lnet/safemoon/androidwallet/viewmodels/blockChainClass/MyWeb3;", "Lr37;", "k", "(Lns0;)Ljava/lang/Object;", "Lrr1$a;", "j", "", "block", "i", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Ljava/util/Date;", "date", "", "after", "Ldg5;", "m", "(Ljava/util/Date;ZLns0;)Ljava/lang/Object;", "Lzk5;", "predictedBlock", "", "blockTime", "h", "(Ljava/util/Date;Lzk5;ZJLns0;)Ljava/lang/Object;", "p", "(Ljava/util/Date;Lzk5;ZLns0;)Ljava/lang/Object;", "Ljava/math/BigInteger;", "currentBlock", "skip", "n", "(Ljava/util/Date;Ljava/math/BigInteger;Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;", "l", "r", "q", "o", "s", "Landroid/app/Application;", "Landroid/app/Application;", "a", "()Landroid/app/Application;", "application", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "c", "()Lnet/safemoon/androidwallet/model/token/abstraction/IToken;", "iToken", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "checkedBlocks", "savedBlocks", "", "I", "requests", "", "Ljava/lang/Double;", "_blockTime", "Ljava/util/Date;", "_firstTimeStamp", "<init>", "(Landroid/app/Application;Lnet/safemoon/androidwallet/model/token/abstraction/IToken;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BlockTime.kt */
public final class BlockTime extends MyWeb3 {

    /* renamed from: i */
    public final Application f43018i;

    /* renamed from: j */
    public final IToken f43019j;

    /* renamed from: k */
    public final HashMap<Long, ArrayList<BigInteger>> f43020k = new HashMap<>();

    /* renamed from: l */
    public final HashMap<String, zk5> f43021l = new HashMap<>();

    /* renamed from: m */
    public int f43022m;

    /* renamed from: n */
    public Double f43023n;

    /* renamed from: o */
    public Date f43024o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockTime(Application application, IToken iToken) {
        super(application, iToken);
        vx2.m53591g(application, "application");
        vx2.m53591g(iToken, "iToken");
        this.f43018i = application;
        this.f43019j = iToken;
    }

    /* renamed from: a */
    public Application mo61800a() {
        return this.f43018i;
    }

    /* renamed from: c */
    public IToken mo61801c() {
        return this.f43019j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0141 A[Catch:{ Exception -> 0x019b }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0142 A[Catch:{ Exception -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0181 A[Catch:{ Exception -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0183 A[Catch:{ Exception -> 0x019b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0196 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197 A[PHI: r4 
      PHI: (r4v2 java.lang.Object) = (r4v9 java.lang.Object), (r4v1 java.lang.Object) binds: [B:63:0x0194, B:14:?] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61802h(java.util.Date r22, p000.zk5 r23, boolean r24, long r25, p000.ns0<? super java.lang.String> r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r27
            java.lang.String r5 = "this.subtract(other)"
            boolean r6 = r4 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$findBetter$1
            if (r6 == 0) goto L_0x001f
            r6 = r4
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$findBetter$1 r6 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$findBetter$1) r6
            int r7 = r6.label
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.label = r7
            goto L_0x0024
        L_0x001f:
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$findBetter$1 r6 = new net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$findBetter$1
            r6.<init>(r0, r4)
        L_0x0024:
            r13 = r6
            java.lang.Object r4 = r13.result
            java.lang.Object r6 = p000.wx2.m54101d()
            int r7 = r13.label
            r8 = 4
            r9 = 3
            r10 = 2
            r12 = 1
            if (r7 == 0) goto L_0x009c
            if (r7 == r12) goto L_0x0086
            if (r7 == r10) goto L_0x0066
            if (r7 == r9) goto L_0x004c
            if (r7 != r8) goto L_0x0044
            java.lang.Object r1 = r13.L$0
            zk5 r1 = (p000.zk5) r1
            p000.hg5.m45199b(r4)     // Catch:{ Exception -> 0x019b }
            goto L_0x0197
        L_0x0044:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004c:
            boolean r1 = r13.Z$0
            java.lang.Object r2 = r13.L$2
            zk5 r2 = (p000.zk5) r2
            java.lang.Object r3 = r13.L$1
            java.util.Date r3 = (java.util.Date) r3
            java.lang.Object r7 = r13.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r7 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r7
            p000.hg5.m45199b(r4)     // Catch:{ Exception -> 0x0063 }
            r8 = r3
            r10 = r7
            r3 = r1
            r1 = r2
            goto L_0x0143
        L_0x0063:
            r1 = r2
            goto L_0x019b
        L_0x0066:
            boolean r1 = r13.Z$0
            java.lang.Object r2 = r13.L$3
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r2
            java.lang.Object r3 = r13.L$2
            zk5 r3 = (p000.zk5) r3
            java.lang.Object r7 = r13.L$1
            java.util.Date r7 = (java.util.Date) r7
            java.lang.Object r10 = r13.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r10 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r10
            p000.hg5.m45199b(r4)     // Catch:{ Exception -> 0x0083 }
            r14 = r7
            r20 = r3
            r3 = r1
        L_0x007f:
            r1 = r20
            goto L_0x0122
        L_0x0083:
            r1 = r3
            goto L_0x019b
        L_0x0086:
            long r1 = r13.J$0
            boolean r3 = r13.Z$0
            java.lang.Object r7 = r13.L$2
            zk5 r7 = (p000.zk5) r7
            java.lang.Object r14 = r13.L$1
            java.util.Date r14 = (java.util.Date) r14
            java.lang.Object r15 = r13.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r15 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r15
            p000.hg5.m45199b(r4)
            r8 = r1
            r2 = r7
            goto L_0x00b7
        L_0x009c:
            p000.hg5.m45199b(r4)
            r13.L$0 = r0
            r13.L$1 = r1
            r13.L$2 = r2
            r13.Z$0 = r3
            r14 = r25
            r13.J$0 = r14
            r13.label = r12
            java.lang.Object r4 = r0.mo61810p(r1, r2, r3, r13)
            if (r4 != r6) goto L_0x00b4
            return r6
        L_0x00b4:
            r8 = r14
            r15 = r0
            r14 = r1
        L_0x00b7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00c4
            java.lang.String r1 = r2.mo67325a()
            return r1
        L_0x00c4:
            long r16 = r14.getTime()
            java.math.BigInteger r4 = r2.mo67326b()
            java.util.Date r4 = r15.mo61812r(r4)
            long r18 = r4.getTime()
            long r16 = r16 - r18
            r4 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r4
            long r11 = r16 / r11
            r22 = r2
            double r1 = (double) r11
            double r8 = (double) r8
            double r1 = r1 / r8
            double r1 = java.lang.Math.ceil(r1)
            int r1 = p000.ap3.m31898a(r1)
            if (r1 != 0) goto L_0x00f3
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f2
            r1 = -1
            goto L_0x00f3
        L_0x00f2:
            r1 = 1
        L_0x00f3:
            java.math.BigInteger r2 = new java.math.BigInteger     // Catch:{ Exception -> 0x0198 }
            java.lang.String r4 = r22.mo67325a()     // Catch:{ Exception -> 0x0198 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0198 }
            long r8 = (long) r1     // Catch:{ Exception -> 0x0198 }
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r8)     // Catch:{ Exception -> 0x0198 }
            java.lang.String r4 = "valueOf(this.toLong())"
            p000.vx2.m53590f(r1, r4)     // Catch:{ Exception -> 0x0198 }
            r13.L$0 = r15     // Catch:{ Exception -> 0x0198 }
            r13.L$1 = r14     // Catch:{ Exception -> 0x0198 }
            r4 = r22
            r13.L$2 = r4     // Catch:{ Exception -> 0x019a }
            r13.L$3 = r15     // Catch:{ Exception -> 0x019a }
            r13.Z$0 = r3     // Catch:{ Exception -> 0x019a }
            r13.label = r10     // Catch:{ Exception -> 0x019a }
            java.lang.Object r1 = r15.mo61808n(r14, r2, r1, r13)     // Catch:{ Exception -> 0x019a }
            if (r1 != r6) goto L_0x011b
            return r6
        L_0x011b:
            r2 = r15
            r10 = r2
            r20 = r4
            r4 = r1
            goto L_0x007f
        L_0x0122:
            java.math.BigInteger r4 = (java.math.BigInteger) r4     // Catch:{ Exception -> 0x019b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x019b }
            java.lang.String r8 = "getNextBlock(date, predi…oBigInteger()).toString()"
            p000.vx2.m53590f(r4, r8)     // Catch:{ Exception -> 0x019b }
            r13.L$0 = r10     // Catch:{ Exception -> 0x019b }
            r13.L$1 = r14     // Catch:{ Exception -> 0x019b }
            r13.L$2 = r1     // Catch:{ Exception -> 0x019b }
            r7 = 0
            r13.L$3 = r7     // Catch:{ Exception -> 0x019b }
            r13.Z$0 = r3     // Catch:{ Exception -> 0x019b }
            r8 = 3
            r13.label = r8     // Catch:{ Exception -> 0x019b }
            java.lang.Object r4 = r2.mo61806l(r4, r13)     // Catch:{ Exception -> 0x019b }
            if (r4 != r6) goto L_0x0142
            return r6
        L_0x0142:
            r8 = r14
        L_0x0143:
            r9 = r4
            zk5 r9 = (p000.zk5) r9     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r2 = r1.mo67326b()     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r4 = r9.mo67326b()     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r2 = r2.subtract(r4)     // Catch:{ Exception -> 0x019b }
            p000.vx2.m53590f(r2, r5)     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch:{ Exception -> 0x019b }
            java.lang.String r11 = r1.mo67325a()     // Catch:{ Exception -> 0x019b }
            r4.<init>(r11)     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r11 = new java.math.BigInteger     // Catch:{ Exception -> 0x019b }
            java.lang.String r12 = r9.mo67325a()     // Catch:{ Exception -> 0x019b }
            r11.<init>(r12)     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r4 = r4.subtract(r11)     // Catch:{ Exception -> 0x019b }
            p000.vx2.m53590f(r4, r5)     // Catch:{ Exception -> 0x019b }
            java.math.BigInteger r2 = r2.divide(r4)     // Catch:{ Exception -> 0x019b }
            java.lang.String r4 = "this.divide(other)"
            p000.vx2.m53590f(r2, r4)     // Catch:{ Exception -> 0x019b }
            long r4 = r2.longValue()     // Catch:{ Exception -> 0x019b }
            long r11 = java.lang.Math.abs(r4)     // Catch:{ Exception -> 0x019b }
            if (r3 == 0) goto L_0x0183
            r2 = 1
            goto L_0x0184
        L_0x0183:
            r2 = 0
        L_0x0184:
            r13.L$0 = r1     // Catch:{ Exception -> 0x019b }
            r3 = 0
            r13.L$1 = r3     // Catch:{ Exception -> 0x019b }
            r13.L$2 = r3     // Catch:{ Exception -> 0x019b }
            r3 = 4
            r13.label = r3     // Catch:{ Exception -> 0x019b }
            r7 = r10
            r10 = r2
            java.lang.Object r4 = r7.mo61802h(r8, r9, r10, r11, r13)     // Catch:{ Exception -> 0x019b }
            if (r4 != r6) goto L_0x0197
            return r6
        L_0x0197:
            return r4
        L_0x0198:
            r4 = r22
        L_0x019a:
            r1 = r4
        L_0x019b:
            java.lang.String r1 = r1.mo67325a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime.mo61802h(java.util.Date, zk5, boolean, long, ns0):java.lang.Object");
    }

    /* renamed from: i */
    public final Object mo61803i(String str, ns0<? super rr1.C9279a> ns0) {
        x61 x61;
        try {
            if (wb6.m73528j(str) == null) {
                x61 = w61.m73486a(str);
            } else {
                x61 = w61.m73487b(new BigInteger(str));
            }
            rr1 send = mo61839g().ethGetBlockByNumber(x61, false).send();
            if (send.getError() == null) {
                return send.getBlock();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final Object mo61804j(ns0<? super rr1.C9279a> ns0) {
        try {
            rr1 send = mo61839g().ethGetBlockByNumber(DefaultBlockParameterName.LATEST, false).send();
            if (send.getError() == null) {
                return send.getBlock();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61805k(p000.ns0<? super p000.r37> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockTime$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockTime$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockTime$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockTime$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockTime$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r1 = r0.L$1
            zk5 r1 = (p000.zk5) r1
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r0
            p000.hg5.m45199b(r9)
            goto L_0x0071
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r2
            p000.hg5.m45199b(r9)
            goto L_0x0059
        L_0x0044:
            p000.hg5.m45199b(r9)
            org.web3j.protocol.core.DefaultBlockParameterName r9 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST
            java.lang.String r9 = r9.name()
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r8.mo61806l(r9, r0)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r8
        L_0x0059:
            zk5 r9 = (p000.zk5) r9
            org.web3j.protocol.core.DefaultBlockParameterName r4 = org.web3j.protocol.core.DefaultBlockParameterName.EARLIEST
            java.lang.String r4 = r4.name()
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r0 = r2.mo61806l(r4, r0)
            if (r0 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r1 = r9
            r9 = r0
            r0 = r2
        L_0x0071:
            zk5 r9 = (p000.zk5) r9
            java.math.BigInteger r2 = r1.mo67326b()
            double r2 = r2.doubleValue()
            java.math.BigInteger r4 = r9.mo67326b()
            double r4 = r4.doubleValue()
            double r2 = r2 - r4
            java.lang.String r1 = r1.mo67325a()
            int r1 = java.lang.Integer.parseInt(r1)
            double r4 = (double) r1
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            double r2 = r2 / r4
            java.lang.Double r1 = p000.a40.m31671b(r2)
            r0.f43023n = r1
            java.math.BigInteger r9 = r9.mo67326b()
            java.util.Date r9 = r0.mo61812r(r9)
            r0.f43024o = r9
            r37 r9 = p000.r37.f33317a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime.mo61805k(ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61806l(java.lang.String r9, p000.ns0<? super p000.zk5> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockWrapper$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockWrapper$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockWrapper$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockWrapper$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getBlockWrapper$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            java.lang.Object r9 = r0.L$3
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            java.lang.Object r1 = r0.L$2
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r0
            p000.hg5.m45199b(r10)
            goto L_0x00a7
        L_0x003d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0045:
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r2
            p000.hg5.m45199b(r10)
            goto L_0x0074
        L_0x0051:
            p000.hg5.m45199b(r10)
            java.util.HashMap<java.lang.String, zk5> r10 = r8.f43021l
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L_0x0066
            java.util.HashMap<java.lang.String, zk5> r10 = r8.f43021l
            java.lang.Object r9 = r10.get(r9)
            p000.vx2.m53588d(r9)
            return r9
        L_0x0066:
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r8.mo61803i(r9, r0)
            if (r10 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r8
        L_0x0074:
            p000.vx2.m53588d(r10)
            rr1$a r10 = (p000.rr1.C9279a) r10
            java.util.HashMap<java.lang.String, zk5> r5 = r2.f43021l
            java.math.BigInteger r10 = r10.getTimestamp()
            java.lang.String r6 = "foundBlock.timestamp"
            p000.vx2.m53590f(r10, r6)
            org.web3j.protocol.core.DefaultBlockParameterName r6 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST
            java.lang.String r6 = r6.name()
            boolean r6 = p000.vx2.m53586b(r9, r6)
            if (r6 == 0) goto L_0x00ba
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r5
            r0.L$3 = r10
            r0.label = r3
            java.lang.Object r0 = r2.mo61804j(r0)
            if (r0 != r1) goto L_0x00a1
            return r1
        L_0x00a1:
            r1 = r5
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r0
            r0 = r7
        L_0x00a7:
            rr1$a r10 = (p000.rr1.C9279a) r10
            if (r10 == 0) goto L_0x00b0
            java.math.BigInteger r10 = r10.getNumber()
            goto L_0x00b1
        L_0x00b0:
            r10 = 0
        L_0x00b1:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r5 = r1
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00bc
        L_0x00ba:
            r0 = r2
            r2 = r9
        L_0x00bc:
            zk5 r1 = new zk5
            r1.<init>(r10, r9)
            r5.put(r2, r1)
            int r9 = r0.f43022m
            int r9 = r9 + r4
            r0.f43022m = r9
            java.util.HashMap<java.lang.String, zk5> r9 = r0.f43021l
            java.lang.Object r9 = r9.get(r2)
            p000.vx2.m53588d(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime.mo61806l(java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e2 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017b A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017d A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0199 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x011a=Splitter:B:75:0x011a, B:90:0x019c=Splitter:B:90:0x019c} */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61807m(java.util.Date r20, boolean r21, p000.ns0<? super p000.dg5> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r22
            boolean r2 = r1 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getDate$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getDate$1 r2 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getDate$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getDate$1 r2 = new net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$getDate$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r10 = p000.wx2.m54101d()
            int r3 = r2.label
            java.lang.String r11 = "getBlockNumber()!!.number"
            r12 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r8 = 1
            if (r3 == 0) goto L_0x00a5
            if (r3 == r8) goto L_0x0092
            if (r3 == r6) goto L_0x0078
            if (r3 == r5) goto L_0x005f
            if (r3 == r4) goto L_0x0048
            if (r3 != r12) goto L_0x0040
            java.lang.Object r2 = r2.L$0
            java.util.Date r2 = (java.util.Date) r2
            p000.hg5.m45199b(r1)
            goto L_0x01c1
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            java.lang.Object r3 = r2.L$2
            java.util.Date r3 = (java.util.Date) r3
            java.lang.Object r4 = r2.L$1
            java.util.Date r4 = (java.util.Date) r4
            java.lang.Object r5 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r5 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r5
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x008f }
            r18 = r3
            r3 = r1
            r1 = r4
            r4 = r18
            goto L_0x019c
        L_0x005f:
            boolean r3 = r2.Z$0
            java.lang.Object r5 = r2.L$1
            java.util.Date r5 = (java.util.Date) r5
            java.lang.Object r6 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r6 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r6
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0074 }
            r13 = r6
            r18 = r5
            r5 = r1
            r1 = r18
            goto L_0x0177
        L_0x0074:
            r1 = r5
            r5 = r6
            goto L_0x01ac
        L_0x0078:
            java.lang.Object r3 = r2.L$2
            java.util.Date r3 = (java.util.Date) r3
            java.lang.Object r4 = r2.L$1
            java.util.Date r4 = (java.util.Date) r4
            java.lang.Object r5 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r5 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r5
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x008f }
            r18 = r3
            r3 = r1
            r1 = r4
            r4 = r18
            goto L_0x011a
        L_0x008f:
            r1 = r4
            goto L_0x01ac
        L_0x0092:
            boolean r3 = r2.Z$0
            java.lang.Object r9 = r2.L$1
            java.util.Date r9 = (java.util.Date) r9
            java.lang.Object r13 = r2.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r13 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r13
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x00a1 }
            r1 = r9
            goto L_0x00ca
        L_0x00a1:
            r1 = r9
        L_0x00a2:
            r5 = r13
            goto L_0x01ac
        L_0x00a5:
            p000.hg5.m45199b(r1)
            java.lang.Double r1 = r0.f43023n     // Catch:{ Exception -> 0x01a9 }
            if (r1 == 0) goto L_0x00b7
            java.util.Date r1 = r0.f43024o     // Catch:{ Exception -> 0x01a9 }
            if (r1 != 0) goto L_0x00b1
            goto L_0x00b7
        L_0x00b1:
            r1 = r20
            r3 = r21
        L_0x00b5:
            r13 = r0
            goto L_0x00ca
        L_0x00b7:
            r2.L$0 = r0     // Catch:{ Exception -> 0x01a9 }
            r1 = r20
            r2.L$1 = r1     // Catch:{ Exception -> 0x01ab }
            r3 = r21
            r2.Z$0 = r3     // Catch:{ Exception -> 0x01ab }
            r2.label = r8     // Catch:{ Exception -> 0x01ab }
            java.lang.Object r9 = r0.mo61805k(r2)     // Catch:{ Exception -> 0x01ab }
            if (r9 != r10) goto L_0x00b5
            return r10
        L_0x00ca:
            java.util.Date r9 = r13.f43024o     // Catch:{ Exception -> 0x00a2 }
            p000.vx2.m53588d(r9)     // Catch:{ Exception -> 0x00a2 }
            boolean r9 = r13.mo61809o(r1, r9)     // Catch:{ Exception -> 0x00a2 }
            if (r9 == 0) goto L_0x00e2
            dg5 r3 = new dg5     // Catch:{ Exception -> 0x00a2 }
            java.math.BigInteger r4 = java.math.BigInteger.ONE     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r5 = "ONE"
            p000.vx2.m53590f(r4, r5)     // Catch:{ Exception -> 0x00a2 }
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x00a2 }
            return r3
        L_0x00e2:
            java.util.HashMap<java.lang.String, zk5> r9 = r13.f43021l     // Catch:{ Exception -> 0x00a2 }
            org.web3j.protocol.core.DefaultBlockParameterName r14 = org.web3j.protocol.core.DefaultBlockParameterName.LATEST     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r14 = r14.name()     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r9 = r9.get(r14)     // Catch:{ Exception -> 0x00a2 }
            zk5 r9 = (p000.zk5) r9     // Catch:{ Exception -> 0x00a2 }
            if (r9 == 0) goto L_0x0106
            java.math.BigInteger r9 = r9.mo67326b()     // Catch:{ Exception -> 0x00a2 }
            if (r9 == 0) goto L_0x0106
            java.util.Date r9 = r13.mo61812r(r9)     // Catch:{ Exception -> 0x00a2 }
            if (r9 == 0) goto L_0x0106
            boolean r9 = r13.mo61811q(r1, r9)     // Catch:{ Exception -> 0x00a2 }
            if (r9 != r8) goto L_0x0106
            r9 = r8
            goto L_0x0107
        L_0x0106:
            r9 = 0
        L_0x0107:
            if (r9 == 0) goto L_0x012c
            r2.L$0 = r13     // Catch:{ Exception -> 0x00a2 }
            r2.L$1 = r1     // Catch:{ Exception -> 0x00a2 }
            r2.L$2 = r1     // Catch:{ Exception -> 0x00a2 }
            r2.label = r6     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r13.mo61804j(r2)     // Catch:{ Exception -> 0x00a2 }
            if (r3 != r10) goto L_0x0118
            return r10
        L_0x0118:
            r4 = r1
            r5 = r13
        L_0x011a:
            p000.vx2.m53588d(r3)     // Catch:{ Exception -> 0x01ac }
            rr1$a r3 = (p000.rr1.C9279a) r3     // Catch:{ Exception -> 0x01ac }
            java.math.BigInteger r3 = r3.getNumber()     // Catch:{ Exception -> 0x01ac }
            p000.vx2.m53590f(r3, r11)     // Catch:{ Exception -> 0x01ac }
            dg5 r6 = new dg5     // Catch:{ Exception -> 0x01ac }
            r6.<init>(r4, r3)     // Catch:{ Exception -> 0x01ac }
            return r6
        L_0x012c:
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.math.BigInteger>> r6 = r13.f43020k     // Catch:{ Exception -> 0x00a2 }
            long r14 = r13.mo61813s(r1)     // Catch:{ Exception -> 0x00a2 }
            java.lang.Long r9 = p000.a40.m31674e(r14)     // Catch:{ Exception -> 0x00a2 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a2 }
            r14.<init>()     // Catch:{ Exception -> 0x00a2 }
            r6.put(r9, r14)     // Catch:{ Exception -> 0x00a2 }
            long r14 = r1.getTime()     // Catch:{ Exception -> 0x00a2 }
            java.util.Date r6 = r13.f43024o     // Catch:{ Exception -> 0x00a2 }
            p000.vx2.m53588d(r6)     // Catch:{ Exception -> 0x00a2 }
            long r16 = r6.getTime()     // Catch:{ Exception -> 0x00a2 }
            long r14 = r14 - r16
            r6 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r6     // Catch:{ Exception -> 0x00a2 }
            long r14 = r14 / r7
            double r6 = (double) r14     // Catch:{ Exception -> 0x00a2 }
            java.lang.Double r8 = r13.f43023n     // Catch:{ Exception -> 0x00a2 }
            p000.vx2.m53588d(r8)     // Catch:{ Exception -> 0x00a2 }
            double r14 = r8.doubleValue()     // Catch:{ Exception -> 0x00a2 }
            double r6 = r6 / r14
            double r6 = java.lang.Math.ceil(r6)     // Catch:{ Exception -> 0x00a2 }
            int r6 = p000.ap3.m31898a(r6)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00a2 }
            r2.L$0 = r13     // Catch:{ Exception -> 0x00a2 }
            r2.L$1 = r1     // Catch:{ Exception -> 0x00a2 }
            r2.Z$0 = r3     // Catch:{ Exception -> 0x00a2 }
            r2.label = r5     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r5 = r13.mo61806l(r6, r2)     // Catch:{ Exception -> 0x00a2 }
            if (r5 != r10) goto L_0x0177
            return r10
        L_0x0177:
            zk5 r5 = (p000.zk5) r5     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x017d
            r6 = 1
            goto L_0x017e
        L_0x017d:
            r6 = 0
        L_0x017e:
            java.lang.Double r3 = r13.f43023n     // Catch:{ Exception -> 0x00a2 }
            p000.vx2.m53588d(r3)     // Catch:{ Exception -> 0x00a2 }
            double r7 = r3.doubleValue()     // Catch:{ Exception -> 0x00a2 }
            long r7 = (long) r7     // Catch:{ Exception -> 0x00a2 }
            r2.L$0 = r13     // Catch:{ Exception -> 0x00a2 }
            r2.L$1 = r1     // Catch:{ Exception -> 0x00a2 }
            r2.L$2 = r1     // Catch:{ Exception -> 0x00a2 }
            r2.label = r4     // Catch:{ Exception -> 0x00a2 }
            r3 = r13
            r4 = r1
            r9 = r2
            java.lang.Object r3 = r3.mo61802h(r4, r5, r6, r7, r9)     // Catch:{ Exception -> 0x00a2 }
            if (r3 != r10) goto L_0x019a
            return r10
        L_0x019a:
            r4 = r1
            r5 = r13
        L_0x019c:
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01ac }
            java.math.BigInteger r6 = new java.math.BigInteger     // Catch:{ Exception -> 0x01ac }
            r6.<init>(r3)     // Catch:{ Exception -> 0x01ac }
            dg5 r3 = new dg5     // Catch:{ Exception -> 0x01ac }
            r3.<init>(r4, r6)     // Catch:{ Exception -> 0x01ac }
            return r3
        L_0x01a9:
            r1 = r20
        L_0x01ab:
            r5 = r0
        L_0x01ac:
            r2.L$0 = r1
            r3 = 0
            r2.L$1 = r3
            r2.L$2 = r3
            r2.label = r12
            java.lang.Object r2 = r5.mo61804j(r2)
            if (r2 != r10) goto L_0x01bc
            return r10
        L_0x01bc:
            r18 = r2
            r2 = r1
            r1 = r18
        L_0x01c1:
            p000.vx2.m53588d(r1)
            rr1$a r1 = (p000.rr1.C9279a) r1
            java.math.BigInteger r1 = r1.getNumber()
            p000.vx2.m53590f(r1, r11)
            dg5 r3 = new dg5
            r3.<init>(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime.mo61807m(java.util.Date, boolean, ns0):java.lang.Object");
    }

    /* renamed from: n */
    public final Object mo61808n(Date date, BigInteger bigInteger, BigInteger bigInteger2, ns0<? super BigInteger> ns0) {
        BigInteger bigInteger3;
        BigInteger add = bigInteger.add(bigInteger2);
        vx2.m53590f(add, "this.add(other)");
        ArrayList arrayList = this.f43020k.get(a40.m31674e(mo61813s(date)));
        boolean z = true;
        if (arrayList == null || !arrayList.contains(add)) {
            z = false;
        }
        if (z) {
            if (bigInteger2.compareTo(BigInteger.ZERO) < 0) {
                BigInteger bigInteger4 = BigInteger.ONE;
                vx2.m53590f(bigInteger4, "ONE");
                bigInteger3 = bigInteger4.add(bigInteger2);
                vx2.m53590f(bigInteger3, "this.add(other)");
            } else {
                BigInteger bigInteger5 = BigInteger.ONE;
                vx2.m53590f(bigInteger5, "ONE");
                bigInteger3 = bigInteger5.subtract(bigInteger2);
                vx2.m53590f(bigInteger3, "this.subtract(other)");
            }
            return mo61808n(date, bigInteger, bigInteger3, ns0);
        }
        ArrayList arrayList2 = this.f43020k.get(a40.m31674e(mo61813s(date)));
        if (arrayList2 != null) {
            a40.m31670a(arrayList2.add(add));
        }
        return add;
    }

    /* renamed from: o */
    public final boolean mo61809o(Date date, Date date2) {
        if (date.compareTo(date2) < 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61810p(java.util.Date r9, p000.zk5 r10, boolean r11, p000.ns0<? super java.lang.Boolean> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$isBetterBlock$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$isBetterBlock$1 r0 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$isBetterBlock$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$isBetterBlock$1 r0 = new net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime$isBetterBlock$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r9 = r0.L$2
            java.util.Date r9 = (java.util.Date) r9
            java.lang.Object r10 = r0.L$1
            java.util.Date r10 = (java.util.Date) r10
            java.lang.Object r11 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r11 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r11
            p000.hg5.m45199b(r12)
            goto L_0x00f8
        L_0x003a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0042:
            java.lang.Object r9 = r0.L$2
            java.util.Date r9 = (java.util.Date) r9
            java.lang.Object r10 = r0.L$1
            java.util.Date r10 = (java.util.Date) r10
            java.lang.Object r11 = r0.L$0
            net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime r11 = (net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime) r11
            p000.hg5.m45199b(r12)
            goto L_0x00a0
        L_0x0052:
            p000.hg5.m45199b(r12)
            java.math.BigInteger r12 = r10.mo67326b()
            java.util.Date r12 = r8.mo61812r(r12)
            java.lang.String r2 = "predictedBlock.number.to…igInteger.ONE).toString()"
            java.lang.String r6 = "ONE"
            if (r11 == 0) goto L_0x00bb
            boolean r11 = r8.mo61809o(r12, r9)
            if (r11 == 0) goto L_0x006e
            java.lang.Boolean r9 = p000.a40.m31670a(r4)
            return r9
        L_0x006e:
            java.math.BigInteger r11 = new java.math.BigInteger
            java.lang.String r10 = r10.mo67325a()
            r11.<init>(r10)
            java.math.BigInteger r10 = java.math.BigInteger.ONE
            p000.vx2.m53590f(r10, r6)
            java.math.BigInteger r10 = r11.subtract(r10)
            java.lang.String r11 = "this.subtract(other)"
            p000.vx2.m53590f(r10, r11)
            java.lang.String r10 = r10.toString()
            p000.vx2.m53590f(r10, r2)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r12
            r0.label = r5
            java.lang.Object r10 = r8.mo61806l(r10, r0)
            if (r10 != r1) goto L_0x009b
            return r1
        L_0x009b:
            r11 = r8
            r7 = r10
            r10 = r9
            r9 = r12
            r12 = r7
        L_0x00a0:
            zk5 r12 = (p000.zk5) r12
            boolean r9 = r11.mo61811q(r9, r10)
            if (r9 == 0) goto L_0x0113
            java.math.BigInteger r9 = r12.mo67326b()
            java.util.Date r9 = r11.mo61812r(r9)
            boolean r9 = r11.mo61809o(r9, r10)
            if (r9 == 0) goto L_0x0113
            java.lang.Boolean r9 = p000.a40.m31670a(r5)
            return r9
        L_0x00bb:
            boolean r11 = r8.mo61811q(r12, r9)
            if (r11 == 0) goto L_0x00c6
            java.lang.Boolean r9 = p000.a40.m31670a(r4)
            return r9
        L_0x00c6:
            java.math.BigInteger r11 = new java.math.BigInteger
            java.lang.String r10 = r10.mo67325a()
            r11.<init>(r10)
            java.math.BigInteger r10 = java.math.BigInteger.ONE
            p000.vx2.m53590f(r10, r6)
            java.math.BigInteger r10 = r11.add(r10)
            java.lang.String r11 = "this.add(other)"
            p000.vx2.m53590f(r10, r11)
            java.lang.String r10 = r10.toString()
            p000.vx2.m53590f(r10, r2)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r12
            r0.label = r3
            java.lang.Object r10 = r8.mo61806l(r10, r0)
            if (r10 != r1) goto L_0x00f3
            return r1
        L_0x00f3:
            r11 = r8
            r7 = r10
            r10 = r9
            r9 = r12
            r12 = r7
        L_0x00f8:
            zk5 r12 = (p000.zk5) r12
            boolean r9 = r11.mo61809o(r9, r10)
            if (r9 == 0) goto L_0x0113
            java.math.BigInteger r9 = r12.mo67326b()
            java.util.Date r9 = r11.mo61812r(r9)
            boolean r9 = r11.mo61811q(r9, r10)
            if (r9 == 0) goto L_0x0113
            java.lang.Boolean r9 = p000.a40.m31670a(r5)
            return r9
        L_0x0113:
            java.lang.Boolean r9 = p000.a40.m31670a(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.blockChainClass.BlockTime.mo61810p(java.util.Date, zk5, boolean, ns0):java.lang.Object");
    }

    /* renamed from: q */
    public final boolean mo61811q(Date date, Date date2) {
        if (date.compareTo(date2) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final Date mo61812r(BigInteger bigInteger) {
        return new Date(bigInteger.longValue() * ((long) 1000));
    }

    /* renamed from: s */
    public final long mo61813s(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.getTimeInMillis() / ((long) 1000);
    }
}
