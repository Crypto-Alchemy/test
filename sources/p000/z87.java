package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lz87;", "Lry6;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "verbatim", "<init>", "(Ljava/lang/String;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z87 */
/* compiled from: TtsAnnotation.kt */
public final class z87 extends ry6 {

    /* renamed from: a */
    public final String f20500a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z87(String str) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(str, "verbatim");
        this.f20500a = str;
    }

    /* renamed from: a */
    public final String mo28381a() {
        return this.f20500a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z87) && vx2.m53586b(this.f20500a, ((z87) obj).f20500a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20500a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f20500a + ')';
    }
}
