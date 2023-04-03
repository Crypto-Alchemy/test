package p000;

import android.view.RenderNode;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\r"}, mo44877d2 = {"Lkd5;", "", "Landroid/view/RenderNode;", "renderNode", "", "a", "target", "Lr37;", "c", "b", "d", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: kd5 */
/* compiled from: RenderNodeApi23.android.kt */
public final class kd5 {

    /* renamed from: a */
    public static final kd5 f14039a = new kd5();

    /* renamed from: a */
    public final int mo22255a(RenderNode renderNode) {
        vx2.m53591g(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    /* renamed from: b */
    public final int mo22256b(RenderNode renderNode) {
        vx2.m53591g(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    /* renamed from: c */
    public final void mo22257c(RenderNode renderNode, int i) {
        vx2.m53591g(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    /* renamed from: d */
    public final void mo22258d(RenderNode renderNode, int i) {
        vx2.m53591g(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
