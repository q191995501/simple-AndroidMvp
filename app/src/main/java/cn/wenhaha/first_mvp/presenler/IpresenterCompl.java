package cn.wenhaha.first_mvp.presenler;

import cn.wenhaha.first_mvp.model.IUser;
import cn.wenhaha.first_mvp.model.UserModle;
import cn.wenhaha.first_mvp.view.ILoginView;

public class IpresenterCompl implements IPresenter {

    private ILoginView iLoginView;
    private IUser iUser;

    public IpresenterCompl(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        this.iUser=new UserModle();
    }

    @Override
    public void login(String user, String pwd) {

        iLoginView.onLoginResult(iUser.checkLoginVisible(user,pwd),0);

    }

}
