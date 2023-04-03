package p000;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KVariance;
import org.slf4j.Marker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u001b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lq93;", "", "", "toString", "Lkotlin/reflect/KVariance;", "a", "Lm93;", "b", "", "hashCode", "other", "", "equals", "Lkotlin/reflect/KVariance;", "d", "()Lkotlin/reflect/KVariance;", "variance", "Lm93;", "c", "()Lm93;", "type", "<init>", "(Lkotlin/reflect/KVariance;Lm93;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q93 */
/* compiled from: KTypeProjection.kt */
public final class q93 {

    /* renamed from: c */
    public static final C6396a f33000c = new C6396a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final q93 f33001d = new q93((KVariance) null, (m93) null);

    /* renamed from: a */
    public final KVariance f33002a;

    /* renamed from: b */
    public final m93 f33003b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo44877d2 = {"Lq93$a;", "", "Lm93;", "type", "Lq93;", "d", "a", "b", "c", "()Lq93;", "STAR", "star", "Lq93;", "getStar$annotations", "()V", "<init>", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: q93$a */
    /* compiled from: KTypeProjection.kt */
    public static final class C6396a {
        public C6396a() {
        }

        public /* synthetic */ C6396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final q93 mo47033a(m93 m93) {
            vx2.m53591g(m93, "type");
            return new q93(KVariance.IN, m93);
        }

        /* renamed from: b */
        public final q93 mo47034b(m93 m93) {
            vx2.m53591g(m93, "type");
            return new q93(KVariance.OUT, m93);
        }

        /* renamed from: c */
        public final q93 mo47035c() {
            return q93.f33001d;
        }

        /* renamed from: d */
        public final q93 mo47036d(m93 m93) {
            vx2.m53591g(m93, "type");
            return new q93(KVariance.INVARIANT, m93);
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: q93$b */
    /* compiled from: KTypeProjection.kt */
    public /* synthetic */ class C6397b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33004a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f33004a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.q93.C6397b.<clinit>():void");
        }
    }

    public q93(KVariance kVariance, m93 m93) {
        boolean z;
        boolean z2;
        String str;
        this.f33002a = kVariance;
        this.f33003b = m93;
        boolean z3 = true;
        if (kVariance == null) {
            z = true;
        } else {
            z = false;
        }
        if (m93 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z != z2 ? false : z3)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: a */
    public final KVariance mo47026a() {
        return this.f33002a;
    }

    /* renamed from: b */
    public final m93 mo47027b() {
        return this.f33003b;
    }

    /* renamed from: c */
    public final m93 mo47028c() {
        return this.f33003b;
    }

    /* renamed from: d */
    public final KVariance mo47029d() {
        return this.f33002a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q93)) {
            return false;
        }
        q93 q93 = (q93) obj;
        return this.f33002a == q93.f33002a && vx2.m53586b(this.f33003b, q93.f33003b);
    }

    public int hashCode() {
        KVariance kVariance = this.f33002a;
        int i = 0;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        m93 m93 = this.f33003b;
        if (m93 != null) {
            i = m93.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        int i;
        KVariance kVariance = this.f33002a;
        if (kVariance == null) {
            i = -1;
        } else {
            i = C6397b.f33004a[kVariance.ordinal()];
        }
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        if (i == 1) {
            return String.valueOf(this.f33003b);
        }
        if (i == 2) {
            return "in " + this.f33003b;
        } else if (i == 3) {
            return "out " + this.f33003b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
