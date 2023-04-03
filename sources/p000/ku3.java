package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.ju3;
import p018io.reactivex.exceptions.CompositeException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lku3;", "", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lju3;", "b", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lju3;", "a", "", "Lju3$a;", "Ljava/util/List;", "messageAdapterFactories", "", "Lku3$a;", "Ljava/util/Map;", "messageAdapterCache", "<init>", "(Ljava/util/List;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ku3 */
/* compiled from: MessageAdapterResolver.kt */
public final class ku3 {

    /* renamed from: a */
    public final List<ju3.C6128a> f31072a;

    /* renamed from: b */
    public final Map<C6203a, ju3<Object>> f31073b = new LinkedHashMap();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lku3$a;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/reflect/Type;", "a", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "type", "", "", "b", "[Ljava/lang/annotation/Annotation;", "getAnnotations", "()[Ljava/lang/annotation/Annotation;", "annotations", "<init>", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: ku3$a */
    /* compiled from: MessageAdapterResolver.kt */
    public static final class C6203a {

        /* renamed from: a */
        public final Type f31074a;

        /* renamed from: b */
        public final Annotation[] f31075b;

        public C6203a(Type type, Annotation[] annotationArr) {
            vx2.m53591g(type, "type");
            vx2.m53591g(annotationArr, "annotations");
            this.f31074a = type;
            this.f31075b = annotationArr;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<C6203a> cls2 = C6203a.class;
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            if (!vx2.m53586b(cls2, cls)) {
                return false;
            }
            if (obj != null) {
                C6203a aVar = (C6203a) obj;
                if (vx2.m53586b(this.f31074a, aVar.f31074a) && Arrays.equals(this.f31075b, aVar.f31075b)) {
                    return true;
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.tinder.scarlet.internal.servicemethod.MessageAdapterResolver.MessageAdapterKey");
        }

        public int hashCode() {
            return (this.f31074a.hashCode() * 31) + Arrays.hashCode(this.f31075b);
        }

        public String toString() {
            return "MessageAdapterKey(type=" + this.f31074a + ", annotations=" + Arrays.toString(this.f31075b) + ')';
        }
    }

    public ku3(List<? extends ju3.C6128a> list) {
        vx2.m53591g(list, "messageAdapterFactories");
        this.f31072a = list;
    }

    /* renamed from: a */
    public final ju3<Object> mo45290a(Type type, Annotation[] annotationArr) {
        ArrayList arrayList = new ArrayList();
        for (ju3.C6128a a : this.f31072a) {
            try {
                return a.mo42691a(type, annotationArr);
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        Object[] array = arrayList.toArray(new Throwable[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Throwable[] thArr = (Throwable[]) array;
        CompositeException compositeException = new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
        throw new IllegalStateException("Cannot resolve message adapter for type: " + type + ", annotations: " + annotationArr + '.', compositeException);
    }

    /* renamed from: b */
    public final ju3<Object> mo45291b(Type type, Annotation[] annotationArr) {
        vx2.m53591g(type, "type");
        vx2.m53591g(annotationArr, "annotations");
        C6203a aVar = new C6203a(type, annotationArr);
        if (this.f31073b.containsKey(aVar)) {
            ju3<Object> ju3 = this.f31073b.get(aVar);
            vx2.m53588d(ju3);
            return ju3;
        }
        ju3<Object> a = mo45290a(type, annotationArr);
        this.f31073b.put(aVar, a);
        return a;
    }
}
