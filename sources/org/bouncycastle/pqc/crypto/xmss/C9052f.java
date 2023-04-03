package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.C9040a;
import org.bouncycastle.pqc.crypto.xmss.C9043b;
import org.bouncycastle.pqc.crypto.xmss.C9050e;

/* renamed from: org.bouncycastle.pqc.crypto.xmss.f */
public class C9052f {
    /* renamed from: a */
    public static XMSSNode m70562a(C9049d dVar, yf7 yf7, C9043b bVar) {
        double d;
        if (yf7 == null) {
            throw new NullPointerException("publicKey == null");
        } else if (bVar != null) {
            int a = dVar.mo64651d().mo66862a();
            byte[][] a2 = yf7.mo67092a();
            XMSSNode[] xMSSNodeArr = new XMSSNode[a2.length];
            for (int i = 0; i < a2.length; i++) {
                xMSSNodeArr[i] = new XMSSNode(0, a2[i]);
            }
            C9050e.C9051a f = ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar.mo64657b())).mo64661h(bVar.mo64658c())).mo64637n(bVar.mo64632e()).mo64638o(0).mo64639p(bVar.mo64634g()).mo64659f(bVar.mo64656a());
            while (true) {
                C9043b bVar2 = (C9043b) ((C9043b.C9045b) f).mo64635l();
                if (a <= 1) {
                    return xMSSNodeArr[0];
                }
                int i2 = 0;
                while (true) {
                    d = (double) (a / 2);
                    if (i2 >= ((int) Math.floor(d))) {
                        break;
                    }
                    bVar2 = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar2.mo64657b())).mo64661h(bVar2.mo64658c())).mo64637n(bVar2.mo64632e()).mo64638o(bVar2.mo64633f()).mo64639p(i2).mo64659f(bVar2.mo64656a())).mo64635l();
                    int i3 = i2 * 2;
                    xMSSNodeArr[i2] = m70563b(dVar, xMSSNodeArr[i3], xMSSNodeArr[i3 + 1], bVar2);
                    i2++;
                }
                if (a % 2 == 1) {
                    xMSSNodeArr[(int) Math.floor(d)] = xMSSNodeArr[a - 1];
                }
                a = (int) Math.ceil(((double) a) / 2.0d);
                f = ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar2.mo64657b())).mo64661h(bVar2.mo64658c())).mo64637n(bVar2.mo64632e()).mo64638o(bVar2.mo64633f() + 1).mo64639p(bVar2.mo64634g()).mo64659f(bVar2.mo64656a());
            }
        } else {
            throw new NullPointerException("address == null");
        }
    }

    /* renamed from: b */
    public static XMSSNode m70563b(C9049d dVar, XMSSNode xMSSNode, XMSSNode xMSSNode2, C9050e eVar) {
        if (xMSSNode == null) {
            throw new NullPointerException("left == null");
        } else if (xMSSNode2 == null) {
            throw new NullPointerException("right == null");
        } else if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        } else if (eVar != null) {
            byte[] f = dVar.mo64653f();
            if (eVar instanceof C9043b) {
                C9043b bVar = (C9043b) eVar;
                eVar = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar.mo64657b())).mo64661h(bVar.mo64658c())).mo64637n(bVar.mo64632e()).mo64638o(bVar.mo64633f()).mo64639p(bVar.mo64634g()).mo64659f(0)).mo64635l();
            } else if (eVar instanceof C9040a) {
                C9040a aVar = (C9040a) eVar;
                eVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar.mo64657b())).mo64661h(aVar.mo64658c())).mo64630m(aVar.mo64625e()).mo64631n(aVar.mo64626f()).mo64659f(0)).mo64628k();
            }
            byte[] c = dVar.mo64650c().mo62861c(f, eVar.mo64624d());
            if (eVar instanceof C9043b) {
                C9043b bVar2 = (C9043b) eVar;
                eVar = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar2.mo64657b())).mo64661h(bVar2.mo64658c())).mo64637n(bVar2.mo64632e()).mo64638o(bVar2.mo64633f()).mo64639p(bVar2.mo64634g()).mo64659f(1)).mo64635l();
            } else if (eVar instanceof C9040a) {
                C9040a aVar2 = (C9040a) eVar;
                eVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar2.mo64657b())).mo64661h(aVar2.mo64658c())).mo64630m(aVar2.mo64625e()).mo64631n(aVar2.mo64626f()).mo64659f(1)).mo64628k();
            }
            byte[] c2 = dVar.mo64650c().mo62861c(f, eVar.mo64624d());
            if (eVar instanceof C9043b) {
                C9043b bVar3 = (C9043b) eVar;
                eVar = (C9043b) ((C9043b.C9045b) ((C9043b.C9045b) ((C9043b.C9045b) new C9043b.C9045b().mo64660g(bVar3.mo64657b())).mo64661h(bVar3.mo64658c())).mo64637n(bVar3.mo64632e()).mo64638o(bVar3.mo64633f()).mo64639p(bVar3.mo64634g()).mo64659f(2)).mo64635l();
            } else if (eVar instanceof C9040a) {
                C9040a aVar3 = (C9040a) eVar;
                eVar = (C9040a) ((C9040a.C9042b) ((C9040a.C9042b) ((C9040a.C9042b) new C9040a.C9042b().mo64660g(aVar3.mo64657b())).mo64661h(aVar3.mo64658c())).mo64630m(aVar3.mo64625e()).mo64631n(aVar3.mo64626f()).mo64659f(2)).mo64628k();
            }
            byte[] c3 = dVar.mo64650c().mo62861c(f, eVar.mo64624d());
            int c4 = dVar.mo64651d().mo66864c();
            byte[] bArr = new byte[(c4 * 2)];
            for (int i = 0; i < c4; i++) {
                bArr[i] = (byte) (xMSSNode.getValue()[i] ^ c2[i]);
            }
            for (int i2 = 0; i2 < c4; i2++) {
                bArr[i2 + c4] = (byte) (xMSSNode2.getValue()[i2] ^ c3[i2]);
            }
            return new XMSSNode(xMSSNode.getHeight(), dVar.mo64650c().mo62860b(c, bArr));
        } else {
            throw new NullPointerException("address == null");
        }
    }
}
