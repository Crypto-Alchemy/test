package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B+\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "bit", "", "t", "A", "s", "bits", "r", "w", "", "iterator", "default", "u", "", "toString", "", "a", "J", "upperSet", "d", "lowerSet", "e", "I", "lowerBound", "", "g", "[I", "belowBound", "<init>", "(JJI[I)V", "k", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SnapshotIdSet.kt */
public final class SnapshotIdSet implements Iterable<Integer>, a93 {

    /* renamed from: k */
    public static final C0349a f1576k = new C0349a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final SnapshotIdSet f1577r = new SnapshotIdSet(0, 0, 0, (int[]) null);

    /* renamed from: a */
    public final long f1578a;

    /* renamed from: d */
    public final long f1579d;

    /* renamed from: e */
    public final int f1580e;

    /* renamed from: g */
    public final int[] f1581g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$a;", "", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "a", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$a */
    /* compiled from: SnapshotIdSet.kt */
    public static final class C0349a {
        public C0349a() {
        }

        public /* synthetic */ C0349a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SnapshotIdSet mo3167a() {
            return SnapshotIdSet.f1577r;
        }
    }

    public SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.f1578a = j;
        this.f1579d = j2;
        this.f1580e = i;
        this.f1581g = iArr;
    }

    /* renamed from: A */
    public final SnapshotIdSet mo3159A(int i) {
        int i2;
        int[] iArr;
        int i3 = i;
        int i4 = this.f1580e;
        int i5 = i3 - i4;
        long j = 0;
        if (i5 >= 0 && i5 < 64) {
            long j2 = 1 << i5;
            long j3 = this.f1579d;
            if ((j3 & j2) == 0) {
                return new SnapshotIdSet(this.f1578a, j3 | j2, i4, this.f1581g);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j4 = 1 << (i5 - 64);
            long j5 = this.f1578a;
            if ((j5 & j4) == 0) {
                return new SnapshotIdSet(j5 | j4, this.f1579d, i4, this.f1581g);
            }
        } else if (i5 < 128) {
            int[] iArr2 = this.f1581g;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.f1578a, this.f1579d, i4, new int[]{i3});
            }
            int b = d56.m14800b(iArr2, i3);
            if (b < 0) {
                int i6 = -(b + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                C6706xq.m54493g(iArr2, iArr3, 0, 0, i6);
                C6706xq.m54493g(iArr2, iArr3, i6 + 1, i6, length - 1);
                iArr3[i6] = i3;
                return new SnapshotIdSet(this.f1578a, this.f1579d, this.f1580e, iArr3);
            }
        } else if (!mo3163t(i)) {
            long j6 = this.f1578a;
            long j7 = this.f1579d;
            int i7 = this.f1580e;
            ArrayList arrayList = null;
            int i8 = ((i3 + 1) / 64) * 64;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i7 >= i8) {
                    i2 = i7;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.f1581g;
                        if (iArr4 != null) {
                            for (int valueOf : iArr4) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i7));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    j8 = j;
                    i2 = i8;
                    break;
                }
                i7 += 64;
                j8 = j9;
                j9 = j;
            }
            if (arrayList == null || (iArr = CollectionsKt___CollectionsKt.m47310J0(arrayList)) == null) {
                iArr = this.f1581g;
            }
            return new SnapshotIdSet(j9, j8, i2, iArr).mo3159A(i3);
        }
        return this;
    }

    public Iterator<Integer> iterator() {
        return kw5.m63631b(new SnapshotIdSet$iterator$1(this, (ns0<? super SnapshotIdSet$iterator$1>) null)).iterator();
    }

    /* renamed from: r */
    public final SnapshotIdSet mo3161r(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        vx2.m53591g(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f1577r;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.f1580e;
        int i2 = this.f1580e;
        if (i == i2 && snapshotIdSet.f1581g == (iArr = this.f1581g)) {
            return new SnapshotIdSet(this.f1578a & (~snapshotIdSet.f1578a), this.f1579d & (~snapshotIdSet.f1579d), i2, iArr);
        }
        Iterator it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.mo3162s(((Number) it.next()).intValue());
        }
        return snapshotIdSet3;
    }

    /* renamed from: s */
    public final SnapshotIdSet mo3162s(int i) {
        int[] iArr;
        int b;
        int i2 = i;
        int i3 = this.f1580e;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j = 1 << i4;
            long j2 = this.f1579d;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.f1578a, j2 & (~j), i3, this.f1581g);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j3 = 1 << (i4 - 64);
            long j4 = this.f1578a;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.f1579d, i3, this.f1581g);
            }
        } else if (i4 < 0 && (iArr = this.f1581g) != null && (b = d56.m14800b(iArr, i2)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f1578a, this.f1579d, this.f1580e, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (b > 0) {
                C6706xq.m54493g(iArr, iArr2, 0, 0, b);
            }
            if (b < length) {
                C6706xq.m54493g(iArr, iArr2, b, b + 1, length + 1);
            }
            return new SnapshotIdSet(this.f1578a, this.f1579d, this.f1580e, iArr2);
        }
        return this;
    }

    /* renamed from: t */
    public final boolean mo3163t(int i) {
        int[] iArr;
        int i2 = i - this.f1580e;
        boolean z = true;
        if (i2 < 0 || i2 >= 64) {
            if (i2 < 64 || i2 >= 128) {
                if (i2 > 0 || (iArr = this.f1581g) == null) {
                    return false;
                }
                if (d56.m14800b(iArr, i) < 0) {
                    z = false;
                }
                return z;
            } else if (((1 << (i2 - 64)) & this.f1578a) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (((1 << i2) & this.f1579d) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(dk0.m43495u(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(ei3.m16103d(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public final int mo3165u(int i) {
        int[] iArr = this.f1581g;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f1579d;
        if (j != 0) {
            return this.f1580e + d56.m14801c(j);
        }
        long j2 = this.f1578a;
        if (j2 != 0) {
            return this.f1580e + 64 + d56.m14801c(j2);
        }
        return i;
    }

    /* renamed from: w */
    public final SnapshotIdSet mo3166w(SnapshotIdSet snapshotIdSet) {
        int[] iArr;
        vx2.m53591g(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f1577r;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.f1580e;
        int i2 = this.f1580e;
        if (i == i2 && snapshotIdSet.f1581g == (iArr = this.f1581g)) {
            return new SnapshotIdSet(this.f1578a | snapshotIdSet.f1578a, this.f1579d | snapshotIdSet.f1579d, i2, iArr);
        }
        if (this.f1581g == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.mo3159A(((Number) it.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.mo3159A(((Number) it2.next()).intValue());
        }
        return snapshotIdSet3;
    }
}
