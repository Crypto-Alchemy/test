package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: a */
    public State f24782a = State.NOT_READY;

    /* renamed from: d */
    public T f24783d;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.base.AbstractIterator$a */
    public static /* synthetic */ class C4497a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24785a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24785a = r0
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24785a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator.C4497a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract T mo34305a();

    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo34306b() {
        this.f24782a = State.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean mo34307c() {
        this.f24782a = State.FAILED;
        this.f24783d = mo34305a();
        if (this.f24782a == State.DONE) {
            return false;
        }
        this.f24782a = State.READY;
        return true;
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f24782a != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        du4.m43696p(z);
        int i = C4497a.f24785a[this.f24782a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return mo34307c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f24782a = State.NOT_READY;
            T a = jc4.m46417a(this.f24783d);
            this.f24783d = null;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
