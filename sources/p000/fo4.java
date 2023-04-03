package p000;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B/\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001e¨\u0006$"}, mo44877d2 = {"Lfo4;", "E", "La7;", "Lho4;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lho4;", "remove", "", "iterator", "", "d", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "firstElement", "e", "getLastElement$runtime_release", "lastElement", "Lon4;", "Luh3;", "g", "Lon4;", "getHashMap$runtime_release", "()Lon4;", "hashMap", "", "()I", "size", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lon4;)V", "k", "a", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fo4 */
/* compiled from: PersistentOrderedSet.kt */
public final class fo4<E> extends C3801a7<E> implements ho4<E> {

    /* renamed from: k */
    public static final C2314a f11960k = new C2314a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final fo4 f11961r;

    /* renamed from: d */
    public final Object f11962d;

    /* renamed from: e */
    public final Object f11963e;

    /* renamed from: g */
    public final on4<E, uh3> f11964g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo44877d2 = {"Lfo4$a;", "", "E", "Lho4;", "a", "()Lho4;", "Lfo4;", "", "EMPTY", "Lfo4;", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: fo4$a */
    /* compiled from: PersistentOrderedSet.kt */
    public static final class C2314a {
        public C2314a() {
        }

        public /* synthetic */ C2314a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <E> ho4<E> mo20035a() {
            return fo4.f11961r;
        }
    }

    static {
        xp1 xp1 = xp1.f19948a;
        f11961r = new fo4(xp1, xp1, on4.f15955g.mo24021a());
    }

    public fo4(Object obj, Object obj2, on4<E, uh3> on4) {
        vx2.m53591g(on4, "hashMap");
        this.f11962d = obj;
        this.f11963e = obj2;
        this.f11964g = on4;
    }

    public ho4<E> add(E e) {
        if (this.f11964g.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new fo4(e, e, this.f11964g.mo24019p(e, new uh3()));
        }
        Object obj = this.f11963e;
        uh3 uh3 = this.f11964g.get(obj);
        vx2.m53588d(uh3);
        return new fo4(this.f11962d, e, this.f11964g.mo24019p(obj, uh3.mo26793e(e)).mo24019p(e, new uh3(obj)));
    }

    public boolean contains(Object obj) {
        return this.f11964g.containsKey(obj);
    }

    /* renamed from: e */
    public int mo11067e() {
        return this.f11964g.size();
    }

    public Iterator<E> iterator() {
        return new go4(this.f11962d, this.f11964g);
    }

    public ho4<E> remove(E e) {
        Object obj;
        Object obj2;
        uh3 uh3 = this.f11964g.get(e);
        if (uh3 == null) {
            return this;
        }
        on4<E, uh3> q = this.f11964g.mo24020q(e);
        if (uh3.mo26790b()) {
            uh3 uh32 = q.get(uh3.mo26792d());
            vx2.m53588d(uh32);
            q = q.mo24019p(uh3.mo26792d(), uh32.mo26793e(uh3.mo26791c()));
        }
        if (uh3.mo26789a()) {
            uh3 uh33 = q.get(uh3.mo26791c());
            vx2.m53588d(uh33);
            q = q.mo24019p(uh3.mo26791c(), uh33.mo26794f(uh3.mo26792d()));
        }
        if (!uh3.mo26790b()) {
            obj = uh3.mo26791c();
        } else {
            obj = this.f11962d;
        }
        if (!uh3.mo26789a()) {
            obj2 = uh3.mo26792d();
        } else {
            obj2 = this.f11963e;
        }
        return new fo4(obj, obj2, q);
    }
}
