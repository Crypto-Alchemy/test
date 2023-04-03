package net.safemoon.androidwallet.fragments;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.reflections.RoomReflectionsDataAndToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$onViewCreated$2", mo48632f = "ReflectionsAdvanceFragment.kt", mo48633l = {170}, mo48634m = "invokeSuspend")
/* compiled from: ReflectionsAdvanceFragment.kt */
public final class ReflectionsAdvanceFragment$onViewCreated$2 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ ReflectionsAdvanceFragment this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Lnet/safemoon/androidwallet/model/reflections/RoomReflectionsDataAndToken;", "it", "Lr37;", "a", "(Ljava/util/List;Lns0;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.fragments.ReflectionsAdvanceFragment$onViewCreated$2$a */
    /* compiled from: ReflectionsAdvanceFragment.kt */
    public static final class C8418a<T> implements a52 {

        /* renamed from: a */
        public final /* synthetic */ ReflectionsAdvanceFragment f42038a;

        public C8418a(ReflectionsAdvanceFragment reflectionsAdvanceFragment) {
            this.f42038a = reflectionsAdvanceFragment;
        }

        /* renamed from: a */
        public final Object emit(List<RoomReflectionsDataAndToken> list, ns0<? super r37> ns0) {
            boolean z;
            ReflectionsAdvanceFragment reflectionsAdvanceFragment = this.f42038a;
            reflectionsAdvanceFragment.mo57581N().submitList((List) null);
            bb5 H = reflectionsAdvanceFragment.mo57581N();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Float diffBalance = ((RoomReflectionsDataAndToken) next).getDiffBalance();
                vx2.m53588d(diffBalance);
                if (diffBalance.floatValue() <= Utils.FLOAT_EPSILON) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            H.submitList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : list) {
                Float diffBalance2 = ((RoomReflectionsDataAndToken) next2).getDiffBalance();
                vx2.m53588d(diffBalance2);
                if (diffBalance2.floatValue() > Utils.FLOAT_EPSILON) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            reflectionsAdvanceFragment.mo57579L(arrayList2);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionsAdvanceFragment$onViewCreated$2(ReflectionsAdvanceFragment reflectionsAdvanceFragment, ns0<? super ReflectionsAdvanceFragment$onViewCreated$2> ns0) {
        super(2, ns0);
        this.this$0 = reflectionsAdvanceFragment;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new ReflectionsAdvanceFragment$onViewCreated$2(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((ReflectionsAdvanceFragment$onViewCreated$2) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            z42<List<RoomReflectionsDataAndToken>> m = this.this$0.mo57582O().mo61341m();
            if (m != null) {
                C8418a aVar = new C8418a(this.this$0);
                this.label = 1;
                if (m.mo8646a(aVar, this) == d) {
                    return d;
                }
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
