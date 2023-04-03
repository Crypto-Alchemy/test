package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\n\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005B\u0019\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R(\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, mo44877d2 = {"Lul4;", "", "T", "Lq83;", "clazz", "a", "(Lq83;)Ljava/lang/Object;", "", "toString", "", "Ljava/util/List;", "get_values", "()Ljava/util/List;", "get_values$annotations", "()V", "_values", "<init>", "(Ljava/util/List;)V", "b", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ul4 */
/* compiled from: ParametersHolder.kt */
public class ul4 {

    /* renamed from: b */
    public static final C9412a f45139b = new C9412a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final List<Object> f45140a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lul4$a;", "", "", "MAX_PARAMS", "I", "<init>", "()V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ul4$a */
    /* compiled from: ParametersHolder.kt */
    public static final class C9412a {
        public C9412a() {
        }

        public /* synthetic */ C9412a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ul4() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public ul4(List<Object> list) {
        vx2.m53591g(list, "_values");
        this.f45140a = list;
    }

    /* renamed from: a */
    public <T> T mo66334a(q83<?> q83) {
        T t;
        vx2.m53591g(q83, "clazz");
        Iterator<T> it = this.f45140a.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (q83.mo46999h(next) && next != null) {
                t = next;
                continue;
            }
        } while (t == null);
        return t;
    }

    public String toString() {
        return "DefinitionParameters" + CollectionsKt___CollectionsKt.m47311K0(this.f45140a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul4(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
