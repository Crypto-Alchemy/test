package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

/* compiled from: BuiltInsLoader.kt */
public final class BuiltInsLoader$Companion$Instance$2 extends Lambda implements pc2<BuiltInsLoader> {
    public static final BuiltInsLoader$Companion$Instance$2 INSTANCE = new BuiltInsLoader$Companion$Instance$2();

    public BuiltInsLoader$Companion$Instance$2() {
        super(0);
    }

    public final BuiltInsLoader invoke() {
        Class<BuiltInsLoader> cls = BuiltInsLoader.class;
        ServiceLoader<S> load = ServiceLoader.load(cls, cls.getClassLoader());
        vx2.m53590f(load, "implementations");
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) CollectionsKt___CollectionsKt.m47330a0(load);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
