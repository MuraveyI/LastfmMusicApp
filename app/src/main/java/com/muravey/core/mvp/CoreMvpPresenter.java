package com.muravey.core.mvp;

public class CoreMvpPresenter  {

    interface View extends ICoreMvpContract.View<Presenter>{
        void attachPresenter();

        void finishView();



    }
    interface Presenter extends ICoreMvpContract.Presenter<View>{

        void attachView();

        void detachView();


    }
}
