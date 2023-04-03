package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.dl4;
import p000.y11;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "Key", "Value", "Lhu0;", "Ldl4$b$b;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.LegacyPagingSource$load$2", mo48632f = "LegacyPagingSource.kt", mo48633l = {116}, mo48634m = "invokeSuspend")
/* compiled from: LegacyPagingSource.kt */
public final class LegacyPagingSource$load$2 extends SuspendLambda implements fd2<hu0, ns0<? super dl4.C2176b.C2178b<Key, Value>>, Object> {
    public final /* synthetic */ Ref$ObjectRef $dataSourceParams;
    public final /* synthetic */ dl4.C2171a $params;
    public int label;
    public final /* synthetic */ LegacyPagingSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyPagingSource$load$2(LegacyPagingSource legacyPagingSource, Ref$ObjectRef ref$ObjectRef, dl4.C2171a aVar, ns0 ns0) {
        super(2, ns0);
        this.this$0 = legacyPagingSource;
        this.$dataSourceParams = ref$ObjectRef;
        this.$params = aVar;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        return new LegacyPagingSource$load$2(this.this$0, this.$dataSourceParams, this.$params, ns0);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyPagingSource$load$2) create(obj, (ns0) obj2)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        wx2.m54101d();
        int i = this.label;
        Object obj3 = null;
        if (i == 0) {
            hg5.m45199b(obj);
            this.this$0.mo8657i();
            y11.C3652b bVar = (y11.C3652b) this.$dataSourceParams.element;
            this.label = 1;
            throw null;
        } else if (i == 1) {
            hg5.m45199b(obj);
            y11.C3650a aVar = (y11.C3650a) obj;
            List<Value> list = aVar.f20003a;
            if (!list.isEmpty() || !(this.$params instanceof dl4.C2171a.C2174c)) {
                obj2 = aVar.mo27907d();
            } else {
                obj2 = null;
            }
            if (!aVar.f20003a.isEmpty() || !(this.$params instanceof dl4.C2171a.C2172a)) {
                obj3 = aVar.mo27906c();
            }
            return new dl4.C2176b.C2178b(list, obj2, obj3, aVar.mo27905b(), aVar.mo27904a());
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
