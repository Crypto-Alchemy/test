package p000;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import kotlin.Metadata;
import net.sqlcipher.database.SQLiteDatabase;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u000f\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0016\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0018\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001d\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0002\u001aD\u0010$\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0001H\u0002\u001a,\u0010*\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002\u001a,\u0010,\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0002¨\u0006-"}, mo44877d2 = {"", "", "address", "F", "", "L", "P", "J", "Q", "H", "I", "value", "Lr37;", "X", "C", "U", "B", "A", "T", "D", "M", "O", "Y", "R", "Z", "G", "W", "E", "anchor", "V", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "K", "Ljava/util/ArrayList;", "Lbg;", "Lkotlin/collections/ArrayList;", "location", "effectiveSize", "S", "index", "N", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: s46 */
/* compiled from: SlotTable.kt */
public final class s46 {
    /* renamed from: A */
    public static final int m26591A(int[] iArr, int i) {
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            return iArr.length;
        }
        return m26594D(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
    }

    /* renamed from: B */
    public static final boolean m26592B(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public static final boolean m26593C(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public static final int m26594D(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: E */
    public static final int m26595E(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: F */
    public static final int m26596F(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* renamed from: G */
    public static final int m26597G(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* renamed from: H */
    public static final boolean m26598H(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & SQLiteDatabase.CREATE_IF_NECESSARY) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static final boolean m26599I(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static final boolean m26600J(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static final void m26601K(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (z) {
            i5 = 1073741824;
        } else {
            i5 = 0;
        }
        if (z2) {
            i6 = 536870912;
        } else {
            i6 = 0;
        }
        if (z3) {
            i7 = SQLiteDatabase.CREATE_IF_NECESSARY;
        } else {
            i7 = 0;
        }
        int i8 = i * 5;
        iArr[i8 + 0] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    /* renamed from: L */
    public static final boolean m26602L(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static final int m26603M(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* renamed from: N */
    public static final int m26604N(ArrayList<C1628bg> arrayList, int i, int i2) {
        int S = m26609S(arrayList, i, i2);
        if (S >= 0) {
            return S;
        }
        return -(S + 1);
    }

    /* renamed from: O */
    public static final int m26605O(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* renamed from: P */
    public static final int m26606P(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* renamed from: Q */
    public static final int m26607Q(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m26594D(iArr[i2 + 1] >> 30);
    }

    /* renamed from: R */
    public static final int m26608R(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* renamed from: S */
    public static final int m26609S(ArrayList<C1628bg> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int a = arrayList.get(i4).mo11639a();
            if (a < 0) {
                a += i2;
            }
            int i5 = vx2.m53593i(a, i);
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* renamed from: T */
    public static final int m26610T(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + m26594D(iArr[i2 + 1] >> 28);
    }

    /* renamed from: U */
    public static final void m26611U(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & -67108865;
        }
    }

    /* renamed from: V */
    public static final void m26612V(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    /* renamed from: W */
    public static final void m26613W(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m2006X(z);
        iArr[(i * 5) + 3] = i2;
    }

    /* renamed from: X */
    public static final void m26614X(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & -134217729;
        }
    }

    /* renamed from: Y */
    public static final void m26615Y(int[] iArr, int i, int i2) {
        boolean z;
        if (i2 < 0 || i2 >= 67108863) {
            z = false;
        } else {
            z = true;
        }
        ComposerKt.m2006X(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & -67108864);
    }

    /* renamed from: Z */
    public static final void m26616Z(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}
