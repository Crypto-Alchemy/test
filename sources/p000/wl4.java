package p000;

import p000.rw5;

/* renamed from: wl4 */
/* compiled from: ParametersParser */
public abstract class wl4<SerializationT extends rw5> {

    /* renamed from: a */
    public final e70 f35375a;

    /* renamed from: b */
    public final Class<SerializationT> f35376b;

    /* renamed from: wl4$a */
    /* compiled from: ParametersParser */
    public class C6667a extends wl4<SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ C6668b f35377c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6667a(e70 e70, Class cls, C6668b bVar) {
            super(e70, cls, (C6667a) null);
            this.f35377c = bVar;
        }
    }

    /* renamed from: wl4$b */
    /* compiled from: ParametersParser */
    public interface C6668b<SerializationT extends rw5> {
    }

    public /* synthetic */ wl4(e70 e70, Class cls, C6667a aVar) {
        this(e70, cls);
    }

    /* renamed from: a */
    public static <SerializationT extends rw5> wl4<SerializationT> m53969a(C6668b<SerializationT> bVar, e70 e70, Class<SerializationT> cls) {
        return new C6667a(e70, cls, bVar);
    }

    /* renamed from: b */
    public final e70 mo49228b() {
        return this.f35375a;
    }

    /* renamed from: c */
    public final Class<SerializationT> mo49229c() {
        return this.f35376b;
    }

    public wl4(e70 e70, Class<SerializationT> cls) {
        this.f35375a = e70;
        this.f35376b = cls;
    }
}
