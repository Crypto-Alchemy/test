package com.tinder.scarlet.internal.connection;

import com.tinder.StateMachine;
import com.tinder.scarlet.internal.connection.Connection;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.et1;
import p000.q86;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n"}, mo44877d2 = {"Lcom/tinder/StateMachine$GraphBuilder;", "Lq86;", "Let1;", "", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 5, 1})
/* compiled from: Connection.kt */
public final class Connection$StateManager$stateMachine$1 extends Lambda implements rc2<StateMachine.GraphBuilder<q86, et1, Object>, r37> {
    public final /* synthetic */ Connection.StateManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Connection$StateManager$stateMachine$1(Connection.StateManager stateManager) {
        super(1);
        this.this$0 = stateManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StateMachine.GraphBuilder<q86, et1, Object>) (StateMachine.GraphBuilder) obj);
        return r37.f33317a;
    }

    public final void invoke(StateMachine.GraphBuilder<q86, et1, Object> graphBuilder) {
        vx2.m53591g(graphBuilder, "$this$create");
        final Connection.StateManager stateManager = this.this$0;
        C54771 r0 = new rc2<StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6392d>, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6392d>) (StateMachine.GraphBuilder.StateDefinitionBuilder) obj);
                return r37.f33317a;
            }

            public final void invoke(final StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6392d> stateDefinitionBuilder) {
                vx2.m53591g(stateDefinitionBuilder, "$this$state");
                final Connection.StateManager stateManager = stateManager;
                stateDefinitionBuilder.mo39647e(new fd2<q86.C6392d, et1, r37>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((q86.C6392d) obj, (et1) obj2);
                        return r37.f33317a;
                    }

                    public final void invoke(q86.C6392d dVar, et1 et1) {
                        vx2.m53591g(dVar, "$this$onEnter");
                        vx2.m53591g(et1, "it");
                        stateManager.mo39692t();
                    }
                });
                StateMachine.Matcher f = stateManager.mo39688p();
                final Connection.StateManager stateManager2 = stateManager;
                stateDefinitionBuilder.mo39646d(f, new fd2<q86.C6392d, et1.C5810a.C5811a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6392d dVar, et1.C5810a.C5811a<?> aVar) {
                        vx2.m53591g(dVar, "$this$on");
                        vx2.m53591g(aVar, "it");
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, dVar, new q86.C6390b(stateManager2.mo39691s(), 0), (Object) null, 2, (Object) null);
                    }
                });
                StateMachine.Matcher g = stateManager.mo39689q();
                final Connection.StateManager stateManager3 = stateManager;
                stateDefinitionBuilder.mo39646d(g, new fd2<q86.C6392d, et1.C5810a.C5811a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6392d dVar, et1.C5810a.C5811a<?> aVar) {
                        vx2.m53591g(dVar, "$this$on");
                        vx2.m53591g(aVar, "it");
                        stateManager3.mo39692t();
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41931c(stateDefinitionBuilder, dVar, (Object) null, 1, (Object) null);
                    }
                });
                stateDefinitionBuilder.mo39646d(StateMachine.Matcher.f26969c.mo39651a(et1.C5810a.C5812b.class), new fd2<q86.C6392d, et1.C5810a.C5812b, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6392d dVar, et1.C5810a.C5812b bVar) {
                        vx2.m53591g(dVar, "$this$on");
                        vx2.m53591g(bVar, "it");
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, dVar, q86.C6391c.f32971a, (Object) null, 2, (Object) null);
                    }
                });
            }
        };
        StateMachine.Matcher.C5468a aVar = StateMachine.Matcher.f26969c;
        graphBuilder.mo39643d(aVar.mo39651a(q86.C6392d.class), r0);
        final Connection.StateManager stateManager2 = this.this$0;
        graphBuilder.mo39643d(aVar.mo39651a(q86.C6394f.class), new rc2<StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6394f>, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6394f>) (StateMachine.GraphBuilder.StateDefinitionBuilder) obj);
                return r37.f33317a;
            }

            public final void invoke(final StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6394f> stateDefinitionBuilder) {
                vx2.m53591g(stateDefinitionBuilder, "$this$state");
                final Connection.StateManager stateManager = stateManager2;
                stateDefinitionBuilder.mo39647e(new fd2<q86.C6394f, et1, r37>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((q86.C6394f) obj, (et1) obj2);
                        return r37.f33317a;
                    }

                    public final void invoke(q86.C6394f fVar, et1 et1) {
                        vx2.m53591g(fVar, "$this$onEnter");
                        vx2.m53591g(et1, "it");
                        stateManager.mo39692t();
                    }
                });
                final Connection.StateManager stateManager2 = stateManager2;
                C54842 r0 = new fd2<q86.C6394f, et1.C5813b, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6394f fVar, et1.C5813b bVar) {
                        vx2.m53591g(fVar, "$this$on");
                        vx2.m53591g(bVar, "it");
                        ox5 h = stateManager2.mo39691s();
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, fVar, new q86.C6390b(h, fVar.mo47013a() + 1), (Object) null, 2, (Object) null);
                    }
                };
                StateMachine.Matcher.C5468a aVar = StateMachine.Matcher.f26969c;
                stateDefinitionBuilder.mo39646d(aVar.mo39651a(et1.C5813b.class), r0);
                StateMachine.Matcher f = stateManager2.mo39688p();
                final Connection.StateManager stateManager3 = stateManager2;
                stateDefinitionBuilder.mo39646d(f, new fd2<q86.C6394f, et1.C5810a.C5811a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6394f fVar, et1.C5810a.C5811a<?> aVar) {
                        vx2.m53591g(fVar, "$this$on");
                        vx2.m53591g(aVar, "it");
                        stateManager3.mo39692t();
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41931c(stateDefinitionBuilder, fVar, (Object) null, 1, (Object) null);
                    }
                });
                StateMachine.Matcher g = stateManager2.mo39689q();
                final Connection.StateManager stateManager4 = stateManager2;
                stateDefinitionBuilder.mo39646d(g, new fd2<q86.C6394f, et1.C5810a.C5811a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6394f fVar, et1.C5810a.C5811a<?> aVar) {
                        vx2.m53591g(fVar, "$this$on");
                        vx2.m53591g(aVar, "it");
                        stateManager4.mo39684l(fVar);
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, fVar, q86.C6392d.f32972a, (Object) null, 2, (Object) null);
                    }
                });
                final Connection.StateManager stateManager5 = stateManager2;
                stateDefinitionBuilder.mo39646d(aVar.mo39651a(et1.C5810a.C5812b.class), new fd2<q86.C6394f, et1.C5810a.C5812b, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6394f fVar, et1.C5810a.C5812b bVar) {
                        vx2.m53591g(fVar, "$this$on");
                        vx2.m53591g(bVar, "it");
                        stateManager5.mo39684l(fVar);
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, fVar, q86.C6391c.f32971a, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        final Connection.StateManager stateManager3 = this.this$0;
        graphBuilder.mo39643d(aVar.mo39651a(q86.C6390b.class), new rc2<StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6390b>, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6390b>) (StateMachine.GraphBuilder.StateDefinitionBuilder) obj);
                return r37.f33317a;
            }

            public final void invoke(final StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6390b> stateDefinitionBuilder) {
                vx2.m53591g(stateDefinitionBuilder, "$this$state");
                stateDefinitionBuilder.mo39646d(stateManager3.mo39695w(), new fd2<q86.C6390b, et1.C5815d.C5816a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6390b bVar, et1.C5815d.C5816a<?> aVar) {
                        vx2.m53591g(bVar, "$this$on");
                        vx2.m53591g(aVar, "it");
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, bVar, new q86.C6389a(bVar.mo47009b()), (Object) null, 2, (Object) null);
                    }
                });
                final Connection.StateManager stateManager = stateManager3;
                stateDefinitionBuilder.mo39646d(StateMachine.Matcher.f26969c.mo39651a(et1.C5815d.C5817b.class), new fd2<q86.C6390b, et1.C5815d.C5817b, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6390b bVar, et1.C5815d.C5817b bVar2) {
                        vx2.m53591g(bVar, "$this$on");
                        vx2.m53591g(bVar2, "it");
                        long a = stateManager.f26994c.mo44468a(bVar.mo47008a());
                        th1 j = stateManager.mo39693u(a);
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, bVar, new q86.C6394f(j, bVar.mo47008a(), a), (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        final Connection.StateManager stateManager4 = this.this$0;
        graphBuilder.mo39643d(aVar.mo39651a(q86.C6389a.class), new rc2<StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6389a>, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6389a>) (StateMachine.GraphBuilder.StateDefinitionBuilder) obj);
                return r37.f33317a;
            }

            public final void invoke(final StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6389a> stateDefinitionBuilder) {
                vx2.m53591g(stateDefinitionBuilder, "$this$state");
                final Connection.StateManager stateManager = stateManager4;
                stateDefinitionBuilder.mo39647e(new fd2<q86.C6389a, et1, r37>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((q86.C6389a) obj, (et1) obj2);
                        return r37.f33317a;
                    }

                    public final void invoke(q86.C6389a aVar, et1 et1) {
                        vx2.m53591g(aVar, "$this$onEnter");
                        vx2.m53591g(et1, "it");
                        stateManager.mo39692t();
                    }
                });
                StateMachine.Matcher f = stateManager4.mo39688p();
                final Connection.StateManager stateManager2 = stateManager4;
                stateDefinitionBuilder.mo39646d(f, new fd2<q86.C6389a, et1.C5810a.C5811a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6389a aVar, et1.C5810a.C5811a<?> aVar2) {
                        vx2.m53591g(aVar, "$this$on");
                        vx2.m53591g(aVar2, "it");
                        stateManager2.mo39692t();
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41931c(stateDefinitionBuilder, aVar, (Object) null, 1, (Object) null);
                    }
                });
                StateMachine.Matcher g = stateManager4.mo39689q();
                final Connection.StateManager stateManager3 = stateManager4;
                stateDefinitionBuilder.mo39646d(g, new fd2<q86.C6389a, et1.C5810a.C5811a<?>, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    /* JADX WARNING: type inference failed for: r9v0, types: [et1$a$a, java.lang.Object, et1$a$a<?>] */
                    /* JADX WARNING: Unknown variable types count: 1 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final com.tinder.StateMachine.C5470b.C5471a.C5472a<p000.q86, java.lang.Object> invoke(p000.q86.C6389a r8, p000.et1.C5810a.C5811a<?> r9) {
                        /*
                            r7 = this;
                            java.lang.String r0 = "$this$on"
                            p000.vx2.m53591g(r8, r0)
                            java.lang.String r0 = "it"
                            p000.vx2.m53591g(r9, r0)
                            com.tinder.scarlet.internal.connection.Connection$StateManager r0 = r2
                            kg3$a r9 = r9.mo42400a()
                            r0.mo39687o(r8, r9)
                            com.tinder.StateMachine$GraphBuilder<q86, et1, java.lang.Object>$StateDefinitionBuilder<q86$a> r1 = r4
                            q86$e r3 = p000.q86.C6393e.f32973a
                            r4 = 0
                            r5 = 2
                            r6 = 0
                            r2 = r8
                            com.tinder.StateMachine$b$a$a r8 = com.tinder.StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(r1, r2, r3, r4, r5, r6)
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.C54914.C54943.invoke(q86$a, et1$a$a):com.tinder.StateMachine$b$a$a");
                    }
                });
                C54954 r0 = new fd2<q86.C6389a, et1.C5810a.C5812b, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6389a aVar, et1.C5810a.C5812b bVar) {
                        vx2.m53591g(aVar, "$this$on");
                        vx2.m53591g(bVar, "it");
                        aVar.mo47004a().mo46557a().cancel();
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, aVar, q86.C6391c.f32971a, (Object) null, 2, (Object) null);
                    }
                };
                StateMachine.Matcher.C5468a aVar = StateMachine.Matcher.f26969c;
                stateDefinitionBuilder.mo39646d(aVar.mo39651a(et1.C5810a.C5812b.class), r0);
                final Connection.StateManager stateManager4 = stateManager4;
                stateDefinitionBuilder.mo39646d(aVar.mo39651a(et1.C5815d.C5817b.class), new fd2<q86.C6389a, et1.C5815d.C5817b, StateMachine.C5470b.C5471a.C5472a<? extends q86, Object>>() {
                    public final StateMachine.C5470b.C5471a.C5472a<q86, Object> invoke(q86.C6389a aVar, et1.C5815d.C5817b bVar) {
                        vx2.m53591g(aVar, "$this$on");
                        vx2.m53591g(bVar, "it");
                        long a = stateManager4.f26994c.mo44468a(0);
                        return StateMachine.GraphBuilder.StateDefinitionBuilder.m41932g(stateDefinitionBuilder, aVar, new q86.C6394f(stateManager4.mo39693u(a), 0, a), (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        graphBuilder.mo39643d(aVar.mo39651a(q86.C6393e.class), C54975.INSTANCE);
        final Connection.StateManager stateManager5 = this.this$0;
        graphBuilder.mo39643d(aVar.mo39651a(q86.C6391c.class), new rc2<StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6391c>, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6391c>) (StateMachine.GraphBuilder.StateDefinitionBuilder) obj);
                return r37.f33317a;
            }

            public final void invoke(StateMachine.GraphBuilder<q86, et1, Object>.StateDefinitionBuilder<q86.C6391c> stateDefinitionBuilder) {
                vx2.m53591g(stateDefinitionBuilder, "$this$state");
                final Connection.StateManager stateManager = stateManager5;
                stateDefinitionBuilder.mo39647e(new fd2<q86.C6391c, et1, r37>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((q86.C6391c) obj, (et1) obj2);
                        return r37.f33317a;
                    }

                    public final void invoke(q86.C6391c cVar, et1 et1) {
                        vx2.m53591g(cVar, "$this$onEnter");
                        vx2.m53591g(et1, "it");
                        stateManager.f26996e.dispose();
                    }
                });
            }
        });
        graphBuilder.mo39641b(q86.C6392d.f32972a);
        final Connection.StateManager stateManager6 = this.this$0;
        graphBuilder.mo39642c(new rc2<StateMachine.C5473c<? extends q86, ? extends et1, Object>, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((StateMachine.C5473c<? extends q86, ? extends et1, Object>) (StateMachine.C5473c) obj);
                return r37.f33317a;
            }

            public final void invoke(StateMachine.C5473c<? extends q86, ? extends et1, Object> cVar) {
                vx2.m53591g(cVar, "transition");
                Connection.StateManager stateManager = stateManager6;
                if ((cVar instanceof StateMachine.C5473c.C5475b) && !vx2.m53586b(cVar.mo39668a(), ((StateMachine.C5473c.C5475b) cVar).mo39674c())) {
                    stateManager.f26997f.onNext(new et1.C5814c(stateManager.mo39685m()));
                }
            }
        });
    }
}
