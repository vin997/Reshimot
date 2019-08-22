package cn.xjingshuju.reshimot.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ViewPagerAdapter
 * 主界面的5个fragment的适配器 以供Viewpager使用
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();//List存放fragments

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * 通过当前fragment在list中的位置获取fragment自身
     *
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    /**
     * 获取fragment的数量
     *
     * @return
     */
    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    /**
     * 往list中添加fragment
     *
     * @param fragment
     */
    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }
}
