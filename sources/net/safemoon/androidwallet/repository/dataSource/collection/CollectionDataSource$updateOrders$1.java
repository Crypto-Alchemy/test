package net.safemoon.androidwallet.repository.dataSource.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.collection.CollectionDataSource", mo48632f = "CollectionDataSource.kt", mo48633l = {45}, mo48634m = "updateOrders")
/* compiled from: CollectionDataSource.kt */
public final class CollectionDataSource$updateOrders$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CollectionDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionDataSource$updateOrders$1(CollectionDataSource collectionDataSource, ns0<? super CollectionDataSource$updateOrders$1> ns0) {
        super(ns0);
        this.this$0 = collectionDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60799h((List<Pair<Long, Integer>>) null, this);
    }
}
