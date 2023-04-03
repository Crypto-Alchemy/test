package p000;

import androidx.lifecycle.C0729l;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lgu2;", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "Lzv0;", "extras", "b", "(Ljava/lang/Class;Lzv0;)Lad7;", "", "Lbd7;", "a", "[Lbd7;", "initializers", "<init>", "([Lbd7;)V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: gu2 */
/* compiled from: InitializerViewModelFactory.kt */
public final class gu2 implements C0729l.C0733b {

    /* renamed from: a */
    public final bd7<?>[] f12614a;

    public gu2(bd7<?>... bd7Arr) {
        vx2.m53591g(bd7Arr, "initializers");
        this.f12614a = bd7Arr;
    }

    /* renamed from: a */
    public /* synthetic */ ad7 mo6370a(Class cls) {
        return ed7.m16078a(this, cls);
    }

    /* renamed from: b */
    public <T extends ad7> T mo6371b(Class<T> cls, zv0 zv0) {
        vx2.m53591g(cls, "modelClass");
        vx2.m53591g(zv0, "extras");
        T t = null;
        for (bd7<?> bd7 : this.f12614a) {
            if (vx2.m53586b(bd7.mo11534a(), cls)) {
                T invoke = bd7.mo11535b().invoke(zv0);
                if (invoke instanceof ad7) {
                    t = (ad7) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
