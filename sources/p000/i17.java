package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0015\u001a\u00060\u0002j\u0002`\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Li17;", "Loz4;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lq83;", "a", "Lq83;", "getType", "()Lq83;", "type", "Lorg/koin/core/qualifier/QualifierValue;", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Lq83;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: i17 */
/* compiled from: TypeQualifier.kt */
public final class i17 implements oz4 {

    /* renamed from: a */
    public final q83<?> f38319a;

    /* renamed from: b */
    public final String f38320b;

    public i17(q83<?> q83) {
        vx2.m53591g(q83, "type");
        this.f38319a = q83;
        this.f38320b = s83.m71896a(q83);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vx2.m53586b(ua5.m52727b(i17.class), ua5.m52727b(obj.getClass())) || !vx2.m53586b(getValue(), ((i17) obj).getValue())) {
            return false;
        }
        return true;
    }

    public String getValue() {
        return this.f38320b;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "q:'" + getValue() + '\'';
    }
}
