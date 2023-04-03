package com.walletconnect.android.internal.common.model.type;

import com.walletconnect.android.internal.common.JsonRpcResponse;
import com.walletconnect.android.internal.common.model.EnvelopeType;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H&J6\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H&J`\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H&J\\\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0011\u001a\u00020\u0010H&JJ\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H&J.\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&Jb\u0010!\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H&R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010$¨\u00061"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/type/JsonRpcInteractorInterface;", "", "Les6;", "topic", "Lkotlin/Function1;", "Lr37;", "onSuccess", "", "onFailure", "g", "Lkotlin/Function0;", "d", "Lny2;", "params", "Lo63;", "payload", "Lcom/walletconnect/android/internal/common/model/EnvelopeType;", "envelopeType", "Lqm4;", "participants", "h", "Lcom/walletconnect/android/internal/common/JsonRpcResponse;", "response", "k", "Lrf7;", "request", "Lrg0;", "clientParams", "irnParams", "b", "i", "Lar1;", "error", "c", "Lxz5;", "e", "()Lxz5;", "clientSyncJsonRpc", "Lsf7;", "j", "peerResponse", "Lt86;", "", "a", "()Lt86;", "isConnectionAvailable", "Ljava/lang/InternalError;", "f", "internalErrors", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcInteractorInterface.kt */
public interface JsonRpcInteractorInterface {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: JsonRpcInteractorInterface.kt */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ void m42228a(JsonRpcInteractorInterface jsonRpcInteractorInterface, es6 es6, ny2 ny2, o63 o63, EnvelopeType envelopeType, qm4 qm4, pc2 pc2, rc2 rc2, int i, Object obj) {
            EnvelopeType envelopeType2;
            qm4 qm42;
            JsonRpcInteractorInterface$publishJsonRpcRequest$1 jsonRpcInteractorInterface$publishJsonRpcRequest$1;
            JsonRpcInteractorInterface$publishJsonRpcRequest$2 jsonRpcInteractorInterface$publishJsonRpcRequest$2;
            if (obj == null) {
                if ((i & 8) != 0) {
                    envelopeType2 = EnvelopeType.ZERO;
                } else {
                    envelopeType2 = envelopeType;
                }
                if ((i & 16) != 0) {
                    qm42 = null;
                } else {
                    qm42 = qm4;
                }
                if ((i & 32) != 0) {
                    jsonRpcInteractorInterface$publishJsonRpcRequest$1 = JsonRpcInteractorInterface$publishJsonRpcRequest$1.INSTANCE;
                } else {
                    jsonRpcInteractorInterface$publishJsonRpcRequest$1 = pc2;
                }
                if ((i & 64) != 0) {
                    jsonRpcInteractorInterface$publishJsonRpcRequest$2 = JsonRpcInteractorInterface$publishJsonRpcRequest$2.INSTANCE;
                } else {
                    jsonRpcInteractorInterface$publishJsonRpcRequest$2 = rc2;
                }
                jsonRpcInteractorInterface.mo40295h(es6, ny2, o63, envelopeType2, qm42, jsonRpcInteractorInterface$publishJsonRpcRequest$1, jsonRpcInteractorInterface$publishJsonRpcRequest$2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishJsonRpcRequest");
        }

        /* renamed from: b */
        public static /* synthetic */ void m42229b(JsonRpcInteractorInterface jsonRpcInteractorInterface, es6 es6, ny2 ny2, JsonRpcResponse jsonRpcResponse, pc2 pc2, rc2 rc2, qm4 qm4, EnvelopeType envelopeType, int i, Object obj) {
            JsonRpcInteractorInterface$publishJsonRpcResponse$1 jsonRpcInteractorInterface$publishJsonRpcResponse$1;
            JsonRpcInteractorInterface$publishJsonRpcResponse$2 jsonRpcInteractorInterface$publishJsonRpcResponse$2;
            qm4 qm42;
            EnvelopeType envelopeType2;
            if (obj == null) {
                if ((i & 8) != 0) {
                    jsonRpcInteractorInterface$publishJsonRpcResponse$1 = JsonRpcInteractorInterface$publishJsonRpcResponse$1.INSTANCE;
                } else {
                    jsonRpcInteractorInterface$publishJsonRpcResponse$1 = pc2;
                }
                if ((i & 16) != 0) {
                    jsonRpcInteractorInterface$publishJsonRpcResponse$2 = JsonRpcInteractorInterface$publishJsonRpcResponse$2.INSTANCE;
                } else {
                    jsonRpcInteractorInterface$publishJsonRpcResponse$2 = rc2;
                }
                if ((i & 32) != 0) {
                    qm42 = null;
                } else {
                    qm42 = qm4;
                }
                if ((i & 64) != 0) {
                    envelopeType2 = EnvelopeType.ZERO;
                } else {
                    envelopeType2 = envelopeType;
                }
                jsonRpcInteractorInterface.mo40298k(es6, ny2, jsonRpcResponse, jsonRpcInteractorInterface$publishJsonRpcResponse$1, jsonRpcInteractorInterface$publishJsonRpcResponse$2, qm42, envelopeType2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishJsonRpcResponse");
        }

        /* renamed from: c */
        public static /* synthetic */ void m42230c(JsonRpcInteractorInterface jsonRpcInteractorInterface, rf7 rf7, ar1 ar1, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, rc2 rc2, rc2 rc22, int i, Object obj) {
            EnvelopeType envelopeType2;
            qm4 qm42;
            JsonRpcInteractorInterface$respondWithError$1 jsonRpcInteractorInterface$respondWithError$1;
            JsonRpcInteractorInterface$respondWithError$2 jsonRpcInteractorInterface$respondWithError$2;
            if (obj == null) {
                if ((i & 8) != 0) {
                    envelopeType2 = EnvelopeType.ZERO;
                } else {
                    envelopeType2 = envelopeType;
                }
                if ((i & 16) != 0) {
                    qm42 = null;
                } else {
                    qm42 = qm4;
                }
                if ((i & 32) != 0) {
                    jsonRpcInteractorInterface$respondWithError$1 = JsonRpcInteractorInterface$respondWithError$1.INSTANCE;
                } else {
                    jsonRpcInteractorInterface$respondWithError$1 = rc2;
                }
                if ((i & 64) != 0) {
                    jsonRpcInteractorInterface$respondWithError$2 = JsonRpcInteractorInterface$respondWithError$2.INSTANCE;
                } else {
                    jsonRpcInteractorInterface$respondWithError$2 = rc22;
                }
                jsonRpcInteractorInterface.mo40290c(rf7, ar1, ny2, envelopeType2, qm42, jsonRpcInteractorInterface$respondWithError$1, jsonRpcInteractorInterface$respondWithError$2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithError");
        }

        /* renamed from: d */
        public static /* synthetic */ void m42231d(JsonRpcInteractorInterface jsonRpcInteractorInterface, rf7 rf7, rg0 rg0, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    envelopeType = EnvelopeType.ZERO;
                }
                EnvelopeType envelopeType2 = envelopeType;
                if ((i & 16) != 0) {
                    qm4 = null;
                }
                jsonRpcInteractorInterface.mo40289b(rf7, rg0, ny2, envelopeType2, qm4, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithParams");
        }

        /* renamed from: e */
        public static /* synthetic */ void m42232e(JsonRpcInteractorInterface jsonRpcInteractorInterface, rf7 rf7, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    envelopeType = EnvelopeType.ZERO;
                }
                if ((i & 8) != 0) {
                    qm4 = null;
                }
                jsonRpcInteractorInterface.mo40296i(rf7, ny2, envelopeType, qm4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithSuccess");
        }

        /* renamed from: f */
        public static /* synthetic */ void m42233f(JsonRpcInteractorInterface jsonRpcInteractorInterface, es6 es6, rc2 rc2, rc2 rc22, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rc2 = JsonRpcInteractorInterface$subscribe$1.INSTANCE;
                }
                if ((i & 4) != 0) {
                    rc22 = JsonRpcInteractorInterface$subscribe$2.INSTANCE;
                }
                jsonRpcInteractorInterface.mo40294g(es6, rc2, rc22);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
        }

        /* renamed from: g */
        public static /* synthetic */ void m42234g(JsonRpcInteractorInterface jsonRpcInteractorInterface, es6 es6, pc2 pc2, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    pc2 = JsonRpcInteractorInterface$unsubscribe$1.INSTANCE;
                }
                if ((i & 4) != 0) {
                    rc2 = JsonRpcInteractorInterface$unsubscribe$2.INSTANCE;
                }
                jsonRpcInteractorInterface.mo40291d(es6, pc2, rc2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsubscribe");
        }
    }

    /* renamed from: a */
    t86<Boolean> mo40288a();

    /* renamed from: b */
    void mo40289b(rf7 rf7, rg0 rg0, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, rc2<? super Throwable, r37> rc2);

    /* renamed from: c */
    void mo40290c(rf7 rf7, ar1 ar1, ny2 ny2, EnvelopeType envelopeType, qm4 qm4, rc2<? super rf7, r37> rc2, rc2<? super Throwable, r37> rc22);

    /* renamed from: d */
    void mo40291d(es6 es6, pc2<r37> pc2, rc2<? super Throwable, r37> rc2);

    /* renamed from: e */
    xz5<rf7> mo40292e();

    /* renamed from: f */
    xz5<InternalError> mo40293f();

    /* renamed from: g */
    void mo40294g(es6 es6, rc2<? super es6, r37> rc2, rc2<? super Throwable, r37> rc22);

    /* renamed from: h */
    void mo40295h(es6 es6, ny2 ny2, o63<?> o63, EnvelopeType envelopeType, qm4 qm4, pc2<r37> pc2, rc2<? super Throwable, r37> rc2);

    /* renamed from: i */
    void mo40296i(rf7 rf7, ny2 ny2, EnvelopeType envelopeType, qm4 qm4);

    /* renamed from: j */
    xz5<sf7> mo40297j();

    /* renamed from: k */
    void mo40298k(es6 es6, ny2 ny2, JsonRpcResponse jsonRpcResponse, pc2<r37> pc2, rc2<? super Throwable, r37> rc2, qm4 qm4, EnvelopeType envelopeType);
}
