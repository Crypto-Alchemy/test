package p000;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import p000.ja6;
import p018io.reactivex.exceptions.CompositeException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, mo44877d2 = {"Lka6;", "", "Ljava/lang/reflect/Type;", "type", "Lja6;", "a", "", "Lja6$a;", "Ljava/util/List;", "streamAdapterFactories", "<init>", "(Ljava/util/List;)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: ka6 */
/* compiled from: StreamAdapterResolver.kt */
public final class ka6 {

    /* renamed from: a */
    public final List<ja6.C6024a> f30777a;

    public ka6(List<? extends ja6.C6024a> list) {
        vx2.m53591g(list, "streamAdapterFactories");
        this.f30777a = list;
    }

    /* renamed from: a */
    public final ja6<Object, Object> mo44729a(Type type) {
        vx2.m53591g(type, "type");
        ArrayList arrayList = new ArrayList();
        for (ja6.C6024a a : this.f30777a) {
            try {
                return a.mo40756a(type);
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
        throw new IllegalStateException("Cannot resolve stream adapter for type " + type + '.', compositeException);
    }
}
