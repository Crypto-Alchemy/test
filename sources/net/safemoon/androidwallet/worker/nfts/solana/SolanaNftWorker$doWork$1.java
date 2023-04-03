package net.safemoon.androidwallet.worker.nfts.solana;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.worker.nfts.solana.SolanaNftWorker", mo48632f = "SolanaNftWorker.kt", mo48633l = {41, 43, 59, 72, 79, 81, 85, 87, 98, 99}, mo48634m = "doWork")
/* compiled from: SolanaNftWorker.kt */
public final class SolanaNftWorker$doWork$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SolanaNftWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SolanaNftWorker$doWork$1(SolanaNftWorker solanaNftWorker, ns0<? super SolanaNftWorker$doWork$1> ns0) {
        super(ns0);
        this.this$0 = solanaNftWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo10853r(this);
    }
}
