package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.TypesJVMKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0010B\u001b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, mo44877d2 = {"Lzk7;", "Ljava/lang/reflect/WildcardType;", "", "", "Ljava/lang/reflect/Type;", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "a", "Ljava/lang/reflect/Type;", "upperBound", "d", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "e", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zk7 */
/* compiled from: TypesJVM.kt */
public final class zk7 implements WildcardType, Type {

    /* renamed from: e */
    public static final C6772a f36177e = new C6772a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final zk7 f36178g = new zk7((Type) null, (Type) null);

    /* renamed from: a */
    public final Type f36179a;

    /* renamed from: d */
    public final Type f36180d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lzk7$a;", "", "Lzk7;", "STAR", "Lzk7;", "a", "()Lzk7;", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: zk7$a */
    /* compiled from: TypesJVM.kt */
    public static final class C6772a {
        public C6772a() {
        }

        public /* synthetic */ C6772a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final zk7 mo49873a() {
            return zk7.f36178g;
        }
    }

    public zk7(Type type, Type type2) {
        this.f36179a = type;
        this.f36180d = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (!Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) || !Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Type[] getLowerBounds() {
        Type type = this.f36180d;
        if (type == null) {
            return new Type[0];
        }
        return new Type[]{type};
    }

    public String getTypeName() {
        if (this.f36180d != null) {
            return "? super " + TypesJVMKt.m47449h(this.f36180d);
        }
        Type type = this.f36179a;
        if (type == null || vx2.m53586b(type, Object.class)) {
            return "?";
        }
        return "? extends " + TypesJVMKt.m47449h(this.f36179a);
    }

    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f36179a;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
