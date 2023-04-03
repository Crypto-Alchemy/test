package p000;

import p000.rw5;
import p000.tl4;

/* renamed from: xl4 */
/* compiled from: ParametersSerializer */
public abstract class xl4<ParametersT extends tl4, SerializationT extends rw5> {

    /* renamed from: a */
    public final Class<ParametersT> f35653a;

    /* renamed from: b */
    public final Class<SerializationT> f35654b;

    /* renamed from: xl4$a */
    /* compiled from: ParametersSerializer */
    public class C6703a extends xl4<ParametersT, SerializationT> {

        /* renamed from: c */
        public final /* synthetic */ C6704b f35655c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6703a(Class cls, Class cls2, C6704b bVar) {
            super(cls, cls2, (C6703a) null);
            this.f35655c = bVar;
        }
    }

    /* renamed from: xl4$b */
    /* compiled from: ParametersSerializer */
    public interface C6704b<ParametersT extends tl4, SerializationT extends rw5> {
    }

    public /* synthetic */ xl4(Class cls, Class cls2, C6703a aVar) {
        this(cls, cls2);
    }

    /* renamed from: a */
    public static <ParametersT extends tl4, SerializationT extends rw5> xl4<ParametersT, SerializationT> m54428a(C6704b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new C6703a(cls, cls2, bVar);
    }

    /* renamed from: b */
    public Class<ParametersT> mo49501b() {
        return this.f35653a;
    }

    /* renamed from: c */
    public Class<SerializationT> mo49502c() {
        return this.f35654b;
    }

    public xl4(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f35653a = cls;
        this.f35654b = cls2;
    }
}
