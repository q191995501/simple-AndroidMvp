package cn.wenhaha.first_mvp.model;

public interface IUser {
    public String getUsername();
    public String getPWD();
    public boolean checkLoginVisible(String username,String pwd);
}
