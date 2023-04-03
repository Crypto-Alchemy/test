package com.tinder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \t*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0001:\u0005\f\u0018\u001f \tB#\b\u0002\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006*\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b*\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u000f*\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u000f*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0002R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b¨\u0006!"}, mo44877d2 = {"Lcom/tinder/StateMachine;", "", "STATE", "EVENT", "SIDE_EFFECT", "event", "Lcom/tinder/StateMachine$c;", "g", "(Ljava/lang/Object;)Lcom/tinder/StateMachine$c;", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$c;", "Lcom/tinder/StateMachine$b$a;", "a", "(Ljava/lang/Object;)Lcom/tinder/StateMachine$b$a;", "cause", "Lr37;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "e", "f", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "stateRef", "Lcom/tinder/StateMachine$b;", "b", "Lcom/tinder/StateMachine$b;", "graph", "()Ljava/lang/Object;", "state", "<init>", "(Lcom/tinder/StateMachine$b;)V", "GraphBuilder", "Matcher", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
/* compiled from: StateMachine.kt */
public final class StateMachine<STATE, EVENT, SIDE_EFFECT> {

    /* renamed from: c */
    public static final C5469a f26961c = new C5469a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final AtomicReference<STATE> f26962a;

    /* renamed from: b */
    public final C5470b<STATE, EVENT, SIDE_EFFECT> f26963b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t\"\b\b\u0003\u0010\u0002*\u00020\u0001\"\b\b\u0004\u0010\u0003*\u00020\u0001\"\b\b\u0005\u0010\u0004*\u00020\u00012$\u0010\b\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006\u0012\u0004\u0012\u00020\u00070\u0005Jz\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t\"\b\b\u0003\u0010\u0002*\u00020\u0001\"\b\b\u0004\u0010\u0003*\u00020\u0001\"\b\b\u0005\u0010\u0004*\u00020\u00012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u000b2$\u0010\b\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¨\u0006\u0010"}, mo44877d2 = {"Lcom/tinder/StateMachine$a;", "", "STATE", "EVENT", "SIDE_EFFECT", "Lkotlin/Function1;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lr37;", "init", "Lcom/tinder/StateMachine;", "a", "Lcom/tinder/StateMachine$b;", "graph", "b", "<init>", "()V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: com.tinder.StateMachine$a */
    /* compiled from: StateMachine.kt */
    public static final class C5469a {
        public C5469a() {
        }

        public /* synthetic */ C5469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <STATE, EVENT, SIDE_EFFECT> StateMachine<STATE, EVENT, SIDE_EFFECT> mo39652a(rc2<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>, r37> rc2) {
            vx2.m53592h(rc2, ZendeskBlipsProvider.ACTION_CORE_INIT);
            return mo39653b((C5470b) null, rc2);
        }

        /* renamed from: b */
        public final <STATE, EVENT, SIDE_EFFECT> StateMachine<STATE, EVENT, SIDE_EFFECT> mo39653b(C5470b<STATE, EVENT, SIDE_EFFECT> bVar, rc2<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>, r37> rc2) {
            GraphBuilder graphBuilder = new GraphBuilder(bVar);
            rc2.invoke(graphBuilder);
            return new StateMachine<>(graphBuilder.mo39640a(), (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\b\b\u0004\u0010\u0003*\u00020\u0001*\b\b\u0005\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\fBm\u0012\u0006\u0010\u000f\u001a\u00028\u0003\u00120\u0010\u0017\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00120\u0010\u0012*\u0010\u001e\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u0018¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00028\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eRA\u0010\u0017\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00120\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R;\u0010\u001e\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u001a\u0012\u0004\u0012\u00020\u001b0\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lcom/tinder/StateMachine$b;", "", "STATE", "EVENT", "SIDE_EFFECT", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "initialState", "", "Lcom/tinder/StateMachine$Matcher;", "Lcom/tinder/StateMachine$b$a;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "stateDefinitions", "", "Lkotlin/Function1;", "Lcom/tinder/StateMachine$c;", "Lr37;", "Ljava/util/List;", "()Ljava/util/List;", "onTransitionListeners", "<init>", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;)V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: com.tinder.StateMachine$b */
    /* compiled from: StateMachine.kt */
    public static final class C5470b<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        public final STATE f26972a;

        /* renamed from: b */
        public final Map<Matcher<STATE, STATE>, C5471a<STATE, EVENT, SIDE_EFFECT>> f26973b;

        /* renamed from: c */
        public final List<rc2<C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37>> f26974c;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0006\u0010\u0002*\u00020\u0001*\b\b\u0007\u0010\u0003*\u00020\u0001*\b\b\b\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\bB\t\b\u0000¢\u0006\u0004\b\u0016\u0010\u0017R/\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR/\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\nR\u0001\u0010\u0015\u001ar\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00070\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\b0\u00100\u00060\u000ej8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00070\u000f\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\b0\u00100\u0006`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lcom/tinder/StateMachine$b$a;", "", "STATE", "EVENT", "SIDE_EFFECT", "", "Lkotlin/Function2;", "Lr37;", "a", "Ljava/util/List;", "()Ljava/util/List;", "onEnterListeners", "b", "onExitListeners", "Ljava/util/LinkedHashMap;", "Lcom/tinder/StateMachine$Matcher;", "Lcom/tinder/StateMachine$b$a$a;", "Lkotlin/collections/LinkedHashMap;", "c", "Ljava/util/LinkedHashMap;", "()Ljava/util/LinkedHashMap;", "transitions", "<init>", "()V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
        /* renamed from: com.tinder.StateMachine$b$a */
        /* compiled from: StateMachine.kt */
        public static final class C5471a<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            public final List<fd2<STATE, EVENT, r37>> f26975a = new ArrayList();

            /* renamed from: b */
            public final List<fd2<STATE, EVENT, r37>> f26976b = new ArrayList();

            /* renamed from: c */
            public final LinkedHashMap<Matcher<EVENT, EVENT>, fd2<STATE, EVENT, C5472a<STATE, SIDE_EFFECT>>> f26977c = new LinkedHashMap<>();

            @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\n\b\t\u0010\u0002 \u0001*\u00020\u0001*\n\b\n\u0010\u0003 \u0001*\u00020\u00012\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0010\u001a\u00028\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00018\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00028\tHÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00018\nHÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00028\t8\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0019\u0010\u0012\u001a\u0004\u0018\u00018\n8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0015"}, mo44877d2 = {"Lcom/tinder/StateMachine$b$a$a;", "", "STATE", "SIDE_EFFECT", "a", "()Ljava/lang/Object;", "b", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "getToState", "toState", "getSideEffect", "sideEffect", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
            /* renamed from: com.tinder.StateMachine$b$a$a */
            /* compiled from: StateMachine.kt */
            public static final class C5472a<STATE, SIDE_EFFECT> {

                /* renamed from: a */
                public final STATE f26978a;

                /* renamed from: b */
                public final SIDE_EFFECT f26979b;

                public C5472a(STATE state, SIDE_EFFECT side_effect) {
                    vx2.m53592h(state, "toState");
                    this.f26978a = state;
                    this.f26979b = side_effect;
                }

                /* renamed from: a */
                public final STATE mo39663a() {
                    return this.f26978a;
                }

                /* renamed from: b */
                public final SIDE_EFFECT mo39664b() {
                    return this.f26979b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5472a)) {
                        return false;
                    }
                    C5472a aVar = (C5472a) obj;
                    return vx2.m53586b(this.f26978a, aVar.f26978a) && vx2.m53586b(this.f26979b, aVar.f26979b);
                }

                public int hashCode() {
                    STATE state = this.f26978a;
                    int i = 0;
                    int hashCode = (state != null ? state.hashCode() : 0) * 31;
                    SIDE_EFFECT side_effect = this.f26979b;
                    if (side_effect != null) {
                        i = side_effect.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.f26978a + ", sideEffect=" + this.f26979b + ")";
                }
            }

            /* renamed from: a */
            public final List<fd2<STATE, EVENT, r37>> mo39660a() {
                return this.f26975a;
            }

            /* renamed from: b */
            public final List<fd2<STATE, EVENT, r37>> mo39661b() {
                return this.f26976b;
            }

            /* renamed from: c */
            public final LinkedHashMap<Matcher<EVENT, EVENT>, fd2<STATE, EVENT, C5472a<STATE, SIDE_EFFECT>>> mo39662c() {
                return this.f26977c;
            }
        }

        public C5470b(STATE state, Map<Matcher<STATE, STATE>, C5471a<STATE, EVENT, SIDE_EFFECT>> map, List<? extends rc2<? super C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37>> list) {
            vx2.m53592h(state, "initialState");
            vx2.m53592h(map, "stateDefinitions");
            vx2.m53592h(list, "onTransitionListeners");
            this.f26972a = state;
            this.f26973b = map;
            this.f26974c = list;
        }

        /* renamed from: a */
        public final STATE mo39654a() {
            return this.f26972a;
        }

        /* renamed from: b */
        public final List<rc2<C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37>> mo39655b() {
            return this.f26974c;
        }

        /* renamed from: c */
        public final Map<Matcher<STATE, STATE>, C5471a<STATE, EVENT, SIDE_EFFECT>> mo39656c() {
            return this.f26973b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5470b)) {
                return false;
            }
            C5470b bVar = (C5470b) obj;
            return vx2.m53586b(this.f26972a, bVar.f26972a) && vx2.m53586b(this.f26973b, bVar.f26973b) && vx2.m53586b(this.f26974c, bVar.f26974c);
        }

        public int hashCode() {
            STATE state = this.f26972a;
            int i = 0;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<Matcher<STATE, STATE>, C5471a<STATE, EVENT, SIDE_EFFECT>> map = this.f26973b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<rc2<C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37>> list = this.f26974c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Graph(initialState=" + this.f26972a + ", stateDefinitions=" + this.f26973b + ", onTransitionListeners=" + this.f26974c + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0003\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0004\u0010\u0003 \u0001*\u00020\u0001*\n\b\u0005\u0010\u0004 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0005\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0007\u001a\u00028\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f¨\u0006\r"}, mo44877d2 = {"Lcom/tinder/StateMachine$c;", "", "STATE", "EVENT", "SIDE_EFFECT", "a", "()Ljava/lang/Object;", "fromState", "<init>", "()V", "b", "Lcom/tinder/StateMachine$c$b;", "Lcom/tinder/StateMachine$c$a;", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: com.tinder.StateMachine$c */
    /* compiled from: StateMachine.kt */
    public static abstract class C5473c<STATE, EVENT, SIDE_EFFECT> {

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000*\n\b\u0006\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0001*\n\b\b\u0010\u0004 \u0001*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u0005B\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00028\u0006\u0012\u0006\u0010\u0012\u001a\u00028\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0010\u001a\u00028\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00028\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, mo44877d2 = {"Lcom/tinder/StateMachine$c$a;", "", "STATE", "EVENT", "SIDE_EFFECT", "Lcom/tinder/StateMachine$c;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "fromState", "b", "event", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
        /* renamed from: com.tinder.StateMachine$c$a */
        /* compiled from: StateMachine.kt */
        public static final class C5474a<STATE, EVENT, SIDE_EFFECT> extends C5473c<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            public final STATE f26980a;

            /* renamed from: b */
            public final EVENT f26981b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5474a(STATE state, EVENT event) {
                super((DefaultConstructorMarker) null);
                vx2.m53592h(state, "fromState");
                vx2.m53592h(event, "event");
                this.f26980a = state;
                this.f26981b = event;
            }

            /* renamed from: a */
            public STATE mo39668a() {
                return this.f26980a;
            }

            /* renamed from: b */
            public EVENT mo39669b() {
                return this.f26981b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5474a)) {
                    return false;
                }
                C5474a aVar = (C5474a) obj;
                return vx2.m53586b(mo39668a(), aVar.mo39668a()) && vx2.m53586b(mo39669b(), aVar.mo39669b());
            }

            public int hashCode() {
                Object a = mo39668a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                Object b = mo39669b();
                if (b != null) {
                    i = b.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return "Invalid(fromState=" + mo39668a() + ", event=" + mo39669b() + ")";
            }
        }

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000*\n\b\u0006\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0001*\n\b\b\u0010\u0004 \u0001*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u0005B+\b\u0000\u0012\u0006\u0010\u0010\u001a\u00028\u0006\u0012\u0006\u0010\u0012\u001a\u00028\u0007\u0012\u0006\u0010\u0014\u001a\u00028\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00018\b¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0010\u001a\u00028\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00028\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0014\u001a\u00028\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\u0017\u001a\u0004\u0018\u00018\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u001a"}, mo44877d2 = {"Lcom/tinder/StateMachine$c$b;", "", "STATE", "EVENT", "SIDE_EFFECT", "Lcom/tinder/StateMachine$c;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "fromState", "b", "event", "c", "toState", "d", "getSideEffect", "sideEffect", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
        /* renamed from: com.tinder.StateMachine$c$b */
        /* compiled from: StateMachine.kt */
        public static final class C5475b<STATE, EVENT, SIDE_EFFECT> extends C5473c<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            public final STATE f26982a;

            /* renamed from: b */
            public final EVENT f26983b;

            /* renamed from: c */
            public final STATE f26984c;

            /* renamed from: d */
            public final SIDE_EFFECT f26985d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5475b(STATE state, EVENT event, STATE state2, SIDE_EFFECT side_effect) {
                super((DefaultConstructorMarker) null);
                vx2.m53592h(state, "fromState");
                vx2.m53592h(event, "event");
                vx2.m53592h(state2, "toState");
                this.f26982a = state;
                this.f26983b = event;
                this.f26984c = state2;
                this.f26985d = side_effect;
            }

            /* renamed from: a */
            public STATE mo39668a() {
                return this.f26982a;
            }

            /* renamed from: b */
            public EVENT mo39673b() {
                return this.f26983b;
            }

            /* renamed from: c */
            public final STATE mo39674c() {
                return this.f26984c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5475b)) {
                    return false;
                }
                C5475b bVar = (C5475b) obj;
                return vx2.m53586b(mo39668a(), bVar.mo39668a()) && vx2.m53586b(mo39673b(), bVar.mo39673b()) && vx2.m53586b(this.f26984c, bVar.f26984c) && vx2.m53586b(this.f26985d, bVar.f26985d);
            }

            public int hashCode() {
                Object a = mo39668a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                Object b = mo39673b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                STATE state = this.f26984c;
                int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 31;
                SIDE_EFFECT side_effect = this.f26985d;
                if (side_effect != null) {
                    i = side_effect.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                return "Valid(fromState=" + mo39668a() + ", event=" + mo39673b() + ", toState=" + this.f26984c + ", sideEffect=" + this.f26985d + ")";
            }
        }

        public C5473c() {
        }

        public /* synthetic */ C5473c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract STATE mo39668a();
    }

    public StateMachine(C5470b<STATE, EVENT, SIDE_EFFECT> bVar) {
        this.f26963b = bVar;
        this.f26962a = new AtomicReference<>(bVar.mo39654a());
    }

    /* renamed from: a */
    public final C5470b.C5471a<STATE, EVENT, SIDE_EFFECT> mo39633a(STATE state) {
        Map<Matcher<STATE, STATE>, C5470b.C5471a<STATE, EVENT, SIDE_EFFECT>> c = this.f26963b.mo39656c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : c.entrySet()) {
            if (((Matcher) next.getKey()).mo39649b(state)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry value : linkedHashMap.entrySet()) {
            arrayList.add((C5470b.C5471a) value.getValue());
        }
        C5470b.C5471a<STATE, EVENT, SIDE_EFFECT> aVar = (C5470b.C5471a) CollectionsKt___CollectionsKt.m47331b0(arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Missing definition for state " + state.getClass().getSimpleName() + '!').toString());
    }

    /* renamed from: b */
    public final STATE mo39634b() {
        STATE state = this.f26962a.get();
        vx2.m53587c(state, "stateRef.get()");
        return state;
    }

    /* renamed from: c */
    public final C5473c<STATE, EVENT, SIDE_EFFECT> mo39635c(STATE state, EVENT event) {
        for (Map.Entry entry : mo39633a(state).mo39662c().entrySet()) {
            fd2 fd2 = (fd2) entry.getValue();
            if (((Matcher) entry.getKey()).mo39649b(event)) {
                C5470b.C5471a.C5472a aVar = (C5470b.C5471a.C5472a) fd2.invoke(state, event);
                return new C5473c.C5475b(state, event, aVar.mo39663a(), aVar.mo39664b());
            }
        }
        return new C5473c.C5474a(state, event);
    }

    /* renamed from: d */
    public final void mo39636d(STATE state, EVENT event) {
        for (fd2 invoke : mo39633a(state).mo39660a()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: e */
    public final void mo39637e(STATE state, EVENT event) {
        for (fd2 invoke : mo39633a(state).mo39661b()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: f */
    public final void mo39638f(C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> cVar) {
        for (rc2 invoke : this.f26963b.mo39655b()) {
            invoke.invoke(cVar);
        }
    }

    /* renamed from: g */
    public final C5473c<STATE, EVENT, SIDE_EFFECT> mo39639g(EVENT event) {
        C5473c<STATE, EVENT, SIDE_EFFECT> c;
        vx2.m53592h(event, "event");
        synchronized (this) {
            STATE state = this.f26962a.get();
            vx2.m53587c(state, "fromState");
            c = mo39635c(state, event);
            if (c instanceof C5473c.C5475b) {
                this.f26962a.set(((C5473c.C5475b) c).mo39674c());
            }
        }
        mo39638f(c);
        if (c instanceof C5473c.C5475b) {
            C5473c.C5475b bVar = (C5473c.C5475b) c;
            mo39637e(bVar.mo39668a(), event);
            mo39636d(bVar.mo39674c(), event);
        }
        return c;
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0007*\b\b\u0003\u0010\u0002*\u00020\u0001*\n\b\u0004\u0010\u0003 \u0001*\u00028\u00032\u00020\u0001:\u0001\fB\u0017\b\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00040\u000f¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u00050\u0004J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0003¢\u0006\u0004\b\t\u0010\nR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00050\u00040\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00040\u000f8\bX\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lcom/tinder/StateMachine$Matcher;", "", "T", "R", "Lkotlin/Function1;", "", "predicate", "c", "value", "b", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "predicates", "Ljava/lang/Class;", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/Class;)V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* compiled from: StateMachine.kt */
    public static final class Matcher<T, R extends T> {

        /* renamed from: c */
        public static final C5468a f26969c = new C5468a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final List<rc2<T, Boolean>> f26970a;

        /* renamed from: b */
        public final Class<R> f26971b;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0006\"\b\b\u0005\u0010\u0002*\u00020\u0001\"\b\b\u0006\u0010\u0003*\u00028\u00052\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00060\u0004¨\u0006\n"}, mo44877d2 = {"Lcom/tinder/StateMachine$Matcher$a;", "", "T", "R", "Ljava/lang/Class;", "clazz", "Lcom/tinder/StateMachine$Matcher;", "a", "<init>", "()V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
        /* renamed from: com.tinder.StateMachine$Matcher$a */
        /* compiled from: StateMachine.kt */
        public static final class C5468a {
            public C5468a() {
            }

            public /* synthetic */ C5468a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final <T, R extends T> Matcher<T, R> mo39651a(Class<R> cls) {
                vx2.m53592h(cls, "clazz");
                return new Matcher<>(cls, (DefaultConstructorMarker) null);
            }
        }

        public Matcher(Class<R> cls) {
            this.f26971b = cls;
            this.f26970a = ck0.m33068p(new StateMachine$Matcher$predicates$1(this));
        }

        /* renamed from: b */
        public final boolean mo39649b(T t) {
            vx2.m53592h(t, "value");
            List<rc2<T, Boolean>> list = this.f26970a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (rc2 invoke : list) {
                if (!((Boolean) invoke.invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final Matcher<T, R> mo39650c(rc2<? super R, Boolean> rc2) {
            vx2.m53592h(rc2, "predicate");
            this.f26970a.add(new StateMachine$Matcher$where$$inlined$apply$lambda$1(rc2));
            return this;
        }

        public /* synthetic */ Matcher(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
            this(cls);
        }
    }

    public /* synthetic */ StateMachine(C5470b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\b\b\u0004\u0010\u0003*\u00020\u0001*\b\b\u0005\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001#B%\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0007\u0010\bJT\u0010\u000f\u001a\u00020\u0006\"\b\b\u0006\u0010\t*\u00028\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00060\n2.\u0010\u000e\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u00060\rR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u00060\fJ,\u0010\u0012\u001a\u00020\u00062$\u0010\u0011\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\u0012\u0004\u0012\u00020\u00060\fJ\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015RÉ\u0001\u0010\u001b\u001a¶\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003 \u0017*\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003\u0018\u00010\n0\n\u00120\u0012.\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005 \u0017*\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u00180\u00180\u0016jZ\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003 \u0017*\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003\u0018\u00010\n0\n\u00120\u0012.\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005 \u0017*\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u00180\u0018`\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR­\u0001\u0010\u001f\u001a\u0001\u0012H\u0012F\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\u0012\u0004\u0012\u00020\u0006 \u0017*\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f0\f0\u001cjL\u0012H\u0012F\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\u0012\u0004\u0012\u00020\u0006 \u0017*\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f0\f`\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006$"}, mo44877d2 = {"Lcom/tinder/StateMachine$GraphBuilder;", "", "STATE", "EVENT", "SIDE_EFFECT", "initialState", "Lr37;", "b", "(Ljava/lang/Object;)V", "S", "Lcom/tinder/StateMachine$Matcher;", "stateMatcher", "Lkotlin/Function1;", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "init", "d", "Lcom/tinder/StateMachine$c;", "listener", "c", "Lcom/tinder/StateMachine$b;", "a", "Ljava/lang/Object;", "Ljava/util/LinkedHashMap;", "kotlin.jvm.PlatformType", "Lcom/tinder/StateMachine$b$a;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "stateDefinitions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "onTransitionListeners", "graph", "<init>", "(Lcom/tinder/StateMachine$b;)V", "StateDefinitionBuilder", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* compiled from: StateMachine.kt */
    public static final class GraphBuilder<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        public STATE f26964a;

        /* renamed from: b */
        public final LinkedHashMap<Matcher<STATE, STATE>, C5470b.C5471a<STATE, EVENT, SIDE_EFFECT>> f26965b;

        /* renamed from: c */
        public final ArrayList<rc2<C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37>> f26966c;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00028\u00032\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019JJ\u0010\n\u001a\u00020\t\"\b\b\u0007\u0010\u0003*\u00028\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00070\u00042$\u0010\b\u001a \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00070\u0006J \u0010\r\u001a\u00020\f2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\t0\u0006J\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000eJ1\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0007*\u00028\u00062\u0006\u0010\u0010\u001a\u00028\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0005¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0007*\u00028\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u0005¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "S", "", "E", "Lcom/tinder/StateMachine$Matcher;", "eventMatcher", "Lkotlin/Function2;", "Lcom/tinder/StateMachine$b$a$a;", "createTransitionTo", "Lr37;", "d", "listener", "", "e", "Lcom/tinder/StateMachine$b$a;", "a", "state", "sideEffect", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$b$a$a;", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$b$a$a;", "Lcom/tinder/StateMachine$b$a;", "stateDefinition", "<init>", "(Lcom/tinder/StateMachine$GraphBuilder;)V", "state-machine"}, mo44878k = 1, mo44879mv = {1, 4, 0})
        /* compiled from: StateMachine.kt */
        public final class StateDefinitionBuilder<S extends STATE> {

            /* renamed from: a */
            public final C5470b.C5471a<STATE, EVENT, SIDE_EFFECT> f26967a = new C5470b.C5471a<>();

            public StateDefinitionBuilder() {
            }

            /* renamed from: c */
            public static /* synthetic */ C5470b.C5471a.C5472a m41931c(StateDefinitionBuilder stateDefinitionBuilder, Object obj, Object obj2, int i, Object obj3) {
                if ((i & 1) != 0) {
                    obj2 = null;
                }
                return stateDefinitionBuilder.mo39645b(obj, obj2);
            }

            /* renamed from: g */
            public static /* synthetic */ C5470b.C5471a.C5472a m41932g(StateDefinitionBuilder stateDefinitionBuilder, Object obj, Object obj2, Object obj3, int i, Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                return stateDefinitionBuilder.mo39648f(obj, obj2, obj3);
            }

            /* renamed from: a */
            public final C5470b.C5471a<STATE, EVENT, SIDE_EFFECT> mo39644a() {
                return this.f26967a;
            }

            /* renamed from: b */
            public final C5470b.C5471a.C5472a<STATE, SIDE_EFFECT> mo39645b(S s, SIDE_EFFECT side_effect) {
                vx2.m53592h(s, "receiver$0");
                return mo39648f(s, s, side_effect);
            }

            /* renamed from: d */
            public final <E extends EVENT> void mo39646d(Matcher<EVENT, ? extends E> matcher, fd2<? super S, ? super E, ? extends C5470b.C5471a.C5472a<? extends STATE, ? extends SIDE_EFFECT>> fd2) {
                vx2.m53592h(matcher, "eventMatcher");
                vx2.m53592h(fd2, "createTransitionTo");
                this.f26967a.mo39662c().put(matcher, new StateMachine$GraphBuilder$StateDefinitionBuilder$on$1(fd2));
            }

            /* renamed from: e */
            public final boolean mo39647e(fd2<? super S, ? super EVENT, r37> fd2) {
                vx2.m53592h(fd2, "listener");
                return this.f26967a.mo39660a().add(new C5476xbc677dc4(fd2));
            }

            /* renamed from: f */
            public final C5470b.C5471a.C5472a<STATE, SIDE_EFFECT> mo39648f(S s, STATE state, SIDE_EFFECT side_effect) {
                vx2.m53592h(s, "receiver$0");
                vx2.m53592h(state, "state");
                return new C5470b.C5471a.C5472a<>(state, side_effect);
            }
        }

        public GraphBuilder() {
            this((C5470b) null, 1, (DefaultConstructorMarker) null);
        }

        public GraphBuilder(C5470b<STATE, EVENT, SIDE_EFFECT> bVar) {
            List<rc2<C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37>> j;
            Map<Matcher<STATE, STATE>, C5470b.C5471a<STATE, EVENT, SIDE_EFFECT>> i;
            this.f26964a = bVar != null ? bVar.mo39654a() : null;
            this.f26965b = new LinkedHashMap<>((bVar == null || (i = bVar.mo39656c()) == null) ? C6177b.m47361i() : i);
            this.f26966c = new ArrayList<>((bVar == null || (j = bVar.mo39655b()) == null) ? ck0.m33062j() : j);
        }

        /* renamed from: a */
        public final C5470b<STATE, EVENT, SIDE_EFFECT> mo39640a() {
            STATE state = this.f26964a;
            if (state != null) {
                return new C5470b<>(state, C6177b.m47371s(this.f26965b), CollectionsKt___CollectionsKt.m47311K0(this.f26966c));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: b */
        public final void mo39641b(STATE state) {
            vx2.m53592h(state, "initialState");
            this.f26964a = state;
        }

        /* renamed from: c */
        public final void mo39642c(rc2<? super C5473c<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, r37> rc2) {
            vx2.m53592h(rc2, "listener");
            this.f26966c.add(rc2);
        }

        /* renamed from: d */
        public final <S extends STATE> void mo39643d(Matcher<STATE, ? extends S> matcher, rc2<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>.StateDefinitionBuilder<S>, r37> rc2) {
            vx2.m53592h(matcher, "stateMatcher");
            vx2.m53592h(rc2, ZendeskBlipsProvider.ACTION_CORE_INIT);
            LinkedHashMap<Matcher<STATE, STATE>, C5470b.C5471a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.f26965b;
            StateDefinitionBuilder stateDefinitionBuilder = new StateDefinitionBuilder();
            rc2.invoke(stateDefinitionBuilder);
            linkedHashMap.put(matcher, stateDefinitionBuilder.mo39644a());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GraphBuilder(C5470b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bVar);
        }
    }
}
