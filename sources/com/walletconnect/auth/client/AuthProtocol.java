package com.walletconnect.auth.client;

import com.walletconnect.auth.engine.domain.AuthEngine;
import com.walletconnect.auth.p014di.EngineModuleKt$engineModule$1;
import com.walletconnect.auth.p014di.JsonRpcModuleKt$jsonRpcModule$1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.C6121jt;
import p000.C6197kt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/auth/client/AuthProtocol;", "", "Lkt$b;", "params", "Lkotlin/Function1;", "Ljt$b;", "Lr37;", "onError", "d", "Lot;", "delegate", "e", "Lkt$a;", "", "c", "b", "Lcom/walletconnect/auth/engine/domain/AuthEngine;", "a", "Lcom/walletconnect/auth/engine/domain/AuthEngine;", "authEngine", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AuthProtocol.kt */
public final class AuthProtocol {

    /* renamed from: b */
    public static final C5582a f27286b = new C5582a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final AuthProtocol f27287c = new AuthProtocol();

    /* renamed from: a */
    public AuthEngine f27288a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/auth/client/AuthProtocol$a;", "", "Lcom/walletconnect/auth/client/AuthProtocol;", "instance", "Lcom/walletconnect/auth/client/AuthProtocol;", "a", "()Lcom/walletconnect/auth/client/AuthProtocol;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.auth.client.AuthProtocol$a */
    /* compiled from: AuthProtocol.kt */
    public static final class C5582a {
        public C5582a() {
        }

        public /* synthetic */ C5582a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AuthProtocol mo40617a() {
            return AuthProtocol.f27287c;
        }
    }

    /* renamed from: b */
    public final void mo40613b() throws IllegalStateException {
        boolean z;
        if (this.f27288a != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("AuthClient needs to be initialized first using the initialize function".toString());
        }
    }

    /* renamed from: c */
    public String mo40614c(C6197kt.C6198a aVar) throws IllegalStateException {
        vx2.m53591g(aVar, "params");
        mo40613b();
        try {
            AuthEngine authEngine = this.f27288a;
            if (authEngine == null) {
                vx2.m53605u("authEngine");
                authEngine = null;
            }
            return authEngine.mo40675q(vx2.m53591g(aVar.mo45280b(), "<this>"), aVar.mo45279a());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo40615d(C6197kt.C6199b bVar, rc2<? super C6121jt.C6123b, r37> rc2) throws IllegalStateException {
        vx2.m53591g(bVar, "params");
        vx2.m53591g(rc2, "onError");
        try {
            hc3.m45112a().mo51896f(jx3.m59607b(false, JsonRpcModuleKt$jsonRpcModule$1.INSTANCE, 1, (Object) null), jx3.m59607b(false, EngineModuleKt$engineModule$1.INSTANCE, 1, (Object) null));
            AuthEngine authEngine = null;
            AuthEngine authEngine2 = (AuthEngine) hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(AuthEngine.class), (oz4) null, (pc2<? extends ul4>) null);
            this.f27288a = authEngine2;
            if (authEngine2 == null) {
                vx2.m53605u("authEngine");
            } else {
                authEngine = authEngine2;
            }
            authEngine.mo40680v();
        } catch (Exception e) {
            rc2.invoke(new C6121jt.C6123b(e));
        }
    }

    /* renamed from: e */
    public void mo40616e(C6324ot otVar) throws IllegalStateException {
        vx2.m53591g(otVar, "delegate");
        mo40613b();
        AuthEngine authEngine = this.f27288a;
        if (authEngine == null) {
            vx2.m53605u("authEngine");
            authEngine = null;
        }
        e52.m57232x(e52.m57202C(authEngine.mo40676r(), new AuthProtocol$setResponderDelegate$1(otVar, (ns0<? super AuthProtocol$setResponderDelegate$1>) null)), bh7.m32535a());
    }
}
