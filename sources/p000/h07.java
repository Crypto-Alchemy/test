package p000;

import java.util.List;
import java.util.function.BiFunction;
import org.web3j.abi.C9084b;
import org.web3j.abi.TypeReference;

/* renamed from: h07 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h07 implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ TypeReference f38142a;

    public /* synthetic */ h07(TypeReference typeReference) {
        this.f38142a = typeReference;
    }

    public final Object apply(Object obj, Object obj2) {
        return C9084b.lambda$decodeDynamicStruct$3(this.f38142a, (List) obj, (String) obj2);
    }
}
