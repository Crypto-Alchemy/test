package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001al\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001an\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a#\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\u000e\"\u0004\b\u0000\u0010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo44877d2 = {"T1", "T2", "R", "Lz42;", "flow", "Lkotlin/Function3;", "Lns0;", "", "transform", "c", "(Lz42;Lz42;Lid2;)Lz42;", "flow2", "b", "T", "Lkotlin/Function0;", "", "d", "()Lpc2;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Zip.kt */
public final /* synthetic */ class FlowKt__ZipKt {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/flow/FlowKt__ZipKt$a", "Lz42;", "La52;", "collector", "Lr37;", "a", "(La52;Lns0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C7788a implements z42<R> {

        /* renamed from: a */
        public final /* synthetic */ z42 f40428a;

        /* renamed from: d */
        public final /* synthetic */ z42 f40429d;

        /* renamed from: e */
        public final /* synthetic */ id2 f40430e;

        public C7788a(z42 z42, z42 z422, id2 id2) {
            this.f40428a = z42;
            this.f40429d = z422;
            this.f40430e = id2;
        }

        /* renamed from: a */
        public Object mo8646a(a52<? super R> a52, ns0<? super r37> ns0) {
            Object a = CombineKt.m63464a(a52, new z42[]{this.f40428a, this.f40429d}, FlowKt__ZipKt.m63380d(), new FlowKt__ZipKt$combine$1$1(this.f40430e, (ns0<? super FlowKt__ZipKt$combine$1$1>) null), ns0);
            if (a == wx2.m54101d()) {
                return a;
            }
            return r37.f33317a;
        }
    }

    /* renamed from: b */
    public static final <T1, T2, R> z42<R> m63378b(z42<? extends T1> z42, z42<? extends T2> z422, id2<? super T1, ? super T2, ? super ns0<? super R>, ? extends Object> id2) {
        return e52.m57229u(z42, z422, id2);
    }

    /* renamed from: c */
    public static final <T1, T2, R> z42<R> m63379c(z42<? extends T1> z42, z42<? extends T2> z422, id2<? super T1, ? super T2, ? super ns0<? super R>, ? extends Object> id2) {
        return new C7788a(z42, z422, id2);
    }

    /* renamed from: d */
    public static final <T> pc2<T[]> m63380d() {
        return FlowKt__ZipKt$nullArrayFactory$1.INSTANCE;
    }
}
