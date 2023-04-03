package p000;

import java.util.List;
import java.util.function.BiFunction;
import org.web3j.abi.C9084b;
import org.web3j.abi.TypeReference;

/* renamed from: i07 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i07 implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ TypeReference f38309a;

    public /* synthetic */ i07(TypeReference typeReference) {
        this.f38309a = typeReference;
    }

    public final Object apply(Object obj, Object obj2) {
        return C9084b.lambda$decodeStaticStruct$1(this.f38309a, (List) obj, (String) obj2);
    }
}
