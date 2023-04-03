package p000;

import java.security.GeneralSecurityException;
import p000.rw5;

/* renamed from: wa3 */
/* compiled from: KeyParser */
public abstract class wa3<SerializationT extends rw5> {

    /* renamed from: a */
    public final e70 f35270a;

    /* renamed from: b */
    public final Class<SerializationT> f35271b;

    /* renamed from: wa3$a */
    /* compiled from: KeyParser */
    public class C6647a extends wa3<SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ C6648b f35272c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6647a(e70 e70, Class cls, C6648b bVar) {
            super(e70, cls, (C6647a) null);
            this.f35272c = bVar;
        }

        /* renamed from: d */
        public aa3 mo48930d(SerializationT serializationt, ur5 ur5) throws GeneralSecurityException {
            return this.f35272c.mo48384a(serializationt, ur5);
        }
    }

    /* renamed from: wa3$b */
    /* compiled from: KeyParser */
    public interface C6648b<SerializationT extends rw5> {
        /* renamed from: a */
        aa3 mo48384a(SerializationT serializationt, ur5 ur5) throws GeneralSecurityException;
    }

    public /* synthetic */ wa3(e70 e70, Class cls, C6647a aVar) {
        this(e70, cls);
    }

    /* renamed from: a */
    public static <SerializationT extends rw5> wa3<SerializationT> m53770a(C6648b<SerializationT> bVar, e70 e70, Class<SerializationT> cls) {
        return new C6647a(e70, cls, bVar);
    }

    /* renamed from: b */
    public final e70 mo48928b() {
        return this.f35270a;
    }

    /* renamed from: c */
    public final Class<SerializationT> mo48929c() {
        return this.f35271b;
    }

    /* renamed from: d */
    public abstract aa3 mo48930d(SerializationT serializationt, ur5 ur5) throws GeneralSecurityException;

    public wa3(e70 e70, Class<SerializationT> cls) {
        this.f35270a = e70;
        this.f35271b = cls;
    }
}
