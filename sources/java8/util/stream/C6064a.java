package java8.util.stream;

/* renamed from: java8.util.stream.a */
/* compiled from: AbstractPipeline */
public abstract class C6064a<E_IN, E_OUT, S> extends C6087f<E_OUT> {

    /* renamed from: a */
    public final C6064a f30408a;

    /* renamed from: b */
    public final C6064a f30409b;

    /* renamed from: c */
    public final int f30410c;

    /* renamed from: d */
    public C6064a f30411d;

    /* renamed from: e */
    public int f30412e;

    /* renamed from: f */
    public int f30413f;

    /* renamed from: g */
    public z66<?> f30414g;

    /* renamed from: h */
    public sd6<? extends z66<?>> f30415h;

    /* renamed from: i */
    public boolean f30416i;

    /* renamed from: j */
    public boolean f30417j;

    /* renamed from: k */
    public boolean f30418k;

    public C6064a(z66<?> z66, int i, boolean z) {
        this.f30409b = null;
        this.f30414g = z66;
        this.f30408a = this;
        int i2 = StreamOpFlag.STREAM_MASK & i;
        this.f30410c = i2;
        this.f30413f = (~(i2 << 1)) & StreamOpFlag.INITIAL_OPS_VALUE;
        this.f30412e = 0;
        this.f30418k = z;
    }

    /* renamed from: o */
    public static /* synthetic */ Object[] m46343o(int i) {
        return new Object[i];
    }

    /* renamed from: d */
    public final <P_IN> void mo44351d(C6095h<P_IN> hVar, z66<P_IN> z66) {
        kf4.m47057e(hVar);
        if (!StreamOpFlag.SHORT_CIRCUIT.isKnown(mo44353f())) {
            hVar.mo44326e(z66.getExactSizeIfKnown());
            z66.mo29473a(hVar);
            hVar.end();
            return;
        }
        mo44356j(hVar, z66);
    }

    /* renamed from: e */
    public final <P_IN> long mo44352e(z66<P_IN> z66) {
        if (StreamOpFlag.SIZED.isKnown(mo44353f())) {
            return z66.getExactSizeIfKnown();
        }
        return -1;
    }

    /* renamed from: f */
    public final int mo44353f() {
        return this.f30413f;
    }

    /* renamed from: h */
    public final <P_IN, S_ extends C6095h<E_OUT>> S_ mo44354h(S_ s_, z66<P_IN> z66) {
        mo44351d(mo44355i((C6095h) kf4.m47057e(s_)), z66);
        return s_;
    }

    /* renamed from: i */
    public final <P_IN> C6095h<P_IN> mo44355i(C6095h<E_OUT> hVar) {
        kf4.m47057e(hVar);
        C6064a aVar = this;
        C6095h<E_OUT> hVar2 = hVar;
        while (aVar.f30412e > 0) {
            C6095h<E_OUT> s = aVar.mo44364s(aVar.f30409b.f30413f, hVar2);
            aVar = aVar.f30409b;
            hVar2 = s;
        }
        return hVar2;
    }

    /* renamed from: j */
    public final <P_IN> boolean mo44356j(C6095h<P_IN> hVar, z66<P_IN> z66) {
        C6064a aVar = this;
        while (aVar.f30412e > 0) {
            aVar = aVar.f30409b;
        }
        hVar.mo44326e(z66.getExactSizeIfKnown());
        boolean l = aVar.mo44358l(z66, hVar);
        hVar.end();
        return l;
    }

    /* renamed from: k */
    public final <R> R mo44357k(ym6<E_OUT, R> ym6) {
        if (!this.f30416i) {
            this.f30416i = true;
            if (mo44360n()) {
                return ym6.mo44325d(this, mo44365t(ym6.mo44324c()));
            }
            return ym6.mo44323a(this, mo44365t(ym6.mo44324c()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* renamed from: l */
    public abstract boolean mo44358l(z66<E_OUT> z66, C6095h<E_OUT> hVar);

    /* renamed from: m */
    public final boolean mo44359m() {
        return StreamOpFlag.ORDERED.isKnown(this.f30413f);
    }

    /* renamed from: n */
    public final boolean mo44360n() {
        return this.f30408a.f30418k;
    }

    /* renamed from: p */
    public <P_IN> C6068d<E_OUT> mo44361p(C6087f<E_OUT> fVar, z66<P_IN> z66, kw2<E_OUT[]> kw2) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* renamed from: q */
    public <P_IN> z66<E_OUT> mo44362q(C6087f<E_OUT> fVar, z66<P_IN> z66) {
        return mo44361p(fVar, z66, C6513t6.m52086a()).spliterator();
    }

    /* renamed from: r */
    public abstract boolean mo44363r();

    /* renamed from: s */
    public abstract C6095h<E_IN> mo44364s(int i, C6095h<E_OUT> hVar);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: z66<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.z66<?> mo44365t(int r8) {
        /*
            r7 = this;
            java8.util.stream.a r0 = r7.f30408a
            z66<?> r1 = r0.f30414g
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r0.f30414g = r2
            goto L_0x0019
        L_0x000a:
            sd6<? extends z66<?>> r0 = r0.f30415h
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r0.get()
            r1 = r0
            z66 r1 = (p000.z66) r1
            java8.util.stream.a r0 = r7.f30408a
            r0.f30415h = r2
        L_0x0019:
            boolean r0 = r7.mo44360n()
            if (r0 == 0) goto L_0x006c
            java8.util.stream.a r0 = r7.f30408a
            boolean r2 = r0.f30417j
            if (r2 == 0) goto L_0x006c
            java8.util.stream.a r2 = r0.f30411d
            r3 = 1
        L_0x0028:
            if (r0 == r7) goto L_0x006c
            int r4 = r2.f30410c
            boolean r5 = r2.mo44363r()
            if (r5 == 0) goto L_0x0059
            r3 = 0
            java8.util.stream.StreamOpFlag r5 = java8.util.stream.StreamOpFlag.SHORT_CIRCUIT
            boolean r5 = r5.isKnown(r4)
            if (r5 == 0) goto L_0x003f
            int r5 = java8.util.stream.StreamOpFlag.IS_SHORT_CIRCUIT
            int r5 = ~r5
            r4 = r4 & r5
        L_0x003f:
            z66 r1 = r2.mo44362q(r0, r1)
            r5 = 64
            boolean r5 = r1.hasCharacteristics(r5)
            if (r5 == 0) goto L_0x0052
            int r5 = java8.util.stream.StreamOpFlag.NOT_SIZED
            int r5 = ~r5
            r4 = r4 & r5
            int r5 = java8.util.stream.StreamOpFlag.IS_SIZED
            goto L_0x0058
        L_0x0052:
            int r5 = java8.util.stream.StreamOpFlag.IS_SIZED
            int r5 = ~r5
            r4 = r4 & r5
            int r5 = java8.util.stream.StreamOpFlag.NOT_SIZED
        L_0x0058:
            r4 = r4 | r5
        L_0x0059:
            int r5 = r3 + 1
            r2.f30412e = r3
            int r0 = r0.f30413f
            int r0 = java8.util.stream.StreamOpFlag.combineOpFlags(r4, r0)
            r2.f30413f = r0
            java8.util.stream.a r0 = r2.f30411d
            r3 = r5
            r6 = r2
            r2 = r0
            r0 = r6
            goto L_0x0028
        L_0x006c:
            if (r8 == 0) goto L_0x0076
            int r0 = r7.f30413f
            int r8 = java8.util.stream.StreamOpFlag.combineOpFlags(r8, r0)
            r7.f30413f = r8
        L_0x0076:
            return r1
        L_0x0077:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "source already consumed or closed"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: java8.util.stream.C6064a.mo44365t(int):z66");
    }

    /* renamed from: u */
    public final z66<E_OUT> mo44366u() {
        C6064a aVar = this.f30408a;
        if (this != aVar) {
            throw new IllegalStateException();
        } else if (!this.f30416i) {
            this.f30416i = true;
            z66<?> z66 = aVar.f30414g;
            if (z66 != null) {
                aVar.f30414g = null;
                return z66;
            }
            sd6<? extends z66<?>> sd6 = aVar.f30415h;
            if (sd6 != null) {
                z66<E_OUT> z662 = (z66) sd6.get();
                this.f30408a.f30415h = null;
                return z662;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    public C6064a(C6064a<?, E_IN, ?> aVar, int i) {
        if (!aVar.f30416i) {
            aVar.f30416i = true;
            aVar.f30411d = this;
            this.f30409b = aVar;
            this.f30410c = StreamOpFlag.OP_MASK & i;
            this.f30413f = StreamOpFlag.combineOpFlags(i, aVar.f30413f);
            C6064a aVar2 = aVar.f30408a;
            this.f30408a = aVar2;
            if (mo44363r()) {
                aVar2.f30417j = true;
            }
            this.f30412e = aVar.f30412e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
