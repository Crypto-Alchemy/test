package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

public interface CallableMemberDescriptor extends C7420a, ns3 {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            if (this != FAKE_OVERRIDE) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    CallableMemberDescriptor mo50045a();

    /* renamed from: d */
    Collection<? extends CallableMemberDescriptor> mo51659d();

    /* renamed from: f0 */
    CallableMemberDescriptor mo50948f0(d31 d31, Modality modality, fd1 fd1, Kind kind, boolean z);

    Kind getKind();

    /* renamed from: x0 */
    void mo50952x0(Collection<? extends CallableMemberDescriptor> collection);
}
