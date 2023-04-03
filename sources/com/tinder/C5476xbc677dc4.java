package com.tinder;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00028\u0004\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\b\b\u0003\u0010\u0004*\u00020\u0001\"\b\b\u0004\u0010\u0002*\u00020\u0001\"\b\b\u0005\u0010\u0003*\u00020\u0001\"\b\b\u0006\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u00042\u0006\u0010\u0006\u001a\u00028\u0005H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo44877d2 = {"S", "L;", "STATE", "EVENT", "kotlin/Any", "state", "cause", "Lr37;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V", "com/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$1$1", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 0})
/* renamed from: com.tinder.StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$$inlined$with$lambda$1 */
/* compiled from: StateMachine.kt */
public final class C5476xbc677dc4 extends Lambda implements fd2<STATE, EVENT, r37> {
    public final /* synthetic */ fd2 $listener$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5476xbc677dc4(fd2 fd2) {
        super(2);
        this.$listener$inlined = fd2;
    }

    public final void invoke(STATE state, EVENT event) {
        vx2.m53592h(state, "state");
        vx2.m53592h(event, "cause");
        this.$listener$inlined.invoke(state, event);
    }
}
