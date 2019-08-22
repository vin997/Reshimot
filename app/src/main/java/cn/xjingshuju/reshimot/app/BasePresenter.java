package cn.xjingshuju.reshimot.app;

/**
 * 所有presenter需要继承BasePresenter
 *
 * @param <T>
 */
public interface BasePresenter<T extends BaseView> {
    /**
     * 关联Presenter和View
     *
     * @param view view
     */
    void attachView(T view);

    void detachView();
}
