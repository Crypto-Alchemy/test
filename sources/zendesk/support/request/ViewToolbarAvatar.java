package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zendesk.support.UiUtils;
import zendesk.support.ZendeskAvatarView;

class ViewToolbarAvatar extends FrameLayout {
    private static final int[] IMAGE_VIEW_IDS = {l35.zs_request_toolbar_avatar_1, l35.zs_request_toolbar_avatar_2, l35.zs_request_toolbar_avatar_3, l35.zs_request_toolbar_avatar_4, l35.zs_request_toolbar_avatar_5};
    public static final int MAX_IMAGES = 5;
    private final List<ZendeskAvatarView> avatarViews;
    private int imageRadius;
    private int strokeColor;
    private int strokeWidth;
    private List<jl4<String, String>> userInfo;

    public ViewToolbarAvatar(Context context) {
        this(context, (AttributeSet) null);
    }

    private void bindData(Picasso picasso) {
        for (int i = 0; i < this.avatarViews.size(); i++) {
            ZendeskAvatarView zendeskAvatarView = this.avatarViews.get(i);
            if (i < this.userInfo.size()) {
                jl4 jl4 = this.userInfo.get(i);
                if (kb6.m46949b((String) jl4.f13688a)) {
                    zendeskAvatarView.showUserWithAvatarImage(picasso, (String) jl4.f13688a, (String) jl4.f13689b, this.imageRadius);
                } else {
                    zendeskAvatarView.showUserWithName((String) jl4.f13689b);
                }
                zendeskAvatarView.setVisibility(0);
            } else {
                zendeskAvatarView.setVisibility(8);
            }
        }
    }

    private ZendeskAvatarView createAndAddView(int i) {
        ZendeskAvatarView zendeskAvatarView = new ZendeskAvatarView(getContext());
        zendeskAvatarView.setId(IMAGE_VIEW_IDS[i]);
        zendeskAvatarView.setStroke(this.strokeColor, this.strokeWidth);
        int i2 = this.imageRadius * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 8388613;
        layoutParams.setMarginEnd(i * 2 * (i2 / 3));
        addView(zendeskAvatarView, layoutParams);
        return zendeskAvatarView;
    }

    public void setImageUrls(Picasso picasso, List<jl4<String, String>> list) {
        if (list.size() > 5) {
            this.userInfo = list.subList(0, 5);
        } else {
            this.userInfo = kj0.m47112c(list);
        }
        Collections.reverse(this.userInfo);
        bindData(picasso);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewToolbarAvatar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.avatarViews = new ArrayList(5);
        this.userInfo = new ArrayList(5);
        this.imageRadius = context.getResources().getDimensionPixelOffset(m25.zs_request_toolbar_avatar_radius);
        this.strokeWidth = context.getResources().getDimensionPixelOffset(m25.zs_request_toolbar_avatar_stroke_width);
        this.strokeColor = UiUtils.themeAttributeToColor(l15.colorPrimary, getContext(), y15.zs_request_fallback_color_primary);
        for (int i2 = 0; i2 < 5; i2++) {
            ZendeskAvatarView createAndAddView = createAndAddView(i2);
            createAndAddView.setVisibility(8);
            this.avatarViews.add(createAndAddView);
        }
    }
}
