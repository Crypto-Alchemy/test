package p000;

import p000.aa3;
import p000.rw5;

/* renamed from: za3 */
/* compiled from: KeySerializer */
public abstract class za3<KeyT extends aa3, SerializationT extends rw5> {

    /* renamed from: a */
    public final Class<KeyT> f36085a;

    /* renamed from: b */
    public final Class<SerializationT> f36086b;

    /* renamed from: za3$a */
    /* compiled from: KeySerializer */
    public class C6761a extends za3<KeyT, SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ C6762b f36087c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6761a(Class cls, Class cls2, C6762b bVar) {
            super(cls, cls2, (C6761a) null);
            this.f36087c = bVar;
        }
    }

    /* renamed from: za3$b */
    /* compiled from: KeySerializer */
    public interface C6762b<KeyT extends aa3, SerializationT extends rw5> {
    }

    public /* synthetic */ za3(Class cls, Class cls2, C6761a aVar) {
        this(cls, cls2);
    }

    /* renamed from: a */
    public static <KeyT extends aa3, SerializationT extends rw5> za3<KeyT, SerializationT> m55040a(C6762b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new C6761a(cls, cls2, bVar);
    }

    /* renamed from: b */
    public Class<KeyT> mo49814b() {
        return this.f36085a;
    }

    /* renamed from: c */
    public Class<SerializationT> mo49815c() {
        return this.f36086b;
    }

    public za3(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f36085a = cls;
        this.f36086b = cls2;
    }
}
