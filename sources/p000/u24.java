package p000;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* renamed from: u24 */
/* compiled from: NameResolverImpl.kt */
public final class u24 implements t24 {

    /* renamed from: a */
    public final ProtoBuf$StringTable f44856a;

    /* renamed from: b */
    public final ProtoBuf$QualifiedNameTable f44857b;

    /* renamed from: u24$a */
    /* compiled from: NameResolverImpl.kt */
    public /* synthetic */ class C9383a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44858a;

        static {
            int[] iArr = new int[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.values().length];
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            iArr[ProtoBuf$QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            f44858a = iArr;
        }
    }

    public u24(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        vx2.m53591g(protoBuf$StringTable, "strings");
        vx2.m53591g(protoBuf$QualifiedNameTable, "qualifiedNames");
        this.f44856a = protoBuf$StringTable;
        this.f44857b = protoBuf$QualifiedNameTable;
    }

    /* renamed from: a */
    public boolean mo51403a(int i) {
        return mo66171c(i).getThird().booleanValue();
    }

    /* renamed from: b */
    public String mo51404b(int i) {
        Triple<List<String>, List<String>, Boolean> c = mo66171c(i);
        List component1 = c.component1();
        String i0 = CollectionsKt___CollectionsKt.m47338i0(c.component2(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null);
        if (component1.isEmpty()) {
            return i0;
        }
        return CollectionsKt___CollectionsKt.m47338i0(component1, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null) + '/' + i0;
    }

    /* renamed from: c */
    public final Triple<List<String>, List<String>, Boolean> mo66171c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f44857b.getQualifiedName(i);
            String string = this.f44856a.getString(qualifiedName.getShortName());
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            vx2.m53588d(kind);
            int i2 = C9383a.f44858a[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else if (i2 == 3) {
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public String getString(int i) {
        String string = this.f44856a.getString(i);
        vx2.m53590f(string, "strings.getString(index)");
        return string;
    }
}
