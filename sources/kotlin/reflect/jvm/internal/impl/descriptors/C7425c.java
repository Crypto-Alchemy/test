package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* compiled from: FunctionDescriptor */
public interface C7425c extends CallableMemberDescriptor {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c$a */
    /* compiled from: FunctionDescriptor */
    public interface C7426a<D extends C7425c> {
        /* renamed from: a */
        C7426a<D> mo50953a();

        /* renamed from: b */
        C7426a<D> mo50954b(List<n87> list);

        D build();

        /* renamed from: c */
        C7426a<D> mo50956c(h85 h85);

        /* renamed from: d */
        C7426a<D> mo50957d(fd1 fd1);

        /* renamed from: e */
        C7426a<D> mo50958e(h85 h85);

        /* renamed from: f */
        C7426a<D> mo50959f(p17 p17);

        /* renamed from: g */
        C7426a<D> mo50960g();

        /* renamed from: h */
        <V> C7426a<D> mo50961h(C7420a.C7421a<V> aVar, V v);

        /* renamed from: i */
        C7426a<D> mo50962i();

        /* renamed from: j */
        C7426a<D> mo50963j(d31 d31);

        /* renamed from: k */
        C7426a<D> mo50964k(Modality modality);

        /* renamed from: l */
        C7426a<D> mo50965l();

        /* renamed from: m */
        C7426a<D> mo50966m(CallableMemberDescriptor callableMemberDescriptor);

        /* renamed from: n */
        C7426a<D> mo50967n(boolean z);

        /* renamed from: o */
        C7426a<D> mo50968o(List<a17> list);

        /* renamed from: p */
        C7426a<D> mo50969p(C6983dm dmVar);

        /* renamed from: q */
        C7426a<D> mo50970q(xc3 xc3);

        /* renamed from: r */
        C7426a<D> mo50971r(CallableMemberDescriptor.Kind kind);

        /* renamed from: s */
        C7426a<D> mo50972s(r24 r24);

        /* renamed from: t */
        C7426a<D> mo50973t();
    }

    /* renamed from: a */
    C7425c mo50045a();

    /* renamed from: b */
    d31 mo51119b();

    /* renamed from: c */
    C7425c mo50708c(TypeSubstitutor typeSubstitutor);

    /* renamed from: d */
    Collection<? extends C7425c> mo51659d();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    /* renamed from: n0 */
    C7425c mo51325n0();

    /* renamed from: s */
    C7426a<? extends C7425c> mo50951s();

    /* renamed from: w0 */
    boolean mo51328w0();

    /* renamed from: y */
    boolean mo50147y();

    /* renamed from: z0 */
    boolean mo51330z0();
}
