package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;

/* renamed from: cy4 */
/* compiled from: protoTypeTableUtil.kt */
public final class cy4 {
    /* renamed from: a */
    public static final ProtoBuf$Type m56596a(ProtoBuf$Type protoBuf$Type, w17 w17) {
        vx2.m53591g(protoBuf$Type, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Type.hasAbbreviatedType()) {
            return protoBuf$Type.getAbbreviatedType();
        }
        if (protoBuf$Type.hasAbbreviatedTypeId()) {
            return w17.mo66609a(protoBuf$Type.getAbbreviatedTypeId());
        }
        return null;
    }

    /* renamed from: b */
    public static final ProtoBuf$Type m56597b(ProtoBuf$TypeAlias protoBuf$TypeAlias, w17 w17) {
        vx2.m53591g(protoBuf$TypeAlias, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$TypeAlias.hasExpandedType()) {
            ProtoBuf$Type expandedType = protoBuf$TypeAlias.getExpandedType();
            vx2.m53590f(expandedType, "expandedType");
            return expandedType;
        } else if (protoBuf$TypeAlias.hasExpandedTypeId()) {
            return w17.mo66609a(protoBuf$TypeAlias.getExpandedTypeId());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: c */
    public static final ProtoBuf$Type m56598c(ProtoBuf$Type protoBuf$Type, w17 w17) {
        vx2.m53591g(protoBuf$Type, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Type.hasFlexibleUpperBound()) {
            return protoBuf$Type.getFlexibleUpperBound();
        }
        if (protoBuf$Type.hasFlexibleUpperBoundId()) {
            return w17.mo66609a(protoBuf$Type.getFlexibleUpperBoundId());
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m56599d(ProtoBuf$Function protoBuf$Function) {
        vx2.m53591g(protoBuf$Function, "<this>");
        if (protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m56600e(ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(protoBuf$Property, "<this>");
        if (protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final ProtoBuf$Type m56601f(ProtoBuf$Class protoBuf$Class, w17 w17) {
        vx2.m53591g(protoBuf$Class, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Class.hasInlineClassUnderlyingType()) {
            return protoBuf$Class.getInlineClassUnderlyingType();
        }
        if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
            return w17.mo66609a(protoBuf$Class.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    /* renamed from: g */
    public static final ProtoBuf$Type m56602g(ProtoBuf$Type protoBuf$Type, w17 w17) {
        vx2.m53591g(protoBuf$Type, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Type.hasOuterType()) {
            return protoBuf$Type.getOuterType();
        }
        if (protoBuf$Type.hasOuterTypeId()) {
            return w17.mo66609a(protoBuf$Type.getOuterTypeId());
        }
        return null;
    }

    /* renamed from: h */
    public static final ProtoBuf$Type m56603h(ProtoBuf$Function protoBuf$Function, w17 w17) {
        vx2.m53591g(protoBuf$Function, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Function.hasReceiverType()) {
            return protoBuf$Function.getReceiverType();
        }
        if (protoBuf$Function.hasReceiverTypeId()) {
            return w17.mo66609a(protoBuf$Function.getReceiverTypeId());
        }
        return null;
    }

    /* renamed from: i */
    public static final ProtoBuf$Type m56604i(ProtoBuf$Property protoBuf$Property, w17 w17) {
        vx2.m53591g(protoBuf$Property, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Property.hasReceiverType()) {
            return protoBuf$Property.getReceiverType();
        }
        if (protoBuf$Property.hasReceiverTypeId()) {
            return w17.mo66609a(protoBuf$Property.getReceiverTypeId());
        }
        return null;
    }

    /* renamed from: j */
    public static final ProtoBuf$Type m56605j(ProtoBuf$Function protoBuf$Function, w17 w17) {
        vx2.m53591g(protoBuf$Function, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Function.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Function.getReturnType();
            vx2.m53590f(returnType, "returnType");
            return returnType;
        } else if (protoBuf$Function.hasReturnTypeId()) {
            return w17.mo66609a(protoBuf$Function.getReturnTypeId());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: k */
    public static final ProtoBuf$Type m56606k(ProtoBuf$Property protoBuf$Property, w17 w17) {
        vx2.m53591g(protoBuf$Property, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$Property.hasReturnType()) {
            ProtoBuf$Type returnType = protoBuf$Property.getReturnType();
            vx2.m53590f(returnType, "returnType");
            return returnType;
        } else if (protoBuf$Property.hasReturnTypeId()) {
            return w17.mo66609a(protoBuf$Property.getReturnTypeId());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: l */
    public static final List<ProtoBuf$Type> m56607l(ProtoBuf$Class protoBuf$Class, w17 w17) {
        vx2.m53591g(protoBuf$Class, "<this>");
        vx2.m53591g(w17, "typeTable");
        List<ProtoBuf$Type> supertypeList = protoBuf$Class.getSupertypeList();
        if (!(!supertypeList.isEmpty())) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = protoBuf$Class.getSupertypeIdList();
            vx2.m53590f(supertypeIdList, "supertypeIdList");
            supertypeList = new ArrayList<>(dk0.m43495u(supertypeIdList, 10));
            for (Integer num : supertypeIdList) {
                vx2.m53590f(num, "it");
                supertypeList.add(w17.mo66609a(num.intValue()));
            }
        }
        return supertypeList;
    }

    /* renamed from: m */
    public static final ProtoBuf$Type m56608m(ProtoBuf$Type.Argument argument, w17 w17) {
        vx2.m53591g(argument, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return w17.mo66609a(argument.getTypeId());
        }
        return null;
    }

    /* renamed from: n */
    public static final ProtoBuf$Type m56609n(ProtoBuf$ValueParameter protoBuf$ValueParameter, w17 w17) {
        vx2.m53591g(protoBuf$ValueParameter, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$ValueParameter.hasType()) {
            ProtoBuf$Type type = protoBuf$ValueParameter.getType();
            vx2.m53590f(type, "type");
            return type;
        } else if (protoBuf$ValueParameter.hasTypeId()) {
            return w17.mo66609a(protoBuf$ValueParameter.getTypeId());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: o */
    public static final ProtoBuf$Type m56610o(ProtoBuf$TypeAlias protoBuf$TypeAlias, w17 w17) {
        vx2.m53591g(protoBuf$TypeAlias, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$TypeAlias.hasUnderlyingType()) {
            ProtoBuf$Type underlyingType = protoBuf$TypeAlias.getUnderlyingType();
            vx2.m53590f(underlyingType, "underlyingType");
            return underlyingType;
        } else if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
            return w17.mo66609a(protoBuf$TypeAlias.getUnderlyingTypeId());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: p */
    public static final List<ProtoBuf$Type> m56611p(ProtoBuf$TypeParameter protoBuf$TypeParameter, w17 w17) {
        vx2.m53591g(protoBuf$TypeParameter, "<this>");
        vx2.m53591g(w17, "typeTable");
        List<ProtoBuf$Type> upperBoundList = protoBuf$TypeParameter.getUpperBoundList();
        if (!(!upperBoundList.isEmpty())) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = protoBuf$TypeParameter.getUpperBoundIdList();
            vx2.m53590f(upperBoundIdList, "upperBoundIdList");
            upperBoundList = new ArrayList<>(dk0.m43495u(upperBoundIdList, 10));
            for (Integer num : upperBoundIdList) {
                vx2.m53590f(num, "it");
                upperBoundList.add(w17.mo66609a(num.intValue()));
            }
        }
        return upperBoundList;
    }

    /* renamed from: q */
    public static final ProtoBuf$Type m56612q(ProtoBuf$ValueParameter protoBuf$ValueParameter, w17 w17) {
        vx2.m53591g(protoBuf$ValueParameter, "<this>");
        vx2.m53591g(w17, "typeTable");
        if (protoBuf$ValueParameter.hasVarargElementType()) {
            return protoBuf$ValueParameter.getVarargElementType();
        }
        if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
            return w17.mo66609a(protoBuf$ValueParameter.getVarargElementTypeId());
        }
        return null;
    }
}
