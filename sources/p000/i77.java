package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.function.Predicate;

/* renamed from: i77 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i77 implements Predicate {
    public final boolean test(Object obj) {
        return Modifier.isPublic(((Field) obj).getModifiers());
    }
}
