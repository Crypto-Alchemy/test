package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.ReceiptStatus;
import net.safemoon.androidwallet.model.rpc2.bitcoin.BitcoinSpecificTransaction;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1", mo48632f = "TransferViewModel.kt", mo48633l = {197}, mo48634m = "invokeSuspend")
/* compiled from: TransferViewModel.kt */
public final class TransferViewModel$getTransactionStatus$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ String $hash;
    public final /* synthetic */ TokenType $tokenType;
    public int label;
    public final /* synthetic */ TransferViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1", mo48632f = "TransferViewModel.kt", mo48633l = {259}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1 */
    /* compiled from: TransferViewModel.kt */
    public static final class C88701 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/TransferViewModel$getTransactionStatus$1$1$a", "Lp90;", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSpecificTransaction;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$a */
        /* compiled from: TransferViewModel.kt */
        public static final class C8872a implements p90<BitcoinSpecificTransaction> {

            /* renamed from: a */
            public final /* synthetic */ TransferViewModel f43010a;

            public C8872a(TransferViewModel transferViewModel) {
                this.f43010a = transferViewModel;
            }

            /* renamed from: a */
            public void mo47103a(k90<BitcoinSpecificTransaction> k90, Throwable th) {
                vx2.m53591g(k90, "call");
                vx2.m53591g(th, "t");
            }

            /* renamed from: b */
            public void mo47104b(k90<BitcoinSpecificTransaction> k90, bg5<BitcoinSpecificTransaction> bg5) {
                String str;
                vx2.m53591g(k90, "call");
                vx2.m53591g(bg5, "response");
                ReceiptStatus.Result result = new ReceiptStatus.Result();
                if (bg5.mo50581e()) {
                    BitcoinSpecificTransaction a = bg5.mo50578a();
                    if (a == null || a.getBlockhash() == null) {
                        str = "";
                    } else {
                        str = "1";
                    }
                    result.status = str;
                } else {
                    result.status = "0";
                }
                this.f43010a.mo61762k().postValue(new ReceiptStatus(result));
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/TransferViewModel$getTransactionStatus$1$1$b", "Lp90;", "Lnet/safemoon/androidwallet/model/rpc2/bitcoin/BitcoinSpecificTransaction;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$b */
        /* compiled from: TransferViewModel.kt */
        public static final class C8873b implements p90<BitcoinSpecificTransaction> {

            /* renamed from: a */
            public final /* synthetic */ TransferViewModel f43011a;

            public C8873b(TransferViewModel transferViewModel) {
                this.f43011a = transferViewModel;
            }

            /* renamed from: a */
            public void mo47103a(k90<BitcoinSpecificTransaction> k90, Throwable th) {
                vx2.m53591g(k90, "call");
                vx2.m53591g(th, "t");
            }

            /* renamed from: b */
            public void mo47104b(k90<BitcoinSpecificTransaction> k90, bg5<BitcoinSpecificTransaction> bg5) {
                String str;
                vx2.m53591g(k90, "call");
                vx2.m53591g(bg5, "response");
                ReceiptStatus.Result result = new ReceiptStatus.Result();
                if (bg5.mo50581e()) {
                    BitcoinSpecificTransaction a = bg5.mo50578a();
                    if (a == null || a.getBlockhash() == null) {
                        str = "";
                    } else {
                        str = "1";
                    }
                    result.status = str;
                } else {
                    result.status = "0";
                }
                this.f43011a.mo61762k().postValue(new ReceiptStatus(result));
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/TransferViewModel$getTransactionStatus$1$1$c", "Lp90;", "Lnet/safemoon/androidwallet/model/ReceiptStatus;", "Lk90;", "call", "Lbg5;", "response", "Lr37;", "b", "", "t", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$c */
        /* compiled from: TransferViewModel.kt */
        public static final class C8874c implements p90<ReceiptStatus> {

            /* renamed from: a */
            public final /* synthetic */ TransferViewModel f43012a;

            public C8874c(TransferViewModel transferViewModel) {
                this.f43012a = transferViewModel;
            }

            /* renamed from: a */
            public void mo47103a(k90<ReceiptStatus> k90, Throwable th) {
                vx2.m53591g(k90, "call");
                vx2.m53591g(th, "t");
            }

            /* renamed from: b */
            public void mo47104b(k90<ReceiptStatus> k90, bg5<ReceiptStatus> bg5) {
                vx2.m53591g(k90, "call");
                vx2.m53591g(bg5, "response");
                if (bg5.mo50581e()) {
                    this.f43012a.mo61762k().postValue(bg5.mo50578a());
                }
            }
        }

        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m69132a(net.safemoon.androidwallet.common.TokenType r6, java.lang.String r7, net.safemoon.androidwallet.viewmodels.TransferViewModel r8, p000.ns0<? super p000.r37> r9) {
            /*
                boolean r0 = r9 instanceof net.safemoon.androidwallet.viewmodels.C8875xa618be78
                if (r0 == 0) goto L_0x0013
                r0 = r9
                net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$loadSolTransactionStatus$1 r0 = (net.safemoon.androidwallet.viewmodels.C8875xa618be78) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$loadSolTransactionStatus$1 r0 = new net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1$1$loadSolTransactionStatus$1
                r0.<init>(r9)
            L_0x0018:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p000.wx2.m54101d()
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x003b
                if (r2 != r3) goto L_0x0033
                java.lang.Object r6 = r0.L$1
                net.safemoon.androidwallet.model.ReceiptStatus$Result r6 = (net.safemoon.androidwallet.model.ReceiptStatus.Result) r6
                java.lang.Object r7 = r0.L$0
                r8 = r7
                net.safemoon.androidwallet.viewmodels.TransferViewModel r8 = (net.safemoon.androidwallet.viewmodels.TransferViewModel) r8
                p000.hg5.m45199b(r9)
                goto L_0x0063
            L_0x0033:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x003b:
                p000.hg5.m45199b(r9)
                net.safemoon.androidwallet.model.ReceiptStatus$Result r9 = new net.safemoon.androidwallet.model.ReceiptStatus$Result
                net.safemoon.androidwallet.model.ReceiptStatus r2 = new net.safemoon.androidwallet.model.ReceiptStatus
                r2.<init>()
                r9.<init>()
                i30 r6 = p000.ol0.m70377s(r6)
                r2 = 2
                k90 r6 = p000.i30.C7204a.m58796e(r6, r7, r4, r2, r4)
                if (r6 == 0) goto L_0x0075
                r0.L$0 = r8
                r0.L$1 = r9
                r0.label = r3
                java.lang.Object r6 = retrofit2.KotlinExtensions.m71521c(r6, r0)
                if (r6 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r5 = r9
                r9 = r6
                r6 = r5
            L_0x0063:
                bg5 r9 = (p000.bg5) r9
                if (r9 == 0) goto L_0x0074
                java.lang.Object r7 = r9.mo50578a()
                net.safemoon.androidwallet.model.transaction.solana.SolStatus r7 = (net.safemoon.androidwallet.model.transaction.solana.SolStatus) r7
                if (r7 == 0) goto L_0x0074
                java.lang.String r4 = r7.getStatus()
                goto L_0x0076
            L_0x0074:
                r9 = r6
            L_0x0075:
                r6 = r9
            L_0x0076:
                if (r4 == 0) goto L_0x00aa
                java.util.Locale r7 = java.util.Locale.ROOT
                java.lang.String r9 = r4.toLowerCase(r7)
                java.lang.String r0 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
                p000.vx2.m53590f(r9, r0)
                java.lang.String r1 = "success"
                java.lang.String r7 = r1.toLowerCase(r7)
                p000.vx2.m53590f(r7, r0)
                boolean r7 = p000.vx2.m53586b(r9, r7)
                if (r7 == 0) goto L_0x0097
                java.lang.String r7 = "1"
                r6.status = r7
                goto L_0x009b
            L_0x0097:
                java.lang.String r7 = "0"
                r6.status = r7
            L_0x009b:
                net.safemoon.androidwallet.model.ReceiptStatus r7 = new net.safemoon.androidwallet.model.ReceiptStatus
                r7.<init>(r6)
                k04 r6 = r8.mo61762k()
                r6.postValue(r7)
                r37 r6 = p000.r37.f33317a
                return r6
            L_0x00aa:
                java.lang.String r7 = ""
                r6.status = r7
                net.safemoon.androidwallet.model.ReceiptStatus r7 = new net.safemoon.androidwallet.model.ReceiptStatus
                r7.<init>(r6)
                k04 r6 = r8.mo61762k()
                r6.postValue(r7)
                java.lang.Exception r6 = new java.lang.Exception
                java.lang.String r7 = "Retry"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.TransferViewModel$getTransactionStatus$1.C88701.m69132a(net.safemoon.androidwallet.common.TokenType, java.lang.String, net.safemoon.androidwallet.viewmodels.TransferViewModel, ns0):java.lang.Object");
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88701(tokenType, str, transferViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88701) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            k90<ReceiptStatus> a;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                if (tokenType.getChainId() == TokenType.MULTI_COIN_DOGE.getChainId()) {
                    ll1.f40640a.mo55919e(str).mo50512X(new C8872a(transferViewModel));
                } else if (tokenType.getChainId() == TokenType.MULTI_COIN_BITCOIN.getChainId()) {
                    ll1.f40640a.mo55916b(str).mo50512X(new C8873b(transferViewModel));
                } else if (tokenType.getChainId() == TokenType.SOLANA.getChainId()) {
                    final TokenType tokenType = tokenType;
                    final String str = str;
                    final TransferViewModel transferViewModel = transferViewModel;
                    C88713 r10 = new fd2<Integer, ns0<? super r37>, Object>((ns0<? super C88713>) null) {
                        public /* synthetic */ int I$0;
                        public int label;

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            C88713 r0 = 

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public TransferViewModel$getTransactionStatus$1(TokenType tokenType, String str, TransferViewModel transferViewModel, ns0<? super TransferViewModel$getTransactionStatus$1> ns0) {
                                super(2, ns0);
                                this.$tokenType = tokenType;
                                this.$hash = str;
                                this.this$0 = transferViewModel;
                            }

                            public final ns0<r37> create(Object obj, ns0<?> ns0) {
                                return new TransferViewModel$getTransactionStatus$1(this.$tokenType, this.$hash, this.this$0, ns0);
                            }

                            public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                                return ((TransferViewModel$getTransactionStatus$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                            }

                            public final Object invokeSuspend(Object obj) {
                                Object d = wx2.m54101d();
                                int i = this.label;
                                if (i == 0) {
                                    hg5.m45199b(obj);
                                    CoroutineDispatcher b = qh1.m71265b();
                                    final TokenType tokenType = this.$tokenType;
                                    final String str = this.$hash;
                                    final TransferViewModel transferViewModel = this.this$0;
                                    C88701 r1 = new C88701((ns0<? super C88701>) null);
                                    this.label = 1;
                                    if (b50.m55768e(b, r1, this) == d) {
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
