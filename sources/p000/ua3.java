package p000;

import com.google.crypto.tink.shaded.protobuf.C4705c0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: ua3 */
/* compiled from: KeyManagerRegistry */
public final class ua3 {

    /* renamed from: b */
    public static final Logger f34568b = Logger.getLogger(ua3.class.getName());

    /* renamed from: a */
    public final ConcurrentMap<String, C6563b> f34569a;

    /* renamed from: ua3$a */
    /* compiled from: KeyManagerRegistry */
    public class C6562a implements C6563b {

        /* renamed from: a */
        public final /* synthetic */ hb3 f34570a;

        public C6562a(hb3 hb3) {
            this.f34570a = hb3;
        }

        /* renamed from: a */
        public Class<?> mo48376a() {
            return this.f34570a.getClass();
        }

        /* renamed from: b */
        public Set<Class<?>> mo48377b() {
            return this.f34570a.mo43123i();
        }

        /* renamed from: c */
        public <Q> sa3<Q> mo48378c(Class<Q> cls) throws GeneralSecurityException {
            try {
                return new ta3(this.f34570a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        /* renamed from: d */
        public sa3<?> mo48379d() {
            hb3 hb3 = this.f34570a;
            return new ta3(hb3, hb3.mo43120b());
        }
    }

    /* renamed from: ua3$b */
    /* compiled from: KeyManagerRegistry */
    public interface C6563b {
        /* renamed from: a */
        Class<?> mo48376a();

        /* renamed from: b */
        Set<Class<?>> mo48377b();

        /* renamed from: c */
        <P> sa3<P> mo48378c(Class<P> cls) throws GeneralSecurityException;

        /* renamed from: d */
        sa3<?> mo48379d();
    }

    public ua3(ua3 ua3) {
        this.f34569a = new ConcurrentHashMap(ua3.f34569a);
    }

    /* renamed from: a */
    public static <T> T m52708a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    public static <KeyProtoT extends C4705c0> C6563b m52709b(hb3<KeyProtoT> hb3) {
        return new C6562a(hb3);
    }

    /* renamed from: i */
    public static String m52710i(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: c */
    public <P> sa3<P> mo48369c(String str, Class<P> cls) throws GeneralSecurityException {
        return mo48371e(str, (Class) m52708a(cls));
    }

    /* renamed from: d */
    public final synchronized C6563b mo48370d(String str) throws GeneralSecurityException {
        if (this.f34569a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f34569a.get(str);
    }

    /* renamed from: e */
    public final <P> sa3<P> mo48371e(String str, Class<P> cls) throws GeneralSecurityException {
        C6563b d = mo48370d(str);
        if (cls == null) {
            return d.mo48379d();
        }
        if (d.mo48377b().contains(cls)) {
            return d.mo48378c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d.mo48376a() + ", supported primitives: " + m52710i(d.mo48377b()));
    }

    /* renamed from: f */
    public sa3<?> mo48372f(String str) throws GeneralSecurityException {
        return mo48370d(str).mo48379d();
    }

    /* renamed from: g */
    public synchronized <KeyProtoT extends C4705c0> void mo48373g(hb3<KeyProtoT> hb3) throws GeneralSecurityException {
        if (hb3.mo43119a().isCompatible()) {
            mo48374h(m52709b(hb3), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + hb3.getClass() + " as it is not FIPS compatible.");
        }
    }

    /* renamed from: h */
    public final synchronized <P> void mo48374h(C6563b bVar, boolean z) throws GeneralSecurityException {
        String keyType = bVar.mo48379d().getKeyType();
        C6563b bVar2 = this.f34569a.get(keyType);
        if (bVar2 != null) {
            if (!bVar2.mo48376a().equals(bVar.mo48376a())) {
                Logger logger = f34568b;
                logger.warning("Attempted overwrite of a registered key manager for key type " + keyType);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{keyType, bVar2.mo48376a().getName(), bVar.mo48376a().getName()}));
            }
        }
        if (!z) {
            this.f34569a.putIfAbsent(keyType, bVar);
        } else {
            this.f34569a.put(keyType, bVar);
        }
    }

    /* renamed from: j */
    public boolean mo48375j(String str) {
        return this.f34569a.containsKey(str);
    }

    public ua3() {
        this.f34569a = new ConcurrentHashMap();
    }
}
