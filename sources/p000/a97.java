package p000;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;

/* renamed from: a97 */
/* compiled from: VersionRequirement.kt */
public final class a97 {

    /* renamed from: b */
    public static final C6814a f36407b = new C6814a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final a97 f36408c = new a97(ck0.m33062j());

    /* renamed from: a */
    public final List<ProtoBuf$VersionRequirement> f36409a;

    /* renamed from: a97$a */
    /* compiled from: VersionRequirement.kt */
    public static final class C6814a {
        public C6814a() {
        }

        public /* synthetic */ C6814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final a97 mo50122a(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            vx2.m53591g(protoBuf$VersionRequirementTable, "table");
            if (protoBuf$VersionRequirementTable.getRequirementCount() == 0) {
                return mo50123b();
            }
            List<ProtoBuf$VersionRequirement> requirementList = protoBuf$VersionRequirementTable.getRequirementList();
            vx2.m53590f(requirementList, "table.requirementList");
            return new a97(requirementList, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final a97 mo50123b() {
            return a97.f36408c;
        }
    }

    public a97(List<ProtoBuf$VersionRequirement> list) {
        this.f36409a = list;
    }

    public /* synthetic */ a97(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
