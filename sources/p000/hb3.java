package p000;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4705c0;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: hb3 */
/* compiled from: KeyTypeManager */
public abstract class hb3<KeyProtoT extends C4705c0> {

    /* renamed from: a */
    public final Class<KeyProtoT> f29504a;

    /* renamed from: b */
    public final Map<Class<?>, av4<?, KeyProtoT>> f29505b;

    /* renamed from: c */
    public final Class<?> f29506c;

    /* renamed from: hb3$a */
    /* compiled from: KeyTypeManager */
    public static abstract class C5887a<KeyFormatProtoT extends C4705c0, KeyProtoT extends C4705c0> {

        /* renamed from: a */
        public final Class<KeyFormatProtoT> f29507a;

        /* renamed from: hb3$a$a */
        /* compiled from: KeyTypeManager */
        public static final class C5888a<KeyFormatProtoT> {

            /* renamed from: a */
            public KeyFormatProtoT f29508a;

            /* renamed from: b */
            public KeyTemplate.OutputPrefixType f29509b;

            public C5888a(KeyFormatProtoT keyformatprotot, KeyTemplate.OutputPrefixType outputPrefixType) {
                this.f29508a = keyformatprotot;
                this.f29509b = outputPrefixType;
            }
        }

        public C5887a(Class<KeyFormatProtoT> cls) {
            this.f29507a = cls;
        }

        /* renamed from: a */
        public abstract KeyProtoT mo29955a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        /* renamed from: b */
        public final Class<KeyFormatProtoT> mo43124b() {
            return this.f29507a;
        }

        /* renamed from: c */
        public Map<String, C5888a<KeyFormatProtoT>> mo43125c() throws GeneralSecurityException {
            return Collections.emptyMap();
        }

        /* renamed from: d */
        public abstract KeyFormatProtoT mo29956d(ByteString byteString) throws InvalidProtocolBufferException;

        /* renamed from: e */
        public abstract void mo29957e(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    public hb3(Class<KeyProtoT> cls, av4<?, KeyProtoT>... av4Arr) {
        this.f29504a = cls;
        HashMap hashMap = new HashMap();
        int length = av4Arr.length;
        int i = 0;
        while (i < length) {
            av4<?, KeyProtoT> av4 = av4Arr[i];
            if (!hashMap.containsKey(av4.mo29371b())) {
                hashMap.put(av4.mo29371b(), av4);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + av4.mo29371b().getCanonicalName());
            }
        }
        if (av4Arr.length > 0) {
            this.f29506c = av4Arr[0].mo29371b();
        } else {
            this.f29506c = Void.class;
        }
        this.f29505b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public TinkFipsUtil.AlgorithmFipsCompatibility mo43119a() {
        return TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    }

    /* renamed from: b */
    public final Class<?> mo43120b() {
        return this.f29506c;
    }

    /* renamed from: c */
    public final Class<KeyProtoT> mo43121c() {
        return this.f29504a;
    }

    /* renamed from: d */
    public abstract String mo29945d();

    /* renamed from: e */
    public final <P> P mo43122e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        av4 av4 = this.f29505b.get(cls);
        if (av4 != null) {
            return av4.mo29370a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: f */
    public abstract C5887a<?, KeyProtoT> mo29946f();

    /* renamed from: g */
    public abstract KeyData.KeyMaterialType mo29947g();

    /* renamed from: h */
    public abstract KeyProtoT mo29948h(ByteString byteString) throws InvalidProtocolBufferException;

    /* renamed from: i */
    public final Set<Class<?>> mo43123i() {
        return this.f29505b.keySet();
    }

    /* renamed from: j */
    public abstract void mo29949j(KeyProtoT keyprotot) throws GeneralSecurityException;
}
