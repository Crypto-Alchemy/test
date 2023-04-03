package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p000.dy3;

public final class MapMaker {

    /* renamed from: a */
    public boolean f24918a;

    /* renamed from: b */
    public int f24919b = -1;

    /* renamed from: c */
    public int f24920c = -1;

    /* renamed from: d */
    public MapMakerInternalMap.Strength f24921d;

    /* renamed from: e */
    public MapMakerInternalMap.Strength f24922e;

    /* renamed from: f */
    public Equivalence<Object> f24923f;

    public enum Dummy {
        VALUE
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public MapMaker mo34847a(int i) {
        boolean z;
        int i2 = this.f24920c;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        du4.m43698r(z, "concurrency level was already set to %s", i2);
        if (i <= 0) {
            z2 = false;
        }
        du4.m43684d(z2);
        this.f24920c = i;
        return this;
    }

    /* renamed from: b */
    public int mo34848b() {
        int i = this.f24920c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* renamed from: c */
    public int mo34849c() {
        int i = this.f24919b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: d */
    public Equivalence<Object> mo34850d() {
        return (Equivalence) dy3.m43720a(this.f24923f, mo34851e().defaultEquivalence());
    }

    /* renamed from: e */
    public MapMakerInternalMap.Strength mo34851e() {
        return (MapMakerInternalMap.Strength) dy3.m43720a(this.f24921d, MapMakerInternalMap.Strength.STRONG);
    }

    /* renamed from: f */
    public MapMakerInternalMap.Strength mo34852f() {
        return (MapMakerInternalMap.Strength) dy3.m43720a(this.f24922e, MapMakerInternalMap.Strength.STRONG);
    }

    @CanIgnoreReturnValue
    /* renamed from: g */
    public MapMaker mo34853g(int i) {
        boolean z;
        int i2 = this.f24919b;
        boolean z2 = true;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        du4.m43698r(z, "initial capacity was already set to %s", i2);
        if (i < 0) {
            z2 = false;
        }
        du4.m43684d(z2);
        this.f24919b = i;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: h */
    public MapMaker mo34854h(Equivalence<Object> equivalence) {
        boolean z;
        Equivalence<Object> equivalence2 = this.f24923f;
        if (equivalence2 == null) {
            z = true;
        } else {
            z = false;
        }
        du4.m43699s(z, "key equivalence was already set to %s", equivalence2);
        this.f24923f = (Equivalence) du4.m43691k(equivalence);
        this.f24918a = true;
        return this;
    }

    /* renamed from: i */
    public <K, V> ConcurrentMap<K, V> mo34855i() {
        if (!this.f24918a) {
            return new ConcurrentHashMap(mo34849c(), 0.75f, mo34848b());
        }
        return MapMakerInternalMap.create(this);
    }

    /* renamed from: j */
    public MapMaker mo34856j(MapMakerInternalMap.Strength strength) {
        boolean z;
        MapMakerInternalMap.Strength strength2 = this.f24921d;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        du4.m43699s(z, "Key strength was already set to %s", strength2);
        this.f24921d = (MapMakerInternalMap.Strength) du4.m43691k(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f24918a = true;
        }
        return this;
    }

    /* renamed from: k */
    public MapMaker mo34857k(MapMakerInternalMap.Strength strength) {
        boolean z;
        MapMakerInternalMap.Strength strength2 = this.f24922e;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        du4.m43699s(z, "Value strength was already set to %s", strength2);
        this.f24922e = (MapMakerInternalMap.Strength) du4.m43691k(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f24918a = true;
        }
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: l */
    public MapMaker mo34858l() {
        return mo34856j(MapMakerInternalMap.Strength.WEAK);
    }

    public String toString() {
        dy3.C5748b b = dy3.m43721b(this);
        int i = this.f24919b;
        if (i != -1) {
            b.mo42078a("initialCapacity", i);
        }
        int i2 = this.f24920c;
        if (i2 != -1) {
            b.mo42078a("concurrencyLevel", i2);
        }
        MapMakerInternalMap.Strength strength = this.f24921d;
        if (strength != null) {
            b.mo42079b("keyStrength", C5876gr.m44841e(strength.toString()));
        }
        MapMakerInternalMap.Strength strength2 = this.f24922e;
        if (strength2 != null) {
            b.mo42079b("valueStrength", C5876gr.m44841e(strength2.toString()));
        }
        if (this.f24923f != null) {
            b.mo42085h("keyEquivalence");
        }
        return b.toString();
    }
}
