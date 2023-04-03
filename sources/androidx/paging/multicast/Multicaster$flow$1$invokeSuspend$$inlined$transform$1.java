package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "R", "La52;", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1", mo48632f = "Multicaster.kt", mo48633l = {215}, mo48634m = "invokeSuspend")
/* compiled from: Emitters.kt */
public final class Multicaster$flow$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    public final /* synthetic */ z42 $this_transform;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$invokeSuspend$$inlined$transform$1(z42 z42, ns0 ns0) {
        super(2, ns0);
        this.$this_transform = z42;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        Multicaster$flow$1$invokeSuspend$$inlined$transform$1 multicaster$flow$1$invokeSuspend$$inlined$transform$1 = new Multicaster$flow$1$invokeSuspend$$inlined$transform$1(this.$this_transform, ns0);
        multicaster$flow$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return multicaster$flow$1$invokeSuspend$$inlined$transform$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Multicaster$flow$1$invokeSuspend$$inlined$transform$1) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final a52 a52 = (a52) this.L$0;
            z42 z42 = this.$this_transform;
            C12011 r3 = new a52<ChannelManager.C1194b.C1196b.C1199c<T>>(this) {

                /* renamed from: a */
                public final /* synthetic */ Multicaster$flow$1$invokeSuspend$$inlined$transform$1 f6274a;

                {
                    this.f6274a = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, p000.ns0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1.C12011.C12021
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1 r0 = (androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1.C12011.C12021) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1 r0 = new androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1$1$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p000.wx2.m54101d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0035
                        if (r2 != r3) goto L_0x002d
                        java.lang.Object r5 = r0.L$0
                        androidx.paging.multicast.ChannelManager$b$b$c r5 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c) r5
                        p000.hg5.m45199b(r6)
                        goto L_0x004b
                    L_0x002d:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0035:
                        p000.hg5.m45199b(r6)
                        a52 r6 = r5
                        androidx.paging.multicast.ChannelManager$b$b$c r5 = (androidx.paging.multicast.ChannelManager.C1194b.C1196b.C1199c) r5
                        java.lang.Object r2 = r5.mo8790b()
                        r0.L$0 = r5
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r2, r0)
                        if (r6 != r1) goto L_0x004b
                        return r1
                    L_0x004b:
                        cm0 r5 = r5.mo8789a()
                        r37 r6 = p000.r37.f33317a
                        r5.mo50920l(r6)
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.multicast.Multicaster$flow$1$invokeSuspend$$inlined$transform$1.C12011.emit(java.lang.Object, ns0):java.lang.Object");
                }
            };
            this.label = 1;
            if (z42.mo8646a(r3, this) == d) {
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
