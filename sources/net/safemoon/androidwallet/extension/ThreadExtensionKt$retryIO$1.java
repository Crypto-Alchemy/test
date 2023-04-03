package net.safemoon.androidwallet.extension;

import com.github.mikephil.charting.utils.Utils;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.extension.ThreadExtensionKt", mo48632f = "ThreadExtension.kt", mo48633l = {32, 41, 44}, mo48634m = "retryIO")
/* compiled from: ThreadExtension.kt */
public final class ThreadExtensionKt$retryIO$1<T> extends ContinuationImpl {
    public double D$0;
    public int I$0;
    public int I$1;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ThreadExtensionKt$retryIO$1(ns0<? super ThreadExtensionKt$retryIO$1> ns0) {
        super(ns0);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ThreadExtensionKt.m66347a(0, 0, 0, Utils.DOUBLE_EPSILON, (fd2) null, this);
    }
}
