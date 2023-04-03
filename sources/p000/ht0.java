package p000;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* renamed from: ht0 */
/* compiled from: ContractDeserializer.kt */
public interface ht0 {

    /* renamed from: a */
    public static final C7190a f38268a = C7190a.f38269a;

    /* renamed from: ht0$a */
    /* compiled from: ContractDeserializer.kt */
    public static final class C7190a {

        /* renamed from: a */
        public static final /* synthetic */ C7190a f38269a = new C7190a();

        /* renamed from: b */
        public static final ht0 f38270b = new C7191a();

        /* renamed from: ht0$a$a */
        /* compiled from: ContractDeserializer.kt */
        public static final class C7191a implements ht0 {
            /* renamed from: a */
            public Pair mo52312a(ProtoBuf$Function protoBuf$Function, C7425c cVar, w17 w17, TypeDeserializer typeDeserializer) {
                vx2.m53591g(protoBuf$Function, "proto");
                vx2.m53591g(cVar, "ownerFunction");
                vx2.m53591g(w17, "typeTable");
                vx2.m53591g(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        /* renamed from: a */
        public final ht0 mo52313a() {
            return f38270b;
        }
    }

    /* renamed from: a */
    Pair<C7420a.C7421a<?>, Object> mo52312a(ProtoBuf$Function protoBuf$Function, C7425c cVar, w17 w17, TypeDeserializer typeDeserializer);
}
