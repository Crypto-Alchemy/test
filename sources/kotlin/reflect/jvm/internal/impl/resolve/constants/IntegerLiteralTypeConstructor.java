package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C6169a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;

/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class IntegerLiteralTypeConstructor implements yz6 {

    /* renamed from: f */
    public static final Companion f40089f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f40090a;

    /* renamed from: b */
    public final mx3 f40091b;

    /* renamed from: c */
    public final Set<xc3> f40092c;

    /* renamed from: d */
    public final d36 f40093d;

    /* renamed from: e */
    public final ef3 f40094e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class Companion {

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public enum Mode {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor$Companion$a */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class C7662a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f40096a;

            static {
                int[] iArr = new int[Mode.values().length];
                iArr[Mode.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[Mode.INTERSECTION_TYPE.ordinal()] = 2;
                f40096a = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final d36 mo55074a(Collection<? extends d36> collection, Mode mode) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                T next = it.next();
                while (it.hasNext()) {
                    Companion companion = IntegerLiteralTypeConstructor.f40089f;
                    next = companion.mo55076c((d36) next, (d36) it.next(), mode);
                }
                return (d36) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        /* renamed from: b */
        public final d36 mo55075b(Collection<? extends d36> collection) {
            vx2.m53591g(collection, "types");
            return mo55074a(collection, Mode.INTERSECTION_TYPE);
        }

        /* renamed from: c */
        public final d36 mo55076c(d36 d36, d36 d362, Mode mode) {
            if (d36 == null || d362 == null) {
                return null;
            }
            yz6 H0 = d36.mo51134H0();
            yz6 H02 = d362.mo51134H0();
            boolean z = H0 instanceof IntegerLiteralTypeConstructor;
            if (z && (H02 instanceof IntegerLiteralTypeConstructor)) {
                return mo55078e((IntegerLiteralTypeConstructor) H0, (IntegerLiteralTypeConstructor) H02, mode);
            }
            if (z) {
                return mo55077d((IntegerLiteralTypeConstructor) H0, d362);
            }
            if (H02 instanceof IntegerLiteralTypeConstructor) {
                return mo55077d((IntegerLiteralTypeConstructor) H02, d36);
            }
            return null;
        }

        /* renamed from: d */
        public final d36 mo55077d(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, d36 d36) {
            if (integerLiteralTypeConstructor.mo55069l().contains(d36)) {
                return d36;
            }
            return null;
        }

        /* renamed from: e */
        public final d36 mo55078e(IntegerLiteralTypeConstructor integerLiteralTypeConstructor, IntegerLiteralTypeConstructor integerLiteralTypeConstructor2, Mode mode) {
            Set<T> set;
            int i = C7662a.f40096a[mode.ordinal()];
            if (i == 1) {
                set = CollectionsKt___CollectionsKt.m47334e0(integerLiteralTypeConstructor.mo55069l(), integerLiteralTypeConstructor2.mo55069l());
            } else if (i == 2) {
                set = CollectionsKt___CollectionsKt.m47317P0(integerLiteralTypeConstructor.mo55069l(), integerLiteralTypeConstructor2.mo55069l());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return KotlinTypeFactory.m62850e(rz6.f44504d.mo65783h(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f40090a, integerLiteralTypeConstructor.f40091b, set, (DefaultConstructorMarker) null), false);
        }
    }

    public IntegerLiteralTypeConstructor(long j, mx3 mx3, Set<? extends xc3> set) {
        this.f40093d = KotlinTypeFactory.m62850e(rz6.f44504d.mo65783h(), this, false);
        this.f40094e = C6169a.m47232a(new IntegerLiteralTypeConstructor$supertypes$2(this));
        this.f40090a = j;
        this.f40091b = mx3;
        this.f40092c = set;
    }

    public /* synthetic */ IntegerLiteralTypeConstructor(long j, mx3 mx3, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, mx3, set);
    }

    /* renamed from: a */
    public yz6 mo51808a(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: d */
    public eg0 mo51180d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo51809e() {
        return false;
    }

    /* renamed from: g */
    public Collection<xc3> mo51811g() {
        return mo55070m();
    }

    public List<a17> getParameters() {
        return ck0.m33062j();
    }

    /* renamed from: k */
    public C7389b mo51813k() {
        return this.f40091b.mo51535k();
    }

    /* renamed from: l */
    public final Set<xc3> mo55069l() {
        return this.f40092c;
    }

    /* renamed from: m */
    public final List<xc3> mo55070m() {
        return (List) this.f40094e.getValue();
    }

    /* renamed from: n */
    public final boolean mo55071n() {
        Collection<xc3> a = dv4.m57077a(this.f40091b);
        if ((a instanceof Collection) && a.isEmpty()) {
            return true;
        }
        for (xc3 contains : a) {
            if (!(!this.f40092c.contains(contains))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public final String mo55072o() {
        return '[' + CollectionsKt___CollectionsKt.m47338i0(this.f40092c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, IntegerLiteralTypeConstructor$valueToString$1.INSTANCE, 30, (Object) null) + ']';
    }

    public String toString() {
        return "IntegerLiteralType" + mo55072o();
    }
}
