package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {194}, mo48634m = "invokeSuspend")
/* compiled from: MultiWalletViewModel.kt */
public final class MultiWalletViewModel$addWallet$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $address;
    public final /* synthetic */ rc2<Long, r37> $callBack;
    public final /* synthetic */ Ref$ObjectRef<String> $encryptedMnemonic;
    public final /* synthetic */ String $encryptedPrivateKey;
    public final /* synthetic */ boolean $isPrimaryWallet;
    public final /* synthetic */ boolean $isSetActiveWallet;
    public final /* synthetic */ String $privateKey;
    public final /* synthetic */ String $u5B64;
    public final /* synthetic */ String $walletName;
    public int label;
    public final /* synthetic */ MultiWalletViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1$1", mo48632f = "MultiWalletViewModel.kt", mo48633l = {195, 204, 215, 227, 241, 244, 249, 250, 266}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1$1 */
    /* compiled from: MultiWalletViewModel.kt */
    public static final class C87001 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87001(multiWalletViewModel, str, str2, str3, ref$ObjectRef, str4, z, z2, str5, rc2, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87001) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
            if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
            r1 = p000.cd7.m11843a(r5);
            r0 = r14;
            p000.y23 unused = p000.d50.m56748b(r1, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1.C87001.C87011((p000.ns0<? super net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1.C87001.C87011>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
            return p000.r37.f33317a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
            r0 = r5.mo61260v();
            r11.label = 2;
            r0 = r0.mo60771c(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
            if (r0 != r12) goto L_0x00ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
            r0 = (java.util.List) r0;
            r10 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
            r1 = new kotlin.jvm.internal.Ref$ObjectRef();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
            if (r0.isEmpty() == false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c1, code lost:
            r2 = "Wallet";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c4, code lost:
            r2 = "Wallet " + r0.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d9, code lost:
            r1.element = r2;
            r2 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e3, code lost:
            if (r2.hasNext() == false) goto L_0x00f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e5, code lost:
            r3 = r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
            if (p000.vx2.m53586b(((net.safemoon.androidwallet.model.wallets.Wallet) r3).getName(), r1.element) == false) goto L_0x00df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
            if (((net.safemoon.androidwallet.model.wallets.Wallet) r3) == null) goto L_0x0116;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fe, code lost:
            r1.element = r1.element + "-" + r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0116, code lost:
            r2 = p000.vx2.m53586b("Primary Wallet", r7);
            r3 = r5.mo61260v();
            r4 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0126, code lost:
            if (r4 != null) goto L_0x012d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0128, code lost:
            r1 = (java.lang.String) r1.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x012d, code lost:
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
            r4 = r8;
            p000.vx2.m53590f(r4, "encryptedPrivateKey");
            r5 = r6;
            r6 = r9.element;
            r7 = (java.lang.String) r6;
            r6 = (java.lang.String) r6;
            r8 = r10;
            p000.vx2.m53590f(r8, "u5B64");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0147, code lost:
            if (r2 == false) goto L_0x014b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0149, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x014b, code lost:
            r9 = r0.size();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0150, code lost:
            r2 = r11;
            r11.L$0 = r10;
            r11.label = 3;
            r16 = r10;
            r0 = r3.mo60770b(r1, r4, r5, r7, r10, r6, r8, r9, r2, r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x016a, code lost:
            if (r0 != r12) goto L_0x016d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x016c, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x016d, code lost:
            r1 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x016f, code lost:
            r0 = (java.lang.Long) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0171, code lost:
            if (r0 == null) goto L_0x028d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x017b, code lost:
            if (r0.longValue() <= 0) goto L_0x028d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x017d, code lost:
            r2 = r5.mo61260v();
            r3 = r0.longValue();
            r11.L$0 = r1;
            r11.L$1 = r0;
            r11.label = 4;
            r2 = r2.mo60776h(r3, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0192, code lost:
            if (r2 != r12) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0194, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0195, code lost:
            r2 = (net.safemoon.androidwallet.model.wallets.Wallet) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a3, code lost:
            if (p000.a77.m55423a("verified", r5.mo27549b()) != false) goto L_0x01c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
            r3 = r2.getAllAddressOfWallet();
            r4 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b0, code lost:
            if ((!r3.isEmpty()) == false) goto L_0x01c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b2, code lost:
            r3 = (java.lang.String[]) r3.toArray(new java.lang.String[0]);
            r4.mo61262x((java.lang.String[]) java.util.Arrays.copyOf(r3, r3.length));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c6, code lost:
            if (r12 == false) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c8, code lost:
            r5.mo61245D(r2);
            r11.L$0 = r1;
            r11.L$1 = r0;
            r11.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01da, code lost:
            if (p000.jb1.m59336a(2000, r11) != r12) goto L_0x01f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01dc, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01dd, code lost:
            net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p.mo57124g();
            r11.L$0 = r1;
            r11.L$1 = r0;
            r11.label = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ef, code lost:
            if (p000.jb1.m59336a(500, r11) != r12) goto L_0x01f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f1, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f2, code lost:
            r2 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p;
            r3 = r5.mo27549b();
            p000.vx2.m53590f(r3, "getApplication()");
            r2.mo57120b(r3, r1);
            r1 = p000.qu4.f44243a;
            r1.mo50768a();
            r2 = r5.mo27549b();
            p000.vx2.m53590f(r2, "getApplication()");
            r1 = r1.mo65529b(r2);
            r11.L$0 = r0;
            r11.L$1 = r1;
            r11.label = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x021f, code lost:
            if (r1.mo65758a(r11) != r12) goto L_0x0222;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0221, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0222, code lost:
            r17 = r1;
            r1 = r0;
            r0 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0227, code lost:
            r11.L$0 = r1;
            r11.L$1 = null;
            r11.label = 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0233, code lost:
            if (r0.mo65759b(r11) != r12) goto L_0x0236;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0235, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0236, code lost:
            r0 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0237, code lost:
            r1 = net.safemoon.androidwallet.ERC20.m64654r("0x8076c74c5e3f5852037f31ff0093eeb8c8add8d3", p000.uj7.m72805a(new p000.hn2(p000.ol0.m70384z(56))), p000.cw0.create(r13), new p000.i81()).mo56479p(r6).send();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0267, code lost:
            if (r1 == null) goto L_0x027a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0269, code lost:
            r1 = r1.toString();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x026d, code lost:
            if (r1 == null) goto L_0x027a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x026f, code lost:
            r1 = p000.ol0.m70375q(r1, 9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0273, code lost:
            if (r1 == null) goto L_0x027a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0275, code lost:
            r5 = r1.doubleValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x027a, code lost:
            r5 = 0.0d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x027b, code lost:
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x027f, code lost:
            if (r5 <= com.github.mikephil.charting.utils.Utils.DOUBLE_EPSILON) goto L_0x0282;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0281, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0282, code lost:
            r11.L$0 = r0;
            r11.label = 9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x028a, code lost:
            if (r1.mo61252l(r13, r11) != r12) goto L_0x028d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x028c, code lost:
            return r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x028d, code lost:
            r2 = p000.cd7.m11843a(r5);
            r1 = r14;
            p000.y23 unused = p000.d50.m56748b(r2, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1.C87001.C87026((p000.ns0<? super net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1.C87001.C87026>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x02a3, code lost:
            return p000.r37.f33317a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r11 = r18
                java.lang.Object r12 = p000.wx2.m54101d()
                int r0 = r11.label
                r13 = 0
                r14 = 1
                r15 = 0
                switch(r0) {
                    case 0: goto L_0x0069;
                    case 1: goto L_0x0063;
                    case 2: goto L_0x005d;
                    case 3: goto L_0x0051;
                    case 4: goto L_0x0042;
                    case 5: goto L_0x0035;
                    case 6: goto L_0x0035;
                    case 7: goto L_0x0028;
                    case 8: goto L_0x001f;
                    case 9: goto L_0x0016;
                    default: goto L_0x000e;
                }
            L_0x000e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0016:
                java.lang.Object r0 = r11.L$0
                java.lang.Long r0 = (java.lang.Long) r0
                p000.hg5.m45199b(r19)
                goto L_0x028d
            L_0x001f:
                java.lang.Object r0 = r11.L$0
                java.lang.Long r0 = (java.lang.Long) r0
                p000.hg5.m45199b(r19)
                goto L_0x0237
            L_0x0028:
                java.lang.Object r0 = r11.L$1
                to2 r0 = (p000.to2) r0
                java.lang.Object r1 = r11.L$0
                java.lang.Long r1 = (java.lang.Long) r1
                p000.hg5.m45199b(r19)
                goto L_0x0227
            L_0x0035:
                java.lang.Object r0 = r11.L$1
                java.lang.Long r0 = (java.lang.Long) r0
                java.lang.Object r1 = r11.L$0
                java.lang.String r1 = (java.lang.String) r1
                p000.hg5.m45199b(r19)
                goto L_0x01f2
            L_0x0042:
                java.lang.Object r0 = r11.L$1
                java.lang.Long r0 = (java.lang.Long) r0
                java.lang.Object r1 = r11.L$0
                java.lang.String r1 = (java.lang.String) r1
                p000.hg5.m45199b(r19)
                r2 = r19
                goto L_0x0195
            L_0x0051:
                java.lang.Object r0 = r11.L$0
                java.lang.String r0 = (java.lang.String) r0
                p000.hg5.m45199b(r19)
                r1 = r0
                r0 = r19
                goto L_0x016f
            L_0x005d:
                p000.hg5.m45199b(r19)
                r0 = r19
                goto L_0x00ac
            L_0x0063:
                p000.hg5.m45199b(r19)
                r0 = r19
                goto L_0x007d
            L_0x0069:
                p000.hg5.m45199b(r19)
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r0 = r5
                net.safemoon.androidwallet.repository.WalletDataSource r0 = r0.mo61260v()
                java.lang.String r1 = r6
                r11.label = r14
                java.lang.Object r0 = r0.mo60775g(r1, r11)
                if (r0 != r12) goto L_0x007d
                return r12
            L_0x007d:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x009c
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r0 = r5
                hu0 r1 = p000.cd7.m11843a(r0)
                r2 = 0
                r3 = 0
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1$1$1 r4 = new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1$1$1
                rc2<java.lang.Long, r37> r0 = r14
                r4.<init>(r0, r15)
                r5 = 3
                r6 = 0
                p000.y23 unused = p000.d50.m56748b(r1, r2, r3, r4, r5, r6)
                r37 r0 = p000.r37.f33317a
                return r0
            L_0x009c:
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r0 = r5
                net.safemoon.androidwallet.repository.WalletDataSource r0 = r0.mo61260v()
                r1 = 2
                r11.label = r1
                java.lang.Object r0 = r0.mo60771c(r11)
                if (r0 != r12) goto L_0x00ac
                return r12
            L_0x00ac:
                java.util.List r0 = (java.util.List) r0
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.String r10 = java.lang.String.valueOf(r1)
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                boolean r2 = r0.isEmpty()
                if (r2 == 0) goto L_0x00c4
                java.lang.String r2 = "Wallet"
                goto L_0x00d9
            L_0x00c4:
                int r2 = r0.size()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Wallet "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
            L_0x00d9:
                r1.element = r2
                java.util.Iterator r2 = r0.iterator()
            L_0x00df:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00f9
                java.lang.Object r3 = r2.next()
                r4 = r3
                net.safemoon.androidwallet.model.wallets.Wallet r4 = (net.safemoon.androidwallet.model.wallets.Wallet) r4
                java.lang.String r4 = r4.getName()
                T r5 = r1.element
                boolean r4 = p000.vx2.m53586b(r4, r5)
                if (r4 == 0) goto L_0x00df
                goto L_0x00fa
            L_0x00f9:
                r3 = r15
            L_0x00fa:
                net.safemoon.androidwallet.model.wallets.Wallet r3 = (net.safemoon.androidwallet.model.wallets.Wallet) r3
                if (r3 == 0) goto L_0x0116
                T r2 = r1.element
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r2)
                java.lang.String r2 = "-"
                r3.append(r2)
                r3.append(r10)
                java.lang.String r2 = r3.toString()
                r1.element = r2
            L_0x0116:
                java.lang.String r2 = r7
                java.lang.String r3 = "Primary Wallet"
                boolean r2 = p000.vx2.m53586b(r3, r2)
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r3 = r5
                net.safemoon.androidwallet.repository.WalletDataSource r3 = r3.mo61260v()
                java.lang.String r4 = r7
                if (r4 != 0) goto L_0x012d
                T r1 = r1.element
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x012e
            L_0x012d:
                r1 = r4
            L_0x012e:
                java.lang.String r4 = r8
                java.lang.String r5 = "encryptedPrivateKey"
                p000.vx2.m53590f(r4, r5)
                java.lang.String r5 = r6
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r6 = r9
                T r6 = r6.element
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r8 = r10
                java.lang.String r9 = "u5B64"
                p000.vx2.m53590f(r8, r9)
                if (r2 == 0) goto L_0x014b
                r9 = r13
                goto L_0x0150
            L_0x014b:
                int r0 = r0.size()
                r9 = r0
            L_0x0150:
                boolean r2 = r11
                r11.L$0 = r10
                r0 = 3
                r11.label = r0
                r0 = r3
                r16 = r2
                r2 = r4
                r3 = r5
                r4 = r7
                r5 = r10
                r7 = r8
                r8 = r9
                r9 = r16
                r16 = r10
                r10 = r18
                java.lang.Object r0 = r0.mo60770b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r0 != r12) goto L_0x016d
                return r12
            L_0x016d:
                r1 = r16
            L_0x016f:
                java.lang.Long r0 = (java.lang.Long) r0
                if (r0 == 0) goto L_0x028d
                long r2 = r0.longValue()
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x028d
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r2 = r5
                net.safemoon.androidwallet.repository.WalletDataSource r2 = r2.mo61260v()
                long r3 = r0.longValue()
                r11.L$0 = r1
                r11.L$1 = r0
                r5 = 4
                r11.label = r5
                java.lang.Object r2 = r2.mo60776h(r3, r11)
                if (r2 != r12) goto L_0x0195
                return r12
            L_0x0195:
                net.safemoon.androidwallet.model.wallets.Wallet r2 = (net.safemoon.androidwallet.model.wallets.Wallet) r2
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r3 = r5
                android.app.Application r3 = r3.mo27549b()
                java.lang.String r4 = "verified"
                boolean r3 = p000.a77.m55423a(r4, r3)
                if (r3 != 0) goto L_0x01c4
                java.util.List r3 = r2.getAllAddressOfWallet()
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r4 = r5
                boolean r5 = r3.isEmpty()
                r5 = r5 ^ r14
                if (r5 == 0) goto L_0x01c4
                java.lang.String[] r5 = new java.lang.String[r13]
                java.lang.Object[] r3 = r3.toArray(r5)
                java.lang.String[] r3 = (java.lang.String[]) r3
                int r5 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r4.mo61262x(r3)
            L_0x01c4:
                boolean r3 = r12
                if (r3 == 0) goto L_0x01dd
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r3 = r5
                r3.mo61245D(r2)
                r2 = 2000(0x7d0, double:9.88E-321)
                r11.L$0 = r1
                r11.L$1 = r0
                r4 = 5
                r11.label = r4
                java.lang.Object r2 = p000.jb1.m59336a(r2, r11)
                if (r2 != r12) goto L_0x01f2
                return r12
            L_0x01dd:
                net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m r2 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p
                r2.mo57124g()
                r2 = 500(0x1f4, double:2.47E-321)
                r11.L$0 = r1
                r11.L$1 = r0
                r4 = 6
                r11.label = r4
                java.lang.Object r2 = p000.jb1.m59336a(r2, r11)
                if (r2 != r12) goto L_0x01f2
                return r12
            L_0x01f2:
                net.safemoon.androidwallet.database.room.ApplicationRoomDatabase$m r2 = net.safemoon.androidwallet.database.room.ApplicationRoomDatabase.f41664p
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r3 = r5
                android.app.Application r3 = r3.mo27549b()
                java.lang.String r4 = "getApplication()"
                p000.vx2.m53590f(r3, r4)
                r2.mo57120b(r3, r1)
                qu4 r1 = p000.qu4.f44243a
                r1.mo50768a()
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r2 = r5
                android.app.Application r2 = r2.mo27549b()
                p000.vx2.m53590f(r2, r4)
                to2 r1 = r1.mo65529b(r2)
                r11.L$0 = r0
                r11.L$1 = r1
                r2 = 7
                r11.label = r2
                java.lang.Object r2 = r1.mo65758a(r11)
                if (r2 != r12) goto L_0x0222
                return r12
            L_0x0222:
                r17 = r1
                r1 = r0
                r0 = r17
            L_0x0227:
                r11.L$0 = r1
                r11.L$1 = r15
                r2 = 8
                r11.label = r2
                java.lang.Object r0 = r0.mo65759b(r11)
                if (r0 != r12) goto L_0x0236
                return r12
            L_0x0236:
                r0 = r1
            L_0x0237:
                r1 = 56
                hn2 r2 = new hn2
                java.lang.String r1 = p000.ol0.m70384z(r1)
                r2.<init>((java.lang.String) r1)
                vj7 r1 = p000.uj7.m72805a(r2)
                java.lang.String r2 = r13
                cw0 r2 = p000.cw0.create((java.lang.String) r2)
                i81 r3 = new i81
                r3.<init>()
                java.lang.String r4 = "0x8076c74c5e3f5852037f31ff0093eeb8c8add8d3"
                net.safemoon.androidwallet.ERC20 r1 = net.safemoon.androidwallet.ERC20.m64654r(r4, r1, r2, r3)
                java.lang.String r2 = r6
                rc5 r1 = r1.mo56479p(r2)
                java.lang.Object r1 = r1.send()
                java.math.BigInteger r1 = (java.math.BigInteger) r1
                r2 = 9
                r3 = 0
                if (r1 == 0) goto L_0x027a
                java.lang.String r1 = r1.toString()
                if (r1 == 0) goto L_0x027a
                java.math.BigDecimal r1 = p000.ol0.m70375q(r1, r2)
                if (r1 == 0) goto L_0x027a
                double r5 = r1.doubleValue()
                goto L_0x027b
            L_0x027a:
                r5 = r3
            L_0x027b:
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r1 = r5
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x0282
                r13 = r14
            L_0x0282:
                r11.L$0 = r0
                r11.label = r2
                java.lang.Object r1 = r1.mo61252l(r13, r11)
                if (r1 != r12) goto L_0x028d
                return r12
            L_0x028d:
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel r1 = r5
                hu0 r2 = p000.cd7.m11843a(r1)
                r3 = 0
                r4 = 0
                net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1$1$6 r5 = new net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1$1$6
                rc2<java.lang.Long, r37> r1 = r14
                r5.<init>(r1, r0, r15)
                r6 = 3
                r7 = 0
                p000.y23 unused = p000.d50.m56748b(r2, r3, r4, r5, r6, r7)
                r37 r0 = p000.r37.f33317a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.MultiWalletViewModel$addWallet$1.C87001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiWalletViewModel$addWallet$1(MultiWalletViewModel multiWalletViewModel, String str, String str2, String str3, Ref$ObjectRef<String> ref$ObjectRef, String str4, boolean z, boolean z2, String str5, rc2<? super Long, r37> rc2, ns0<? super MultiWalletViewModel$addWallet$1> ns0) {
        super(2, ns0);
        this.this$0 = multiWalletViewModel;
        this.$address = str;
        this.$walletName = str2;
        this.$encryptedPrivateKey = str3;
        this.$encryptedMnemonic = ref$ObjectRef;
        this.$u5B64 = str4;
        this.$isPrimaryWallet = z;
        this.$isSetActiveWallet = z2;
        this.$privateKey = str5;
        this.$callBack = rc2;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new MultiWalletViewModel$addWallet$1(this.this$0, this.$address, this.$walletName, this.$encryptedPrivateKey, this.$encryptedMnemonic, this.$u5B64, this.$isPrimaryWallet, this.$isSetActiveWallet, this.$privateKey, this.$callBack, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((MultiWalletViewModel$addWallet$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final MultiWalletViewModel multiWalletViewModel = this.this$0;
            final String str = this.$address;
            final String str2 = this.$walletName;
            final String str3 = this.$encryptedPrivateKey;
            final Ref$ObjectRef<String> ref$ObjectRef = this.$encryptedMnemonic;
            final String str4 = this.$u5B64;
            final boolean z = this.$isPrimaryWallet;
            final boolean z2 = this.$isSetActiveWallet;
            final String str5 = this.$privateKey;
            final rc2<Long, r37> rc2 = this.$callBack;
            C87001 r17 = r4;
            C87001 r4 = new C87001((ns0<? super C87001>) null);
            this.label = 1;
            if (b50.m55768e(b, r17, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
