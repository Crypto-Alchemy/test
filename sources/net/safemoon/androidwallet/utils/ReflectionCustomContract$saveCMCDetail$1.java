package net.safemoon.androidwallet.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.utils.ReflectionCustomContract", mo48632f = "ReflectionCustomContract.kt", mo48633l = {86, 101, 106}, mo48634m = "saveCMCDetail")
/* compiled from: ReflectionCustomContract.kt */
public final class ReflectionCustomContract$saveCMCDetail$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ReflectionCustomContract this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionCustomContract$saveCMCDetail$1(ReflectionCustomContract reflectionCustomContract, ns0<? super ReflectionCustomContract$saveCMCDetail$1> ns0) {
        super(ns0);
        this.this$0 = reflectionCustomContract;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60944i((List<RoomReflectionsToken>) null, this);
    }
}
