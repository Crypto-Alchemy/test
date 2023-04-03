package com.tinder;

import com.tinder.StateMachine;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00070\b\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\b\b\u0001\u0010\u0001*\u00028\u0005\"\b\b\u0002\u0010\u0003*\u00020\u0002\"\b\b\u0003\u0010\u0004*\u00020\u0002\"\b\b\u0004\u0010\u0005*\u00020\u0002\"\b\b\u0005\u0010\u0003*\u00020\u0002\"\b\b\u0006\u0010\u0004*\u00020\u0002\"\b\b\u0007\u0010\u0005*\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u00052\u0006\u0010\u0007\u001a\u00028\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, mo44877d2 = {"E", "S", "", "STATE", "EVENT", "SIDE_EFFECT", "state", "event", "Lcom/tinder/StateMachine$b$a$a;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$b$a$a;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 0})
/* compiled from: StateMachine.kt */
public final class StateMachine$GraphBuilder$StateDefinitionBuilder$on$1 extends Lambda implements fd2<STATE, EVENT, StateMachine.C5470b.C5471a.C5472a<? extends STATE, ? extends SIDE_EFFECT>> {
    public final /* synthetic */ fd2 $createTransitionTo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateMachine$GraphBuilder$StateDefinitionBuilder$on$1(fd2 fd2) {
        super(2);
        this.$createTransitionTo = fd2;
    }

    public final StateMachine.C5470b.C5471a.C5472a<STATE, SIDE_EFFECT> invoke(STATE state, EVENT event) {
        vx2.m53592h(state, "state");
        vx2.m53592h(event, "event");
        return (StateMachine.C5470b.C5471a.C5472a) this.$createTransitionTo.invoke(state, event);
    }
}
