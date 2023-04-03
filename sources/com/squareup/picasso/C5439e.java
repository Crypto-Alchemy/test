package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C5454m;
import com.squareup.picasso.Picasso;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: com.squareup.picasso.e */
/* compiled from: ContentStreamRequestHandler */
public class C5439e extends C5454m {

    /* renamed from: a */
    public final Context f26856a;

    public C5439e(Context context) {
        this.f26856a = context;
    }

    /* renamed from: c */
    public boolean mo39454c(C5450k kVar) {
        return PublicResolver.FUNC_CONTENT.equals(kVar.f26891d.getScheme());
    }

    /* renamed from: f */
    public C5454m.C5455a mo39455f(C5450k kVar, int i) throws IOException {
        return new C5454m.C5455a(sg4.m71937l(mo39528j(kVar)), Picasso.LoadedFrom.DISK);
    }

    /* renamed from: j */
    public InputStream mo39528j(C5450k kVar) throws FileNotFoundException {
        return this.f26856a.getContentResolver().openInputStream(kVar.f26891d);
    }
}
