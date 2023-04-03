package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import p000.ka5;

/* renamed from: ca5 */
/* compiled from: ReflectJavaField.kt */
public final class ca5 extends ea5 implements f13 {

    /* renamed from: a */
    public final Field f37093a;

    public ca5(Field field) {
        vx2.m53591g(field, "member");
        this.f37093a = field;
    }

    /* renamed from: H */
    public boolean mo50846H() {
        return mo50848S().isEnumConstant();
    }

    /* renamed from: M */
    public boolean mo50847M() {
        return false;
    }

    /* renamed from: U */
    public Field mo50848S() {
        return this.f37093a;
    }

    /* renamed from: V */
    public ka5 getType() {
        ka5.C7340a aVar = ka5.f38877a;
        Type genericType = mo50848S().getGenericType();
        vx2.m53590f(genericType, "member.genericType");
        return aVar.mo52886a(genericType);
    }
}
