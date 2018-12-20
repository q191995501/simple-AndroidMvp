package cn.wenhaha.first_mvp.model;

public class UserModle implements IUser {

    private String username;
    private String pwd;



    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPWD() {
        return pwd;
    }

    @Override
    public boolean checkLoginVisible(String username, String pwd) {
        //这里没有去做任何数据库查询
        return true;
    }
}
