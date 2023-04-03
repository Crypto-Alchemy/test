package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b@\u0018\u0000 \u001e2\u00020\u0001:\u0001\rB\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007\u0001\u0011\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"Lmq0;", "", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "", "a", "J", "getValue$annotations", "()V", "value", "f", "focusIndex", "j", "minWidth", "h", "maxWidth", "i", "minHeight", "g", "maxHeight", "c", "(J)J", "b", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mq0 */
/* compiled from: Constraints.kt */
public final class mq0 {

    /* renamed from: b */
    public static final C2846a f15127b = new C2846a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int[] f15128c = {18, 20, 17, 15};

    /* renamed from: d */
    public static final int[] f15129d = {65535, 262143, 32767, 8191};

    /* renamed from: e */
    public static final int[] f15130e = {32767, 8191, 65535, 262143};

    /* renamed from: a */
    public final long f15131a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J8\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, mo44877d2 = {"Lmq0$a;", "", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "Lmq0;", "b", "(IIII)J", "size", "a", "", "FocusMask", "J", "", "HeightMask", "[I", "Infinity", "I", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "<init>", "()V", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: mq0$a */
    /* compiled from: Constraints.kt */
    public static final class C2846a {
        public C2846a() {
        }

        public /* synthetic */ C2846a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo23284a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: b */
        public final long mo23285b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            int i7;
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int a = mo23284a(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int a2 = mo23284a(i6);
            if (a + a2 <= 31) {
                if (a2 == 13) {
                    j = 3;
                } else if (a2 == 18) {
                    j = 1;
                } else if (a2 == 15) {
                    j = 2;
                } else if (a2 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                int i8 = 0;
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = mq0.f15128c[(int) j];
                return mq0.m22472c((((long) i7) << 33) | j | (((long) i) << 2) | (((long) i3) << i9) | (((long) i8) << (i9 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }
    }

    public /* synthetic */ mq0(long j) {
        this.f15131a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ mq0 m22471b(long j) {
        return new mq0(j);
    }

    /* renamed from: c */
    public static long m22472c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m22473d(long j, Object obj) {
        return (obj instanceof mq0) && j == ((mq0) obj).mo23282m();
    }

    /* renamed from: e */
    public static final boolean m22474e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m22475f(long j) {
        return (int) (j & 3);
    }

    /* renamed from: g */
    public static final int m22476g(long j) {
        int f = m22475f(j);
        int i = ((int) (j >> (f15128c[f] + 31))) & f15130e[f];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: h */
    public static final int m22477h(long j) {
        int i = ((int) (j >> 33)) & f15129d[m22475f(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    /* renamed from: i */
    public static final int m22478i(long j) {
        int f = m22475f(j);
        return ((int) (j >> f15128c[f])) & f15130e[f];
    }

    /* renamed from: j */
    public static final int m22479j(long j) {
        return ((int) (j >> 2)) & f15129d[m22475f(j)];
    }

    /* renamed from: k */
    public static int m22480k(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: l */
    public static String m22481l(long j) {
        String str;
        int h = m22477h(j);
        String str2 = "Infinity";
        if (h == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(h);
        }
        int g = m22476g(j);
        if (g != Integer.MAX_VALUE) {
            str2 = String.valueOf(g);
        }
        return "Constraints(minWidth = " + m22479j(j) + ", maxWidth = " + str + ", minHeight = " + m22478i(j) + ", maxHeight = " + str2 + ')';
    }

    public boolean equals(Object obj) {
        return m22473d(this.f15131a, obj);
    }

    public int hashCode() {
        return m22480k(this.f15131a);
    }

    /* renamed from: m */
    public final /* synthetic */ long mo23282m() {
        return this.f15131a;
    }

    public String toString() {
        return m22481l(this.f15131a);
    }
}
