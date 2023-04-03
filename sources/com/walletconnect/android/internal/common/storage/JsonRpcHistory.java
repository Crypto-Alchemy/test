package com.walletconnect.android.internal.common.storage;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J2\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/storage/JsonRpcHistory;", "", "", "requestId", "Les6;", "topic", "", "method", "payload", "", "c", "response", "Lq63;", "f", "Lr37;", "b", "record", "e", "body", "d", "Lp63;", "a", "Lp63;", "jsonRpcHistoryQueries", "Lsk3;", "Lsk3;", "logger", "<init>", "(Lp63;Lsk3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JsonRpcHistory.kt */
public final class JsonRpcHistory {

    /* renamed from: a */
    public final p63 f27185a;

    /* renamed from: b */
    public final sk3 f27186b;

    public JsonRpcHistory(p63 p63, sk3 sk3) {
        vx2.m53591g(p63, "jsonRpcHistoryQueries");
        vx2.m53591g(sk3, "logger");
        this.f27185a = p63;
        this.f27186b = sk3;
    }

    /* renamed from: b */
    public final void mo40429b(es6 es6) {
        vx2.m53591g(es6, "topic");
        this.f27185a.mo40542K(es6.mo42395a());
    }

    /* renamed from: c */
    public final boolean mo40430c(long j, es6 es6, String str, String str2) {
        vx2.m53591g(es6, "topic");
        vx2.m53591g(str, "method");
        vx2.m53591g(str2, "payload");
        try {
            if (this.f27185a.mo40544R(j).mo47567c().booleanValue()) {
                this.f27185a.mo40543L(j, es6.mo42395a(), str, str2);
                if (this.f27185a.mo40551o().mo47567c().longValue() > 0) {
                    return true;
                }
                return false;
            }
            sk3 sk3 = this.f27186b;
            sk3.error("Duplicated JsonRpc RequestId: " + j);
            return false;
        } catch (Exception e) {
            this.f27186b.mo40252a(e);
            return false;
        }
    }

    /* renamed from: d */
    public final q63 mo40431d(long j, String str, String str2, String str3, String str4) {
        return new q63(j, str, str2, str3, str4);
    }

    /* renamed from: e */
    public final q63 mo40432e(q63 q63, long j, String str) {
        if (q63.mo46980c() != null) {
            sk3 sk3 = this.f27186b;
            sk3.log("Duplicated JsonRpc RequestId: " + j);
            return null;
        }
        this.f27185a.mo40546d(str, j);
        return q63;
    }

    /* renamed from: f */
    public final q63 mo40433f(long j, String str) {
        vx2.m53591g(str, "response");
        q63 q63 = (q63) this.f27185a.mo40545U(j, new JsonRpcHistory$updateRequestWithResponse$record$1(this)).mo47568d();
        if (q63 != null) {
            return mo40432e(q63, j, str);
        }
        this.f27186b.log("No JsonRpcRequest matching response");
        return null;
    }
}
