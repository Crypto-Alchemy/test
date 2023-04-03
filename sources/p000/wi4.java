package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0019B!\b\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, mo44877d2 = {"Lwi4;", "Li6;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "k", "", "d", "[Lokio/ByteString;", "n", "()[Lokio/ByteString;", "byteStrings", "", "e", "[I", "q", "()[I", "trie", "()I", "size", "<init>", "([Lokio/ByteString;[I)V", "g", "a", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: wi4 */
/* compiled from: Options.kt */
public final class wi4 extends C5946i6<ByteString> implements RandomAccess {

    /* renamed from: g */
    public static final C9519a f45529g = new C9519a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public final ByteString[] f45530d;

    /* renamed from: e */
    public final int[] f45531e;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JT\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002R\u0018\u0010\u0016\u001a\u00020\b*\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, mo44877d2 = {"Lwi4$a;", "", "", "Lokio/ByteString;", "byteStrings", "Lwi4;", "d", "([Lokio/ByteString;)Lwi4;", "", "nodeOffset", "Lm40;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "Lr37;", "a", "c", "(Lm40;)J", "intCount", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: wi4$a */
    /* compiled from: Options.kt */
    public static final class C9519a {
        public C9519a() {
        }

        public /* synthetic */ C9519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m73619b(C9519a aVar, long j, m40 m40, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            long j2;
            int i5;
            int i6;
            int i7;
            if ((i4 & 1) != 0) {
                j2 = 0;
            } else {
                j2 = j;
            }
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 16) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 32) != 0) {
                i7 = list.size();
            } else {
                i7 = i3;
            }
            aVar.mo66717a(j2, m40, i5, list, i6, i7, list2);
        }

        /* renamed from: a */
        public final void mo66717a(long j, m40 m40, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            int i6;
            boolean z2;
            int i7;
            int i8;
            m40 m402;
            boolean z3;
            m40 m403 = m40;
            int i9 = i;
            List<? extends ByteString> list3 = list;
            int i10 = i2;
            int i11 = i3;
            List<Integer> list4 = list2;
            if (i10 < i11) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i10 < i11) {
                    int i12 = i10;
                    while (true) {
                        int i13 = i12 + 1;
                        if (((ByteString) list3.get(i12)).size() >= i9) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (i13 >= i11) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                ByteString byteString = (ByteString) list.get(i2);
                ByteString byteString2 = (ByteString) list3.get(i11 - 1);
                int i14 = -1;
                if (i9 == byteString.size()) {
                    int intValue = list4.get(i10).intValue();
                    int i15 = i10 + 1;
                    i4 = i15;
                    i5 = intValue;
                    byteString = (ByteString) list3.get(i15);
                } else {
                    i4 = i10;
                    i5 = -1;
                }
                if (byteString.getByte(i9) != byteString2.getByte(i9)) {
                    int i16 = i4 + 1;
                    int i17 = 1;
                    if (i16 < i11) {
                        while (true) {
                            int i18 = i16 + 1;
                            if (((ByteString) list3.get(i16 - 1)).getByte(i9) != ((ByteString) list3.get(i16)).getByte(i9)) {
                                i17++;
                            }
                            if (i18 >= i11) {
                                break;
                            }
                            i16 = i18;
                        }
                    }
                    long c = j + mo66718c(m403) + ((long) 2) + ((long) (i17 * 2));
                    m403.writeInt(i17);
                    m403.writeInt(i5);
                    if (i4 < i11) {
                        int i19 = i4;
                        while (true) {
                            int i20 = i19 + 1;
                            byte b = ((ByteString) list3.get(i19)).getByte(i9);
                            if (i19 == i4 || b != ((ByteString) list3.get(i19 - 1)).getByte(i9)) {
                                m403.writeInt(b & 255);
                            }
                            if (i20 >= i11) {
                                break;
                            }
                            i19 = i20;
                        }
                    }
                    m40 m404 = new m40();
                    while (i4 < i11) {
                        byte b2 = ((ByteString) list3.get(i4)).getByte(i9);
                        int i21 = i4 + 1;
                        if (i21 < i11) {
                            int i22 = i21;
                            while (true) {
                                int i23 = i22 + 1;
                                if (b2 != ((ByteString) list3.get(i22)).getByte(i9)) {
                                    i7 = i22;
                                    break;
                                } else if (i23 >= i11) {
                                    break;
                                } else {
                                    i22 = i23;
                                }
                            }
                        }
                        i7 = i11;
                        if (i21 == i7 && i9 + 1 == ((ByteString) list3.get(i4)).size()) {
                            m403.writeInt(list4.get(i4).intValue());
                            i8 = i7;
                            m402 = m404;
                        } else {
                            m403.writeInt(((int) (c + mo66718c(m404))) * i14);
                            i8 = i7;
                            m402 = m404;
                            mo66717a(c, m404, i9 + 1, list, i4, i7, list2);
                        }
                        m404 = m402;
                        i4 = i8;
                        i14 = -1;
                    }
                    m403.mo56029L0(m404);
                    return;
                }
                int min = Math.min(byteString.size(), byteString2.size());
                if (i9 < min) {
                    int i24 = i9;
                    i6 = 0;
                    while (true) {
                        int i25 = i24 + 1;
                        if (byteString.getByte(i24) != byteString2.getByte(i24)) {
                            break;
                        }
                        i6++;
                        if (i25 >= min) {
                            break;
                        }
                        i24 = i25;
                    }
                } else {
                    i6 = 0;
                }
                long c2 = j + mo66718c(m403) + ((long) 2) + ((long) i6) + 1;
                m403.writeInt(-i6);
                m403.writeInt(i5);
                int i26 = i9 + i6;
                if (i9 < i26) {
                    while (true) {
                        int i27 = i9 + 1;
                        m403.writeInt(byteString.getByte(i9) & 255);
                        if (i27 >= i26) {
                            break;
                        }
                        i9 = i27;
                    }
                }
                if (i4 + 1 == i11) {
                    if (i26 == ((ByteString) list3.get(i4)).size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        m403.writeInt(list4.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                m40 m405 = new m40();
                m403.writeInt(((int) (mo66718c(m405) + c2)) * -1);
                mo66717a(c2, m405, i26, list, i4, i3, list2);
                m403.mo56029L0(m405);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: c */
        public final long mo66718c(m40 m40) {
            return m40.size() / ((long) 4);
        }

        /* renamed from: d */
        public final wi4 mo66719d(ByteString... byteStringArr) {
            boolean z;
            boolean z2;
            boolean z3;
            ByteString[] byteStringArr2 = byteStringArr;
            vx2.m53591g(byteStringArr2, "byteStrings");
            int i = 0;
            if (byteStringArr2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new wi4(new ByteString[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List z0 = ArraysKt___ArraysKt.m47300z0(byteStringArr);
            gk0.m44737x(z0);
            ArrayList arrayList = new ArrayList(byteStringArr2.length);
            for (ByteString byteString : byteStringArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List p = ck0.m33068p(Arrays.copyOf(numArr, numArr.length));
                int length = byteStringArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    p.set(ck0.m33061i(z0, byteStringArr2[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                    i2++;
                    i3++;
                }
                if (((ByteString) z0.get(0)).size() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i4 = 0;
                    while (i4 < z0.size()) {
                        ByteString byteString2 = (ByteString) z0.get(i4);
                        int i5 = i4 + 1;
                        int i6 = i5;
                        while (i6 < z0.size()) {
                            ByteString byteString3 = (ByteString) z0.get(i6);
                            if (!byteString3.startsWith(byteString2)) {
                                continue;
                                break;
                            }
                            if (byteString3.size() != byteString2.size()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                throw new IllegalArgumentException(vx2.m53598n("duplicate option: ", byteString3).toString());
                            } else if (((Number) p.get(i6)).intValue() > ((Number) p.get(i4)).intValue()) {
                                z0.remove(i6);
                                p.remove(i6);
                            } else {
                                i6++;
                            }
                        }
                        i4 = i5;
                    }
                    m40 m40 = new m40();
                    m73619b(this, 0, m40, 0, z0, 0, 0, p, 53, (Object) null);
                    int[] iArr = new int[((int) mo66718c(m40))];
                    while (!m40.mo56024I0()) {
                        iArr[i] = m40.readInt();
                        i++;
                    }
                    Object[] copyOf = Arrays.copyOf(byteStringArr2, byteStringArr2.length);
                    vx2.m53590f(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new wi4((ByteString[]) copyOf, iArr, (DefaultConstructorMarker) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public wi4(ByteString[] byteStringArr, int[] iArr) {
        this.f45530d = byteStringArr;
        this.f45531e = iArr;
    }

    public /* synthetic */ wi4(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    /* renamed from: t */
    public static final wi4 m73611t(ByteString... byteStringArr) {
        return f45529g.mo66719d(byteStringArr);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof ByteString)) {
            return false;
        }
        return mo66711j((ByteString) obj);
    }

    /* renamed from: e */
    public int mo11067e() {
        return this.f45530d.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return mo66715r((ByteString) obj);
    }

    /* renamed from: j */
    public /* bridge */ boolean mo66711j(ByteString byteString) {
        return super.contains(byteString);
    }

    /* renamed from: k */
    public ByteString get(int i) {
        return this.f45530d[i];
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof ByteString)) {
            return -1;
        }
        return mo66716s((ByteString) obj);
    }

    /* renamed from: n */
    public final ByteString[] mo66713n() {
        return this.f45530d;
    }

    /* renamed from: q */
    public final int[] mo66714q() {
        return this.f45531e;
    }

    /* renamed from: r */
    public /* bridge */ int mo66715r(ByteString byteString) {
        return super.indexOf(byteString);
    }

    /* renamed from: s */
    public /* bridge */ int mo66716s(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }
}
