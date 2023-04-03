package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__IndentKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\fB)\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n\u0001\u0002\u0013\u0014¨\u0006\u0015"}, mo44877d2 = {"Lgf7;", "", "other", "", "equals", "", "hashCode", "a", "I", "d", "()I", "presentedItemsBefore", "b", "c", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "Lgf7$b;", "Lgf7$a;", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: gf7 */
/* compiled from: ViewportHint.kt */
public abstract class gf7 {

    /* renamed from: a */
    public final int f12314a;

    /* renamed from: b */
    public final int f12315b;

    /* renamed from: c */
    public final int f12316c;

    /* renamed from: d */
    public final int f12317d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, mo44877d2 = {"Lgf7$a;", "Lgf7;", "", "other", "", "equals", "", "hashCode", "", "toString", "e", "I", "f", "()I", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: gf7$a */
    /* compiled from: ViewportHint.kt */
    public static final class C2383a extends gf7 {

        /* renamed from: e */
        public final int f12318e;

        /* renamed from: f */
        public final int f12319f;

        public C2383a(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, (DefaultConstructorMarker) null);
            this.f12318e = i;
            this.f12319f = i2;
        }

        /* renamed from: e */
        public final int mo20570e() {
            return this.f12319f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2383a)) {
                return false;
            }
            C2383a aVar = (C2383a) obj;
            if (this.f12318e == aVar.f12318e && this.f12319f == aVar.f12319f && mo20567d() == aVar.mo20567d() && mo20566c() == aVar.mo20566c() && mo20564a() == aVar.mo20564a() && mo20565b() == aVar.mo20565b()) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final int mo20571f() {
            return this.f12318e;
        }

        public int hashCode() {
            return gf7.super.hashCode() + this.f12318e + this.f12319f;
        }

        public String toString() {
            return StringsKt__IndentKt.m63059h("ViewportHint.Access(\n            |    pageOffset=" + this.f12318e + ",\n            |    indexInPage=" + this.f12319f + ",\n            |    presentedItemsBefore=" + mo20567d() + ",\n            |    presentedItemsAfter=" + mo20566c() + ",\n            |    originalPageOffsetFirst=" + mo20564a() + ",\n            |    originalPageOffsetLast=" + mo20565b() + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, mo44877d2 = {"Lgf7$b;", "Lgf7;", "", "toString", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: gf7$b */
    /* compiled from: ViewportHint.kt */
    public static final class C2384b extends gf7 {
        public C2384b(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return StringsKt__IndentKt.m63059h("ViewportHint.Initial(\n            |    presentedItemsBefore=" + mo20567d() + ",\n            |    presentedItemsAfter=" + mo20566c() + ",\n            |    originalPageOffsetFirst=" + mo20564a() + ",\n            |    originalPageOffsetLast=" + mo20565b() + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    public gf7(int i, int i2, int i3, int i4) {
        this.f12314a = i;
        this.f12315b = i2;
        this.f12316c = i3;
        this.f12317d = i4;
    }

    /* renamed from: a */
    public final int mo20564a() {
        return this.f12316c;
    }

    /* renamed from: b */
    public final int mo20565b() {
        return this.f12317d;
    }

    /* renamed from: c */
    public final int mo20566c() {
        return this.f12315b;
    }

    /* renamed from: d */
    public final int mo20567d() {
        return this.f12314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf7)) {
            return false;
        }
        gf7 gf7 = (gf7) obj;
        if (this.f12314a == gf7.f12314a && this.f12315b == gf7.f12315b && this.f12316c == gf7.f12316c && this.f12317d == gf7.f12317d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f12314a + this.f12315b + this.f12316c + this.f12317d;
    }

    public /* synthetic */ gf7(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4);
    }
}
