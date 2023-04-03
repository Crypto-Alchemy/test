package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;

/* renamed from: vf3 */
/* compiled from: LazyStringArrayList */
public class vf3 extends AbstractList<String> implements RandomAccess, xf3 {

    /* renamed from: d */
    public static final xf3 f45285d = new vf3().mo51372l();

    /* renamed from: a */
    public final List<Object> f45286a;

    public vf3() {
        this.f45286a = new ArrayList();
    }

    /* renamed from: j */
    public static c70 m73207j(Object obj) {
        if (obj instanceof c70) {
            return (c70) obj;
        }
        if (obj instanceof String) {
            return c70.m56317q((String) obj);
        }
        return c70.m56315n((byte[]) obj);
    }

    /* renamed from: k */
    public static String m73208k(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c70) {
            return ((c70) obj).mo50821M();
        }
        return C7621f.m62043b((byte[]) obj);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        this.f45286a.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public void add(int i, String str) {
        this.f45286a.add(i, str);
        this.modCount++;
    }

    /* renamed from: i */
    public List<?> mo51368i() {
        return Collections.unmodifiableList(this.f45286a);
    }

    /* renamed from: j0 */
    public void mo51371j0(c70 c70) {
        this.f45286a.add(c70);
        this.modCount++;
    }

    /* renamed from: l */
    public xf3 mo51372l() {
        return new e47(this);
    }

    /* renamed from: n */
    public String get(int i) {
        Object obj = this.f45286a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c70) {
            c70 c70 = (c70) obj;
            String M = c70.mo50821M();
            if (c70.mo50833w()) {
                this.f45286a.set(i, M);
            }
            return M;
        }
        byte[] bArr = (byte[]) obj;
        String b = C7621f.m62043b(bArr);
        if (C7621f.m62042a(bArr)) {
            this.f45286a.set(i, b);
        }
        return b;
    }

    /* renamed from: o */
    public String remove(int i) {
        Object remove = this.f45286a.remove(i);
        this.modCount++;
        return m73208k(remove);
    }

    /* renamed from: o0 */
    public c70 mo51374o0(int i) {
        Object obj = this.f45286a.get(i);
        c70 j = m73207j(obj);
        if (j != obj) {
            this.f45286a.set(i, j);
        }
        return j;
    }

    /* renamed from: q */
    public String set(int i, String str) {
        return m73208k(this.f45286a.set(i, str));
    }

    public int size() {
        return this.f45286a.size();
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof xf3) {
            collection = ((xf3) collection).mo51368i();
        }
        boolean addAll = this.f45286a.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public vf3(xf3 xf3) {
        this.f45286a = new ArrayList(xf3.size());
        addAll(xf3);
    }
}
