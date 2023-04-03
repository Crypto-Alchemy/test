package zendesk.messaging.p026ui;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.C9802b;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.R$id;

/* renamed from: zendesk.messaging.ui.InputBoxAttachmentClickListener */
class InputBoxAttachmentClickListener implements View.OnClickListener {
    private final AppCompatActivity activity;
    private final BelvedereMediaHolder belvedereMediaHolder;
    private final C9802b imageStream;

    public InputBoxAttachmentClickListener(AppCompatActivity appCompatActivity, C9802b bVar, BelvedereMediaHolder belvedereMediaHolder2) {
        this.activity = appCompatActivity;
        this.imageStream = bVar;
        this.belvedereMediaHolder = belvedereMediaHolder2;
    }

    public void onClick(View view) {
        if (!this.imageStream.mo73736n()) {
            showImagePicker();
        } else {
            this.imageStream.mo73733k();
        }
    }

    public void showImagePicker() {
        BelvedereUi.m75342a(this.activity).mo73629g().mo73630h("*/*", true).mo73634l(this.belvedereMediaHolder.getSelectedMedia()).mo73635m(R$id.input_box_attachments_indicator, R$id.input_box_send_btn).mo73632j(true).mo73628f(this.activity);
    }
}
