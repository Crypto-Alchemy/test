package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class NodeSerialization implements Serializable, Externalizable {
    public static final int LONGEST_EAGER_ALLOC = 100000;
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(nx2.m23499d(obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e.getMessage(), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r6.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        throw r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo16395a(java.io.ObjectInput r6, int r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1 = 0
            if (r7 > r0) goto L_0x000c
            byte[] r0 = new byte[r7]
            r6.readFully(r0, r1, r7)
            return r0
        L_0x000c:
            g60 r2 = new g60
            r2.<init>((int) r0)
            byte[] r0 = r2.mo20398l()     // Catch:{ all -> 0x0033 }
        L_0x0015:
            r3 = r1
        L_0x0016:
            int r4 = r0.length     // Catch:{ all -> 0x0033 }
            int r4 = r4 - r3
            int r4 = java.lang.Math.min(r4, r7)     // Catch:{ all -> 0x0033 }
            r6.readFully(r0, r1, r4)     // Catch:{ all -> 0x0033 }
            int r7 = r7 - r4
            int r3 = r3 + r4
            if (r7 != 0) goto L_0x002b
            byte[] r6 = r2.mo20391e(r3)     // Catch:{ all -> 0x0033 }
            r2.close()
            return r6
        L_0x002b:
            int r4 = r0.length     // Catch:{ all -> 0x0033 }
            if (r3 != r4) goto L_0x0016
            byte[] r0 = r2.mo20392f()     // Catch:{ all -> 0x0033 }
            goto L_0x0015
        L_0x0033:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r7 = move-exception
            r2.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            r6.addSuppressed(r0)
        L_0x003e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.NodeSerialization.mo16395a(java.io.ObjectInput, int):byte[]");
    }

    public void readExternal(ObjectInput objectInput) throws IOException {
        this.json = mo16395a(objectInput, objectInput.readInt());
    }

    public Object readResolve() {
        try {
            return nx2.m23496a(this.json);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e.getMessage(), e);
        }
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }
}
