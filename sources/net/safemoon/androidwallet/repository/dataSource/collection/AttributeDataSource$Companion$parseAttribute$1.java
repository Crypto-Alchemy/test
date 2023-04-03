package net.safemoon.androidwallet.repository.dataSource.collection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.collectible.RoomNFT;
import net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.dataSource.collection.AttributeDataSource$Companion", mo48632f = "AttributeDataSource.kt", mo48633l = {53, 58}, mo48634m = "parseAttribute")
/* compiled from: AttributeDataSource.kt */
public final class AttributeDataSource$Companion$parseAttribute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AttributeDataSource.Companion this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttributeDataSource$Companion$parseAttribute$1(AttributeDataSource.Companion companion, ns0<? super AttributeDataSource$Companion$parseAttribute$1> ns0) {
        super(ns0);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60789b((RoomNFT) null, (String) null, this);
    }
}
