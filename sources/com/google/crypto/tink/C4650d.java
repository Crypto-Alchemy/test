package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4705c0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p000.hb3;

/* renamed from: com.google.crypto.tink.d */
/* compiled from: Registry */
public final class C4650d {

    /* renamed from: a */
    public static final Logger f25051a = Logger.getLogger(C4650d.class.getName());

    /* renamed from: b */
    public static final AtomicReference<ua3> f25052b = new AtomicReference<>(new ua3());

    /* renamed from: c */
    public static final ConcurrentMap<String, C4652b> f25053c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap<String, Boolean> f25054d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap<String, Object> f25055e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap<Class<?>, ev4<?, ?>> f25056f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final ConcurrentMap<String, KeyTemplate> f25057g = new ConcurrentHashMap();

    /* renamed from: com.google.crypto.tink.d$a */
    /* compiled from: Registry */
    public class C4651a implements C4652b {

        /* renamed from: a */
        public final /* synthetic */ hb3 f25058a;

        public C4651a(hb3 hb3) {
            this.f25058a = hb3;
        }
    }

    /* renamed from: com.google.crypto.tink.d$b */
    /* compiled from: Registry */
    public interface C4652b {
    }

    /* renamed from: a */
    public static <KeyProtoT extends C4705c0> C4652b m37105a(hb3<KeyProtoT> hb3) {
        return new C4651a(hb3);
    }

    /* renamed from: b */
    public static synchronized <KeyProtoT extends C4705c0, KeyFormatProtoT extends C4705c0> void m37106b(String str, Map<String, hb3.C5887a.C5888a<KeyFormatProtoT>> map, boolean z) throws GeneralSecurityException {
        synchronized (C4650d.class) {
            if (z) {
                try {
                    ConcurrentMap<String, Boolean> concurrentMap = f25054d;
                    if (concurrentMap.containsKey(str)) {
                        if (!concurrentMap.get(str).booleanValue()) {
                            throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                if (f25052b.get().mo48375j(str)) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!f25057g.containsKey(next.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) next.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry next2 : map.entrySet()) {
                        if (f25057g.containsKey(next2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) next2.getKey()));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static Class<?> m37107c(Class<?> cls) {
        ev4 ev4 = f25056f.get(cls);
        if (ev4 == null) {
            return null;
        }
        return ev4.mo42435b();
    }

    /* renamed from: d */
    public static <P> P m37108d(KeyData keyData, Class<P> cls) throws GeneralSecurityException {
        return m37109e(keyData.mo35289I(), keyData.mo35290J(), cls);
    }

    /* renamed from: e */
    public static <P> P m37109e(String str, ByteString byteString, Class<P> cls) throws GeneralSecurityException {
        return f25052b.get().mo48369c(str, cls).mo47711b(byteString);
    }

    /* renamed from: f */
    public static <P> P m37110f(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return m37109e(str, ByteString.copyFrom(bArr), cls);
    }

    /* renamed from: g */
    public static sa3<?> m37111g(String str) throws GeneralSecurityException {
        return f25052b.get().mo48372f(str);
    }

    /* renamed from: h */
    public static synchronized Map<String, KeyTemplate> m37112h() {
        Map<String, KeyTemplate> unmodifiableMap;
        synchronized (C4650d.class) {
            unmodifiableMap = Collections.unmodifiableMap(f25057g);
        }
        return unmodifiableMap;
    }

    /* renamed from: i */
    public static synchronized C4705c0 m37113i(cb3 cb3) throws GeneralSecurityException {
        C4705c0 c;
        synchronized (C4650d.class) {
            sa3<?> g = m37111g(cb3.mo29915I());
            if (f25054d.get(cb3.mo29915I()).booleanValue()) {
                c = g.mo47712c(cb3.mo29916J());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + cb3.mo29915I());
            }
        }
        return c;
    }

    /* renamed from: j */
    public static synchronized KeyData m37114j(cb3 cb3) throws GeneralSecurityException {
        KeyData a;
        synchronized (C4650d.class) {
            sa3<?> g = m37111g(cb3.mo29915I());
            if (f25054d.get(cb3.mo29915I()).booleanValue()) {
                a = g.mo47710a(cb3.mo29916J());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + cb3.mo29915I());
            }
        }
        return a;
    }

    /* renamed from: k */
    public static synchronized <KeyProtoT extends C4705c0> void m37115k(hb3<KeyProtoT> hb3, boolean z) throws GeneralSecurityException {
        Map<String, hb3.C5887a.C5888a<?>> map;
        synchronized (C4650d.class) {
            if (hb3 != null) {
                AtomicReference<ua3> atomicReference = f25052b;
                ua3 ua3 = new ua3(atomicReference.get());
                ua3.mo48373g(hb3);
                String d = hb3.mo29945d();
                if (z) {
                    map = hb3.mo29946f().mo43125c();
                } else {
                    map = Collections.emptyMap();
                }
                m37106b(d, map, z);
                if (!atomicReference.get().mo48375j(d)) {
                    f25053c.put(d, m37105a(hb3));
                    if (z) {
                        m37116l(d, hb3.mo29946f().mo43125c());
                    }
                }
                f25054d.put(d, Boolean.valueOf(z));
                atomicReference.set(ua3);
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: l */
    public static <KeyFormatProtoT extends C4705c0> void m37116l(String str, Map<String, hb3.C5887a.C5888a<KeyFormatProtoT>> map) {
        for (Map.Entry next : map.entrySet()) {
            f25057g.put((String) next.getKey(), KeyTemplate.m37053a(str, ((C4705c0) ((hb3.C5887a.C5888a) next.getValue()).f29508a).toByteArray(), ((hb3.C5887a.C5888a) next.getValue()).f29509b));
        }
    }

    /* renamed from: m */
    public static synchronized <B, P> void m37117m(ev4<B, P> ev4) throws GeneralSecurityException {
        synchronized (C4650d.class) {
            if (ev4 != null) {
                Class<P> c = ev4.mo42436c();
                ConcurrentMap<Class<?>, ev4<?, ?>> concurrentMap = f25056f;
                if (concurrentMap.containsKey(c)) {
                    ev4 ev42 = concurrentMap.get(c);
                    if (!ev4.getClass().getName().equals(ev42.getClass().getName())) {
                        Logger logger = f25051a;
                        logger.warning("Attempted overwrite of a registered PrimitiveWrapper for type " + c);
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{c.getName(), ev42.getClass().getName(), ev4.getClass().getName()}));
                    }
                }
                concurrentMap.put(c, ev4);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.crypto.tink.c, com.google.crypto.tink.c<B>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P m37118n(com.google.crypto.tink.C4642c<B> r3, java.lang.Class<P> r4) throws java.security.GeneralSecurityException {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, ev4<?, ?>> r0 = f25056f
            java.lang.Object r4 = r0.get(r4)
            ev4 r4 = (p000.ev4) r4
            if (r4 == 0) goto L_0x0044
            java.lang.Class r0 = r4.mo42435b()
            java.lang.Class r1 = r3.mo35263g()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r3 = r4.mo42434a(r3)
            return r3
        L_0x001d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.append(r2)
            java.lang.Class r4 = r4.mo42435b()
            r1.append(r4)
            java.lang.String r4 = ", got "
            r1.append(r4)
            java.lang.Class r3 = r3.mo35263g()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0044:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No wrapper found for "
            r0.append(r1)
            java.lang.Class r3 = r3.mo35263g()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.C4650d.m37118n(com.google.crypto.tink.c, java.lang.Class):java.lang.Object");
    }
}
