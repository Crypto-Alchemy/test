package java8.util.stream;

import java8.util.stream.C6068d;
import java8.util.stream.C6095h;

/* renamed from: java8.util.stream.g */
/* compiled from: ReferencePipeline */
public abstract class C6088g<P_IN, P_OUT> extends C6064a<P_IN, P_OUT, ha6<P_OUT>> implements ha6<P_OUT> {

    /* renamed from: java8.util.stream.g$a */
    /* compiled from: ReferencePipeline */
    public class C6089a extends C6094d<P_OUT, P_OUT> {

        /* renamed from: l */
        public final /* synthetic */ ju4 f30446l;

        /* renamed from: java8.util.stream.g$a$a */
        /* compiled from: ReferencePipeline */
        public class C6090a extends C6095h.C6096a<P_OUT, P_OUT> {
            public C6090a(C6095h hVar) {
                super(hVar);
            }

            public void accept(P_OUT p_out) {
                if (C6089a.this.f30446l.test(p_out)) {
                    this.f30452a.accept(p_out);
                }
            }

            /* renamed from: e */
            public void mo44326e(long j) {
                this.f30452a.mo44326e(-1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6089a(C6064a aVar, StreamShape streamShape, int i, ju4 ju4) {
            super(aVar, streamShape, i);
            this.f30446l = ju4;
        }

        /* renamed from: s */
        public C6095h<P_OUT> mo44364s(int i, C6095h<P_OUT> hVar) {
            return new C6090a(hVar);
        }
    }

    /* renamed from: java8.util.stream.g$b */
    /* compiled from: ReferencePipeline */
    public class C6091b extends C6094d<P_OUT, R> {

        /* renamed from: l */
        public final /* synthetic */ ld2 f30449l;

        /* renamed from: java8.util.stream.g$b$a */
        /* compiled from: ReferencePipeline */
        public class C6092a extends C6095h.C6096a<P_OUT, R> {
            public C6092a(C6095h hVar) {
                super(hVar);
            }

            public void accept(P_OUT p_out) {
                this.f30452a.accept(C6091b.this.f30449l.apply(p_out));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6091b(C6064a aVar, StreamShape streamShape, int i, ld2 ld2) {
            super(aVar, streamShape, i);
            this.f30449l = ld2;
        }

        /* renamed from: s */
        public C6095h<P_OUT> mo44364s(int i, C6095h<R> hVar) {
            return new C6092a(hVar);
        }
    }

    /* renamed from: java8.util.stream.g$c */
    /* compiled from: ReferencePipeline */
    public static class C6093c<E_IN, E_OUT> extends C6088g<E_IN, E_OUT> {
        public C6093c(z66<?> z66, int i, boolean z) {
            super(z66, i, z);
        }

        /* renamed from: r */
        public final boolean mo44363r() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public final C6095h<E_IN> mo44364s(int i, C6095h<E_OUT> hVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: v */
        public void mo44378v(xq0<? super E_OUT> xq0) {
            if (!mo44360n()) {
                mo44366u().mo29473a(xq0);
            } else {
                C6088g.super.mo44378v(xq0);
            }
        }
    }

    /* renamed from: java8.util.stream.g$d */
    /* compiled from: ReferencePipeline */
    public static abstract class C6094d<E_IN, E_OUT> extends C6088g<E_IN, E_OUT> {
        public C6094d(C6064a<?, E_IN, ?> aVar, StreamShape streamShape, int i) {
            super(aVar, i);
        }

        /* renamed from: r */
        public final boolean mo44363r() {
            return false;
        }
    }

    public C6088g(z66<?> z66, int i, boolean z) {
        super(z66, i, z);
    }

    /* renamed from: a */
    public final ha6<P_OUT> mo43114a(ju4<? super P_OUT> ju4) {
        kf4.m47057e(ju4);
        return new C6089a(this, StreamShape.REFERENCE, StreamOpFlag.NOT_SIZED, ju4);
    }

    /* renamed from: b */
    public final <R> ha6<R> mo43115b(ld2<? super P_OUT, ? extends R> ld2) {
        kf4.m47057e(ld2);
        return new C6091b(this, StreamShape.REFERENCE, StreamOpFlag.NOT_SORTED | StreamOpFlag.NOT_DISTINCT, ld2);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java8.util.stream.Collector, java8.util.stream.Collector<? super P_OUT, A, R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R, A> R mo43116c(java8.util.stream.Collector<? super P_OUT, A, R> r4) {
        /*
            r3 = this;
            boolean r0 = r3.mo44360n()
            if (r0 == 0) goto L_0x0038
            java.util.Set r0 = r4.characteristics()
            java8.util.stream.Collector$Characteristics r1 = java8.util.stream.Collector.Characteristics.CONCURRENT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0038
            boolean r0 = r3.mo44359m()
            if (r0 == 0) goto L_0x0024
            java.util.Set r0 = r4.characteristics()
            java8.util.stream.Collector$Characteristics r1 = java8.util.stream.Collector.Characteristics.UNORDERED
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0038
        L_0x0024:
            sd6 r0 = r4.supplier()
            java.lang.Object r0 = r0.get()
            b10 r1 = r4.accumulator()
            xq0 r1 = p000.k95.m46933a(r1, r0)
            r3.mo44378v(r1)
            goto L_0x0040
        L_0x0038:
            ym6 r0 = java8.util.stream.ReduceOps.m46322a(r4)
            java.lang.Object r0 = r3.mo44357k(r0)
        L_0x0040:
            java.util.Set r1 = r4.characteristics()
            java8.util.stream.Collector$Characteristics r2 = java8.util.stream.Collector.Characteristics.IDENTITY_FINISH
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            ld2 r4 = r4.finisher()
            java.lang.Object r0 = r4.apply(r0)
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.C6088g.mo43116c(java8.util.stream.Collector):java.lang.Object");
    }

    /* renamed from: g */
    public final C6068d.C6069a<P_OUT> mo44377g(long j, kw2<P_OUT[]> kw2) {
        return C6074e.m46370b(j, kw2);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: l */
    public final boolean mo44358l(p000.z66<P_OUT> r3, java8.util.stream.C6095h<P_OUT> r4) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r4.mo44328f()
            if (r0 != 0) goto L_0x000c
            boolean r1 = r3.mo29474c(r4)
            if (r1 != 0) goto L_0x0000
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.C6088g.mo44358l(z66, java8.util.stream.h):boolean");
    }

    /* renamed from: v */
    public void mo44378v(xq0<? super P_OUT> xq0) {
        mo44357k(ForEachOps.m46310a(xq0, false));
    }

    public C6088g(C6064a<?, P_IN, ?> aVar, int i) {
        super(aVar, i);
    }
}
