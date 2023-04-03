package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AbstractCollection.kt */
public final class AbstractCollection$toString$1 extends Lambda implements rc2<E, CharSequence> {
    public final /* synthetic */ AbstractCollection<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractCollection$toString$1(AbstractCollection<? extends E> abstractCollection) {
        super(1);
        this.this$0 = abstractCollection;
    }

    public final CharSequence invoke(E e) {
        return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
    }
}
