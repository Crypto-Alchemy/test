package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001b"}, mo44877d2 = {"Ldd3;", "", "", "toString", "", "other", "", "equals", "", "hashCode", "a", "major", "minor", "patch", "d", "I", "getMajor", "()I", "getMinor", "e", "getPatch", "g", "version", "<init>", "(III)V", "(II)V", "k", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dd3 */
/* compiled from: KotlinVersion.kt */
public final class dd3 implements Comparable<dd3> {

    /* renamed from: k */
    public static final C5732a f28152k = new C5732a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final dd3 f28153r = ed3.m43927a();

    /* renamed from: a */
    public final int f28154a;

    /* renamed from: d */
    public final int f28155d;

    /* renamed from: e */
    public final int f28156e;

    /* renamed from: g */
    public final int f28157g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Ldd3$a;", "", "Ldd3;", "CURRENT", "Ldd3;", "", "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dd3$a */
    /* compiled from: KotlinVersion.kt */
    public static final class C5732a {
        public C5732a() {
        }

        public /* synthetic */ C5732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public dd3(int i, int i2, int i3) {
        this.f28154a = i;
        this.f28155d = i2;
        this.f28156e = i3;
        this.f28157g = mo41901d(i, i2, i3);
    }

    /* renamed from: a */
    public int compareTo(dd3 dd3) {
        vx2.m53591g(dd3, "other");
        return this.f28157g - dd3.f28157g;
    }

    /* renamed from: d */
    public final int mo41901d(int i, int i2, int i3) {
        boolean z = false;
        if (new rw2(0, 255).mo47514u(i) && new rw2(0, 255).mo47514u(i2) && new rw2(0, 255).mo47514u(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(Object obj) {
        dd3 dd3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof dd3) {
            dd3 = (dd3) obj;
        } else {
            dd3 = null;
        }
        if (dd3 == null) {
            return false;
        }
        if (this.f28157g == dd3.f28157g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28157g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28154a);
        sb.append('.');
        sb.append(this.f28155d);
        sb.append('.');
        sb.append(this.f28156e);
        return sb.toString();
    }

    public dd3(int i, int i2) {
        this(i, i2, 0);
    }
}
