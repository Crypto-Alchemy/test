package p000;

import java.lang.reflect.Field;
import java.util.function.Predicate;
import org.web3j.abi.datatypes.StaticStruct;

/* renamed from: k77 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k77 implements Predicate {
    public final boolean test(Object obj) {
        return StaticStruct.class.isAssignableFrom(((Field) obj).getType());
    }
}
