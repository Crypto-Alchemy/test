package p000;

import java.lang.reflect.Field;
import java.util.function.Function;
import org.web3j.abi.Utils;

/* renamed from: l77 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class l77 implements Function {
    public final Object apply(Object obj) {
        return Utils.staticStructsNestedFieldsFlatList(((Field) obj).getType());
    }
}
