package p000;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.function.Predicate;

/* renamed from: f77 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f77 implements Predicate {
    public final boolean test(Object obj) {
        return Arrays.stream(((Constructor) obj).getParameterTypes()).allMatch(new h77(fz6.class));
    }
}
