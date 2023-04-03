package zendesk.messaging.p026ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$id;
import zendesk.messaging.R$layout;

/* renamed from: zendesk.messaging.ui.EndUserImageCellView */
public class EndUserImageCellView extends LinearLayout implements Updatable<EndUserCellImageState> {
    private int cornerRadiusPx;
    private FileUploadProgressView fileUploadProgressView;
    private ImageView imageView;
    private TextView label;
    private MessageStatusView statusView;

    public EndUserImageCellView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(1);
        setGravity(8388693);
        View.inflate(getContext(), R$layout.zui_view_end_user_image_cell_content, this);
        this.cornerRadiusPx = getResources().getDimensionPixelSize(R$dimen.zui_cell_bubble_corner_radius);
    }

    private void loadImageIntoImageView(EndUserCellImageState endUserCellImageState) {
        UtilsEndUserCellView.getImageLoadingPlaceholder(getContext());
        endUserCellImageState.getAttachment();
        throw null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.imageView = (ImageView) findViewById(R$id.zui_image_cell_image);
        this.fileUploadProgressView = (FileUploadProgressView) findViewById(R$id.zui_cell_file_upload_progress);
        this.statusView = (MessageStatusView) findViewById(R$id.zui_cell_status_view);
        this.label = (TextView) findViewById(R$id.zui_cell_label_message);
    }

    public void update(EndUserCellImageState endUserCellImageState) {
        loadImageIntoImageView(endUserCellImageState);
        if (endUserCellImageState.getStatus() == MessagingItem.Query.Status.PENDING) {
            this.fileUploadProgressView.setVisibility(0);
        } else {
            this.fileUploadProgressView.setVisibility(8);
        }
        this.statusView.setStatus(endUserCellImageState.getStatus());
        UtilsEndUserCellView.setImageViewColorFilter(endUserCellImageState, this.imageView, getContext());
        UtilsEndUserCellView.setLabelErrorMessage(endUserCellImageState, this.label, getContext());
        UtilsEndUserCellView.setClickListener(endUserCellImageState, this);
        UtilsEndUserCellView.setLongClickListener(endUserCellImageState, this);
        endUserCellImageState.getProps().apply(this, this.statusView);
    }

    public EndUserImageCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EndUserImageCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
