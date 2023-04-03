package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo44877d2 = {"La52;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.StartedLazily$command$1", mo48632f = "SharingStarted.kt", mo48633l = {155}, mo48634m = "invokeSuspend")
/* compiled from: SharingStarted.kt */
public final class StartedLazily$command$1 extends SuspendLambda implements fd2<a52<? super SharingCommand>, ns0<? super r37>, Object> {
    public final /* synthetic */ t86<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(t86<Integer> t86, ns0<? super StartedLazily$command$1> ns0) {
        super(2, ns0);
        this.$subscriptionCount = t86;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, ns0);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    public final Object invoke(a52<? super SharingCommand> a52, ns0<? super r37> ns0) {
        return ((StartedLazily$command$1) create(a52, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final a52 a52 = (a52) this.L$0;
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            t86<Integer> t86 = this.$subscriptionCount;
            C77911 r4 = new a52() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object mo55651a(int r5, p000.ns0<? super p000.r37> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p000.wx2.m54101d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        p000.hg5.m45199b(r6)
                        goto L_0x004b
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        p000.hg5.m45199b(r6)
                        if (r5 <= 0) goto L_0x004e
                        kotlin.jvm.internal.Ref$BooleanRef r5 = r1
                        boolean r6 = r5.element
                        if (r6 != 0) goto L_0x004e
                        r5.element = r3
                        a52<kotlinx.coroutines.flow.SharingCommand> r5 = r6
                        kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                        r0.label = r3
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L_0x004b
                        return r1
                    L_0x004b:
                        r37 r5 = p000.r37.f33317a
                        return r5
                    L_0x004e:
                        r37 r5 = p000.r37.f33317a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.C77911.mo55651a(int, ns0):java.lang.Object");
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, ns0 ns0) {
                    return mo55651a(((Number) obj).intValue(), ns0);
                }
            };
            this.label = 1;
            if (t86.mo8646a(r4, this) == d) {
                return d;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            hg5.m45199b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
