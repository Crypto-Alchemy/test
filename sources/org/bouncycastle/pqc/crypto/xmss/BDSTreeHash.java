package org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;

class BDSTreeHash implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    private boolean finished = false;
    private int height;
    private final int initialHeight;
    private boolean initialized = false;
    private int nextIndex;
    private XMSSNode tailNode;

    public BDSTreeHash(int i) {
        this.initialHeight = i;
    }

    public BDSTreeHash clone() {
        BDSTreeHash bDSTreeHash = new BDSTreeHash(this.initialHeight);
        bDSTreeHash.tailNode = this.tailNode;
        bDSTreeHash.height = this.height;
        bDSTreeHash.nextIndex = this.nextIndex;
        bDSTreeHash.initialized = this.initialized;
        bDSTreeHash.finished = this.finished;
        return bDSTreeHash;
    }

    public int getHeight() {
        if (!this.initialized || this.finished) {
            return Integer.MAX_VALUE;
        }
        return this.height;
    }

    public int getIndexLeaf() {
        return this.nextIndex;
    }

    public XMSSNode getTailNode() {
        return this.tailNode;
    }

    public void initialize(int i) {
        this.tailNode = null;
        this.height = this.initialHeight;
        this.nextIndex = i;
        this.initialized = true;
        this.finished = false;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public void setNode(XMSSNode xMSSNode) {
        this.tailNode = xMSSNode;
        int height2 = xMSSNode.getHeight();
        this.height = height2;
        if (height2 == this.initialHeight) {
            this.finished = true;
        }
    }

    /* JADX WARNING: type inference failed for: r7v17, types: [org.bouncycastle.pqc.crypto.xmss.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> r5, org.bouncycastle.pqc.crypto.xmss.C9049d r6, byte[] r7, byte[] r8, org.bouncycastle.pqc.crypto.xmss.C9046c r9) {
        /*
            r4 = this;
            if (r9 == 0) goto L_0x021e
            boolean r0 = r4.finished
            if (r0 != 0) goto L_0x0216
            boolean r0 = r4.initialized
            if (r0 == 0) goto L_0x0216
            org.bouncycastle.pqc.crypto.xmss.c$b r0 = new org.bouncycastle.pqc.crypto.xmss.c$b
            r0.<init>()
            int r1 = r9.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r0 = r0.mo64660g(r1)
            org.bouncycastle.pqc.crypto.xmss.c$b r0 = (org.bouncycastle.pqc.crypto.xmss.C9046c.C9048b) r0
            long r1 = r9.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r0 = r0.mo64661h(r1)
            org.bouncycastle.pqc.crypto.xmss.c$b r0 = (org.bouncycastle.pqc.crypto.xmss.C9046c.C9048b) r0
            int r1 = r4.nextIndex
            org.bouncycastle.pqc.crypto.xmss.c$b r0 = r0.mo64647p(r1)
            int r1 = r9.mo64640e()
            org.bouncycastle.pqc.crypto.xmss.c$b r0 = r0.mo64645n(r1)
            int r1 = r9.mo64641f()
            org.bouncycastle.pqc.crypto.xmss.c$b r0 = r0.mo64646o(r1)
            int r9 = r9.mo64656a()
            org.bouncycastle.pqc.crypto.xmss.e$a r9 = r0.mo64659f(r9)
            org.bouncycastle.pqc.crypto.xmss.c$b r9 = (org.bouncycastle.pqc.crypto.xmss.C9046c.C9048b) r9
            org.bouncycastle.pqc.crypto.xmss.e r9 = r9.mo64643l()
            org.bouncycastle.pqc.crypto.xmss.c r9 = (org.bouncycastle.pqc.crypto.xmss.C9046c) r9
            org.bouncycastle.pqc.crypto.xmss.b$b r0 = new org.bouncycastle.pqc.crypto.xmss.b$b
            r0.<init>()
            int r1 = r9.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r0 = r0.mo64660g(r1)
            org.bouncycastle.pqc.crypto.xmss.b$b r0 = (org.bouncycastle.pqc.crypto.xmss.C9043b.C9045b) r0
            long r1 = r9.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r0 = r0.mo64661h(r1)
            org.bouncycastle.pqc.crypto.xmss.b$b r0 = (org.bouncycastle.pqc.crypto.xmss.C9043b.C9045b) r0
            int r1 = r4.nextIndex
            org.bouncycastle.pqc.crypto.xmss.b$b r0 = r0.mo64637n(r1)
            org.bouncycastle.pqc.crypto.xmss.e r0 = r0.mo64635l()
            org.bouncycastle.pqc.crypto.xmss.b r0 = (org.bouncycastle.pqc.crypto.xmss.C9043b) r0
            org.bouncycastle.pqc.crypto.xmss.a$b r1 = new org.bouncycastle.pqc.crypto.xmss.a$b
            r1.<init>()
            int r2 = r9.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r1 = r1.mo64660g(r2)
            org.bouncycastle.pqc.crypto.xmss.a$b r1 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r1
            long r2 = r9.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r1 = r1.mo64661h(r2)
            org.bouncycastle.pqc.crypto.xmss.a$b r1 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r1
            int r2 = r4.nextIndex
            org.bouncycastle.pqc.crypto.xmss.a$b r1 = r1.mo64631n(r2)
            org.bouncycastle.pqc.crypto.xmss.e r1 = r1.mo64628k()
            org.bouncycastle.pqc.crypto.xmss.a r1 = (org.bouncycastle.pqc.crypto.xmss.C9040a) r1
            byte[] r8 = r6.mo64654g(r8, r9)
            r6.mo64655h(r8, r7)
            yf7 r7 = r6.mo64652e(r9)
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r7 = org.bouncycastle.pqc.crypto.xmss.C9052f.m70562a(r6, r7, r0)
        L_0x00a2:
            boolean r8 = r5.isEmpty()
            r9 = 1
            if (r8 != 0) goto L_0x0159
            java.lang.Object r8 = r5.peek()
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r8 = (org.bouncycastle.pqc.crypto.xmss.XMSSNode) r8
            int r8 = r8.getHeight()
            int r0 = r7.getHeight()
            if (r8 != r0) goto L_0x0159
            java.lang.Object r8 = r5.peek()
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r8 = (org.bouncycastle.pqc.crypto.xmss.XMSSNode) r8
            int r8 = r8.getHeight()
            int r0 = r4.initialHeight
            if (r8 == r0) goto L_0x0159
            org.bouncycastle.pqc.crypto.xmss.a$b r8 = new org.bouncycastle.pqc.crypto.xmss.a$b
            r8.<init>()
            int r0 = r1.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r8 = r8.mo64660g(r0)
            org.bouncycastle.pqc.crypto.xmss.a$b r8 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r8
            long r2 = r1.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r8 = r8.mo64661h(r2)
            org.bouncycastle.pqc.crypto.xmss.a$b r8 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r8
            int r0 = r1.mo64625e()
            org.bouncycastle.pqc.crypto.xmss.a$b r8 = r8.mo64630m(r0)
            int r0 = r1.mo64626f()
            int r0 = r0 - r9
            int r0 = r0 / 2
            org.bouncycastle.pqc.crypto.xmss.a$b r8 = r8.mo64631n(r0)
            int r0 = r1.mo64656a()
            org.bouncycastle.pqc.crypto.xmss.e$a r8 = r8.mo64659f(r0)
            org.bouncycastle.pqc.crypto.xmss.a$b r8 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r8
            org.bouncycastle.pqc.crypto.xmss.e r8 = r8.mo64628k()
            org.bouncycastle.pqc.crypto.xmss.a r8 = (org.bouncycastle.pqc.crypto.xmss.C9040a) r8
            java.lang.Object r0 = r5.pop()
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r0 = (org.bouncycastle.pqc.crypto.xmss.XMSSNode) r0
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r7 = org.bouncycastle.pqc.crypto.xmss.C9052f.m70563b(r6, r0, r7, r8)
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r0 = new org.bouncycastle.pqc.crypto.xmss.XMSSNode
            int r1 = r7.getHeight()
            int r1 = r1 + r9
            byte[] r7 = r7.getValue()
            r0.<init>(r1, r7)
            org.bouncycastle.pqc.crypto.xmss.a$b r7 = new org.bouncycastle.pqc.crypto.xmss.a$b
            r7.<init>()
            int r1 = r8.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r7 = r7.mo64660g(r1)
            org.bouncycastle.pqc.crypto.xmss.a$b r7 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r7
            long r1 = r8.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r7 = r7.mo64661h(r1)
            org.bouncycastle.pqc.crypto.xmss.a$b r7 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r7
            int r1 = r8.mo64625e()
            int r1 = r1 + r9
            org.bouncycastle.pqc.crypto.xmss.a$b r7 = r7.mo64630m(r1)
            int r9 = r8.mo64626f()
            org.bouncycastle.pqc.crypto.xmss.a$b r7 = r7.mo64631n(r9)
            int r8 = r8.mo64656a()
            org.bouncycastle.pqc.crypto.xmss.e$a r7 = r7.mo64659f(r8)
            org.bouncycastle.pqc.crypto.xmss.a$b r7 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r7
            org.bouncycastle.pqc.crypto.xmss.e r7 = r7.mo64628k()
            r1 = r7
            org.bouncycastle.pqc.crypto.xmss.a r1 = (org.bouncycastle.pqc.crypto.xmss.C9040a) r1
            r7 = r0
            goto L_0x00a2
        L_0x0159:
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r8 = r4.tailNode
            if (r8 != 0) goto L_0x0161
            r4.tailNode = r7
            goto L_0x01fd
        L_0x0161:
            int r8 = r8.getHeight()
            int r0 = r7.getHeight()
            if (r8 != r0) goto L_0x01fa
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = new org.bouncycastle.pqc.crypto.xmss.a$b
            r5.<init>()
            int r8 = r1.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r5 = r5.mo64660g(r8)
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r5
            long r2 = r1.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r5 = r5.mo64661h(r2)
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r5
            int r8 = r1.mo64625e()
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = r5.mo64630m(r8)
            int r8 = r1.mo64626f()
            int r8 = r8 - r9
            int r8 = r8 / 2
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = r5.mo64631n(r8)
            int r8 = r1.mo64656a()
            org.bouncycastle.pqc.crypto.xmss.e$a r5 = r5.mo64659f(r8)
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r5
            org.bouncycastle.pqc.crypto.xmss.e r5 = r5.mo64628k()
            org.bouncycastle.pqc.crypto.xmss.a r5 = (org.bouncycastle.pqc.crypto.xmss.C9040a) r5
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r8 = r4.tailNode
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r6 = org.bouncycastle.pqc.crypto.xmss.C9052f.m70563b(r6, r8, r7, r5)
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r7 = new org.bouncycastle.pqc.crypto.xmss.XMSSNode
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r8 = r4.tailNode
            int r8 = r8.getHeight()
            int r8 = r8 + r9
            byte[] r6 = r6.getValue()
            r7.<init>(r8, r6)
            r4.tailNode = r7
            org.bouncycastle.pqc.crypto.xmss.a$b r6 = new org.bouncycastle.pqc.crypto.xmss.a$b
            r6.<init>()
            int r8 = r5.mo64657b()
            org.bouncycastle.pqc.crypto.xmss.e$a r6 = r6.mo64660g(r8)
            org.bouncycastle.pqc.crypto.xmss.a$b r6 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r6
            long r0 = r5.mo64658c()
            org.bouncycastle.pqc.crypto.xmss.e$a r6 = r6.mo64661h(r0)
            org.bouncycastle.pqc.crypto.xmss.a$b r6 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r6
            int r8 = r5.mo64625e()
            int r8 = r8 + r9
            org.bouncycastle.pqc.crypto.xmss.a$b r6 = r6.mo64630m(r8)
            int r8 = r5.mo64626f()
            org.bouncycastle.pqc.crypto.xmss.a$b r6 = r6.mo64631n(r8)
            int r5 = r5.mo64656a()
            org.bouncycastle.pqc.crypto.xmss.e$a r5 = r6.mo64659f(r5)
            org.bouncycastle.pqc.crypto.xmss.a$b r5 = (org.bouncycastle.pqc.crypto.xmss.C9040a.C9042b) r5
            org.bouncycastle.pqc.crypto.xmss.e r5 = r5.mo64628k()
            org.bouncycastle.pqc.crypto.xmss.a r5 = (org.bouncycastle.pqc.crypto.xmss.C9040a) r5
            goto L_0x01fd
        L_0x01fa:
            r5.push(r7)
        L_0x01fd:
            org.bouncycastle.pqc.crypto.xmss.XMSSNode r5 = r4.tailNode
            int r5 = r5.getHeight()
            int r6 = r4.initialHeight
            if (r5 != r6) goto L_0x020a
            r4.finished = r9
            goto L_0x0215
        L_0x020a:
            int r5 = r7.getHeight()
            r4.height = r5
            int r5 = r4.nextIndex
            int r5 = r5 + r9
            r4.nextIndex = r5
        L_0x0215:
            return
        L_0x0216:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "finished or not initialized"
            r5.<init>(r6)
            throw r5
        L_0x021e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "otsHashAddress == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.xmss.BDSTreeHash.update(java.util.Stack, org.bouncycastle.pqc.crypto.xmss.d, byte[], byte[], org.bouncycastle.pqc.crypto.xmss.c):void");
    }
}
