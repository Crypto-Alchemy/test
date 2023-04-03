package com.walletconnect.sign.client;

import com.walletconnect.sign.engine.domain.SignEngine;
import com.walletconnect.sign.engine.model.EngineDO;
import com.walletconnect.sign.p017di.CommonModuleKt$commonModule$1;
import com.walletconnect.sign.p017di.EngineModuleKt$engineModule$1;
import com.walletconnect.sign.p017di.JsonRpcModuleKt$jsonRpcModule$1;
import com.walletconnect.sign.p017di.StorageModuleKt$storageModule$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.a16;
import p000.b16;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b!\u0010\"J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J8\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J8\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0002R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo44877d2 = {"Lcom/walletconnect/sign/client/SignProtocol;", "", "Lb16$c;", "init", "Lkotlin/Function1;", "La16$c;", "Lr37;", "onError", "g", "Lo16;", "delegate", "i", "Lb16$a;", "approve", "onSuccess", "b", "Lb16$d;", "response", "h", "Lb16$b;", "disconnect", "d", "", "La16$f;", "f", "", "topic", "e", "c", "Lcom/walletconnect/sign/engine/domain/SignEngine;", "a", "Lcom/walletconnect/sign/engine/domain/SignEngine;", "signEngine", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignProtocol.kt */
public final class SignProtocol {

    /* renamed from: b */
    public static final C5624a f27514b = new C5624a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final SignProtocol f27515c = new SignProtocol();

    /* renamed from: a */
    public SignEngine f27516a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lcom/walletconnect/sign/client/SignProtocol$a;", "", "Lcom/walletconnect/sign/client/SignProtocol;", "instance", "Lcom/walletconnect/sign/client/SignProtocol;", "a", "()Lcom/walletconnect/sign/client/SignProtocol;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.client.SignProtocol$a */
    /* compiled from: SignProtocol.kt */
    public static final class C5624a {
        public C5624a() {
        }

        public /* synthetic */ C5624a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SignProtocol mo40979a() {
            return SignProtocol.f27515c;
        }
    }

    /* renamed from: b */
    public void mo40971b(b16.C3871a aVar, rc2<? super b16.C3871a, r37> rc2, rc2<? super a16.C3780c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(aVar, "approve");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        mo40972c();
        try {
            SignEngine signEngine = this.f27516a;
            if (signEngine == null) {
                vx2.m53605u("signEngine");
                signEngine = null;
            }
            signEngine.mo41193B(aVar.mo29411b(), og0.m49303l(aVar.mo29410a()), new SignProtocol$approveSession$1(rc2, aVar), new SignProtocol$approveSession$2(rc22));
        } catch (Exception e) {
            rc22.invoke(new a16.C3780c(e));
        }
    }

    /* renamed from: c */
    public final void mo40972c() throws IllegalStateException {
        boolean z;
        if (this.f27516a != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("SignClient needs to be initialized first using the initialize function".toString());
        }
    }

    /* renamed from: d */
    public void mo40973d(b16.C3872b bVar, rc2<? super b16.C3872b, r37> rc2, rc2<? super a16.C3780c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(bVar, "disconnect");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        mo40972c();
        try {
            SignEngine signEngine = this.f27516a;
            if (signEngine == null) {
                vx2.m53605u("signEngine");
                signEngine = null;
            }
            signEngine.mo41197G(bVar.mo29415a(), new SignProtocol$disconnect$1(rc2, bVar), new SignProtocol$disconnect$2(rc22));
        } catch (Exception e) {
            rc22.invoke(new a16.C3780c(e));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: a16$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: a16$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: a16$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: a16$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.a16.C3789f mo40974e(java.lang.String r5) throws java.lang.IllegalStateException {
        /*
            r4 = this;
            java.lang.String r0 = "topic"
            p000.vx2.m53591g(r5, r0)
            r4.mo40972c()
            com.walletconnect.sign.engine.domain.SignEngine r0 = r4.f27516a
            r1 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "signEngine"
            p000.vx2.m53605u(r0)
            r0 = r1
        L_0x0013:
            java.util.List r0 = r0.mo41199I()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.dk0.m43495u(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r0.next()
            com.walletconnect.sign.engine.model.EngineDO$d r3 = (com.walletconnect.sign.engine.model.EngineDO.C5661d) r3
            a16$f r3 = p000.og0.m49292a(r3)
            r2.add(r3)
            goto L_0x0026
        L_0x003a:
            java.util.Iterator r0 = r2.iterator()
        L_0x003e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r0.next()
            r3 = r2
            a16$f r3 = (p000.a16.C3789f) r3
            java.lang.String r3 = r3.mo28746d()
            boolean r3 = p000.vx2.m53586b(r3, r5)
            if (r3 == 0) goto L_0x003e
            r1 = r2
        L_0x0056:
            a16$f r1 = (p000.a16.C3789f) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.sign.client.SignProtocol.mo40974e(java.lang.String):a16$f");
    }

    /* renamed from: f */
    public List<a16.C3789f> mo40975f() throws IllegalStateException {
        mo40972c();
        SignEngine signEngine = this.f27516a;
        if (signEngine == null) {
            vx2.m53605u("signEngine");
            signEngine = null;
        }
        List<EngineDO.C5661d> I = signEngine.mo41199I();
        ArrayList arrayList = new ArrayList(dk0.m43495u(I, 10));
        for (EngineDO.C5661d a : I) {
            arrayList.add(og0.m49292a(a));
        }
        return arrayList;
    }

    /* renamed from: g */
    public void mo40976g(b16.C3873c cVar, rc2<? super a16.C3780c, r37> rc2) {
        vx2.m53591g(cVar, ZendeskBlipsProvider.ACTION_CORE_INIT);
        vx2.m53591g(rc2, "onError");
        try {
            hc3.m45112a().mo51896f(jx3.m59607b(false, CommonModuleKt$commonModule$1.INSTANCE, 1, (Object) null), jx3.m59607b(false, JsonRpcModuleKt$jsonRpcModule$1.INSTANCE, 1, (Object) null), jx3.m59607b(false, StorageModuleKt$storageModule$1.INSTANCE, 1, (Object) null), jx3.m59607b(false, EngineModuleKt$engineModule$1.INSTANCE, 1, (Object) null));
            SignEngine signEngine = null;
            SignEngine signEngine2 = (SignEngine) hc3.m45112a().mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(SignEngine.class), (oz4) null, (pc2<? extends ul4>) null);
            this.f27516a = signEngine2;
            if (signEngine2 == null) {
                vx2.m53605u("signEngine");
            } else {
                signEngine = signEngine2;
            }
            signEngine.mo41214X();
        } catch (Exception e) {
            rc2.invoke(new a16.C3780c(e));
        }
    }

    /* renamed from: h */
    public void mo40977h(b16.C3874d dVar, rc2<? super b16.C3874d, r37> rc2, rc2<? super a16.C3780c, r37> rc22) throws IllegalStateException {
        vx2.m53591g(dVar, "response");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        mo40972c();
        try {
            SignEngine signEngine = this.f27516a;
            if (signEngine == null) {
                vx2.m53605u("signEngine");
                signEngine = null;
            }
            signEngine.mo41212V(dVar.mo29423b(), og0.m49300i(dVar.mo29422a()), new SignProtocol$respond$1(rc2, dVar), new SignProtocol$respond$2(rc22));
        } catch (Exception e) {
            rc22.invoke(new a16.C3780c(e));
        }
    }

    /* renamed from: i */
    public void mo40978i(o16 o16) throws IllegalStateException {
        vx2.m53591g(o16, "delegate");
        mo40972c();
        SignEngine signEngine = this.f27516a;
        if (signEngine == null) {
            vx2.m53605u("signEngine");
            signEngine = null;
        }
        e52.m57232x(e52.m57202C(signEngine.mo41198H(), new SignProtocol$setWalletDelegate$1(o16, (ns0<? super SignProtocol$setWalletDelegate$1>) null)), bh7.m32535a());
    }
}
