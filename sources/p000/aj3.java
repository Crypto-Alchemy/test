package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo44877d2 = {"Laj3;", "Lz62;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lf27;", "x", "Lf27;", "e", "()Lf27;", "typeface", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: aj3 */
/* compiled from: FontFamily.kt */
public final class aj3 extends z62 {

    /* renamed from: x */
    public final f27 f148x;

    /* renamed from: e */
    public final f27 mo320e() {
        return this.f148x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aj3) && vx2.m53586b(this.f148x, ((aj3) obj).f148x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f148x.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f148x + ')';
    }
}
