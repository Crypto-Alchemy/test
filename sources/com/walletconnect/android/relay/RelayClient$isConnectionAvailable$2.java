package com.walletconnect.android.relay;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lt86;", "", "invoke", "()Lt86;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: RelayClient.kt */
public final class RelayClient$isConnectionAvailable$2 extends Lambda implements pc2<t86<? extends Boolean>> {
    public static final RelayClient$isConnectionAvailable$2 INSTANCE = new RelayClient$isConnectionAvailable$2();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H@"}, mo44877d2 = {"", "wss", "internet", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.android.relay.RelayClient$isConnectionAvailable$2$1", mo48632f = "RelayClient.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.android.relay.RelayClient$isConnectionAvailable$2$1 */
    /* compiled from: RelayClient.kt */
    public static final class C55811 extends SuspendLambda implements id2<Boolean, Boolean, ns0<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public /* synthetic */ boolean Z$1;
        public int label;

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (ns0<? super Boolean>) (ns0) obj3);
        }

        public final Object invoke(boolean z, boolean z2, ns0<? super Boolean> ns0) {
            C55811 r0 = new C55811(ns0);
            r0.Z$0 = z;
            r0.Z$1 = z2;
            return r0.invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                boolean z2 = this.Z$0;
                boolean z3 = this.Z$1;
                if (!z2 || !z3) {
                    z = false;
                } else {
                    z = true;
                }
                return a40.m31670a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public RelayClient$isConnectionAvailable$2() {
        super(0);
    }

    public final t86<Boolean> invoke() {
        return e52.m57206G(e52.m57218j(RelayClient.f27249k, RelayClient.f27245g.mo40537x(), new C55811((ns0<? super C55811>) null)), bh7.m32535a(), i06.f38305a.mo52358c(), Boolean.FALSE);
    }
}
