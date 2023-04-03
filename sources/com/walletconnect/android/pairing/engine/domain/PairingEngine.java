package com.walletconnect.android.pairing.engine.domain;

import com.walletconnect.android.internal.common.exception.CannotFindSequenceForTopic;
import com.walletconnect.android.internal.common.exception.MalformedWalletConnectUri;
import com.walletconnect.android.internal.common.exception.PairWithExistingPairingIsNotAllowed;
import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.android.internal.common.model.AppMetaDataType;
import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.Tags;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010/\u001a\u00020$\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<¢\u0006\u0004\bd\u0010eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J#\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\f\u0010\u0012\u001a\u00020\u000f*\u00020\u0011H\u0002J0\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001aJ!\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u001c\"\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016J*\u0010#\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016J\u001e\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020H0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020R0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010JR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020R0L8\u0006¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020X0G8\u0006¢\u0006\f\n\u0004\b \u0010J\u001a\u0004\bY\u0010ZR!\u0010`\u001a\b\u0012\u0004\u0012\u00020X0\\8FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010c\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, mo44877d2 = {"Lcom/walletconnect/android/pairing/engine/domain/PairingEngine;", "", "Ly23;", "n", "Lr37;", "A", "Lrf7;", "request", "Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;", "params", "w", "(Lrf7;Lcom/walletconnect/android/pairing/model/PairingParams$DeleteParams;Lns0;)Ljava/lang/Object;", "x", "", "topic", "", "u", "Lkl4;", "v", "uri", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "y", "", "r", "", "method", "z", "([Ljava/lang/String;)V", "m", "Lnx1;", "expiry", "B", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "metadata", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "metaDataType", "C", "Lsk3;", "a", "Lsk3;", "logger", "b", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "selfMetaData", "Lkv3;", "c", "Lkv3;", "metadataRepository", "Lra3;", "d", "Lra3;", "crypto", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "e", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "jsonRpcInteractor", "Lol4;", "f", "Lol4;", "pairingRepository", "g", "Ly23;", "jsonRpcRequestsJob", "", "h", "Ljava/util/Set;", "setOfRegisteredMethods", "Lr04;", "Les6;", "i", "Lr04;", "_topicExpiredFlow", "Lxz5;", "j", "Lxz5;", "t", "()Lxz5;", "topicExpiredFlow", "Laq1;", "k", "_engineEvent", "l", "o", "engineEvent", "Ljava/lang/InternalError;", "p", "()Lr04;", "internalErrorFlow", "Lz42;", "Lef3;", "q", "()Lz42;", "jsonRpcErrorFlow", "s", "()Ljava/lang/String;", "registeredMethods", "<init>", "(Lsk3;Lcom/walletconnect/android/internal/common/model/AppMetaData;Lkv3;Lra3;Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;Lol4;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PairingEngine.kt */
public final class PairingEngine {

    /* renamed from: a */
    public final sk3 f27192a;

    /* renamed from: b */
    public final AppMetaData f27193b;

    /* renamed from: c */
    public final kv3 f27194c;

    /* renamed from: d */
    public final ra3 f27195d;

    /* renamed from: e */
    public final JsonRpcInteractorInterface f27196e;

    /* renamed from: f */
    public final ol4 f27197f;

    /* renamed from: g */
    public y23 f27198g;

    /* renamed from: h */
    public final Set<String> f27199h = new LinkedHashSet();

    /* renamed from: i */
    public final r04<es6> f27200i;

    /* renamed from: j */
    public final xz5<es6> f27201j;

    /* renamed from: k */
    public final r04<aq1> f27202k;

    /* renamed from: l */
    public final xz5<aq1> f27203l;

    /* renamed from: m */
    public final r04<InternalError> f27204m;

    /* renamed from: n */
    public final ef3 f27205n;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"", "it", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.android.pairing.engine.domain.PairingEngine$2", mo48632f = "PairingEngine.kt", mo48633l = {48}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.android.pairing.engine.domain.PairingEngine$2 */
    /* compiled from: PairingEngine.kt */
    public static final class C55632 extends SuspendLambda implements fd2<Boolean, ns0<? super r37>, Object> {
        public int label;
        public final /* synthetic */ PairingEngine this$0;

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C55632(this.this$0, ns0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (ns0<? super r37>) (ns0) obj2);
        }

        public final Object invoke(boolean z, ns0<? super r37> ns0) {
            return ((C55632) create(Boolean.valueOf(z), ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final PairingEngine pairingEngine = this.this$0;
                C55641 r5 = new fd2<hu0, ns0<? super y23>, Object>((ns0<? super C55641>) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C55641 r0 = 

                        public PairingEngine(sk3 sk3, AppMetaData appMetaData, kv3 kv3, ra3 ra3, JsonRpcInteractorInterface jsonRpcInteractorInterface, ol4 ol4) {
                            vx2.m53591g(sk3, "logger");
                            vx2.m53591g(appMetaData, "selfMetaData");
                            vx2.m53591g(kv3, "metadataRepository");
                            vx2.m53591g(ra3, "crypto");
                            vx2.m53591g(jsonRpcInteractorInterface, "jsonRpcInteractor");
                            vx2.m53591g(ol4, "pairingRepository");
                            this.f27192a = sk3;
                            this.f27193b = appMetaData;
                            this.f27194c = kv3;
                            this.f27195d = ra3;
                            this.f27196e = jsonRpcInteractorInterface;
                            this.f27197f = ol4;
                            e52.m57232x(e52.m57202C(new PairingEngine$special$$inlined$filter$1(jsonRpcInteractorInterface.mo40288a()), new C55632(this, (ns0<? super C55632>) null)), bh7.m32535a());
                            r04<es6> b = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
                            this.f27200i = b;
                            this.f27201j = e52.m57209a(b);
                            r04<aq1> b2 = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
                            this.f27202k = b2;
                            this.f27203l = e52.m57209a(b2);
                            this.f27204m = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
                            this.f27205n = C6169a.m47232a(new PairingEngine$jsonRpcErrorFlow$2(this));
                        }

                        /* renamed from: A */
                        public final void mo40465A() {
                            List<kl4> d = this.f27197f.mo40446d();
                            ArrayList<es6> arrayList = new ArrayList<>(dk0.m43495u(d, 10));
                            for (kl4 f : d) {
                                arrayList.add(f.mo44832f());
                            }
                            for (es6 f2 : arrayList) {
                                try {
                                    JsonRpcInteractorInterface.DefaultImpls.m42233f(this.f27196e, f2, (rc2) null, new PairingEngine$resubscribeToPairingFlow$2$1(this), 2, (Object) null);
                                } catch (Exception e) {
                                    y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new PairingEngine$resubscribeToPairingFlow$2$2(this, e, (ns0<? super PairingEngine$resubscribeToPairingFlow$2$2>) null), 3, (Object) null);
                                }
                            }
                        }

                        /* renamed from: B */
                        public final void mo40466B(String str, nx1 nx1, rc2<? super Throwable, r37> rc2) {
                            vx2.m53591g(str, "topic");
                            vx2.m53591g(nx1, "expiry");
                            vx2.m53591g(rc2, "onFailure");
                            kl4 f = this.f27197f.mo40448f(new es6(str));
                            if (f != null) {
                                if (!mo40477v(f)) {
                                    f = null;
                                }
                                if (f == null) {
                                    rc2.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str));
                                    return;
                                }
                                this.f27197f.mo40444b(new es6(str), new nx1(f.mo44826a().mo46241a() + nx1.mo46241a()));
                                return;
                            }
                            rc2.invoke(new CannotFindSequenceForTopic("Cannot find sequence for given topic: " + str));
                        }

                        /* renamed from: C */
                        public final void mo40467C(String str, AppMetaData appMetaData, AppMetaDataType appMetaDataType) {
                            vx2.m53591g(str, "topic");
                            vx2.m53591g(appMetaData, "metadata");
                            vx2.m53591g(appMetaDataType, "metaDataType");
                            this.f27194c.mo40435a(new es6(str), appMetaData, appMetaDataType);
                        }

                        /* renamed from: m */
                        public final void mo40468m(String str, rc2<? super Throwable, r37> rc2) {
                            r37 r37;
                            vx2.m53591g(str, "topic");
                            vx2.m53591g(rc2, "onFailure");
                            kl4 f = this.f27197f.mo40448f(new es6(str));
                            if (f != null) {
                                if (mo40477v(f)) {
                                    this.f27197f.mo40447e(f.mo44832f());
                                } else {
                                    rc2.invoke(new IllegalStateException("Pairing for topic " + str + " is expired"));
                                }
                                r37 = r37.f33317a;
                            } else {
                                r37 = null;
                            }
                            if (r37 == null) {
                                rc2.invoke(new IllegalStateException("Pairing for topic " + str + " does not exist"));
                            }
                        }

                        /* renamed from: n */
                        public final y23 mo40469n() {
                            return e52.m57232x(e52.m57202C(new PairingEngine$collectJsonRpcRequestsFlow$$inlined$filter$1(this.f27196e.mo40292e()), new PairingEngine$collectJsonRpcRequestsFlow$2(this, (ns0<? super PairingEngine$collectJsonRpcRequestsFlow$2>) null)), bh7.m32535a());
                        }

                        /* renamed from: o */
                        public final xz5<aq1> mo40470o() {
                            return this.f27203l;
                        }

                        /* renamed from: p */
                        public final r04<InternalError> mo40471p() {
                            return this.f27204m;
                        }

                        /* renamed from: q */
                        public final z42<InternalError> mo40472q() {
                            return (z42) this.f27205n.getValue();
                        }

                        /* renamed from: r */
                        public final List<kl4> mo40473r() {
                            boolean z;
                            List<kl4> d = this.f27197f.mo40446d();
                            ArrayList arrayList = new ArrayList();
                            for (T next : d) {
                                kl4 kl4 = (kl4) next;
                                if (!mo40477v(kl4) || !kl4.mo44834h()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    arrayList.add(next);
                                }
                            }
                            return arrayList;
                        }

                        /* renamed from: s */
                        public final String mo40474s() {
                            return CollectionsKt___CollectionsKt.m47338i0(this.f27199h, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, PairingEngine$registeredMethods$1.INSTANCE, 30, (Object) null);
                        }

                        /* renamed from: t */
                        public final xz5<es6> mo40475t() {
                            return this.f27201j;
                        }

                        /* renamed from: u */
                        public final boolean mo40476u(String str) {
                            kl4 f = this.f27197f.mo40448f(new es6(str));
                            if (f == null) {
                                return false;
                            }
                            return mo40477v(f);
                        }

                        /* renamed from: v */
                        public final boolean mo40477v(kl4 kl4) {
                            boolean z;
                            if (kl4.mo44826a().mo46241a() > fq6.m44369a()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new PairingEngine$isValid$1$1(this, kl4, (ns0<? super PairingEngine$isValid$1$1>) null), 3, (Object) null);
                            }
                            return z;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
                        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                        /* renamed from: w */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.Object mo40478w(p000.rf7 r12, com.walletconnect.android.pairing.model.PairingParams.DeleteParams r13, p000.ns0<? super p000.r37> r14) {
                            /*
                                r11 = this;
                                boolean r0 = r14 instanceof com.walletconnect.android.pairing.engine.domain.PairingEngine$onPairingDelete$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r14
                                com.walletconnect.android.pairing.engine.domain.PairingEngine$onPairingDelete$1 r0 = (com.walletconnect.android.pairing.engine.domain.PairingEngine$onPairingDelete$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                com.walletconnect.android.pairing.engine.domain.PairingEngine$onPairingDelete$1 r0 = new com.walletconnect.android.pairing.engine.domain.PairingEngine$onPairingDelete$1
                                r0.<init>(r11, r14)
                            L_0x0018:
                                java.lang.Object r14 = r0.result
                                java.lang.Object r1 = p000.wx2.m54101d()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0043
                                if (r2 != r3) goto L_0x003b
                                java.lang.Object r12 = r0.L$2
                                ny2 r12 = (p000.ny2) r12
                                java.lang.Object r13 = r0.L$1
                                rf7 r13 = (p000.rf7) r13
                                java.lang.Object r0 = r0.L$0
                                com.walletconnect.android.pairing.engine.domain.PairingEngine r0 = (com.walletconnect.android.pairing.engine.domain.PairingEngine) r0
                                p000.hg5.m45199b(r14)     // Catch:{ Exception -> 0x0036 }
                                goto L_0x00d6
                            L_0x0036:
                                r14 = move-exception
                                r3 = r12
                                r1 = r13
                                goto L_0x00de
                            L_0x003b:
                                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                                r12.<init>(r13)
                                throw r12
                            L_0x0043:
                                p000.hg5.m45199b(r14)
                                ny2 r14 = new ny2
                                com.walletconnect.android.internal.common.model.Tags r5 = com.walletconnect.android.internal.common.model.Tags.PAIRING_DELETE_RESPONSE
                                ky6 r6 = new ky6
                                long r7 = p000.fq6.m44370b()
                                r6.<init>(r7)
                                r7 = 0
                                r8 = 4
                                r9 = 0
                                r4 = r14
                                r4.<init>(r5, r6, r7, r8, r9)
                                es6 r2 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                java.lang.String r2 = r2.mo42395a()     // Catch:{ Exception -> 0x00d9 }
                                boolean r2 = r11.mo40476u(r2)     // Catch:{ Exception -> 0x00d9 }
                                if (r2 != 0) goto L_0x0088
                                com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface r0 = r11.f27196e     // Catch:{ Exception -> 0x00d9 }
                                n37$b r2 = new n37$b     // Catch:{ Exception -> 0x00d9 }
                                java.lang.String r13 = "Pairing"
                                es6 r1 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                java.lang.String r1 = r1.mo42395a()     // Catch:{ Exception -> 0x00d9 }
                                r2.<init>(r13, r1)     // Catch:{ Exception -> 0x00d9 }
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 120(0x78, float:1.68E-43)
                                r9 = 0
                                r1 = r12
                                r3 = r14
                                com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface.DefaultImpls.m42230c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00d9 }
                                r37 r12 = p000.r37.f33317a     // Catch:{ Exception -> 0x00d9 }
                                return r12
                            L_0x0088:
                                ra3 r2 = r11.f27195d     // Catch:{ Exception -> 0x00d9 }
                                es6 r4 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                java.lang.String r4 = r4.mo42395a()     // Catch:{ Exception -> 0x00d9 }
                                r2.mo47352a(r4)     // Catch:{ Exception -> 0x00d9 }
                                com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface r5 = r11.f27196e     // Catch:{ Exception -> 0x00d9 }
                                es6 r6 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                r7 = 0
                                r8 = 0
                                r9 = 6
                                r10 = 0
                                com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface.DefaultImpls.m42234g(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00d9 }
                                ol4 r2 = r11.f27197f     // Catch:{ Exception -> 0x00d9 }
                                es6 r4 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                r2.mo40443a(r4)     // Catch:{ Exception -> 0x00d9 }
                                kv3 r2 = r11.f27194c     // Catch:{ Exception -> 0x00d9 }
                                es6 r4 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                r2.mo40438d(r4)     // Catch:{ Exception -> 0x00d9 }
                                r04<aq1> r2 = r11.f27202k     // Catch:{ Exception -> 0x00d9 }
                                aq1$a r4 = new aq1$a     // Catch:{ Exception -> 0x00d9 }
                                es6 r5 = r12.mo47400d()     // Catch:{ Exception -> 0x00d9 }
                                java.lang.String r5 = r5.mo42395a()     // Catch:{ Exception -> 0x00d9 }
                                java.lang.String r13 = r13.mo40508b()     // Catch:{ Exception -> 0x00d9 }
                                r4.<init>(r5, r13)     // Catch:{ Exception -> 0x00d9 }
                                r0.L$0 = r11     // Catch:{ Exception -> 0x00d9 }
                                r0.L$1 = r12     // Catch:{ Exception -> 0x00d9 }
                                r0.L$2 = r14     // Catch:{ Exception -> 0x00d9 }
                                r0.label = r3     // Catch:{ Exception -> 0x00d9 }
                                java.lang.Object r12 = r2.emit(r4, r0)     // Catch:{ Exception -> 0x00d9 }
                                if (r12 != r1) goto L_0x00d6
                                return r1
                            L_0x00d6:
                                r37 r12 = p000.r37.f33317a
                                return r12
                            L_0x00d9:
                                r13 = move-exception
                                r0 = r11
                                r1 = r12
                                r3 = r14
                                r14 = r13
                            L_0x00de:
                                com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface r0 = r0.f27196e
                                n37$a r2 = new n37$a
                                java.lang.String r12 = r14.getMessage()
                                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                                r13.<init>()
                                java.lang.String r14 = "Cannot delete pairing: "
                                r13.append(r14)
                                r13.append(r12)
                                java.lang.String r12 = r13.toString()
                                r2.<init>(r12)
                                r4 = 0
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 120(0x78, float:1.68E-43)
                                r9 = 0
                                com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface.DefaultImpls.m42230c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                r37 r12 = p000.r37.f33317a
                                return r12
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.pairing.engine.domain.PairingEngine.mo40478w(rf7, com.walletconnect.android.pairing.model.PairingParams$DeleteParams, ns0):java.lang.Object");
                        }

                        /* renamed from: x */
                        public final void mo40479x(rf7 rf7) {
                            JsonRpcInteractorInterface.DefaultImpls.m42232e(this.f27196e, rf7, new ny2(Tags.PAIRING_PING, new ky6(fq6.m44373e()), false, 4, (DefaultConstructorMarker) null), (EnvelopeType) null, (qm4) null, 12, (Object) null);
                        }

                        /* renamed from: y */
                        public final void mo40480y(String str, pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
                            vx2.m53591g(str, "uri");
                            vx2.m53591g(pc2, "onSuccess");
                            vx2.m53591g(rc2, "onFailure");
                            hh7 a = z77.f35998a.mo49801a(str);
                            if (a == null) {
                                rc2.invoke(new MalformedWalletConnectUri("Pairing URI string is invalid."));
                            } else if (mo40476u(a.mo43299d().mo42395a())) {
                                rc2.invoke(new PairWithExistingPairingIsNotAllowed("Pair with existing pairing is not allowed"));
                            } else {
                                kl4 kl4 = new kl4(a, mo40474s());
                                this.f27195d.mo47356e(yj6.m54788b(a.mo43298c()), a.mo43299d().mo42395a());
                                try {
                                    this.f27197f.mo40445c(kl4);
                                    this.f27196e.mo40294g(kl4.mo44832f(), new PairingEngine$pair$1(pc2), new PairingEngine$pair$2(rc2));
                                } catch (Exception e) {
                                    this.f27195d.mo47352a(a.mo43299d().mo42395a());
                                    JsonRpcInteractorInterface.DefaultImpls.m42234g(this.f27196e, kl4.mo44832f(), (pc2) null, (rc2) null, 6, (Object) null);
                                    rc2.invoke(e);
                                }
                            }
                        }

                        /* renamed from: z */
                        public final void mo40481z(String... strArr) {
                            vx2.m53591g(strArr, "method");
                            hk0.m45266A(this.f27199h, strArr);
                        }
                    }
