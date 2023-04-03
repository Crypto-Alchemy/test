package com.walletconnect.android.internal.common.json_rpc.domain;

import com.walletconnect.android.internal.common.JsonRpcResponse;
import com.walletconnect.android.internal.common.exception.NoRelayConnectionException;
import com.walletconnect.android.internal.common.model.EnvelopeType;
import com.walletconnect.android.internal.common.model.type.JsonRpcInteractorInterface;
import com.walletconnect.android.internal.common.storage.JsonRpcHistory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.n37;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010<\u001a\u00020:\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020@¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0016JX\u0010&\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#H\u0016JT\u0010)\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016JF\u0010/\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#H\u0016J*\u00100\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016JZ\u00103\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#H\u0016J8\u00104\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#H\u0016J2\u00105\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020#H\u0016R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010>R\u0014\u0010B\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020*0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00020*0G8\u0016X\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bD\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0C8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010ER \u0010O\u001a\b\u0012\u0004\u0012\u00020L0G8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010I\u001a\u0004\bN\u0010JR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0C8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010ER \u0010R\u001a\b\u0012\u0004\u0012\u00020P0G8\u0016X\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bH\u0010JR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040S8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010TR\u0014\u0010Y\u001a\u00020V8BX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020[0Z8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\\\u0002\u0004\n\u0002\b\u0019¨\u0006`"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/json_rpc/domain/JsonRpcInteractor;", "Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "Lr37;", "D", "", "decryptedMessage", "Les6;", "topic", "C", "(Ljava/lang/String;Les6;Lns0;)Ljava/lang/Object;", "Lcom/walletconnect/android/internal/common/model/sync/ClientJsonRpc;", "clientJsonRpc", "B", "(Lcom/walletconnect/android/internal/common/model/sync/ClientJsonRpc;Les6;Ljava/lang/String;Lns0;)Ljava/lang/Object;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;", "jsonRpcResult", "A", "(Lcom/walletconnect/android/internal/common/JsonRpcResponse$b;Lns0;)Ljava/lang/Object;", "Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;", "jsonRpcError", "z", "(Lcom/walletconnect/android/internal/common/JsonRpcResponse$JsonRpcError;Lns0;)Ljava/lang/Object;", "errorMessage", "y", "w", "Lny2;", "params", "Lo63;", "payload", "Lcom/walletconnect/android/internal/common/model/EnvelopeType;", "envelopeType", "Lqm4;", "participants", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onFailure", "h", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "response", "k", "Lrf7;", "request", "Lrg0;", "clientParams", "irnParams", "b", "i", "Lar1;", "error", "c", "g", "d", "Lfc5;", "a", "Lfc5;", "relay", "Lxh0;", "Lxh0;", "chaChaPolyCodec", "Lcom/walletconnect/android/internal/common/storage/JsonRpcHistory;", "Lcom/walletconnect/android/internal/common/storage/JsonRpcHistory;", "jsonRpcHistory", "Lsk3;", "Lsk3;", "logger", "Lr04;", "e", "Lr04;", "_clientSyncJsonRpc", "Lxz5;", "f", "Lxz5;", "()Lxz5;", "clientSyncJsonRpc", "Lsf7;", "_peerResponse", "j", "peerResponse", "Ljava/lang/InternalError;", "_internalErrors", "internalErrors", "", "Ljava/util/Map;", "subscriptions", "Lt63;", "x", "()Lt63;", "serializer", "Lt86;", "", "()Lt86;", "isConnectionAvailable", "<init>", "(Lfc5;Lxh0;Lcom/walletconnect/android/internal/common/storage/JsonRpcHistory;Lsk3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor implements JsonRpcInteractorInterface {

    /* renamed from: a */
    public final fc5 f27102a;

    /* renamed from: b */
    public final xh0 f27103b;

    /* renamed from: c */
    public final JsonRpcHistory f27104c;

    /* renamed from: d */
    public final sk3 f27105d;

    /* renamed from: e */
    public final r04<rf7> f27106e;

    /* renamed from: f */
    public final xz5<rf7> f27107f;

    /* renamed from: g */
    public final r04<sf7> f27108g;

    /* renamed from: h */
    public final xz5<sf7> f27109h;

    /* renamed from: i */
    public final r04<InternalError> f27110i;

    /* renamed from: j */
    public final xz5<InternalError> f27111j;

    /* renamed from: k */
    public final Map<String, String> f27112k = new LinkedHashMap();

    public JsonRpcInteractor(fc5 fc5, xh0 xh0, JsonRpcHistory jsonRpcHistory, sk3 sk3) {
        vx2.m53591g(fc5, "relay");
        vx2.m53591g(xh0, "chaChaPolyCodec");
        vx2.m53591g(jsonRpcHistory, "jsonRpcHistory");
        vx2.m53591g(sk3, "logger");
        this.f27102a = fc5;
        this.f27103b = xh0;
        this.f27104c = jsonRpcHistory;
        this.f27105d = sk3;
        r04<rf7> b = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f27106e = b;
        this.f27107f = e52.m57209a(b);
        r04<sf7> b2 = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f27108g = b2;
        this.f27109h = e52.m57209a(b2);
        r04<InternalError> b3 = yz5.m74703b(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f27110i = b3;
        this.f27111j = e52.m57209a(b3);
        mo40287D();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40284A(com.walletconnect.android.internal.common.JsonRpcResponse.C5515b r14, p000.ns0<? super p000.r37> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcResult$1 r0 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcResult$1 r0 = new com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcResult$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            java.lang.String r3 = "JsonRpcInteractor: Unknown result params"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r14 = r0.L$0
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r14 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor) r14
            p000.hg5.m45199b(r15)
            goto L_0x008b
        L_0x002f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0037:
            p000.hg5.m45199b(r15)
            t63 r15 = r13.mo40300x()
            java.lang.String r15 = r15.mo47996c(r14)
            if (r15 != 0) goto L_0x004a
            r13.mo40301y(r3)
            r37 r14 = p000.r37.f33317a
            return r14
        L_0x004a:
            com.walletconnect.android.internal.common.storage.JsonRpcHistory r2 = r13.f27104c
            long r5 = r14.getId()
            q63 r15 = r2.mo40433f(r5, r15)
            if (r15 == 0) goto L_0x0095
            t63 r2 = r13.mo40300x()
            java.lang.String r5 = r15.mo46979b()
            java.lang.String r6 = r15.mo46978a()
            rg0 r2 = r2.mo47994a(r5, r6)
            if (r2 == 0) goto L_0x008e
            com.walletconnect.android.internal.common.JsonRpcResponse$b r12 = new com.walletconnect.android.internal.common.JsonRpcResponse$b
            long r6 = r14.getId()
            java.lang.Object r9 = r14.mo40172b()
            r8 = 0
            r10 = 2
            r11 = 0
            r5 = r12
            r5.<init>(r6, r8, r9, r10, r11)
            r04<sf7> r14 = r13.f27108g
            sf7 r15 = p000.r63.m50953f(r15, r12, r2)
            r0.L$0 = r13
            r0.label = r4
            java.lang.Object r14 = r14.emit(r15, r0)
            if (r14 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r14 = r13
        L_0x008b:
            r37 r15 = p000.r37.f33317a
            goto L_0x0090
        L_0x008e:
            r15 = 0
            r14 = r13
        L_0x0090:
            if (r15 != 0) goto L_0x0095
            r14.mo40301y(r3)
        L_0x0095:
            r37 r14 = p000.r37.f33317a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor.mo40284A(com.walletconnect.android.internal.common.JsonRpcResponse$b, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40285B(com.walletconnect.android.internal.common.model.sync.ClientJsonRpc r11, p000.es6 r12, java.lang.String r13, p000.ns0<? super p000.r37> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleRequest$1 r0 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleRequest$1 r0 = new com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleRequest$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r11 = r0.L$0
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r11 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor) r11
            p000.hg5.m45199b(r14)
            goto L_0x0075
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            p000.hg5.m45199b(r14)
            com.walletconnect.android.internal.common.storage.JsonRpcHistory r4 = r10.f27104c
            long r5 = r11.mo40413a()
            java.lang.String r8 = r11.mo40415c()
            r7 = r12
            r9 = r13
            boolean r14 = r4.mo40430c(r5, r7, r8, r9)
            if (r14 == 0) goto L_0x0081
            t63 r14 = r10.mo40300x()
            java.lang.String r2 = r11.mo40415c()
            rg0 r9 = r14.mo47994a(r2, r13)
            if (r9 == 0) goto L_0x0078
            r04<rf7> r13 = r10.f27106e
            rf7 r14 = new rf7
            long r6 = r11.mo40413a()
            java.lang.String r8 = r11.mo40415c()
            r4 = r14
            r5 = r12
            r4.<init>(r5, r6, r8, r9)
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r13.emit(r14, r0)
            if (r11 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r11 = r10
        L_0x0075:
            r37 r12 = p000.r37.f33317a
            goto L_0x007a
        L_0x0078:
            r12 = 0
            r11 = r10
        L_0x007a:
            if (r12 != 0) goto L_0x0081
            java.lang.String r12 = "JsonRpcInteractor: Unknown request params"
            r11.mo40301y(r12)
        L_0x0081:
            r37 r11 = p000.r37.f33317a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor.mo40285B(com.walletconnect.android.internal.common.model.sync.ClientJsonRpc, es6, java.lang.String, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40286C(java.lang.String r8, p000.es6 r9, p000.ns0<? super p000.r37> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$2
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$2 r0 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$2 r0 = new com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$2
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0046
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r8 = r0.L$0
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r8 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor) r8
            p000.hg5.m45199b(r10)
            goto L_0x010f
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003d:
            java.lang.Object r8 = r0.L$0
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r8 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor) r8
            p000.hg5.m45199b(r10)
            goto L_0x00d1
        L_0x0046:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.L$0
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r8 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor) r8
            p000.hg5.m45199b(r10)
            goto L_0x0092
        L_0x0052:
            p000.hg5.m45199b(r10)
            t63 r10 = r7.mo40300x()
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch:{ all -> 0x006e }
            com.squareup.moshi.h r10 = r10.mo47995b()     // Catch:{ all -> 0x006e }
            java.lang.Class<com.walletconnect.android.internal.common.model.sync.ClientJsonRpc> r2 = com.walletconnect.android.internal.common.model.sync.ClientJsonRpc.class
            com.squareup.moshi.d r10 = r10.mo39408c(r2)     // Catch:{ all -> 0x006e }
            java.lang.Object r10 = r10.mo39362c(r8)     // Catch:{ all -> 0x006e }
            java.lang.Object r10 = kotlin.Result.m75635constructorimpl(r10)     // Catch:{ all -> 0x006e }
            goto L_0x0079
        L_0x006e:
            r10 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r10 = p000.hg5.m45198a(r10)
            java.lang.Object r10 = kotlin.Result.m75635constructorimpl(r10)
        L_0x0079:
            boolean r2 = kotlin.Result.m75640isFailureimpl(r10)
            if (r2 == 0) goto L_0x0080
            r10 = r6
        L_0x0080:
            com.walletconnect.android.internal.common.model.sync.ClientJsonRpc r10 = (com.walletconnect.android.internal.common.model.sync.ClientJsonRpc) r10
            if (r10 == 0) goto L_0x0096
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r8 = r7.mo40285B(r10, r9, r8, r0)
            if (r8 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r8 = r7
        L_0x0092:
            r37 r6 = p000.r37.f33317a
            goto L_0x0113
        L_0x0096:
            t63 r9 = r7.mo40300x()
            com.squareup.moshi.h r9 = r9.mo47995b()     // Catch:{ all -> 0x00ad }
            java.lang.Class<com.walletconnect.android.internal.common.JsonRpcResponse$b> r10 = com.walletconnect.android.internal.common.JsonRpcResponse.C5515b.class
            com.squareup.moshi.d r9 = r9.mo39408c(r10)     // Catch:{ all -> 0x00ad }
            java.lang.Object r9 = r9.mo39362c(r8)     // Catch:{ all -> 0x00ad }
            java.lang.Object r9 = kotlin.Result.m75635constructorimpl(r9)     // Catch:{ all -> 0x00ad }
            goto L_0x00b8
        L_0x00ad:
            r9 = move-exception
            kotlin.Result$a r10 = kotlin.Result.Companion
            java.lang.Object r9 = p000.hg5.m45198a(r9)
            java.lang.Object r9 = kotlin.Result.m75635constructorimpl(r9)
        L_0x00b8:
            boolean r10 = kotlin.Result.m75640isFailureimpl(r9)
            if (r10 == 0) goto L_0x00bf
            r9 = r6
        L_0x00bf:
            com.walletconnect.android.internal.common.JsonRpcResponse$b r9 = (com.walletconnect.android.internal.common.JsonRpcResponse.C5515b) r9
            if (r9 == 0) goto L_0x00d4
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r7.mo40284A(r9, r0)
            if (r8 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            r8 = r7
        L_0x00d1:
            r37 r6 = p000.r37.f33317a
            goto L_0x0113
        L_0x00d4:
            t63 r9 = r7.mo40300x()
            com.squareup.moshi.h r9 = r9.mo47995b()     // Catch:{ all -> 0x00eb }
            java.lang.Class<com.walletconnect.android.internal.common.JsonRpcResponse$JsonRpcError> r10 = com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError.class
            com.squareup.moshi.d r9 = r9.mo39408c(r10)     // Catch:{ all -> 0x00eb }
            java.lang.Object r8 = r9.mo39362c(r8)     // Catch:{ all -> 0x00eb }
            java.lang.Object r8 = kotlin.Result.m75635constructorimpl(r8)     // Catch:{ all -> 0x00eb }
            goto L_0x00f6
        L_0x00eb:
            r8 = move-exception
            kotlin.Result$a r9 = kotlin.Result.Companion
            java.lang.Object r8 = p000.hg5.m45198a(r8)
            java.lang.Object r8 = kotlin.Result.m75635constructorimpl(r8)
        L_0x00f6:
            boolean r9 = kotlin.Result.m75640isFailureimpl(r8)
            if (r9 == 0) goto L_0x00fd
            r8 = r6
        L_0x00fd:
            com.walletconnect.android.internal.common.JsonRpcResponse$JsonRpcError r8 = (com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError) r8
            if (r8 == 0) goto L_0x0112
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r7.mo40302z(r8, r0)
            if (r8 != r1) goto L_0x010e
            return r1
        L_0x010e:
            r8 = r7
        L_0x010f:
            r37 r6 = p000.r37.f33317a
            goto L_0x0113
        L_0x0112:
            r8 = r7
        L_0x0113:
            if (r6 != 0) goto L_0x011a
            java.lang.String r9 = "JsonRpcInteractor: Received unknown object type"
            r8.mo40301y(r9)
        L_0x011a:
            r37 r8 = p000.r37.f33317a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor.mo40286C(java.lang.String, es6, ns0):java.lang.Object");
    }

    /* renamed from: D */
    public final void mo40287D() {
        y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new JsonRpcInteractor$manageSubscriptions$1(this, (ns0<? super JsonRpcInteractor$manageSubscriptions$1>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public t86<Boolean> mo40288a() {
        return this.f27102a.mo40533a();
    }

    /* renamed from: b */
    public void mo40289b(rf7 rf7, rg0 rg0, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, rc2<? super Throwable, r37> rc2) {
        rc2<? super Throwable, r37> rc22 = rc2;
        rf7 rf72 = rf7;
        vx2.m53591g(rf7, "request");
        rg0 rg02 = rg0;
        vx2.m53591g(rg02, "clientParams");
        vx2.m53591g(ny2, "irnParams");
        vx2.m53591g(envelopeType, "envelopeType");
        vx2.m53591g(rc22, "onFailure");
        JsonRpcInteractorInterface.DefaultImpls.m42229b(this, rf7.mo47400d(), ny2, new JsonRpcResponse.C5515b(rf7.mo47397a(), (String) null, rg02, 2, (DefaultConstructorMarker) null), (pc2) null, new JsonRpcInteractor$respondWithParams$1(this, rc22), qm4, envelopeType, 8, (Object) null);
    }

    /* renamed from: c */
    public void mo40290c(rf7 rf7, ar1 ar1, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, rc2<? super rf7, r37> rc2, rc2<? super Throwable, r37> rc22) {
        rf7 rf72 = rf7;
        rc2<? super rf7, r37> rc23 = rc2;
        rc2<? super Throwable, r37> rc24 = rc22;
        vx2.m53591g(rf72, "request");
        vx2.m53591g(ar1, "error");
        vx2.m53591g(ny2, "irnParams");
        vx2.m53591g(envelopeType, "envelopeType");
        vx2.m53591g(rc23, "onSuccess");
        vx2.m53591g(rc24, "onFailure");
        sk3 sk3 = this.f27105d;
        String message = ar1.getMessage();
        int code = ar1.getCode();
        sk3.error("Responding with error: " + message + ": " + code);
        JsonRpcResponse.JsonRpcError jsonRpcError = new JsonRpcResponse.JsonRpcError(rf7.mo47397a(), (String) null, new JsonRpcResponse.C5514a(ar1.getCode(), ar1.getMessage()), 2, (DefaultConstructorMarker) null);
        try {
            mo40298k(rf7.mo47400d(), ny2, jsonRpcError, new JsonRpcInteractor$respondWithError$1(rc23, rf72), new JsonRpcInteractor$respondWithError$2(rc24, this), qm4, envelopeType);
        } catch (Exception e) {
            String b = ru1.m51327b(e);
            mo40301y("publishFailure; " + b);
        }
    }

    /* renamed from: d */
    public void mo40291d(es6 es6, pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(rc2, "onFailure");
        try {
            mo40299w();
            if (this.f27112k.containsKey(es6.mo42395a())) {
                this.f27102a.mo40733e(es6.mo42395a(), new sc6(String.valueOf(this.f27112k.get(es6.mo42395a()))).mo47732a(), new JsonRpcInteractor$unsubscribe$1(this, es6, pc2, rc2));
                return;
            }
            rc2.invoke(new NoSuchElementException(new n37.C6274b("Session", es6.mo42395a()).getMessage()));
        } catch (NoRelayConnectionException e) {
            rc2.invoke(e);
        }
    }

    /* renamed from: e */
    public xz5<rf7> mo40292e() {
        return this.f27107f;
    }

    /* renamed from: f */
    public xz5<InternalError> mo40293f() {
        return this.f27111j;
    }

    /* renamed from: g */
    public void mo40294g(es6 es6, rc2<? super es6, r37> rc2, rc2<? super Throwable, r37> rc22) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onFailure");
        try {
            mo40299w();
            this.f27102a.mo40732d(es6.mo42395a(), new JsonRpcInteractor$subscribe$1(this, es6, rc2, rc22));
        } catch (NoRelayConnectionException e) {
            rc22.invoke(e);
        }
    }

    /* renamed from: h */
    public void mo40295h(es6 es6, ny2 ny2, o63<?> o63, EnvelopeType envelopeType, qm4 qm4, pc2<r37> pc2, rc2<? super Throwable, r37> rc2) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(ny2, "params");
        vx2.m53591g(o63, "payload");
        vx2.m53591g(envelopeType, "envelopeType");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(rc2, "onFailure");
        try {
            mo40299w();
            String c = mo40300x().mo47996c(o63);
            if (c == null) {
                rc2.invoke(new IllegalStateException("JsonRpcInteractor: Unknown result params"));
                return;
            }
            if (this.f27104c.mo40430c(o63.getId(), es6, o63.getMethod(), c)) {
                this.f27102a.mo40731c(es6.mo42395a(), this.f27103b.mo48704a(es6, c, envelopeType, qm4), vx2.m53591g(ny2, "<this>"), new JsonRpcInteractor$publishJsonRpcRequest$1(pc2, rc2));
            }
        } catch (NoRelayConnectionException e) {
            rc2.invoke(e);
        }
    }

    /* renamed from: i */
    public void mo40296i(rf7 rf7, ny2 ny2, EnvelopeType envelopeType, qm4 qm4) {
        vx2.m53591g(rf7, "request");
        vx2.m53591g(ny2, "irnParams");
        vx2.m53591g(envelopeType, "envelopeType");
        try {
            JsonRpcInteractorInterface.DefaultImpls.m42229b(this, rf7.mo47400d(), ny2, new JsonRpcResponse.C5515b(rf7.mo47397a(), (String) null, Boolean.TRUE, 2, (DefaultConstructorMarker) null), (pc2) null, new JsonRpcInteractor$respondWithSuccess$1(this), qm4, envelopeType, 8, (Object) null);
        } catch (Exception e) {
            String b = ru1.m51327b(e);
            mo40301y("publishFailure; " + b);
        }
    }

    /* renamed from: j */
    public xz5<sf7> mo40297j() {
        return this.f27109h;
    }

    /* renamed from: k */
    public void mo40298k(es6 es6, ny2 ny2, JsonRpcResponse jsonRpcResponse, pc2<r37> pc2, rc2<? super Throwable, r37> rc2, qm4 qm4, EnvelopeType envelopeType) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(ny2, "params");
        vx2.m53591g(jsonRpcResponse, "response");
        vx2.m53591g(pc2, "onSuccess");
        vx2.m53591g(rc2, "onFailure");
        vx2.m53591g(envelopeType, "envelopeType");
        try {
            mo40299w();
            String c = mo40300x().mo47996c(r63.m50949b(jsonRpcResponse));
            if (c == null) {
                rc2.invoke(new IllegalStateException("JsonRpcInteractor: Unknown result params"));
                return;
            }
            this.f27102a.mo40731c(es6.mo42395a(), this.f27103b.mo48704a(es6, c, envelopeType, qm4), vx2.m53591g(ny2, "<this>"), new JsonRpcInteractor$publishJsonRpcResponse$1(this, jsonRpcResponse, c, pc2, rc2));
        } catch (NoRelayConnectionException e) {
            rc2.invoke(e);
        }
    }

    /* renamed from: w */
    public void mo40299w() {
        if (!this.f27102a.mo40533a().getValue().booleanValue()) {
            throw new NoRelayConnectionException("No connection available");
        }
    }

    /* renamed from: x */
    public final t63 mo40300x() {
        return (t63) hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(t63.class), (oz4) null, (pc2<? extends ul4>) null);
    }

    /* renamed from: y */
    public final void mo40301y(String str) {
        sk3 sk3 = this.f27105d;
        sk3.error("JsonRpcInteractor error: " + str);
        y23 unused = d50.m56748b(bh7.m32535a(), (CoroutineContext) null, (CoroutineStart) null, new JsonRpcInteractor$handleError$1(this, str, (ns0<? super JsonRpcInteractor$handleError$1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo40302z(com.walletconnect.android.internal.common.JsonRpcResponse.JsonRpcError r7, p000.ns0<? super p000.r37> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcError$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcError$1 r0 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcError$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcError$1 r0 = new com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$handleJsonRpcError$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p000.wx2.m54101d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r7 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor) r7
            p000.hg5.m45199b(r8)
            goto L_0x007e
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p000.hg5.m45199b(r8)
            t63 r8 = r6.mo40300x()
            java.lang.String r8 = r8.mo47996c(r7)
            if (r8 != 0) goto L_0x004a
            java.lang.String r7 = "JsonRpcInteractor: Unknown result params"
            r6.mo40301y(r7)
            r37 r7 = p000.r37.f33317a
            return r7
        L_0x004a:
            com.walletconnect.android.internal.common.storage.JsonRpcHistory r2 = r6.f27104c
            long r4 = r7.getId()
            q63 r8 = r2.mo40433f(r4, r8)
            if (r8 == 0) goto L_0x008a
            t63 r2 = r6.mo40300x()
            java.lang.String r4 = r8.mo46979b()
            java.lang.String r5 = r8.mo46978a()
            rg0 r2 = r2.mo47994a(r4, r5)
            if (r2 == 0) goto L_0x0081
            r04<sf7> r4 = r6.f27108g
            com.walletconnect.android.internal.common.JsonRpcResponse$JsonRpcError r7 = p000.vx2.m53591g(r7, "<this>")
            sf7 r7 = p000.r63.m50953f(r8, r7, r2)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r4.emit(r7, r0)
            if (r7 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r6
        L_0x007e:
            r37 r8 = p000.r37.f33317a
            goto L_0x0083
        L_0x0081:
            r8 = 0
            r7 = r6
        L_0x0083:
            if (r8 != 0) goto L_0x008a
            java.lang.String r8 = "JsonRpcInteractor: Unknown error params"
            r7.mo40301y(r8)
        L_0x008a:
            r37 r7 = p000.r37.f33317a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor.mo40302z(com.walletconnect.android.internal.common.JsonRpcResponse$JsonRpcError, ns0):java.lang.Object");
    }
}
