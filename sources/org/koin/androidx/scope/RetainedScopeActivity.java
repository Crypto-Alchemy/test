package org.koin.androidx.scope;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014R\u001b\u0010\f\u001a\u00020\u00078VX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lorg/koin/androidx/scope/RetainedScopeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lij;", "Landroid/os/Bundle;", "savedInstanceState", "Lr37;", "onCreate", "Lorg/koin/core/scope/Scope;", "a", "Lef3;", "n", "()Lorg/koin/core/scope/Scope;", "scope", "", "contentLayoutId", "<init>", "(I)V", "koin-android_release"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* compiled from: RetainedScopeActivity.kt */
public abstract class RetainedScopeActivity extends AppCompatActivity implements C7215ij {

    /* renamed from: a */
    public final ef3 f43929a;

    public RetainedScopeActivity() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RetainedScopeActivity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* renamed from: n */
    public Scope mo52489n() {
        return (Scope) this.f43929a.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo52489n() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public RetainedScopeActivity(int i) {
        super(i);
        this.f43929a = ComponentActivityExtKt.m70713a(this);
    }
}
