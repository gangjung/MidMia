package beyond_imagination.midmia.pChildInfoActivity;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

/**
 * Created by laggu on 2017-07-13.
 */

public class NameEditText extends android.support.v7.widget.AppCompatEditText {
    ChildInfoActivity activity;

    public NameEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        activity = (ChildInfoActivity)context;
        init();
    }

    private void init(){
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                activity.getChild().setName(s.toString());
            }
        });
    }
}
