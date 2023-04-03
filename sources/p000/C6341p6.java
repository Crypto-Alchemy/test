package p000;

import java.util.AbstractList;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Lp6;", "E", "", "Ljava/util/AbstractList;", "", "index", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "removeAt", "(I)Ljava/lang/Object;", "Lr37;", "add", "(ILjava/lang/Object;)V", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: p6 */
/* compiled from: AbstractMutableList.kt */
public abstract class C6341p6<E> extends AbstractList<E> implements d93 {
    public abstract void add(int i, E e);

    public abstract int getSize();

    public final /* bridge */ E remove(int i) {
        return removeAt(i);
    }

    public abstract E removeAt(int i);

    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return getSize();
    }
}
