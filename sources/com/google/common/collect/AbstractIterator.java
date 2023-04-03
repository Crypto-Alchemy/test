package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends c47<T> {

    /* renamed from: a */
    public State f24789a = State.NOT_READY;

    /* renamed from: d */
    public T f24790d;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.collect.AbstractIterator$a */
    public static /* synthetic */ class C4502a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24792a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24792a = r0
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24792a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator.C4502a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract T mo34338a();

    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T mo34339b() {
        this.f24789a = State.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean mo34340c() {
        this.f24789a = State.FAILED;
        this.f24790d = mo34338a();
        if (this.f24789a == State.DONE) {
            return false;
        }
        this.f24789a = State.READY;
        return true;
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        boolean z;
        if (this.f24789a != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        du4.m43696p(z);
        int i = C4502a.f24792a[this.f24789a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return mo34340c();
        }
        return true;
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f24789a = State.NOT_READY;
            T a = ic4.m45613a(this.f24790d);
            this.f24790d = null;
            return a;
        }
        throw new NoSuchElementException();
    }
}
