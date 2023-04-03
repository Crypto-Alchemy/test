package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* compiled from: DeserializedPackageFragmentImpl.kt */
public abstract class DeserializedPackageFragmentImpl extends vd1 {

    /* renamed from: A */
    public final u24 f40141A;

    /* renamed from: B */
    public final ux4 f40142B;

    /* renamed from: C */
    public ProtoBuf$PackageFragment f40143C;

    /* renamed from: H */
    public MemberScope f40144H;

    /* renamed from: x */
    public final o10 f40145x;

    /* renamed from: y */
    public final sd1 f40146y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(u82 u82, da6 da6, mx3 mx3, ProtoBuf$PackageFragment protoBuf$PackageFragment, o10 o10, sd1 sd1) {
        super(u82, da6, mx3);
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(mx3, "module");
        vx2.m53591g(protoBuf$PackageFragment, "proto");
        vx2.m53591g(o10, "metadataVersion");
        this.f40145x = o10;
        this.f40146y = sd1;
        ProtoBuf$StringTable strings = protoBuf$PackageFragment.getStrings();
        vx2.m53590f(strings, "proto.strings");
        ProtoBuf$QualifiedNameTable qualifiedNames = protoBuf$PackageFragment.getQualifiedNames();
        vx2.m53590f(qualifiedNames, "proto.qualifiedNames");
        u24 u24 = new u24(strings, qualifiedNames);
        this.f40141A = u24;
        this.f40142B = new ux4(protoBuf$PackageFragment, u24, o10, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this.f40143C = protoBuf$PackageFragment;
    }

    /* renamed from: F0 */
    public void mo55126F0(id1 id1) {
        vx2.m53591g(id1, "components");
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f40143C;
        if (protoBuf$PackageFragment != null) {
            this.f40143C = null;
            ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.getPackage();
            vx2.m53590f(protoBuf$Package, "proto.`package`");
            u24 u24 = this.f40141A;
            o10 o10 = this.f40145x;
            sd1 sd1 = this.f40146y;
            this.f40144H = new wd1(this, protoBuf$Package, u24, o10, sd1, id1, "scope of " + this, new DeserializedPackageFragmentImpl$initialize$1(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: H0 */
    public ux4 mo55125A0() {
        return this.f40142B;
    }

    /* renamed from: m */
    public MemberScope mo51712m() {
        MemberScope memberScope = this.f40144H;
        if (memberScope != null) {
            return memberScope;
        }
        vx2.m53605u("_memberScope");
        return null;
    }
}
