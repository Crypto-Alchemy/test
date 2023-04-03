package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000f\u001a\u00060\u0002j\u0002`\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001e\u0010\u000f\u001a\u00060\u0002j\u0002`\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lgb6;", "Loz4;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lorg/koin/core/qualifier/QualifierValue;", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: gb6 */
/* compiled from: StringQualifier.kt */
public final class gb6 implements oz4 {

    /* renamed from: a */
    public final String f38002a;

    public gb6(String str) {
        vx2.m53591g(str, "value");
        this.f38002a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb6) && vx2.m53586b(getValue(), ((gb6) obj).getValue());
    }

    public String getValue() {
        return this.f38002a;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue();
    }
}
