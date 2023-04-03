package com.google.crypto.tink;

import com.google.crypto.tink.proto.C4663a;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.crypto.tink.c */
/* compiled from: PrimitiveSet */
public final class C4642c<P> {

    /* renamed from: a */
    public final ConcurrentMap<C4646d, List<C4645c<P>>> f25032a;

    /* renamed from: b */
    public C4645c<P> f25033b;

    /* renamed from: c */
    public final Class<P> f25034c;

    /* renamed from: d */
    public final rx3 f25035d;

    /* renamed from: e */
    public final boolean f25036e;

    /* renamed from: com.google.crypto.tink.c$b */
    /* compiled from: PrimitiveSet */
    public static class C4644b<P> {

        /* renamed from: a */
        public final Class<P> f25037a;

        /* renamed from: b */
        public ConcurrentMap<C4646d, List<C4645c<P>>> f25038b;

        /* renamed from: c */
        public C4645c<P> f25039c;

        /* renamed from: d */
        public rx3 f25040d;

        /* renamed from: a */
        public C4644b<P> mo35266a(P p, C4663a.C4666c cVar) throws GeneralSecurityException {
            return mo35268c(p, cVar, true);
        }

        /* renamed from: b */
        public C4644b<P> mo35267b(P p, C4663a.C4666c cVar) throws GeneralSecurityException {
            return mo35268c(p, cVar, false);
        }

        /* renamed from: c */
        public final C4644b<P> mo35268c(P p, C4663a.C4666c cVar, boolean z) throws GeneralSecurityException {
            if (this.f25038b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            } else if (cVar.mo35315K() == KeyStatusType.ENABLED) {
                C4645c<P> a = C4642c.m37080b(p, cVar, this.f25038b);
                if (z) {
                    if (this.f25039c == null) {
                        this.f25039c = a;
                    } else {
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                }
                return this;
            } else {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
        }

        /* renamed from: d */
        public C4642c<P> mo35269d() throws GeneralSecurityException {
            ConcurrentMap<C4646d, List<C4645c<P>>> concurrentMap = this.f25038b;
            if (concurrentMap != null) {
                C4642c cVar = new C4642c(concurrentMap, this.f25039c, this.f25040d, this.f25037a);
                this.f25038b = null;
                return cVar;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        /* renamed from: e */
        public C4644b<P> mo35270e(rx3 rx3) {
            if (this.f25038b != null) {
                this.f25040d = rx3;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }

        public C4644b(Class<P> cls) {
            this.f25038b = new ConcurrentHashMap();
            this.f25037a = cls;
            this.f25040d = rx3.f33629b;
        }
    }

    /* renamed from: com.google.crypto.tink.c$c */
    /* compiled from: PrimitiveSet */
    public static final class C4645c<P> {

        /* renamed from: a */
        public final P f25041a;

        /* renamed from: b */
        public final byte[] f25042b;

        /* renamed from: c */
        public final KeyStatusType f25043c;

        /* renamed from: d */
        public final OutputPrefixType f25044d;

        /* renamed from: e */
        public final int f25045e;

        /* renamed from: f */
        public final aa3 f25046f;

        public C4645c(P p, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i, aa3 aa3) {
            this.f25041a = p;
            this.f25042b = Arrays.copyOf(bArr, bArr.length);
            this.f25043c = keyStatusType;
            this.f25044d = outputPrefixType;
            this.f25045e = i;
            this.f25046f = aa3;
        }

        /* renamed from: a */
        public final byte[] mo35271a() {
            byte[] bArr = this.f25042b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        /* renamed from: b */
        public aa3 mo35272b() {
            return this.f25046f;
        }

        /* renamed from: c */
        public int mo35273c() {
            return this.f25045e;
        }

        /* renamed from: d */
        public OutputPrefixType mo35274d() {
            return this.f25044d;
        }

        /* renamed from: e */
        public tl4 mo35275e() {
            return this.f25046f.mo28899a();
        }

        /* renamed from: f */
        public P mo35276f() {
            return this.f25041a;
        }

        /* renamed from: g */
        public KeyStatusType mo35277g() {
            return this.f25043c;
        }
    }

    /* renamed from: com.google.crypto.tink.c$d */
    /* compiled from: PrimitiveSet */
    public static class C4646d implements Comparable<C4646d> {

        /* renamed from: a */
        public final byte[] f25047a;

        /* renamed from: a */
        public int compareTo(C4646d dVar) {
            byte[] bArr = this.f25047a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f25047a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.f25047a;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = dVar.f25047a[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4646d)) {
                return false;
            }
            return Arrays.equals(this.f25047a, ((C4646d) obj).f25047a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f25047a);
        }

        public String toString() {
            return yl2.m54811b(this.f25047a);
        }

        public C4646d(byte[] bArr) {
            this.f25047a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* renamed from: b */
    public static <P> C4645c<P> m37080b(P p, C4663a.C4666c cVar, ConcurrentMap<C4646d, List<C4645c<P>>> concurrentMap) throws GeneralSecurityException {
        Integer valueOf = Integer.valueOf(cVar.mo35313I());
        if (cVar.mo35314J() == OutputPrefixType.RAW) {
            valueOf = null;
        }
        C4645c cVar2 = new C4645c(p, iw0.m46033a(cVar), cVar.mo35315K(), cVar.mo35314J(), cVar.mo35313I(), q04.m50211a().mo46929c(ay4.m32290b(cVar.mo35312H().mo35289I(), cVar.mo35312H().mo35290J(), cVar.mo35312H().mo35288H(), cVar.mo35314J(), valueOf), ov2.m49581a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        C4646d dVar = new C4646d(cVar2.mo35271a());
        List put = concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (put != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(put);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    /* renamed from: j */
    public static <P> C4644b<P> m37081j(Class<P> cls) {
        return new C4644b<>(cls);
    }

    /* renamed from: c */
    public Collection<List<C4645c<P>>> mo35259c() {
        return this.f25032a.values();
    }

    /* renamed from: d */
    public rx3 mo35260d() {
        return this.f25035d;
    }

    /* renamed from: e */
    public C4645c<P> mo35261e() {
        return this.f25033b;
    }

    /* renamed from: f */
    public List<C4645c<P>> mo35262f(byte[] bArr) {
        List<C4645c<P>> list = this.f25032a.get(new C4646d(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    public Class<P> mo35263g() {
        return this.f25034c;
    }

    /* renamed from: h */
    public List<C4645c<P>> mo35264h() {
        return mo35262f(iw0.f30139a);
    }

    /* renamed from: i */
    public boolean mo35265i() {
        return !this.f25035d.mo47520b().isEmpty();
    }

    public C4642c(ConcurrentMap<C4646d, List<C4645c<P>>> concurrentMap, C4645c<P> cVar, rx3 rx3, Class<P> cls) {
        this.f25032a = concurrentMap;
        this.f25033b = cVar;
        this.f25034c = cls;
        this.f25035d = rx3;
        this.f25036e = false;
    }
}
