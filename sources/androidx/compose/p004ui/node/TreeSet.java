package androidx.compose.p004ui.node;

import java.util.Comparator;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Landroidx/compose/ui/node/TreeSet;", "E", "Ljava/util/TreeSet;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.node.TreeSet */
/* compiled from: JvmTreeSet.jvm.kt */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
        vx2.m53591g(comparator, "comparator");
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
