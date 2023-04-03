package net.safemoon.androidwallet.viewmodels.blockChainClass;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2", mo48632f = "MigrationToV2.kt", mo48633l = {152, 163}, mo48634m = "approve")
/* compiled from: MigrationToV2.kt */
public final class MigrationToV2$approve$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MigrationToV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MigrationToV2$approve$1(MigrationToV2 migrationToV2, ns0<? super MigrationToV2$approve$1> ns0) {
        super(ns0);
        this.this$0 = migrationToV2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo61814e(this);
    }
}
