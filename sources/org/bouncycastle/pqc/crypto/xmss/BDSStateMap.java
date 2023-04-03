package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.pqc.crypto.xmss.C9046c;

public class BDSStateMap implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;

    /* renamed from: a */
    public transient long f43803a;
    private final Map<Integer, BDS> bdsState = new TreeMap();

    public BDSStateMap(long j) {
        this.f43803a = j;
    }

    public BDSStateMap(BDSStateMap bDSStateMap, long j) {
        for (Integer next : bDSStateMap.bdsState.keySet()) {
            this.bdsState.put(next, new BDS(bDSStateMap.bdsState.get(next)));
        }
        this.f43803a = j;
    }

    public BDSStateMap(to7 to7, long j, byte[] bArr, byte[] bArr2) {
        this.f43803a = (1 << to7.mo66102a()) - 1;
        for (long j2 = 0; j2 < j; j2++) {
            updateState(to7, j2, bArr, bArr2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f43803a = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.f43803a);
    }

    public BDS get(int i) {
        return this.bdsState.get(gx2.m58284d(i));
    }

    public long getMaxIndex() {
        return this.f43803a;
    }

    public boolean isEmpty() {
        return this.bdsState.isEmpty();
    }

    public void put(int i, BDS bds) {
        this.bdsState.put(gx2.m58284d(i), bds);
    }

    public BDS update(int i, byte[] bArr, byte[] bArr2, C9046c cVar) {
        return this.bdsState.put(gx2.m58284d(i), this.bdsState.get(gx2.m58284d(i)).getNextState(bArr, bArr2, cVar));
    }

    public void updateState(to7 to7, long j, byte[] bArr, byte[] bArr2) {
        long j2 = j;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        zo7 h = to7.mo66109h();
        int b = h.mo67366b();
        long j3 = dp7.m57000j(j2, b);
        int i = dp7.m56999i(j2, b);
        C9046c cVar = (C9046c) ((C9046c.C9048b) new C9046c.C9048b().mo64661h(j3)).mo64647p(i).mo64643l();
        int i2 = (1 << b) - 1;
        if (i < i2) {
            if (get(0) == null || i == 0) {
                put(0, new BDS(h, bArr3, bArr4, cVar));
            }
            update(0, bArr3, bArr4, cVar);
        }
        for (int i3 = 1; i3 < to7.mo66103b(); i3++) {
            int i4 = dp7.m56999i(j3, b);
            j3 = dp7.m57000j(j3, b);
            C9046c cVar2 = (C9046c) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(i3)).mo64661h(j3)).mo64647p(i4).mo64643l();
            if (this.bdsState.get(Integer.valueOf(i3)) == null || dp7.m57004n(j2, b, i3)) {
                this.bdsState.put(Integer.valueOf(i3), new BDS(h, bArr3, bArr4, cVar2));
            }
            if (i4 < i2 && dp7.m57003m(j2, b, i3)) {
                update(i3, bArr3, bArr4, cVar2);
            }
        }
    }

    public BDSStateMap withWOTSDigest(C9156p4 p4Var) {
        BDSStateMap bDSStateMap = new BDSStateMap(this.f43803a);
        for (Integer next : this.bdsState.keySet()) {
            bDSStateMap.bdsState.put(next, this.bdsState.get(next).withWOTSDigest(p4Var));
        }
        return bDSStateMap;
    }
}
