package cn.xjingshuju.reshimot;

import cn.xjingshuju.reshimot.app.App;
import cn.xjingshuju.reshimot.app.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEventAndData() {

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
