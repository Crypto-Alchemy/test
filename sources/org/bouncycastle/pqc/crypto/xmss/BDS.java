package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.pqc.crypto.xmss.C9040a;
import org.bouncycastle.pqc.crypto.xmss.C9043b;
import org.bouncycastle.pqc.crypto.xmss.C9046c;

public final class BDS implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public transient C9049d f43800a;
    private List<XMSSNode> authenticationPath;

    /* renamed from: d */
    public transient int f43801d;
    private int index;

    /* renamed from: k */
    private int f43802k;
    private Map<Integer, XMSSNode> keep;
    private Map<Integer, LinkedList<XMSSNode>> retain;
    private XMSSNode root;
    private Stack<XMSSNode> stack;
    private final List<BDSTreeHash> treeHashInstances;
    private final int treeHeight;
    private boolean used;

    public BDS(BDS bds) {
        this.f43800a = new C9049d(bds.f43800a.mo64651d());
        this.treeHeight = bds.treeHeight;
        this.f43802k = bds.f43802k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer next : bds.retain.keySet()) {
            this.retain.put(next, (LinkedList) bds.retain.get(next).clone());
        }
        Stack<XMSSNode> stack2 = new Stack<>();
        this.stack = stack2;
        stack2.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        for (BDSTreeHash clone : bds.treeHashInstances) {
            this.treeHashInstances.add(clone.clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.f43801d = bds.f43801d;
        this.used = bds.used;
    }

    public BDS(BDS bds, int i, C9156p4 p4Var) {
        this.f43800a = new C9049d(new xf7(p4Var));
        this.treeHeight = bds.treeHeight;
        this.f43802k = bds.f43802k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer next : bds.retain.keySet()) {
            this.retain.put(next, (LinkedList) bds.retain.get(next).clone());
        }
        Stack<XMSSNode> stack2 = new Stack<>();
        this.stack = stack2;
        stack2.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        for (BDSTreeHash clone : bds.treeHashInstances) {
            this.treeHashInstances.add(clone.clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.f43801d = i;
        this.used = bds.used;
        mo64595d();
    }

    public BDS(BDS bds, C9156p4 p4Var) {
        this.f43800a = new C9049d(new xf7(p4Var));
        this.treeHeight = bds.treeHeight;
        this.f43802k = bds.f43802k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer next : bds.retain.keySet()) {
            this.retain.put(next, (LinkedList) bds.retain.get(next).clone());
        }
        Stack<XMSSNode> stack2 = new Stack<>();
        this.stack = stack2;
        stack2.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        for (BDSTreeHash clone : bds.treeHashInstances) {
            this.treeHashInstances.add(clone.clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.f43801d = bds.f43801d;
        this.used = bds.used;
        mo64595d();
    }

    public BDS(BDS bds, byte[] bArr, byte[] bArr2, C9046c cVar) {
        this.f43800a = new C9049d(bds.f43800a.mo64651d());
        this.treeHeight = bds.treeHeight;
        this.f43802k = bds.f43802k;
        this.root = bds.root;
        ArrayList arrayList = new ArrayList();
        this.authenticationPath = arrayList;
        arrayList.addAll(bds.authenticationPath);
        this.retain = new TreeMap();
        for (Integer next : bds.retain.keySet()) {
            this.retain.put(next, (LinkedList) bds.retain.get(next).clone());
        }
        Stack<XMSSNode> stack2 = new Stack<>();
        this.stack = stack2;
        stack2.addAll(bds.stack);
        this.treeHashInstances = new ArrayList();
        for (BDSTreeHash clone : bds.treeHashInstances) {
            this.treeHashInstances.add(clone.clone());
        }
        this.keep = new TreeMap(bds.keep);
        this.index = bds.index;
        this.f43801d = bds.f43801d;
        this.used = false;
        mo64594c(bArr, bArr2, cVar);
    }

    public BDS(C9049d dVar, int i, int i2, int i3) {
        this.f43800a = dVar;
        this.treeHeight = i;
        this.f43801d = i3;
        this.f43802k = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.authenticationPath = new ArrayList();
                this.retain = new TreeMap();
                this.stack = new Stack<>();
                this.treeHashInstances = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.treeHashInstances.add(new BDSTreeHash(i5));
                }
                this.keep = new TreeMap();
                this.index = 0;
                this.used = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public BDS(zo7 zo7, int i, int i2) {
        this(zo7.mo67373i(), zo7.mo67366b(), zo7.mo67367c(), i2);
        this.f43801d = i;
        this.index = i2;
        this.used = true;
    }

    public BDS(zo7 zo7, byte[] bArr, byte[] bArr2, C9046c cVar) {
        this(zo7.mo67373i(), zo7.mo67366b(), zo7.mo67367c(), (1 << zo7.mo67366b()) - 1);
        mo64593b(bArr, bArr2, cVar);
    }

    public BDS(zo7 zo7, byte[] bArr, byte[] bArr2, C9046c cVar, int i) {
        this(zo7.mo67373i(), zo7.mo67366b(), zo7.mo67367c(), (1 << zo7.mo67366b()) - 1);
        mo64593b(bArr, bArr2, cVar);
        while (this.index < i) {
            mo64594c(bArr, bArr2, cVar);
            this.used = false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f43801d = objectInputStream.available() != 0 ? objectInputStream.readInt() : (1 << this.treeHeight) - 1;
        int i = this.f43801d;
        if (i > (1 << this.treeHeight) - 1 || this.index > i + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f43801d);
    }

    /* renamed from: a */
    public final BDSTreeHash mo64592a() {
        BDSTreeHash bDSTreeHash = null;
        for (BDSTreeHash next : this.treeHashInstances) {
            if (!next.isFinished() && next.isInitialized()) {
                if (bDSTreeHash == null || next.getHeight() < bDSTreeHash.getHeight() || (next.getHeight() == bDSTreeHash.getHeight() && next.getIndexLeaf() < bDSTreeHash.getIndexLeaf())) {
                    bDSTreeHash = next;
                }
            }
        }
        return bDSTreeHash;
    }

    /* renamed from: b */
    public final void mo64593b(byte[] bArr, byte[] bArr2, C9046c cVar) {
        if (cVar != null) {
            C9043b bVar = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64635l();
            C9040a aVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64628k();
            for (int i = 0; i < (1 << this.treeHeight); i++) {
                cVar = (C9046c) ((C9046c.C9048b) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64647p(i).mo64645n(cVar.mo64640e()).mo64646o(cVar.mo64641f()).mo64659f(cVar.mo64656a())).mo64643l();
                C9049d dVar = this.f43800a;
                dVar.mo64655h(dVar.mo64654g(bArr2, cVar), bArr);
                yf7 e = this.f43800a.mo64652e(cVar);
                bVar = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar.mo64657b())).mo64661h(bVar.mo64658c())).mo64637n(i).mo64638o(bVar.mo64633f()).mo64639p(bVar.mo64634g()).mo64659f(bVar.mo64656a())).mo64635l();
                XMSSNode a = C9052f.m70562a(this.f43800a, e, bVar);
                aVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar.mo64657b())).mo64661h(aVar.mo64658c())).mo64631n(i).mo64659f(aVar.mo64656a())).mo64628k();
                while (!this.stack.isEmpty() && this.stack.peek().getHeight() == a.getHeight()) {
                    int height = i / (1 << a.getHeight());
                    if (height == 1) {
                        this.authenticationPath.add(a);
                    }
                    if (height == 3 && a.getHeight() < this.treeHeight - this.f43802k) {
                        this.treeHashInstances.get(a.getHeight()).setNode(a);
                    }
                    if (height >= 3 && (height & 1) == 1 && a.getHeight() >= this.treeHeight - this.f43802k && a.getHeight() <= this.treeHeight - 2) {
                        if (this.retain.get(Integer.valueOf(a.getHeight())) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a);
                            this.retain.put(Integer.valueOf(a.getHeight()), linkedList);
                        } else {
                            this.retain.get(Integer.valueOf(a.getHeight())).add(a);
                        }
                    }
                    C9040a aVar2 = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar.mo64657b())).mo64661h(aVar.mo64658c())).mo64630m(aVar.mo64625e()).mo64631n((aVar.mo64626f() - 1) / 2).mo64659f(aVar.mo64656a())).mo64628k();
                    XMSSNode b = C9052f.m70563b(this.f43800a, this.stack.pop(), a, aVar2);
                    XMSSNode xMSSNode = new XMSSNode(b.getHeight() + 1, b.getValue());
                    aVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar2.mo64657b())).mo64661h(aVar2.mo64658c())).mo64630m(aVar2.mo64625e() + 1).mo64631n(aVar2.mo64626f()).mo64659f(aVar2.mo64656a())).mo64628k();
                    a = xMSSNode;
                }
                this.stack.push(a);
            }
            this.root = this.stack.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* renamed from: c */
    public final void mo64594c(byte[] bArr, byte[] bArr2, C9046c cVar) {
        Object obj;
        List<XMSSNode> list;
        if (cVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        } else if (!this.used) {
            int i = this.index;
            if (i <= this.f43801d - 1) {
                int b = dp7.m56992b(i, this.treeHeight);
                if (((this.index >> (b + 1)) & 1) == 0 && b < this.treeHeight - 1) {
                    this.keep.put(Integer.valueOf(b), this.authenticationPath.get(b));
                }
                C9043b bVar = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64635l();
                C9040a aVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64628k();
                if (b == 0) {
                    cVar = (C9046c) ((C9046c.C9048b) ((C9046c.C9048b) ((C9046c.C9048b) new C9046c.C9048b().mo64660g(cVar.mo64657b())).mo64661h(cVar.mo64658c())).mo64647p(this.index).mo64645n(cVar.mo64640e()).mo64646o(cVar.mo64641f()).mo64659f(cVar.mo64656a())).mo64643l();
                    C9049d dVar = this.f43800a;
                    dVar.mo64655h(dVar.mo64654g(bArr2, cVar), bArr);
                    this.authenticationPath.set(0, C9052f.m70562a(this.f43800a, this.f43800a.mo64652e(cVar), (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar.mo64657b())).mo64661h(bVar.mo64658c())).mo64637n(this.index).mo64638o(bVar.mo64633f()).mo64639p(bVar.mo64634g()).mo64659f(bVar.mo64656a())).mo64635l()));
                } else {
                    int i2 = b - 1;
                    C9049d dVar2 = this.f43800a;
                    dVar2.mo64655h(dVar2.mo64654g(bArr2, cVar), bArr);
                    XMSSNode b2 = C9052f.m70563b(this.f43800a, this.authenticationPath.get(i2), this.keep.get(Integer.valueOf(i2)), (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar.mo64657b())).mo64661h(aVar.mo64658c())).mo64630m(i2).mo64631n(this.index >> b).mo64659f(aVar.mo64656a())).mo64628k());
                    this.authenticationPath.set(b, new XMSSNode(b2.getHeight() + 1, b2.getValue()));
                    this.keep.remove(Integer.valueOf(i2));
                    for (int i3 = 0; i3 < b; i3++) {
                        if (i3 < this.treeHeight - this.f43802k) {
                            list = this.authenticationPath;
                            obj = this.treeHashInstances.get(i3).getTailNode();
                        } else {
                            list = this.authenticationPath;
                            obj = this.retain.get(Integer.valueOf(i3)).removeFirst();
                        }
                        list.set(i3, obj);
                    }
                    int min = Math.min(b, this.treeHeight - this.f43802k);
                    for (int i4 = 0; i4 < min; i4++) {
                        int i5 = this.index + 1 + ((1 << i4) * 3);
                        if (i5 < (1 << this.treeHeight)) {
                            this.treeHashInstances.get(i4).initialize(i5);
                        }
                    }
                }
                for (int i6 = 0; i6 < ((this.treeHeight - this.f43802k) >> 1); i6++) {
                    BDSTreeHash a = mo64592a();
                    if (a != null) {
                        a.update(this.stack, this.f43800a, bArr, bArr2, cVar);
                    }
                }
                this.index++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        } else {
            throw new IllegalStateException("index already used");
        }
    }

    /* renamed from: d */
    public final void mo64595d() {
        if (this.authenticationPath == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.retain == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.stack == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.treeHashInstances == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (this.keep == null) {
            throw new IllegalStateException("keep == null");
        } else if (!dp7.m57002l(this.treeHeight, (long) this.index)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        for (XMSSNode add : this.authenticationPath) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public int getIndex() {
        return this.index;
    }

    public int getMaxIndex() {
        return this.f43801d;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, C9046c cVar) {
        return new BDS(this, bArr, bArr2, cVar);
    }

    public XMSSNode getRoot() {
        return this.root;
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public boolean isUsed() {
        return this.used;
    }

    public void markUsed() {
        this.used = true;
    }

    public BDS withMaxIndex(int i, C9156p4 p4Var) {
        return new BDS(this, i, p4Var);
    }

    public BDS withWOTSDigest(C9156p4 p4Var) {
        return new BDS(this, p4Var);
    }
}
