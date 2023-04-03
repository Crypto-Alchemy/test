package com.walletconnect.android.internal.common.json_rpc.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1", mo48632f = "JsonRpcInteractor.kt", mo48633l = {237}, mo48634m = "invokeSuspend")
/* compiled from: JsonRpcInteractor.kt */
public final class JsonRpcInteractor$manageSubscriptions$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ JsonRpcInteractor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcInteractor$manageSubscriptions$1(JsonRpcInteractor jsonRpcInteractor, ns0<? super JsonRpcInteractor$manageSubscriptions$1> ns0) {
        super(2, ns0);
        this.this$0 = jsonRpcInteractor;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new JsonRpcInteractor$manageSubscriptions$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((JsonRpcInteractor$manageSubscriptions$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            C5555xc6b50280 jsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1 = new C5555xc6b50280(this.this$0.f27102a.mo40730b(), this.this$0);
            final JsonRpcInteractor jsonRpcInteractor = this.this$0;
            C55582 r5 = new a52() {
                /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(kotlin.Pair<java.lang.String, p000.es6> r5, p000.ns0<? super p000.r37> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2$emit$1 r0 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2$emit$1 r0 = new com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2$emit$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p000.wx2.m54101d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0037
                        if (r2 != r3) goto L_0x002f
                        java.lang.Object r5 = r0.L$0
                        com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1$2 r5 = (com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1.C55582) r5
                        p000.hg5.m45199b(r6)     // Catch:{ Exception -> 0x002d }
                        goto L_0x007a
                    L_0x002d:
                        r6 = move-exception
                        goto L_0x0060
                    L_0x002f:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0037:
                        p000.hg5.m45199b(r6)
                        java.lang.Object r6 = r5.component1()
                        java.lang.String r6 = (java.lang.String) r6
                        java.lang.Object r5 = r5.component2()
                        es6 r5 = (p000.es6) r5
                        int r2 = r6.length()
                        if (r2 <= 0) goto L_0x004e
                        r2 = r3
                        goto L_0x004f
                    L_0x004e:
                        r2 = 0
                    L_0x004f:
                        if (r2 == 0) goto L_0x007a
                        com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r2 = r1     // Catch:{ Exception -> 0x005e }
                        r0.L$0 = r4     // Catch:{ Exception -> 0x005e }
                        r0.label = r3     // Catch:{ Exception -> 0x005e }
                        java.lang.Object r5 = r2.mo40286C(r6, r5, r0)     // Catch:{ Exception -> 0x005e }
                        if (r5 != r1) goto L_0x007a
                        return r1
                    L_0x005e:
                        r6 = move-exception
                        r5 = r4
                    L_0x0060:
                        com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor r5 = r1
                        java.lang.String r6 = p000.ru1.m51327b(r6)
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "ManSub: "
                        r0.append(r1)
                        r0.append(r6)
                        java.lang.String r6 = r0.toString()
                        r5.mo40301y(r6)
                    L_0x007a:
                        r37 r5 = p000.r37.f33317a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.json_rpc.domain.JsonRpcInteractor$manageSubscriptions$1.C55582.emit(kotlin.Pair, ns0):java.lang.Object");
                }
            };
            this.label = 1;
            if (jsonRpcInteractor$manageSubscriptions$1$invokeSuspend$$inlined$map$1.mo8646a(r5, this) == d) {
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
