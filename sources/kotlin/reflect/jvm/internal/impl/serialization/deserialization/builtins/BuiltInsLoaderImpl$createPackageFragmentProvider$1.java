package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.FunctionReference;

/* compiled from: BuiltInsLoaderImpl.kt */
public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements rc2<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "loadResource";
    }

    public final y83 getOwner() {
        return ua5.m52727b(n50.class);
    }

    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    public final InputStream invoke(String str) {
        vx2.m53591g(str, "p0");
        return ((n50) this.receiver).mo56354a(str);
    }
}
