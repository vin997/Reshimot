package cn.xjingshuju.reshimot;

import android.widget.TextView;

import butterknife.BindView;
import cn.xjingshuju.reshimot.app.App;
import cn.xjingshuju.reshimot.app.BaseActivity;

public class MainActivity extends BaseActivity {
    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEventAndData() {
        textView.setText("ButterKnifeTest");
    }

    @Override
    protected void createPresenter() {

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        App.getInstance().exitApp();
    }
}
