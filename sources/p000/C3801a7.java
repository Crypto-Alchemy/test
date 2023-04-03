package p000;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000 \f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\r"}, mo44877d2 = {"La7;", "E", "Lkotlin/collections/AbstractCollection;", "", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: a7 */
/* compiled from: AbstractSet.kt */
public abstract class C3801a7<E> extends AbstractCollection<E> implements Set<E> {

    /* renamed from: a */
    public static final C3802a f20826a = new C3802a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\t2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, mo44877d2 = {"La7$a;", "", "", "c", "", "b", "(Ljava/util/Collection;)I", "", "other", "", "a", "(Ljava/util/Set;Ljava/util/Set;)Z", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: a7$a */
    /* compiled from: AbstractSet.kt */
    public static final class C3802a {
        public C3802a() {
        }

        public /* synthetic */ C3802a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo28887a(Set<?> set, Set<?> set2) {
            vx2.m53591g(set, "c");
            vx2.m53591g(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* renamed from: b */
        public final int mo28888b(Collection<?> collection) {
            int i;
            vx2.m53591g(collection, "c");
            int i2 = 0;
            for (Object next : collection) {
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 += i;
            }
            return i2;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f20826a.mo28887a(this, (Set) obj);
    }

    public int hashCode() {
        return f20826a.mo28888b(this);
    }
}
