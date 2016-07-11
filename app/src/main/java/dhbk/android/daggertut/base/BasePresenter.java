package dhbk.android.daggertut.base;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public interface BasePresenter<T extends BaseView> {

    public void onAttach();

    public void onDettach();

    public void registerView(T param);
}
