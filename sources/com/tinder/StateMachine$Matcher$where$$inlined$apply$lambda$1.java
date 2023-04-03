package com.tinder;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {1, 0, 3}, mo44876d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u0002H\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u00032\u0006\u0010\b\u001a\u0002H\u0002H\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, mo44877d2 = {"<anonymous>", "", "T", "", "R", "STATE", "EVENT", "SIDE_EFFECT", "it", "invoke", "(Ljava/lang/Object;)Z", "com/tinder/StateMachine$Matcher$where$1$1"}, mo44878k = 3, mo44879mv = {1, 1, 13})
/* compiled from: StateMachine.kt */
public final class StateMachine$Matcher$where$$inlined$apply$lambda$1 extends Lambda implements rc2<T, Boolean> {
    public final /* synthetic */ rc2 $predicate$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateMachine$Matcher$where$$inlined$apply$lambda$1(rc2 rc2) {
        super(1);
        this.$predicate$inlined = rc2;
    }

    public final boolean invoke(T t) {
        vx2.m53592h(t, "it");
        return ((Boolean) this.$predicate$inlined.invoke(t)).booleanValue();
    }
}
