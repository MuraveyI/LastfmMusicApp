package com.muravey.core.mvp;

public class ICoreMvpContract  {


    public interface  View<T extends Presenter> {
        void attachPresenter(T presenter);

        void finishView();

    }

    public interface Presenter<T extends  View>{
        void attachView(T view);

        void detachView();

    }

}
