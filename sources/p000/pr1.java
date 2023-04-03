package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: pr1 */
/* compiled from: constantValues.kt */
public abstract class pr1 extends fq0<r37> {

    /* renamed from: b */
    public static final C9186a f44096b = new C9186a((DefaultConstructorMarker) null);

    /* renamed from: pr1$a */
    /* compiled from: constantValues.kt */
    public static final class C9186a {
        public C9186a() {
        }

        public /* synthetic */ C9186a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final pr1 mo65345a(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new C9187b(str);
        }
    }

    /* renamed from: pr1$b */
    /* compiled from: constantValues.kt */
    public static final class C9187b extends pr1 {

        /* renamed from: c */
        public final String f44097c;

        public C9187b(String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f44097c = str;
        }

        /* renamed from: d */
        public lr1 mo50070a(mx3 mx3) {
            vx2.m53591g(mx3, "module");
            return nr1.m70033d(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f44097c);
        }

        public String toString() {
            return this.f44097c;
        }
    }

    public pr1() {
        super(r37.f33317a);
    }

    /* renamed from: c */
    public r37 mo51739b() {
        throw new UnsupportedOperationException();
    }
}
