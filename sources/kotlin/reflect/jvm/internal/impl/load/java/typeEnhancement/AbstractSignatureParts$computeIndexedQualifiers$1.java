package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Lambda;

/* compiled from: AbstractSignatureParts.kt */
public final class AbstractSignatureParts$computeIndexedQualifiers$1 extends Lambda implements rc2<Integer, j23> {
    public final /* synthetic */ j23[] $computedResult;
    public final /* synthetic */ o07 $predefined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(o07 o07, j23[] j23Arr) {
        super(1);
        this.$predefined = o07;
        this.$computedResult = j23Arr;
    }

    public final j23 invoke(int i) {
        Map<Integer, j23> a;
        j23 j23;
        o07 o07 = this.$predefined;
        if (o07 != null && (a = o07.mo62811a()) != null && (j23 = a.get(Integer.valueOf(i))) != null) {
            return j23;
        }
        j23[] j23Arr = this.$computedResult;
        return (i < 0 || i > ArraysKt___ArraysKt.m47261M(j23Arr)) ? j23.f38572e.mo52604a() : j23Arr[i];
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
