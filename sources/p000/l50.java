package p000;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;

/* renamed from: l50 */
/* compiled from: BuiltInsPackageFragmentImpl.kt */
public final class l50 extends DeserializedPackageFragmentImpl implements k50 {

    /* renamed from: L */
    public static final C7822a f40572L = new C7822a((DefaultConstructorMarker) null);

    /* renamed from: I */
    public final boolean f40573I;

    /* renamed from: l50$a */
    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class C7822a {
        public C7822a() {
        }

        public /* synthetic */ C7822a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final l50 mo55820a(u82 u82, da6 da6, mx3 mx3, InputStream inputStream, boolean z) {
            vx2.m53591g(u82, "fqName");
            vx2.m53591g(da6, "storageManager");
            vx2.m53591g(mx3, "module");
            vx2.m53591g(inputStream, "inputStream");
            Pair<ProtoBuf$PackageFragment, j50> a = o75.m70172a(inputStream);
            ProtoBuf$PackageFragment component1 = a.component1();
            j50 component2 = a.component2();
            if (component1 != null) {
                return new l50(u82, da6, mx3, component1, component2, z, (DefaultConstructorMarker) null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + j50.f38596h + ", actual " + component2 + ". Please update Kotlin");
        }
    }

    public l50(u82 u82, da6 da6, mx3 mx3, ProtoBuf$PackageFragment protoBuf$PackageFragment, j50 j50, boolean z) {
        super(u82, da6, mx3, protoBuf$PackageFragment, j50, (sd1) null);
        this.f40573I = z;
    }

    public /* synthetic */ l50(u82 u82, da6 da6, mx3 mx3, ProtoBuf$PackageFragment protoBuf$PackageFragment, j50 j50, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(u82, da6, mx3, protoBuf$PackageFragment, j50, z);
    }

    public String toString() {
        return "builtins package fragment for " + mo51711e() + " from " + DescriptorUtilsKt.m62451l(this);
    }
}
