package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* compiled from: ExtensionRegistryLite */
public class C7616d {

    /* renamed from: b */
    public static final C7616d f39955b = new C7616d(true);

    /* renamed from: a */
    public final Map<C7617a, GeneratedMessageLite.C7604e<?, ?>> f39956a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    /* compiled from: ExtensionRegistryLite */
    public static final class C7617a {

        /* renamed from: a */
        public final Object f39957a;

        /* renamed from: b */
        public final int f39958b;

        public C7617a(Object obj, int i) {
            this.f39957a = obj;
            this.f39958b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7617a)) {
                return false;
            }
            C7617a aVar = (C7617a) obj;
            if (this.f39957a == aVar.f39957a && this.f39958b == aVar.f39958b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f39957a) * 65535) + this.f39958b;
        }
    }

    public C7616d() {
        this.f39956a = new HashMap();
    }

    /* renamed from: c */
    public static C7616d m62008c() {
        return f39955b;
    }

    /* renamed from: d */
    public static C7616d m62009d() {
        return new C7616d();
    }

    /* renamed from: a */
    public final void mo54733a(GeneratedMessageLite.C7604e<?, ?> eVar) {
        this.f39956a.put(new C7617a(eVar.mo54666b(), eVar.mo54668d()), eVar);
    }

    /* renamed from: b */
    public <ContainingType extends C7628h> GeneratedMessageLite.C7604e<ContainingType, ?> mo54734b(ContainingType containingtype, int i) {
        return this.f39956a.get(new C7617a(containingtype, i));
    }

    public C7616d(boolean z) {
        this.f39956a = Collections.emptyMap();
    }
}
