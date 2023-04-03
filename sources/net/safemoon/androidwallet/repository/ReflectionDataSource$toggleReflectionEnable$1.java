package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsToken;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.ReflectionDataSource", mo48632f = "ReflectionDataSource.kt", mo48633l = {119}, mo48634m = "toggleReflectionEnable")
/* compiled from: ReflectionDataSource.kt */
public final class ReflectionDataSource$toggleReflectionEnable$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ReflectionDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionDataSource$toggleReflectionEnable$1(ReflectionDataSource reflectionDataSource, ns0<? super ReflectionDataSource$toggleReflectionEnable$1> ns0) {
        super(ns0);
        this.this$0 = reflectionDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60757r((RoomReflectionsToken) null, this);
    }
}
