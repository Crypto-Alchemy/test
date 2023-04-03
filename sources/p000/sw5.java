package p000;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: sw5 */
/* compiled from: SerializationRegistry */
public final class sw5 {

    /* renamed from: a */
    public final Map<C6505d, za3<?, ?>> f34028a;

    /* renamed from: b */
    public final Map<C6504c, wa3<?>> f34029b;

    /* renamed from: c */
    public final Map<C6505d, xl4<?, ?>> f34030c;

    /* renamed from: d */
    public final Map<C6504c, wl4<?>> f34031d;

    /* renamed from: sw5$c */
    /* compiled from: SerializationRegistry */
    public static class C6504c {

        /* renamed from: a */
        public final Class<? extends rw5> f34036a;

        /* renamed from: b */
        public final e70 f34037b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C6504c)) {
                return false;
            }
            C6504c cVar = (C6504c) obj;
            if (!cVar.f34036a.equals(this.f34036a) || !cVar.f34037b.equals(this.f34037b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f34036a, this.f34037b});
        }

        public String toString() {
            return this.f34036a.getSimpleName() + ", object identifier: " + this.f34037b;
        }

        public C6504c(Class<? extends rw5> cls, e70 e70) {
            this.f34036a = cls;
            this.f34037b = e70;
        }
    }

    /* renamed from: sw5$d */
    /* compiled from: SerializationRegistry */
    public static class C6505d {

        /* renamed from: a */
        public final Class<?> f34038a;

        /* renamed from: b */
        public final Class<? extends rw5> f34039b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C6505d)) {
                return false;
            }
            C6505d dVar = (C6505d) obj;
            if (!dVar.f34038a.equals(this.f34038a) || !dVar.f34039b.equals(this.f34039b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f34038a, this.f34039b});
        }

        public String toString() {
            return this.f34038a.getSimpleName() + " with serialization type: " + this.f34039b.getSimpleName();
        }

        public C6505d(Class<?> cls, Class<? extends rw5> cls2) {
            this.f34038a = cls;
            this.f34039b = cls2;
        }
    }

    /* renamed from: e */
    public <SerializationT extends rw5> aa3 mo47879e(SerializationT serializationt, ur5 ur5) throws GeneralSecurityException {
        C6504c cVar = new C6504c(serializationt.getClass(), serializationt.mo29382a());
        if (this.f34029b.containsKey(cVar)) {
            return this.f34029b.get(cVar).mo48930d(serializationt, ur5);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public sw5(C6503b bVar) {
        this.f34028a = new HashMap(bVar.f34032a);
        this.f34029b = new HashMap(bVar.f34033b);
        this.f34030c = new HashMap(bVar.f34034c);
        this.f34031d = new HashMap(bVar.f34035d);
    }

    /* renamed from: sw5$b */
    /* compiled from: SerializationRegistry */
    public static final class C6503b {

        /* renamed from: a */
        public final Map<C6505d, za3<?, ?>> f34032a;

        /* renamed from: b */
        public final Map<C6504c, wa3<?>> f34033b;

        /* renamed from: c */
        public final Map<C6505d, xl4<?, ?>> f34034c;

        /* renamed from: d */
        public final Map<C6504c, wl4<?>> f34035d;

        public C6503b() {
            this.f34032a = new HashMap();
            this.f34033b = new HashMap();
            this.f34034c = new HashMap();
            this.f34035d = new HashMap();
        }

        /* renamed from: e */
        public sw5 mo47880e() {
            return new sw5(this);
        }

        /* renamed from: f */
        public <SerializationT extends rw5> C6503b mo47881f(wa3<SerializationT> wa3) throws GeneralSecurityException {
            C6504c cVar = new C6504c(wa3.mo48929c(), wa3.mo48928b());
            if (this.f34033b.containsKey(cVar)) {
                wa3 wa32 = this.f34033b.get(cVar);
                if (!wa32.equals(wa3) || !wa3.equals(wa32)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f34033b.put(cVar, wa3);
            }
            return this;
        }

        /* renamed from: g */
        public <KeyT extends aa3, SerializationT extends rw5> C6503b mo47882g(za3<KeyT, SerializationT> za3) throws GeneralSecurityException {
            C6505d dVar = new C6505d(za3.mo49814b(), za3.mo49815c());
            if (this.f34032a.containsKey(dVar)) {
                za3 za32 = this.f34032a.get(dVar);
                if (!za32.equals(za3) || !za3.equals(za32)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f34032a.put(dVar, za3);
            }
            return this;
        }

        /* renamed from: h */
        public <SerializationT extends rw5> C6503b mo47883h(wl4<SerializationT> wl4) throws GeneralSecurityException {
            C6504c cVar = new C6504c(wl4.mo49229c(), wl4.mo49228b());
            if (this.f34035d.containsKey(cVar)) {
                wl4 wl42 = this.f34035d.get(cVar);
                if (!wl42.equals(wl4) || !wl4.equals(wl42)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f34035d.put(cVar, wl4);
            }
            return this;
        }

        /* renamed from: i */
        public <ParametersT extends tl4, SerializationT extends rw5> C6503b mo47884i(xl4<ParametersT, SerializationT> xl4) throws GeneralSecurityException {
            C6505d dVar = new C6505d(xl4.mo49501b(), xl4.mo49502c());
            if (this.f34034c.containsKey(dVar)) {
                xl4 xl42 = this.f34034c.get(dVar);
                if (!xl42.equals(xl4) || !xl4.equals(xl42)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f34034c.put(dVar, xl4);
            }
            return this;
        }

        public C6503b(sw5 sw5) {
            this.f34032a = new HashMap(sw5.f34028a);
            this.f34033b = new HashMap(sw5.f34029b);
            this.f34034c = new HashMap(sw5.f34030c);
            this.f34035d = new HashMap(sw5.f34031d);
        }
    }
}
