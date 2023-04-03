package com.walletconnect.android.internal.common.connection;

import com.walletconnect.foundation.network.data.ConnectionEvent;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.kg3;
import p000.op0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0007\u001a\u00020\u00062.\u0010\u0005\u001a*\u0012\u000e\b\u0000\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0000\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002H\u0001R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000f"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/connection/ManualConnectionLifecycle;", "Lkg3;", "Lnc6;", "Lkg3$a;", "kotlin.jvm.PlatformType", "p0", "Lr37;", "a", "Lyg3;", "Lyg3;", "lifecycleRegistry", "Lop0;", "connectionController", "<init>", "(Lop0;Lyg3;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ManualConnectionLifecycle.kt */
public final class ManualConnectionLifecycle implements kg3 {

    /* renamed from: a */
    public final yg3 f27100a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/data/ConnectionEvent;", "event", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "com.walletconnect.android.internal.common.connection.ManualConnectionLifecycle$1", mo48632f = "ManualConnectionLifecycle.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: com.walletconnect.android.internal.common.connection.ManualConnectionLifecycle$1 */
    /* compiled from: ManualConnectionLifecycle.kt */
    public static final class C55161 extends SuspendLambda implements fd2<ConnectionEvent, ns0<? super r37>, Object> {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ ManualConnectionLifecycle this$0;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: com.walletconnect.android.internal.common.connection.ManualConnectionLifecycle$1$a */
        /* compiled from: ManualConnectionLifecycle.kt */
        public /* synthetic */ class C5517a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f27101a;

            static {
                /*
                    com.walletconnect.foundation.network.data.ConnectionEvent[] r0 = com.walletconnect.foundation.network.data.ConnectionEvent.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.walletconnect.foundation.network.data.ConnectionEvent r1 = com.walletconnect.foundation.network.data.ConnectionEvent.CONNECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.walletconnect.foundation.network.data.ConnectionEvent r1 = com.walletconnect.foundation.network.data.ConnectionEvent.DISCONNECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f27101a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.android.internal.common.connection.ManualConnectionLifecycle.C55161.C5517a.<clinit>():void");
            }
        }

        {
            this.this$0 = r1;
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            C55161 r0 = new C55161(this.this$0, ns0);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ConnectionEvent connectionEvent, ns0<? super r37> ns0) {
            return ((C55161) create(connectionEvent, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                int i = C5517a.f27101a[((ConnectionEvent) this.L$0).ordinal()];
                if (i == 1) {
                    this.this$0.f27100a.onNext(kg3.C6147a.C6149b.f30871a);
                } else if (i == 2) {
                    this.this$0.f27100a.onNext(new kg3.C6147a.C6150c.C6152b((y06) null, 1, (DefaultConstructorMarker) null));
                }
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ManualConnectionLifecycle(op0 op0, yg3 yg3) {
        vx2.m53591g(op0, "connectionController");
        vx2.m53591g(yg3, "lifecycleRegistry");
        this.f27100a = yg3;
        if (op0 instanceof op0.C6322b) {
            e52.m57232x(e52.m57202C(((op0.C6322b) op0).mo46445a(), new C55161(this, (ns0<? super C55161>) null)), bh7.m32535a());
        }
    }

    /* renamed from: a */
    public void mo40232a(nc6<? super kg3.C6147a> nc6) {
        this.f27100a.mo40232a(nc6);
    }
}
