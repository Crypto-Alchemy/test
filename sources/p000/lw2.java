package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Llw2;", "", "", "nextInt", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lw2 */
/* compiled from: PrimitiveIterators.kt */
public abstract class lw2 implements Iterator<Integer>, a93 {
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
