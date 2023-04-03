package com.caverock.androidsvg;

import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;

/* renamed from: com.caverock.androidsvg.a */
/* compiled from: RenderOptions */
public class C1892a {

    /* renamed from: a */
    public CSSParser.C1823n f9322a = null;

    /* renamed from: b */
    public PreserveAspectRatio f9323b = null;

    /* renamed from: c */
    public String f9324c = null;

    /* renamed from: d */
    public SVG.C1829b f9325d = null;

    /* renamed from: e */
    public String f9326e = null;

    /* renamed from: f */
    public SVG.C1829b f9327f = null;

    public C1892a() {
    }

    /* renamed from: a */
    public C1892a mo12943a(String str) {
        this.f9322a = new CSSParser(CSSParser.Source.RenderOptions).mo12693d(str);
        return this;
    }

    /* renamed from: b */
    public boolean mo12944b() {
        CSSParser.C1823n nVar = this.f9322a;
        if (nVar == null || nVar.mo12729f() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo12945c() {
        if (this.f9323b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo12946d() {
        if (this.f9324c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo12947e() {
        if (this.f9326e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo12948f() {
        if (this.f9325d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo12949g() {
        if (this.f9327f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public C1892a mo12950h(float f, float f2, float f3, float f4) {
        this.f9327f = new SVG.C1829b(f, f2, f3, f4);
        return this;
    }

    public C1892a(C1892a aVar) {
        if (aVar != null) {
            this.f9322a = aVar.f9322a;
            this.f9323b = aVar.f9323b;
            this.f9325d = aVar.f9325d;
            this.f9326e = aVar.f9326e;
            this.f9327f = aVar.f9327f;
        }
    }
}
